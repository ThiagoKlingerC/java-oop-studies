# 🧬 Inheritance and Polymorphism

This module explores the core principles of Object-Oriented Programming (OOP) that allow for code reuse, specialization, and flexibility through dynamic behavior.

### 🧪 Concepts Practiced:

* **Inheritance (`extends`):** Creating hierarchies where subclasses inherit attributes and methods from a superclass (e.g., `Account` -> `BusinessAccount`).
* **Method Overriding (`@Override`):** Redefining superclass methods in subclasses to provide specific behaviors (e.g., different withdrawal fees for different accounts).
* **The `super` Keyword:** Accessing and reusing constructors and methods from the parent class within the child class.
* **Polymorphism:** Using a superclass variable to point to subclass objects, allowing the program to decide which method to call at runtime (Dynamic Binding).
* **Casting:** Practicing **Upcasting** (safe) and **Downcasting** (using `instanceof` for safety).
* **Abstract Classes and Methods:** Using `abstract` to prevent instantiation of generic classes and forcing subclasses to implement specific logic (e.g., the `tax()` method in the TaxPayer exercise).

---

### 📂 Exercises Included:

1.  **Bank Account System:** Introduction to inheritance, `protected` modifiers, and the difference between common, savings, and business accounts.
2.  **Employee Payments:** A practical example of polymorphism using a list of employees where outsourced workers have a different payment rule.
3.  **Product Price Tags:** Use of `switch-case` and method overriding to generate specific labels for common, used, and imported products.
4.  **TaxPayer System (Abstract Methods):** A complex exercise using abstract classes to calculate taxes for Individuals and Companies based on different fiscal rules.

---

### 💡 Key Takeaways:

1.  **Abstract Classes:** They act as a "blueprint", ensuring that every subclass follows a specific contract (methods) without providing a generic implementation that shouldn't exist.
2.  **Code Reusability:** Inheritance avoids boilerplate code, while the `super` keyword allows us to build upon existing logic rather than replacing it entirely.
3.  **Flexibility:** Polymorphism allows the system to be easily extended. Adding a new type of "Product" or "TaxPayer" requires minimal changes to the main logic.