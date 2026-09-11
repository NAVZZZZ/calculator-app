pipeline {
    agent any

    stages {

        stage('Build and Test') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }

        stage('Deploy to Nexus') {
            steps {
                echo 'Deploying artifact to Nexus...'
            }
        }
    }
}
