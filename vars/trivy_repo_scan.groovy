def call(String Repourl){
    sh 'trivy repo --format table -o repo-report.html "${Repourl}"'
}
