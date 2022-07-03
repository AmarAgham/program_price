pipeline {
  agent any
  stages {
    stage('My_mavn_project') {
      steps {
        build(job: 'My_mavn_project', propagate: true, quietPeriod: 1)
      }
    }

  }
}