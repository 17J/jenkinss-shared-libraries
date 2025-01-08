def call(String Gitbranch,  String Giturl){
                echo 'Github Code Checkout'
                git branch: "${Gitbranch}",  url: "${Giturl}"
                echo "GitHub Code Fetch"
}
  
