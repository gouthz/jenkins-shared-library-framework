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
                        checkout scm
                        getEnvVariables(params)
                        TAG = "phoenix-development-${params.BUILD_NUMBER}"

                    }
                }
            }
        }
    }
