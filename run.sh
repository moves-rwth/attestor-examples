CSVFILE=benchmark-results.csv
TEXFILE=benchmark-results.tex
rm $CSVFILE
echo "name,states,generation,mc,verification,total" > $CSVFILE
mvn clean install exec:exec@run


cat <<"TAGTEXTFILE" > $TEXFILE
\documentclass{article}[9pt]
\usepackage[a4paper,margin=1in,landscape]{geometry}
\usepackage{csvsimple}
\usepackage{longtable}

\begin{document}

    \author{}
    \date{}
    \title{Attestor Benchmarks}
    \maketitle

    \begin{longtable}{|l|r|r|r|r|r|}
        \hline
        \bfseries Benchmark & \bfseries No. States & \bfseries Statespace Gen. (s) & \bfseries Model checking (s) & \bfseries Total Verification (s) & \bfseries Total Runtime (s)
        \\ \hline \hline
        \csvreader[head to column names]{benchmark-results.csv}{}
        {\name & \states & \generation & \mc & \verification & \total \\}
               & & & & & \\ \hline
    \end{longtable}
\end{document}
TAGTEXTFILE

echo "\n\n\nBenchmark results are found in\n\t$TEXFILE and\n\t$CSVFILE"
