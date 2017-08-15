RESULTS=jmh-result.text

mvn clean install exec:exec@run > tmp
cat tmp | grep "including procedure calls" >> $RESULTS
rm tmp
cat $RESULTS
