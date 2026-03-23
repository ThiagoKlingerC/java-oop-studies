# 📅 Date-Time API in Java

This module covers the modern Java Time API (introduced in Java 8), focusing on how to handle dates, times, and time zones correctly.

### Concepts Practiced:
* **Core Classes:** Using `LocalDate` (date only), `LocalDateTime` (date and time), and `Instant` (global time in UTC).
* **Parsing and Formatting:** Converting strings to dates and vice versa using `DateTimeFormatter`.
* **Time Zones:** Converting `Instant` to local time using `ZoneId`.
* **Date-Time Arithmetic:** Adding and subtracting time units with `plus` and `minus` methods.
* **Duration Calculation:** Calculating the time interval between two moments using the `Duration` class.

### Key Takeaways:
1. **Immutability:** Java Time objects are immutable; any modification creates a new object.
2. **ISO 8601:** By default, Java uses the international standard for date representation.