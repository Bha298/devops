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
        
        
        stage('docker tag'){
            steps{
                script{
                 bat "docker tag 556589fc2e82 bharadwaz1/java:devops"   
                }
            }
            
        }
          stage('docker logout'){
              steps{
                  script{
                    bat 'docker logout'
                  }
              }
              }
            stage('docker login'){
        
        steps{
            
            script{
             withCredentials([string(credentialsId: 'bharadwaz11', variable: 'bharadwaz1')]) {
                 bat "docker login -u bharadwaz1 -p ${bharadwaz1}"
}   
            }
            
        }
        
      
        }
           stage('docker push'){
            steps{
                script{
                 bat "docker push bharadwaz1/java:devops"   
                }
            }
            
        }
        
         stage('kubernates'){
            steps{
                script{
                 kubernetesDeploy (configs: 'modelservice.yml', kubeconfigId: 'kubernates')   
                }
            }
            
        }
        
        
        
        
    }
}
