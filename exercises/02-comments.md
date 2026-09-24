# Exercise 5 — Comment Rescue

Below is a working method with no comments. It runs fine. It is also very hard to understand.

```java
public static double calc(double p, int y, double r) {
    double t = p;
    for (int i = 0; i < y; i++) {
        t = t + (t * r);
    }
    return t - p;
}
```

## Part A — Figure out what it does

**1. What do you think `p`, `y`, and `r` represent?**

p is principal, y is the loan term, r is interest rate

**2. What does the method return?**

The method at the end returns a compounde interest amount

**3. What would you rename each variable and the method itself?**

| Original | Better name |
|---|---|
| `calc` | CompoundInterest |
| `p` | principal|
| `y` | years |
| `r` | rate |
| `t` | total |

## Part B — Rewrite it

Rewrite the method with better names **and** comments. Remember the rule:

> **Bad comments explain *what*. Good comments explain *why*.**

```java

// formula for remaining balance of loan

public static double calculateInterest(double principal, int loanTerm, double interestRate) {
    double balance = principal;
// for every run do this
    for (int year = 0; year < years; year++) {
        balance = balance + (balance * interestRate);
    }
    return balance - principal;

// remember the closing bracket
}

```

## Part C — Reflect

**Which helped a future reader more — the better variable names, or the comments? Defend your answer in two or three sentences.**

Better variable names helped me more because they make the code understandable without needing to read extra comments. The comments are still useful because they explain the purpose of the loop and why the original principal is subtracted at the end.

> There's no single right answer here. Most professionals would say good names reduce the *need* for comments, and comments should then explain the things names can't — assumptions, edge cases, and why a decision was made.
