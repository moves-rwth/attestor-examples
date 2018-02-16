DEPLOY=1
 
PATH_ATTESTOR="/mnt/c/Users/Hannah/Documents/RWTH/Hiwi/attestor"
PATH_EXAMPLES="/mnt/c/Users/Hannah/Documents/RWTH/Hiwi/attestor-examples"
PATH_HELPER="/mnt/c/Users/Hannah/.m2/repository/de/rwth/i2/attestor/JmhBenchmarkHelper/0.0.1-SNAPSHOT"
DIR=benchmarks
LOGFILE=$(pwd)/$DIR/log
CSVFILE=$(pwd)/$DIR/results.csv
TEXFILE=$(pwd)/$DIR/results.tex
PDFFILE=$(pwd)/$DIR/results.pdf
 
PATH_ORIGINAL=$(pwd)
mkdir -p $DIR
 
 
set -e
 
echo "Running full benchmark suite for Attestor..."
cd $PATH_ORIGINAL
 
cd $PATH_ATTESTOR
echo "installing Attestor to local maven repository..."
mvn clean install
echo "done."
 
cd $PATH_HELPER
echo "installing benchmark helper to local maven repository..."
mvn clean install
echo "done."
 
cd $PATH_EXAMPLES
echo "running benchmarks on new Attestor version..."
./run-all.sh | tee $LOGFILE
echo "done."
 
cat $LOGFILE | grep -oP "Analyzed method:\s*[\W\w]*/\K\w+.\w+|Benchmark name:\s*\K[\s\W\w]*|Total runtime[\s\W]*\K\d+.\d+|Total verification time[\s\W]*\K\d+.\d+" | awk 'NR%4{printf "%s, ",$0;next;}1' > $CSVFILE
 
sed -i '1s/^/program,name,verification,total\n/' $CSVFILE
 
cat <<"TAGTEXTFILE" > $TEXFILE
\documentclass{article}
\usepackage{csvsimple}
\usepackage{longtable}
\begin{document}
 
    \title{Full Results of Attestor Benchmark Suite}
    \maketitle
 
    \section*{Legend}
 
    \paragraph{Analyzed method}
    Specifies the top-level method that has been analyzed.
 
    \paragraph{Properties}
    A short description of verified properties.
    A more detailed description is found in the "scenario" tag of the individual example configuration file.
    The following abbreviations for verified properties are used:
    \begin{itemize}
        \item M: Memory safety
        \item S: Shape properties (e.g. that the heap consits of a binary tree and a list).
        \item V: Each element of the input data structure is eventually visited.
        \item N: Every neighbourhood of the input data structure, i.e. each element and its immediate successors, is preserved upon termination.
        \item C: Addigtional correctness properties such as correct placement of return values upon termination.
        \item B: The underlying data structure is balanced upon termination.
        \item R: Reachability properties
    \end{itemize}
    Each of the above properties is expected be successfully verified by Attestor unless stated otherwise. 
    Some examples analyze buggy code. In this case the analysis is expected to fail and attempts to generate a counterexample.
    We use the following abbreviations:
    \begin{itemize}
        \item X: Verification fails and a non-spurious counterexample is constructed.
        \item Y: Verification fails, but all counterexamples obtained by the analysis are spurious.
    \end{itemize}
 
    \paragraph{Verif.}
    The total time in seconds required for verification (including state space generation, model-checking, etc., but excluding parsing). 
 
    \paragraph{Total}
    The total runtime of Attestor in seconds. 
 
    \section*{Benchmark Results}
 
    \begin{longtable}{l|r|r|r}
        \bfseries Method & \bfseries Properties & \bfseries Verif. & \bfseries Total 
        \\ \hline \hline
        \csvreader[head to column names]{results.csv}{}
        {\program & \name& \verification & \total \\}
    \end{longtable}
\end{document}
TAGTEXTFILE
 
 
cd $PATH_ORIGINAL/$DIR
echo "finished execution. See $LOGFILE for details"
echo "creating benchmark table..."
pdflatex $TEXFILE
 
echo "Benchmark results have been written to $CSVFILE and $PDFFILE."
cd $PATH_ORIGINAL