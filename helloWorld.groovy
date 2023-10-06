pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    
    
    stages {
        stage('Initial Step'){
            steps {
                echo 'Did we make it?'
            }

        }
    }
}