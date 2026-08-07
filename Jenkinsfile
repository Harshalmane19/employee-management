pipeline {

    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                url: 'https://github.com/Harshalmane19/employee-management.git'
            }
        }


        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }


        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

    }
}
