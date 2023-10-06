def scriptExitCode
def scriptOutput

pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    
    
    stages {
        stage('Initial'){
            steps {
                echo ('Did we make it here?')
            }
        }
    }
}