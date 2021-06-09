plugins {
  `gradle-enterprise`
}

gradleEnterprise {
  buildScan {
    termsOfServiceUrl = "https://gradle.com/terms-of-service"
    termsOfServiceAgree = "yes"
  }
}

include(":misk")
include(":misk-actions")
include(":misk-aws")
include(":misk-aws-dynamodb")
include(":misk-aws-dynamodb-testing")
include(":misk-aws2-dynamodb")
include(":misk-aws2-dynamodb-testing")
include(":misk-core")
include(":misk-cron")
include(":misk-crypto")
include(":misk-datadog")
include(":misk-eventrouter")
include(":misk-events")
include(":misk-events-core")
include(":misk-events-testing")
include(":misk-feature")
include(":misk-feature-testing")
include(":misk-gcp")
include(":misk-gcp-testing")
include(":misk-grpc-tests")
include(":misk-hibernate")
include(":misk-hibernate-testing")
include(":misk-inject")
include(":misk-jdbc")
include(":misk-jdbc-testing")
include(":misk-jobqueue")
include(":misk-jobqueue-testing")
include(":misk-launchdarkly")
include(":misk-launchdarkly-core")
include(":misk-metrics")
include(":misk-metrics-digester")
include(":misk-metrics-testing")
include(":misk-policy")
include(":misk-prometheus")
include(":misk-redis")
include(":misk-service")
include(":misk-slack")
include(":misk-testing")
include(":misk-transactional-jobqueue")
include(":misk-zookeeper")
include(":misk-zookeeper-testing")
include(":samples:exemplar")
include(":samples:exemplarchat")
include(":wisp-aws-environment")
include(":wisp-client")
include(":wisp-config")
include(":wisp-containers-testing")
include(":wisp-deployment")
include(":wisp-deployment-testing")
include(":wisp-logging")
include(":wisp-logging-testing")
include(":wisp-resource-loader")
include(":wisp-ssl")
include(":misk-jooq")
// autogenerated by polyrepo, do not modify
  includeBuild("../authz-experiments/")

// autogenerated by polyrepo, do not modify
