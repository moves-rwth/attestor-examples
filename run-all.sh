RESULTS=results.text
FILE=jmh-result.text

rm -f $RESULTS
for D in `find . -maxdepth 1 -mindepth 1 -not -path '*/\.*' -type d`
do
    cd $D
    mvn clean install exec:exec@run
    cat $FILE >> ../$RESULTS
    rm -f $FILE
    cd ..
done
echo "All results have been written to $RESULTS."
