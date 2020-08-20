pipeline {

    agent any

    stages {

        stage('Build Package file jar'){
            steps {
                echo 'Build Package file jar'
                echo '******************************'
                sh 'mvn clean install'
            }
        }

        stage('Upload jar file on Nexus server') {
            steps {
                echo 'Deploy on Nexus server'
                echo '******************************'
            }
        }

        stage('Deploy for test sit uat') {
            steps {
                echo 'Deploy for test sit uat'
                echo '******************************'
            }
        }

        stage('Start app on server') {
            steps{
                echo 'Start app'
                echo '******************************'
            }
        }
    }
}