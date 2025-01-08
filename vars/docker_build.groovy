def call(String Imagename){
  sh "docker build -t ${Imagename} ."
}
