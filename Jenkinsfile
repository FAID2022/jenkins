pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh "echo BRANCH ${BRANCH} AND SLEEP ${SLEEP_TIME} "
        sh 'mvn clean package -DskipTests=true'
      }
    }

    stage('Test') {
      steps {
        sh 'mvn test'
        junit(testResults: 'target/surefire-reports/TEST-*.xml', allowEmptyResults: true)
      }
    }

  }
  tools {
    maven 'M3'
  }
}
