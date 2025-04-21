---

# EMI Calculator

## Description

The **EMICalc** program is a simple Java application that calculates the monthly payment (EMI) on a loan based on the principal amount, interest rate, and loan duration in years. The user is prompted to input these values, and the program calculates the EMI using the standard formula for EMI calculation.

## Features

- Accepts the principal loan amount from the user.
- Accepts the annual interest rate (as a percentage).
- Accepts the loan duration in years.
- Calculates and displays the monthly EMI to be paid.

## Formula Used

The formula for calculating the EMI is:

\[
EMI = \frac{P \times r \times (1 + r)^n}{(1 + r)^n - 1}
\]

Where:
- **P** is the principal amount.
- **r** is the monthly interest rate (annual rate divided by 12 and converted to a decimal).
- **n** is the number of months (loan duration in years multiplied by 12).

## Requirements

- Java 8 or higher.

## How to Run

1. Clone or download the project.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse) or a text editor.
3. Compile the program:
   ```bash
   javac EMICalc.java
   ```
4. Run the program:
   ```bash
   java EMICalc
   ```

## Example Output

```
Enter the principal amount: 
100000
Enter the interest rate: 
7.5
Enter the number of years: 
5
Your monthly payment is: 1984.2019048766798
```

## License

This project is licensed under the MIT License - see the LICENSE file for details.

---
