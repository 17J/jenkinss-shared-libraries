def call(String stages){
    sh 'mvn ${stages}"'
}
