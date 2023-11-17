pipeline { 
    agent any 
    options {
        skipStagesAfterUnstable()
    }
    
    environment {
        build_name = 'shield-builder'
    }
    
    stages {
        stage('Running Autobuild.py') {
            steps {
                // Always use back slash instead of foward slash to access specific repos.
                // dir("c:/Users/RLAM8/Documents/Shield Docker/shield-docker-build-master/") {
                //     // powershell ('docker shield-build -t .')
                //     powershell ('python.exe auto-build.py --force') 
                //     echo ('Finished Building!')
                powershell ('pwd')
                echo ('Commit Test_01')
                echo ('Commit Test_02')
            }
        }
    }
}