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
                //Frist Test
                echo ('Commit Test_01')
                echo ('Commit Test_02')
                //Second Test
                echo ('Commit Test_03')
                echo ('Commit Test_04')
                //Third Test
                echo ('Commit Test_05')
                echo ('Commit Test_06')
                echo ('Commit Test_07')
                echo ('Commit Test_08')
            }
        }
    }
}