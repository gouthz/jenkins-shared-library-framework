library "dcube-library"

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                HelloWorld('testing')
            }
        }
    }
}
