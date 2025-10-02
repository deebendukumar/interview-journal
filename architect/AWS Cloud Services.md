# AWS Cloud Services Interview Questions

## How do you design a multi-region deployment in AWS?

To design a multi-region deployment in AWS, I start by selecting the appropriate regions based on latency, compliance,
and disaster recovery requirements. I use services like Route 53 for DNS routing and failover, and set up VPCs in each
region with necessary subnets, security groups, and network ACLs. I leverage services like S3 for cross-region
replication of data, RDS for multi-region database setups, and CloudFront for content delivery. Additionally, I
implement automated deployment pipelines using CodePipeline or Terraform to ensure consistent infrastructure across
regions.

## Explain how you’ve used AWS services like ECS, EKS, or Fargate.

I have used AWS ECS for container orchestration, deploying microservices in a scalable and managed environment. I
configured task definitions, services, and clusters to manage containerized applications. For serverless container
deployments, I utilized AWS Fargate, which allowed me to run containers without managing the underlying infrastructure.
I also have experience
with EKS for Kubernetes-based deployments, where I set up clusters, managed node groups, and integrated with
other AWS services for monitoring and logging.

## Explain in details what is ECS, EKS and Fargate.

- **ECS (Elastic Container Service)**: A fully managed container orchestration service that allows you to run and
  manage Docker containers on a cluster of Amazon EC2 instances. It provides features like task definitions, service
  discovery, and load balancing.
- **EKS (Elastic Kubernetes Service)**: A managed Kubernetes service that simplifies the deployment, management, and
  scaling of
  containerized applications using Kubernetes. It handles the control plane and integrates with other AWS services.
- **Fargate**: A serverless compute engine for containers that works with both ECS and EKS. It allows you to run
  containers without
  provisioning or managing servers, automatically scaling the infrastructure based on the resource requirements of your
  containers.

## What’s the difference between API Gateway and Application Load Balancer?

- **API Gateway**: A fully managed service that makes it easy for developers to create, publish, maintain, monitor, and
  secure APIs at any scale. It provides features like request/response transformation, caching, throttling, and
  authorization.
- **Application Load Balancer (ALB)**: A load balancing service that automatically distributes incoming application
  traffic across multiple targets, such as EC2 instances, containers, and IP addresses. It operates at the application
  layer (Layer 7) and supports features like path-based routing, host-based routing, and SSL termination.

## How do you secure applications deployed on AWS?

To secure applications deployed on AWS, I follow best practices such as:

- Implementing IAM roles and policies to enforce the principle of least privilege.
- Using VPCs, subnets, and security groups to control network access.
- Encrypting data at rest using services like KMS and S3 encryption.
- Enabling SSL/TLS for data in transit.
- Regularly updating and patching instances and applications.
- Implementing logging and monitoring using CloudWatch, CloudTrail, and GuardDuty.
- Conducting regular security audits and vulnerability assessments.

## Can you describe your experience with AWS VPC design?

I have designed AWS VPCs to provide secure and isolated network environments for applications. My experience includes
creating VPCs with multiple subnets (public and private), configuring route tables, internet gateways, and NAT gateways
for internet access. I have also set up VPC peering and VPN connections for secure communication between VPCs and
on-premises networks. Additionally, I have implemented security groups and network ACLs to control inbound and outbound
traffic.

## How do you decide between using Lambda vs. ECS for microservices?

The decision between using AWS Lambda and ECS for microservices depends on several factors:

- **Use Lambda**: For event-driven, short-lived tasks that require automatic scaling and minimal infrastructure
  management. It is ideal for lightweight functions, such as data processing, API backends, and scheduled tasks.
- **Use ECS**: For long-running applications, complex microservices, or when you need more control over the environment
  and dependencies. ECS is suitable for applications that require persistent connections, stateful services, or custom
  networking configurations.

## What’s your approach to cost optimization in AWS?

To optimize costs in AWS, I follow these strategies:

- Right-sizing instances based on workload requirements.
- Using Reserved Instances and Savings Plans for predictable workloads.
- Leveraging Spot Instances for non-critical, flexible workloads.
- Implementing auto-scaling to match resource usage with demand.
- Monitoring and analyzing usage with AWS Cost Explorer and Trusted Advisor.
- Utilizing serverless services like Lambda and Fargate to reduce infrastructure management overhead.

## How do you implement disaster recovery on AWS?

To implement disaster recovery on AWS, I follow the RTO (Recovery Time Objective) and RPO (Recovery Point Objective)
requirements. My approach includes:

- Setting up multi-region deployments for critical applications.
- Using automated backups and snapshots for databases and storage.
- Implementing cross-region replication for S3 and RDS.
- Creating infrastructure as code (IaC) templates for quick recovery of resources.
- Regularly testing disaster recovery plans to ensure they meet the defined objectives.

## Explain blue-green vs. canary deployments on AWS.

- **Blue-Green Deployment**: Involves maintaining two identical environments (blue and green). The blue environment is
  the live production environment, while the green environment is used for testing new releases. Once the new version
  is tested and verified in the green environment, traffic is switched from blue to green, making it the new production
  environment. This approach minimizes downtime and allows for quick rollback if issues arise.
- **Canary Deployment**: Involves gradually rolling out a new version of an application to a small subset of users
  before
  deploying it to the entire user base. This allows for monitoring the new version for any issues and ensures stability
  before a full rollout. If problems are detected, the deployment can be halted or rolled back with minimal impact.

## How do you handle data migration to AWS at scale?

For large-scale data migration to AWS, I typically use AWS Data Migration Service (DMS) for database migrations, which
supports continuous data replication with minimal downtime. For file-based data, I use AWS Snowball or Snowmobile for
transferring large datasets securely and efficiently. I also leverage S3 Transfer Acceleration for faster uploads over
long distances. Additionally, I plan the migration in phases, conduct thorough testing, and ensure data integrity
throughout the process.