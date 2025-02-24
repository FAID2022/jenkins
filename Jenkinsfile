pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                // git 'https://github.com/FAID2022/jenkins'

                // Run Maven on a Unix agent.
                sh "mvn clean package -DskipTests=true"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            
        }
        stage('Test') {
            steps {
               script {
                    for (int i = 0; i < 10; i++) {
                        echo "${i + 1}"
                        sleep 1
                    }
                
                // Run Maven on a Unix agent.
                sh "mvn test"
                    }
                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            
        }
    }
}
