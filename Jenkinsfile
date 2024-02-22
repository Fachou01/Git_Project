pipeline {
    agent any

    triggers {
        // Trigger the pipeline on every push to the repository
        pollSCM('* * * * *')
    }

    stages {
        stage('Display System Date') {
            steps {
                // Print the current system date
                script {
                    def currentDate = new Date()
                    echo "Current system date is: ${currentDate}"
                }
            }
        }
    }
}
