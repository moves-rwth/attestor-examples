DIR=benchmark-results
LOGFILE=$(pwd)/$DIR/log
CSVFILE=$(pwd)/$DIR/results.csv
TEXFILE=$(pwd)/$DIR/results.tex
PDFFILE=$(pwd)/$DIR/results.pdf

PATH_ORIGINAL=$(pwd)
mkdir -p $DIR


set -e

echo "Running benchmark suite for Attestor (single shot)..."

mvn -o exec:exec@run | tee $LOGFILE
echo "done."

cat $LOGFILE | grep -oP "Analyzed method:\s*[\W\w]*/\K\w+.\w+|Benchmark name:\s*\K[\s\W\w]*|Specification summary:\s*\K[\s\W\w]*|w/ procedure calls[\s\W]*\K\d+|w/o procedure calls[\s\W]*\K\d+|final states[\s\W]*\K\d+|Interprocedural Analysis[\s\W]*\K\d+.\d+|Total runtime[\s\W]*\K\d+.\d+|Total verification time[\s\W]*\K\d+.\d+" | awk 'NR%9{printf "%s, ",$0;next;}1' > $CSVFILE

sed -i '1s/^/program,name,properties,totalStates,procStates,finalStates,stateSpaceGeneration,verification,total\n/' $CSVFILE

cat <<"TAGTEXTFILE" > $TEXFILE
\documentclass{article}[9pt]
\usepackage[a4paper,margin=1in,landscape]{geometry}
\usepackage{csvsimple}
\usepackage{longtable}

\begin{document}

    \author{}
    \date{}
    \title{Full Results of Attestor Benchmarks}
    \maketitle

    \section*{Legend}

    \paragraph{Benchmark Description}
    Covers a short description of the analyzed benchmark, the analyzed class and method, and the properties that have been verified (a detailed description is found below).
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

    \paragraph{Number of states}
    Covers the total number of generated states,and the number of final states.

    \paragraph{Runtimes}
    The runtime of Attestor in seconds.
    Total time includes everything.
    Verification times includes state space generation, model-checking, etc., but excludes parsers.

    \pagebreak

    \section*{Benchmark Results}
    \begin{longtable}{|l|r|r|r|r|r|r|}
        \hline
            \multicolumn{2}{|c|}{\bfseries Benchmark description} & \multicolumn{2}{c|}{\bfseries Number of states} & \multicolumn{3}{c|}{\bfseries Runtimes (in seconds)}
        \\ \hline
        \bfseries Analyzed Method & \bfseries Properties & \bfseries Total & \bfseries Final & \bfseries State Space Gen. (SSG) &\bfseries Verification (incl. SSG) & \bfseries Total
        \\ \hline \hline
        \csvreader[head to column names]{results.csv}{}
        {\program & \properties & \totalStates & \finalStates & \stateSpaceGeneration & \verification & \total \\}
               & & & & & &\\ \hline
    \end{longtable}

\end{document}
TAGTEXTFILE


cd $DIR
echo "creating benchmark table..."
pdflatex $TEXFILE

echo ""
echo ""
echo ""
echo ""
echo ""
echo "-----------------------------------------------------------------------------------------------------------------------"
echo ""
echo ""
echo "FINISHED EXECUTION"
echo ""
echo "Details are found in the logfile: $LOGFILE"
echo ""
echo "Benchmark results have been written to $PDFFILE."
echo ""
echo ""
echo "-----------------------------------------------------------------------------------------------------------------------"
echo ""
echo ""
echo ""
echo ""
echo ""
cd $PATH_ORIGINAL

