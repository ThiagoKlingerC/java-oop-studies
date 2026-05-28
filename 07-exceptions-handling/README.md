# 🛠️ Exceptions Handling

This module focuses on building robust, reliable, and fault-tolerant applications by mastering Java's Exception Handling mechanisms. The goal is to separate business logic from error handling, ensuring that systems gracefully recover from unexpected user inputs or domain violations without crashing.

### Concepts Practiced:

* **`try-catch` Blocks:** Intercepting and handling specific runtime exceptions to maintain application stability.
* **`finally` Block:** Guaranteeing resource cleanups (such as closing the `Scanner` object) regardless of whether an exception occurs.
* **Custom Domain Exceptions:** Extending `RuntimeException` to create specific, meaningful business rule exceptions (`DomainException`).
* **Architecture Evolution:** Moving from a tightly-coupled error checking model (`if-else` in the main application) to a clean, centralized exception-driven design.

---

### Exercises Included:

#### 1. Hotel Reservation System
A classic exercise implemented in three distinct versions to understand architectural maturity:
* **Version 1 (Bad Solution):** Validation logic mixed inside the `Program` layer using chained `if-else` statements.
* **Version 2 (Acceptable Solution):** Validation moved to the `Reservation` entity, but returning a `String` error status, causing bloated conditional checks in the main execution.
* **Version 3 (Optimal Solution):** Fully decoupled architecture using a custom `DomainException` and a clean `try-catch` workflow for true encapsulation.

#### 2. Account Withdrawal System
A practical challenge simulating real-world banking business rules:
* Validates if a withdrawal amount exceeds the account's specified `withdrawLimit`.
* Validates if the account has enough `balance` for the operation.
* Employs structured multi-catch blocks to catch both targeted domain violations and generic input mismatch issues (such as users entering alphabetic characters for numeric values).