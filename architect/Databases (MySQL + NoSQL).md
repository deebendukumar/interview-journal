# MySQL & NoSQL Interview Questions

## How do you decide between relational and NoSQL databases for a given use case?

It depends on the specific requirements of the application. If the data is structured, requires ACID transactions, and
has complex relationships, a relational database like MySQL is a better fit. On the other hand, if the data is
unstructured or semi-structured, requires horizontal scalability, and has flexible schema requirements, a NoSQL database
like MongoDB or DynamoDB may be more suitable.

## What do we mean by ACID properties in relational databases?

ACID stands for Atomicity, Consistency, Isolation, and Durability. These properties ensure reliable transactions in
relational databases:

- **Atomicity**: Ensures that a transaction is treated as a single unit, which either completes entirely or not at all.
- **Consistency**: Ensures that a transaction brings the database from one valid state to another, maintaining data
  integrity.
- **Isolation**: Ensures that concurrent transactions do not interfere with each other, providing a consistent view of
  the data.
- **Durability**: Ensures that once a transaction is committed, it remains permanent, even in the event of a system
  failure.

## Explain indexing strategies in MySQL for performance tuning.

Indexing is crucial for optimizing query performance in MySQL. Common strategies include:

- **Single-column indexes**: Create indexes on individual columns that are frequently used in WHERE clauses or JOIN
  conditions.
- **Composite indexes**: Create indexes on multiple columns to optimize queries that filter on more than one column.
- **Full-text indexes**: Use for searching large text fields efficiently.
- **Covering indexes**: Create indexes that include all the columns needed for a query, allowing the database to
  retrieve results directly from the index without accessing the table.
- **Regularly analyze and optimize indexes**: Use tools like `EXPLAIN` to understand query execution plans and identify
  missing or unused indexes.

## How do you handle sharding and partitioning in large databases?

Sharding involves distributing data across multiple database instances to improve performance and scalability. Each
shard contains a subset of the data, and the application is responsible for routing queries to the appropriate shard.

## What are common replication strategies for MySQL?

Common replication strategies include:

- **Master-Slave Replication**: One master database handles write operations, while one or more slave databases handle
  read operations. Changes made to the master are asynchronously replicated to the slaves.
- **Master-Master Replication**: Two or more databases act as both masters and slaves, allowing for read and write
  operations on all nodes. This requires conflict resolution mechanisms.
- **Semi-Synchronous Replication**: The master waits for at least one slave to acknowledge the receipt of a transaction
  before committing it, providing a balance between performance and data safety.

## How do you optimize queries for high-traffic applications?

- Use indexing strategies to speed up data retrieval.
- Avoid SELECT * and only retrieve necessary columns.
- Use query caching to store the results of frequently executed queries.
- Optimize JOIN operations by ensuring proper indexing on join columns.
- Analyze and refactor slow queries using the `EXPLAIN` command.

## Which NoSQL databases have you worked with (MongoDB, Cassandra, DynamoDB)?

I have experience with MongoDB, Cassandra, and DynamoDB. Each of these databases has its strengths and is suited for
different use cases. MongoDB is great for document-oriented data, Cassandra excels in handling large volumes of
write-heavy workloads, and DynamoDB is a fully managed service that offers seamless scalability and low latency.

## How do you model data in DynamoDB for scalability?

When modeling data in DynamoDB, I focus on the following principles:

- Use a single table design to minimize the number of tables and optimize for access patterns.
- Choose appropriate partition keys and sort keys to distribute data evenly and support efficient queries.
- Use secondary indexes to enable additional query patterns without duplicating data.
- Denormalize data to reduce the need for complex joins and improve read performance.
- Consider access patterns and design the schema to optimize for the most common queries.

## Can you explain eventual consistency vs. strong consistency in NoSQL?

Eventual consistency means that updates to a database will propagate to all replicas over time, and while the data may
not be immediately consistent across all nodes, it will eventually become consistent. This is common in distributed
systems like Cassandra and DynamoDB.

## What’s your approach to handling schema migrations in production?

I use tools like Flyway or Liquibase to manage schema migrations in production. These tools allow me to version control
database changes and apply them in a controlled manner. I also ensure that migrations are backward compatible, allowing
the application to function correctly during the migration process. Additionally, I perform thorough testing
in staging environments before applying changes to production.

## How do you monitor and resolve deadlocks in relational databases?

Deadlocks occur when two or more transactions are waiting for each other to release locks, resulting in a standstill. To
monitor and resolve deadlocks, I use the following strategies:

- Enable deadlock detection in MySQL and monitor the `SHOW ENGINE INNODB STATUS` output for deadlock information.
- Analyze application logs to identify patterns that lead to deadlocks.
- Implement retry logic in the application to handle deadlock errors gracefully.
- Optimize transaction scopes to minimize the time locks are held and reduce contention.
- Use appropriate isolation levels to balance consistency and concurrency.