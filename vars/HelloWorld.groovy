def call(Closure body) {
    // evaluate the body block, and collect configuration into the object
    def params = [:]

    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = params
    body()

    pipeline {
        agent any
        options { skipDefaultCheckout()
                  buildDiscarder(logRotator(numToKeepStr:'25'))
        }
        stages {
            // Add jenkins environment variables to configuration
            stage('Env') {
                steps {
                    script {
                        //checkout scm
                        sh 'ls'
                        gitCheckout(params)
                        TAG = "phoenix-development-${params.BUILD_NUMBER}"
                        println "config:" + params.BUILD_NUMBER
                        println "full:" + params
                        dir('configmaps') {
                            git(
                                url: 'https://github.com/gouthz/jenkins-practise.git',
                                branch: 'main'
                            )
                        }
                        sh 'ls configmaps'

                    }
                }
            }
        }
    }
}
