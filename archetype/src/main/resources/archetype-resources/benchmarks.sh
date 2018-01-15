echo "Installing benchmark suite..."
mvn -q clean install
echo "Running benchmarks..."
mvn -o -q exec:exec@benchmark
