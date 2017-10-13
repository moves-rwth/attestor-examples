# script to evaluate state space generation times

RESULTS=evaluation.txt

rm -f $RESULTS

for D in `find . -maxdepth 1 -mindepth 1 -not -path '*/\.*' -not -path './attestor-examples-output' -type d`
do
    cd $D
    mvn clean install exec:exec@run | grep -oP 'Method:.{0,200}|State space generation\s*\|\s*\K[0-9]+\.[0-9]+' | tee ../$RESULTS
    cd ..
done

echo "evaluation has been written to $RESULTS"
