def call(String Giturl, String Gitbranch){
                echo 'Github Code Checkout'
                git branch: "${Gitbranch}",  url: "${Giturl}"
                echo "GitHub Code Fetch"
}
  
