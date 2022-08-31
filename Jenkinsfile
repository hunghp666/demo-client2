pipeline {
    environment {
        registry = "hunghp666/demo-jenkins"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }

    agent any
    stages {
        stage('Cloning our Git') {
            steps {
                git 'https://github.com/hunghp666/demo-client2.git'
            }
        } 

        stage('Building our image') {
            steps {
                script {
                    mvn clean install
                }
            }
        }

        stage('Building our image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }

        stage('Deploy our image') {
            steps {
                script {
                    docker.withRegistry( '', registryCredential ) {
                        dockerImage.push()
                    }
                }
            }
        }
        stage('Cleaning up') {
            steps {
                sh "docker rmi $registry:$BUILD_NUMBER" 
            }
        } 
    }
}
