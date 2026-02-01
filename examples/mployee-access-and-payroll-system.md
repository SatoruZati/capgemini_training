# Employee Access and Payroll System

## Problem Statement

A company requires a **secure employee payroll system** where sensitive data must be protected, and access should be strictly controlled based on roles.

You are required to design this system using **encapsulation, abstraction, polymorphism, and exception handling**.

---

## Requirements

### 1. Employee Model
Each employee must have:
- Employee ID
- Name
- Role
- Salary

### 2. Encapsulation
- Salary must be `private`.
- Direct access to salary is prohibited.
- Salary updates must go through controlled setters.

### 3. Authorization Rules
- Only HR role is allowed to modify salary.
- Unauthorized access must be blocked.

### 4. Abstraction
- Use an interface to define payroll behavior.
- Implement payroll differently for:
  - Full-time employees
  - Contract employees

### 5. Polymorphism
- Use method overriding for payroll calculation.
- Use method overloading where applicable.

### 6. Exception Handling
- Custom unchecked exception:
  - `UnauthorizedAccessException`
- Custom checked exception:
  - `InvalidSalaryException`
- Demonstrate exception propagation and proper handling.

---

## Constraints

- No public variables.
- No duplicate logic.
- No misuse of static methods.
- Entire solution must be written in **a single Java file**.

---

## Deliverable

Submit a **single `.java` file** implementing the payroll system.