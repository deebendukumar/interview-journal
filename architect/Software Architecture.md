# Software Architecture Interview Questions

## What is resiliency ?

Resiliency is the ability of a system to recover from failures and continue to function. In software architecture, this
means designing systems that can handle unexpected issues, such as hardware failures, network outages, or software bugs,
without significant disruption to users.

## What is CAP Theorem?

The CAP theorem states that in a distributed data store, you can only achieve two out of the following three guarantees:

- Consistency: Every read receives the most recent write or an error.
- Availability: Every request receives a (non-error) response, without the guarantee that it contains the most recent
  write.
- Partition Tolerance: The system continues to operate despite an arbitrary number of messages being dropped (or
  delayed) by the network between nodes.
- In practice, systems must choose between consistency and availability when a network partition occurs.

## What do you mean by ACID properties in databases?

ACID properties are a set of principles that ensure reliable processing of database transactions:

- Atomicity: Ensures that all operations within a transaction are completed successfully. If any operation fails, the
  entire transaction is rolled back.
- Consistency: Ensures that a transaction brings the database from one valid state to another, maintaining database
  invariants.
- Isolation: Ensures that concurrent transactions do not interfere with each other. The results of a transaction are not
  visible to other transactions until it is committed.
- Durability: Ensures that once a transaction is committed, it will remain so, even in the event of a system failure.

## What is Scalability in Software Architecture?

Scalability is the ability of a system to handle increased load by adding resources. There are two types of scalability:

- Vertical Scalability (Scaling Up): Involves adding more power (CPU, RAM) to an existing machine.
- Horizontal Scalability (Scaling Out): Involves adding more machines to a system, distributing the load across multiple
  servers.

## Why do we need partitioning in a software system?

Partitioning, also known as sharding, is the process of dividing a database into smaller, more manageable pieces. It is
needed to:

- Improve performance: By distributing data across multiple servers, partitioning can reduce the load on any single
  server.
- Enhance scalability: Partitioning allows a system to grow by adding more servers as needed.
- Increase availability: If one partition fails, others can continue to operate, improving overall system resilience.

## What is the difference between optimistic and pessimistic locking?

- Optimistic Locking: Assumes that multiple transactions can complete without affecting each other. It checks for
  conflicts before committing a transaction. If a conflict is detected, the transaction is rolled back.
- Pessimistic Locking: Assumes that conflicts will occur and locks the data for the duration of a transaction. Other
  transactions must wait until the lock is released.

## How does MAP Reduce Algorithm work?

MapReduce is a programming model used for processing large data sets in a distributed computing environment. It consists
of two main functions:

- Map: The map function takes an input pair and produces a set of intermediate key-value pairs. The framework then
  groups all intermediate values associated with the same key.
- Reduce: The reduce function takes an intermediate key and a set of values for that key and merges them to form a
  smaller set of values. The final output is a set of key-value pairs.

## What are difference between Symmetric and Asymmetric encryption?

- Symmetric Encryption: Uses the same key for both encryption and decryption. It is faster but requires secure key
  distribution.
- Asymmetric Encryption: Uses a pair of keys (public and private). The public key is used for encryption, and the
  private key is used for
  decryption. It is more secure but slower.

## How does a Certificate Authority (CA) work?

A Certificate Authority (CA) is a trusted entity that issues digital certificates. These certificates verify the
identity of entities (like websites) and enable secure communication. The CA validates the identity of the requester
before issuing a certificate, which contains the public key and the identity information. The CA's digital signature on
the certificate ensures its authenticity.

## What is Blue Green Deployments for Microservices ?
Blue-Green Deployment is a release management strategy that reduces downtime and risk by running two identical
production environments, referred to as "Blue" and "Green". At any time, only one environment is live, serving 
all production traffic.