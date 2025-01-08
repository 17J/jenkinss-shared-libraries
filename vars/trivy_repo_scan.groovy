def call(String RepoUrl){
       sh "trivy repo --format table -o repo-report.html ${RepoUrl}" 
}
