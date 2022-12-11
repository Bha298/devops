pipeline{
    
    agent any
    
    stages {
        
        stage('Git Checkout'){
            
            steps{
                
                script{
                    
                   git branch: 'main', url: 'https://github.com/Bha298/devops.git'
                }
            }
        }
        
        
        
        stage('docker build'){
              steps{
                  script{
                    bat 'export DOCKER_HOST=tcp://your_ip:2375'

                    bat 'mvn package -Dmaven.test.skip=true -U'

                    bat  'mvn dockerfile:build'
                  }
              }
              }
        
        
        
        
        
        
    }
}
