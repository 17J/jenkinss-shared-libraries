def call(String Giturl, String Gitbranch){
                echo 'Github Code Checkout'
                git branch: ${Gitbranch}", changelog: false, poll: false, url: "${Giturl}"
                echo "GitHub Code Fetch"
}
  
