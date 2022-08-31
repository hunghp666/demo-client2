pipeline {
    environment {
        registry = "hunghp666/demo-jenkins"
        registryCredential = 'dockerhub_id'
        dockerImage = ''
    }
    // Config tools
    tools {
        maven 'M3'
        docker
    }
    agent any
    stages {
        stage('Cloning Git') {
            steps {
                git 'https://github.com/hunghp666/demo-client2.git'
            }
        } 

        stage('Maven build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Building our image') {
            steps {
                script {
                    //dockerImage = docker.build registry + ":$BUILD_NUMBER"
                    sh 'docker build -t demo-client1:1.0.0'
                }
            }
        }
//
//         stage('Deploy our image') {
//             steps {
//                 script {
//                     docker.withRegistry( '', registryCredential ) {
//                         dockerImage.push()
//                     }
//                 }
//             }
//         }
//         stage('Cleaning up') {
//             steps {
//                 sh "docker rmi $registry:$BUILD_NUMBER"
//             }
//         }
    }
}
