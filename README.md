# Just-Track
Just Track - A simple budget tracker made in java, made to help you be more financially responsible

## Folder structure
- src
    - services
        - Expense (Main calls this class when an expense is to be recorded)
        - Income (Main calls this class when a source of income is to be recorded)
        - Transaction (Main calls this class when a Transaction is to be recorded)
    - utility
        - DateManager
        - TransactionHandler
        - ExpenseHandler
        - IncomeHandler
        - ReceiptGenerator (Creates CSV file for data stored in ArrayList)
    - Main
    - AuthManager

## What I learned through this project so far
### Object Oriented Programming (OOPS) concepts in java

### Date class in java
Java's DateHandler class how I implemented dates which can be called every time a transaction is made, so that instead of inputting the date manually, if the transaction was made on the same day, the system date is automatically obtained.

If the system date is not properly adjusted on the user's end, an option with confirmation is given to the user, and in that case, the date input is manual.

The same manual way is used if the transaction was not made on the same day.

The date is also formatted using basic substring method, so that the entire complex format is not given, but only the basic date value is printed, instead of the entire String that the Date object is converted into.

### File Handling


## To do (features) 
- Integrate crude form of voice input for data input
- Enable a form of login and user system
- Use basic data visualization either by importing python libraries or ASCII in terminal
