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
        stage('Test') {
            steps {
                echo 'Simulando a execução de testes...'
            }
        }
    }
}