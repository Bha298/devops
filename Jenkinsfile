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
                    bat 'mvn clean install -Dmaven.test.skip=true'
                  }
              }
              }
        
        
        
        
        
        
    }
}
