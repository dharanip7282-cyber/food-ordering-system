pipeline {
    agent any

    tools {
        maven 'M3'
    }

    stages {
        stage('Checkout Git') {
            steps {
                git branch: 'main',
                    url: '<your-repository-url>'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t food-ordering-system:latest .'
            }
        }
    }
}
