pipeline {
agent any

tools {
maven 'Maven 3.9.8'
}

stages {
stage('Checkout') {
steps {
// Checkout code from Git repository
git branch: 'main', url: 'https://github.com/rabnic/springboot-cicd-deployment.git'
}
}

stage('Build') {
steps {
// Build Maven project
bat 'mvn clean install'
}
}

stage('Deploy') {
steps {
bat 'java -jar C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\SpringBootCiCd-Pipeline\\target\\SpringBootCICD-0.0.1-SNAPSHOT.jar'
}
}
}
}