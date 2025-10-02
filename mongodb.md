# MongoDB Questions & Answers

## What is replica sets in MongoDB?

A replica set in MongoDB is a group of mongod instances that maintain the same data set, providing redundancy and high
availability. A replica set consists of a primary node and one or more secondary nodes. The primary node receives all
write operations, while secondary nodes replicate the data from the primary and can serve read operations. If the
primary node fails, one of the secondary nodes can be automatically elected as the new primary, ensuring continuous
availability of the database.

## What is sharding in MongoDB?

Sharding is a method for distributing data across multiple servers in MongoDB. It allows for horizontal scaling of the
database by partitioning the data into smaller, more manageable pieces called shards. Each shard is a separate
database instance that holds a subset of the data. Sharding helps to improve performance and handle large datasets by
distributing the load across multiple servers.