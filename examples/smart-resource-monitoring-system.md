# Smart Resource Monitoring & Failure Recovery System

## Problem Statement

A backend monitoring tool tracks system resources such as CPU, memory, and disk usage.  
The system must detect abnormal conditions and recover gracefully without crashing.

You are required to implement this system using **abstraction, polymorphism, encapsulation, and robust exception handling**.

---

## Requirements

### 1. Resource Abstraction
Define a resource template that declares:
- `getUsage()`
- `checkHealth()`

### 2. Resource Types
Implement at least:
- CPU Resource
- Memory Resource
- Disk Resource

### 3. Abstraction Strategy
- Use **partial abstraction** where shared behavior exists.
- Use **full abstraction** where behavior differs.

### 4. Encapsulation
- Resource usage values must be private.
- All updates must go through validated setters.

### 5. Exception Handling
- Custom checked exception:
  - `ResourceOverloadException`
- Custom unchecked exception:
  - `CriticalFailureException`

### 6. Recovery & Stability
- Demonstrate:
  - Exception propagation
  - Multiple catch blocks
  - `finally` block usage
- System must not terminate abruptly.

---

## Constraints

- No switch-case allowed.
- No public fields.
- Entire implementation must be in **one Java file**.

---

## Deliverable

Submit a **single `.java` file** implementing the resource monitoring system.
