pipeline {
    agent any

    tools {
        // Must match the configured Maven name inside Jenkins Global Tool Configuration
        maven 'Maven_3.x'
        jdk 'Java_21'
    }

    stages {
        stage('Checkout Code') {
            steps {
                // Pulls code from the Git repository
                checkout scm
            }
        }

        stage('Execute TestNG Suite') {
            steps {
                // Runs the TestNG suite via Maven
                sh 'mvn clean test'
            }
        }
    }

    post {
        always {
            // Collects and visualizes TestNG results in the Jenkins UI
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
