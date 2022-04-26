pipeline{
agent any

stages{
	stage('One'){
		steps{
			echo "Hi"
		}
	}
	stage('Two'){
		steps{
			input('Do you want to proceed')
		}
	}
	stage('Three'){
		steps{
			echo "Stage3"
		}
	}
}
}
