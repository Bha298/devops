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
        
        
        stage('mvn install'){
            steps{
                script{
                        bat 'mvn clean install'   
                }
            }
        }
        
        stage('docker build'){
              steps{
                  script{
                    bat 'mvn clean package dockerfile:build'   
                  }
              }
              }
        
        
        
        
        
        
    }
}
