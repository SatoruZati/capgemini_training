# Enterprise Order Management System

## Problem Statement

An e-commerce organization is building an **Order Lifecycle Management System**.  
Each order moves through predefined states, and its behavior must dynamically change based on its current state.

You must design a system that avoids conditional logic and ensures **type safety and extensibility**.

---

## Requirements

### 1. Order Status Modeling
- Use an `enum` to represent order status:
  - CREATED
  - CONFIRMED
  - SHIPPED
  - DELIVERED
  - CANCELLED

### 2. Behavior Enforcement
- Each order status must have **different behavior**.
- Conditional logic (`if-else`, `switch`) for status handling is **not allowed**.

### 3. Enum & Interface
- Use **enum implementing interface**.
- The interface must define behaviors such as:
  - `canCancel()`
  - `canRefund()`

### 4. Order Entity
Each order must contain:
- Order ID
- Customer Name
- Order Status

### 5. Encapsulation
- Order details must be private.
- State changes must happen only through controlled methods.

### 6. Exception Handling
- Prevent illegal state transitions using **custom unchecked exceptions**.
- Ensure meaningful error messages.

### 7. Polymorphism
- Order behavior must be driven by polymorphism, not condition checks.

---

## Constraints

- No `if-else` or `switch` for order status logic.
- No public fields.
- Entire solution must exist in **one Java file**.

---

## Deliverable

Submit a **single `.java` file** implementing the complete order management system.
