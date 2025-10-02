# Lazy Loading in React – Architecturally-minded Overview

## What is Lazy Loading?

A technique to defer the initialization of a resource until it is actually needed.
In React, this typically means loading components, modules, or data only when they are about to be rendered or
interacted with.
Goals: reduce initial bundle size, improve perceived performance, and optimize resource usage.

## Why it matters at the solution-architect level
* Performance & Time-to-Interactive (TTI): Smaller initial payloads lead to faster TTI, improving user experience on
slower networks.
* Cost & Resource Efficiency: Fewer resources loaded upfront reduces bandwidth, CPU, and memory on low-powered devices.
* Scalability of the Frontend: Enables progressive enhancement and feature flagging without expanding the initial bundle.
* Operational Considerations: Easier A/B testing, feature rollouts, and rollback strategies when features are isolated.