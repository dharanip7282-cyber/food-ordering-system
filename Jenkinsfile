
pipeline {
    agent any

    tools {
        maven 'M3'
    }

    environment {
        IMAGE_NAME = 'surxverse/food-ordering-ci-cd'
        DOCKER_CREDENTIALS = 'dockerhub-credentials'
    }

    stages {
        stage('Checkout Git') {
            steps {
                git branch: 'main',
                    url: 'YOUR_GIT_REPOSITORY_URL'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t %IMAGE_NAME%:latest .'
            }
        }

        stage('Push to Docker Hub') {
            steps {
                withCredentials([usernamePassword(
                    credentialsId: "${DOCKER_CREDENTIALS}",
                    usernameVariable: 'DOCKER_USER',
                    passwordVariable: 'DOCKER_PASS'
                )]) {
                    bat '''
                        docker login -u "%DOCKER_USER%" -p "%DOCKER_PASS%"
                        docker push %IMAGE_NAME%:latest
                        docker logout
                    '''
                }
            }
        }
    }
}
