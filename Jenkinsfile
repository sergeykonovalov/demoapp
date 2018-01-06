job("Node JS Deployment") {
  scm {
    git("") { node -> 
      node / gitConfigName("DSL User")
      node / gitConfigEmail("skonovalov@inbox.ru")
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
