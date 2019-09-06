pipeline{
agent any
stages{
stage('One') {
steps{
echo'Hello World'
}
}
}
}

pipeline{
    agent any
    stages{
        
        stage('One'){
            steps{
                
                echo 'Loading external file'
                script{
                    def echoer = load "./jenkins/echoer.groovy"
                    echoer.echoit("Hello World")
                }
                echo 'Loaded file and called'
                sh 'echo hello from the shell'
                sh 'hostname'
                sh 'uptime'
            }

        }
        
        stage('Two'){
            
            steps{
                
                script{
                    
                    def disc_size = sh(script:'df/--output-avail|tail-1',
                                    returnStdout:true).trim() as Integer
                                    println ("Disc_size = $disc_size");
                     
                }

            }

        }


    }

}
