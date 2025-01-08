def call(String url){
    echo 'Github code Scan'
    sh 'trivy repo --format table -o repo-report.html "${url}"'
}
