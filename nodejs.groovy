job("Node JS Deployment") {
  scm {
    // will clone repository
    git("git://github.com/sergeykonovalov/docker-demo.git") { node -> 
      node / gitConfigName("DSL User")
      node / gitConfigEmail("skonovalov@inbox.ru")
      // missing configuration for email and name will fail the job
    }
  }
  triggers {
    scm("H/5 * * * *")
  }
  wrappers {
    nodejs("Node 9")
    // Define Node installation name:
    // Manage Jenkins - Configure Tools - NodeJS Installations - Name
  }
  steps {
    shell("npm install")
  }
}
