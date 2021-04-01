def call(params){

      params.WORKSPACE = env.WORKSPACE
      params.BUILD_NUMBER = "Goutham is fine"
      params.JOB_NAME = env.JOB_NAME
      params.SSHCREDENTIAL = env.SSHCREDENTIAL
      params.SONAR_URL = env.SONAR_SERVER
      params.BUILD_SERVER = env.JENKINS_URL
      params.JOB_URL = env.JOB_URL
      params.BLUE_OCEAN_URL = env.BLUE_OCEAN_URL
      params.JACOCO_REPORTS = env.JACOCO_REPORTS
      params.DEV_SERVER = env.DEV_SERVER
      params.QA_SERVER= env.QA_SERVER
      params.STAGE_SERVER= env.STAGE_SERVER
      params.HOTFIX_SERVER= env.HOTFIX_SERVER
      params.PROD_SERVER= env.PROD_SERVER
      params.QA_ECR= env.QA_ECR
      params.DEV_ECR= env.DEV_ECR
      params.STAGE_ECR= env.STAGE_ECR
      params.HOTFIX_ECR= env.HOTFIX_ECR
      params.ECR=env.ECR
      params.DEVOPS_HCHAT= env.DEVOPS_HCHAT
      params.TEAM_HCHAT= env.TEAM_HCHAT
      params.PHOENIX_RELEASE_HCHAT= env.PHOENIX_RELEASE_HCHAT
      params.EMAIL_LIST= env.EMAIL_LIST
      params.DEVOPS_EMAILS= env.DEVOPS_EMAILS
      params.QA_MAIL_LIST= env.QA_MAIL_LIST
      params.STAGE_MAIL_LIST= env.STAGE_MAIL_LIST
      params.DEV_SUBMITTERS= env.DEV_SUBMITTERS
      params.QA_SUBMITTERS= env.QA_SUBMITTERS
      params.STAGE_SUBMITTERS= env.STAGE_SUBMITTERS
      params.PROD_SUBMITTERS = env.PROD_SUBMITTERS

      params.ELK_DEV = env.ELK_DEV
      params.ELK_QA = env.ELK_QA
      params.ELK_BETA = env.ELK_BETA
      params.ELK_HOTFIX = env.ELK_HOTFIX
      params.ELK_PROD = env.ELK_PROD
     
      params.ES_DEV = env.ES_DEV
      params.ES_QA = env.ES_QA
      params.ES_BETA = env.ES_BETA
      params.ES_HOTFIX = env.ES_HOTFIX
      params.ES_PROD = env.ES_PROD

      params.DEV_API_URL  = env.DEV_API_URL
      params.QA_API_URL = env.QA_API_URL
      params.STAGE_API_URL = env.STAGE_API_URL
      params.HOTFIX_API_URL = env.HOTFIX_API_URL
      params.PROD_MUMBAI_URL = env.PROD_MUMBAI_URL
      params.SLACK_DEV_CHANNEL = env.SLACK_DEV_CHANNEL
      params.SLACK_CHANNEL     = env.SLACK_CHANNEL
      params.SLACK_DEVOPS      = env.SLACK_DEVOPS
      params.SLACK_URL         = env.SLACK_URL
      params.SLACK_TOKEN       = env.SLACK_TOKEN


 
}

