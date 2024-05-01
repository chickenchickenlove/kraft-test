
# Docker-compose logs

```shell
$ docker-compose up -d
$ docker-compose logs broker
Attaching to broker
broker       | kafka 23:28:59.07 INFO  ==> 
broker       | kafka 23:28:59.07 INFO  ==> Welcome to the Bitnami kafka container
broker       | kafka 23:28:59.07 INFO  ==> Subscribe to project updates by watching https://github.com/bitnami/containers
broker       | kafka 23:28:59.07 INFO  ==> Submit issues and feature requests at https://github.com/bitnami/containers/issues
broker       | kafka 23:28:59.07 INFO  ==> Upgrade to Tanzu Application Catalog for production environments to access custom-configured and pre-packaged software components. Gain enhanced features, including Software Bill of Materials (SBOM), CVE scan result reports, and VEX documents. To learn more, visit https://bitnami.com/enterprise
broker       | kafka 23:28:59.07 INFO  ==> 
broker       | kafka 23:28:59.07 INFO  ==> ** Starting Kafka setup **
broker       | kafka 23:28:59.11 WARN  ==> The KAFKA_ZOOKEEPER_PROTOCOL environment variable does not configure SASL and/or SSL, this setting is not recommended for production environments.
broker       | kafka 23:28:59.12 WARN  ==> Kafka has been configured with a PLAINTEXT listener, this setting is not recommended for production environments.
broker       | kafka 23:28:59.13 INFO  ==> Initializing Kafka...
broker       | kafka 23:28:59.14 INFO  ==> No injected configuration files found, creating default config files
broker       | 
broker       | kafka 23:28:59.33 INFO  ==> ** Kafka setup finished! **
broker       | kafka 23:28:59.33 INFO  ==> ** Starting Kafka **
broker       | [2024-04-30 23:28:59,776] INFO Registered kafka:type=kafka.Log4jController MBean (kafka.utils.Log4jControllerRegistration$)
broker       | [2024-04-30 23:28:59,968] INFO Setting -D jdk.tls.rejectClientInitiatedRenegotiation=true to disable client-initiated TLS renegotiation (org.apache.zookeeper.common.X509Util)
broker       | [2024-04-30 23:28:59,981] WARN The new 'consumer' rebalance protocol is enabled along with the new group coordinator. This is part of the early access of KIP-848 and MUST NOT be used in production. (kafka.server.KafkaConfig)
...
```


# Java Log
```shell

[main] INFO org.apache.kafka.common.telemetry.internals.KafkaMetricsCollector - initializing Kafka metrics collector
[main] INFO org.apache.kafka.common.utils.AppInfoParser - Kafka version: 3.7.0
[main] INFO org.apache.kafka.common.utils.AppInfoParser - Kafka commitId: 2ae524ed625438c5
[main] INFO org.apache.kafka.common.utils.AppInfoParser - Kafka startTimeMs: 1714522211702
[main] INFO org.apache.kafka.clients.consumer.internals.AsyncKafkaConsumer - [Consumer clientId=1-2, groupId=111023212541010] Subscribed to topic(s): test-topic1
[consumer_background_thread] INFO org.apache.kafka.clients.Metadata - [Consumer clientId=1-2, groupId=111023212541010] Cluster ID: iGiYtloARcS-pdIE8UDmWg
[consumer_background_thread] INFO org.apache.kafka.clients.consumer.internals.CoordinatorRequestManager - [Consumer clientId=1-2, groupId=111023212541010] Discovered group coordinator Coordinator(key='111023212541010', nodeId=1, host='127.0.0.1', port=10000, errorCode=0, errorMessage='')
[consumer_background_thread] ERROR org.apache.kafka.clients.consumer.internals.HeartbeatRequestManager - [Consumer clientId=1-2, groupId=111023212541010] GroupHeartbeatRequest failed due to error: UNSUPPORTED_VERSION
[consumer_background_thread] ERROR org.apache.kafka.clients.consumer.internals.MembershipManagerImpl - [Consumer clientId=1-2, groupId=111023212541010] Member  with epoch 0 transitioned to FATAL state
Exception in thread "main" org.apache.kafka.common.errors.UnsupportedVersionException: The version of API is not supported.


```
