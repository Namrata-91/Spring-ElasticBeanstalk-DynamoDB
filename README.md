# Spring-ElasticBeanstalk-DynamoDB
## ElasticBeanstalk - Deploying applications in AWS

Elastic Beanstalk, you can quickly deploy and manage applications in the AWS Cloud without having to learn about the infrastructure that runs those applications. Elastic Beanstalk reduces management complexity without restricting choice or control. You can interact with Elastic Beanstalk by using the Elastic Beanstalk console, the AWS Command Line Interface (AWS CLI).

Elastic Beanstalk has three components
* Application
* Application version: each deployment gets assigned a version
* Environment name

## DynamoDB - NoSQL Serverless Database
Fully Managed, Highly available with replication across 3 AZ. NoSQL database - not a relational database.
Scales to massive workloads, distributed database.Millions of requests per seconds, trillions of row, 100s of TB of storage. Fast and consistent in performance (low latency on retrieval). Integrated with IAM for security, authorization and administration. Enables event driven programming with DynamoDB Streams. Low cost and auto scaling capabilities.
* DynamoDB is made of tables. Each table has a primary key (must be decided at creation time). Each table can have an infinite number of items (= rows). Each item has attributes (can be added over time – can be null). Maximum size of a item is 400KB. 
* Data types supported are: Scalar Types: String, Number, Binary, Boolean, Null
* Document Types: List, Map
* Set Types: String Set, Number Set, Binary Se
