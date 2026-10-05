# Exercises 8 & 10 — Types

## Exercise 8 — Type Detective

For each value, pick the best Java type and justify it in **one sentence.** The justification is the point of the exercise.

| # | Value to store | Type | Why |
|---|---|---|---|
| 1 | A student's age | int | Because it is a whole number |
| 2 | The price of a coffee | double | price includes decimals to the nearest hundredths |
| 3 | Whether a student is enrolled | boolean | because its true or false |
| 4 | A student's middle initial | char | single character |
| 5 | A phone number | string | there are characters besides the numbers |
| 6 | The population of New York City | int | People counted as whole numbers |
| 7 | A test score out of 100 | int | whole number |
| 8 | A GPA | double | contains decimals not only numbers |
| 9 | Whether it is currently raining | boolean | True or False |
| 10 | A student ID like `0074512` | string | Contains quotes |

### Traps to think carefully about

**#5 — Phone number.** It's made of digits, so `int` feels right. Why is it wrong?

[Because it has other characters other than numbers]

**#10 — Student ID.** Same question, plus one more problem `int` would cause.

[Because its in quotes, and int is for something mathematical, string is any text in quotes]

**#6 — Population of NYC.** About 8.3 million. Does that fit in an `int`? What about the population of Earth?

[No because it has a decimal, for population of Earth it would be the same]

---

## Exercise 10 — Your Project's Data (Homework)

Think about your project idea. What are the five most important pieces of information it needs to store?

| # | What it stores | Type | Example value | Why this type |
|---|---|---|---|---|
| 1 | | | | |
| 2 | | | | |
| 3 | | | | |
| 4 | | | | |
| 5 | | | | |

**Is there anything your project needs to store that doesn't fit any of these types?**

[your answer — this is a good question to be stuck on. It's usually a sign you need a *list* of something, or your own class. Both are coming.]
