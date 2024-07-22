pipeline {
    agent any

   // environment {
        // Define environment variables if needed
   // }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from the repository
                git url: 'https://github.com/rabnic/springboot-cicd-deployment.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                script {
                    // Clean and build the application using Maven
                    bat 'mvn -B -DskipTests clean package'
                }
            }
        }

        /*stage('Run Application') {
            steps {
                script {
                    // Run the Spring Boot application
                    sh 'nohup java -jar target/SpringBootCiCd.jar &'
                }
            }
        }*/
    }

    post {
        always {
            // Clean up workspace after build
            cleanWs()
        }

        success {
            echo 'Pipeline completed successfully!'
        }

        failure {
            echo 'Pipeline failed. Check console output for errors.'
        }
    }
}
