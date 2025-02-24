pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh 'mvn clean package -DskipTests=true'
      }
    }

    stage('Test') {
      steps {
        script {


          // Run Maven on a Unix agent.
          sh "mvn test"
        }

      }
    }

  }
  tools {
    maven 'M3'
  }
}