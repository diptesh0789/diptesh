

pipeline{
	agent any
	stages{

		stage('One'){
			steps{

				echo 'Loading external file'
				script{
					def echoer = load "./Jenkins/Echoer.groovy"
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

					def disc_size = sh(script:"df / --output=avail | tail -1", returnStdout :true).trim() as Integer
					println ("Disc_size = ${disc_size}");
				}
			}
		}
	}

agent any
stages {
        stage('Example Build') {
            agent { docker 'maven:3-alpine' } 
            steps {
                echo 'Hello, Maven'
                sh 'mvn --version'
            }
        }
        stage('Example Test') {
            agent { docker 'openjdk:8-jre' } 
            steps {
                echo 'Hello, JDK'
                sh 'java -version'
            }
        }
    }
 }
