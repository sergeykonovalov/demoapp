node {
   def commit_id
   stage('Checkout') {
     checkout scm
     sh "git rev-parse --short HEAD > .git/commit-id"                        
     commit_id = readFile('.git/commit-id').trim()
   }
   }
   stage('Docker Build and Push') {
     docker.withRegistry('https://registry.hub.docker.com', 'DockerHubDemoApp') {
       def app = docker.build("sergeykonovalov/demoapp:${commit_id}", '.').push()
     }
   }
}
