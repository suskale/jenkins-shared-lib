def call(){
  sh "docker run -d -p 8080:80 portfolio:latest
"
}
