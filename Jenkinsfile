pipeline {
    agent any

    stages {
        stage('Cloning Repository') {
            steps {
                echo 'Clonando o repositório...'
            }
        }
        stage('Build') {
            steps {
                echo 'Simulando um build...'
                sh 'java --version'
            }
        }
        stage('Build Backend') {
            steps {
                echo 'Building the Spring Boot application...'
                dir('catalogo-service') { 
                    sh './mvnw clean package'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Simulando a execução de testes...'
            }
        }
    }

    post {
        always {
            echo 'Build finished.'
            archiveArtifacts artifacts: 'catalogo-service/target/*.jar', fingerprint: true
        }
    }
}