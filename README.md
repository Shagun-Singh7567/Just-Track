# Just-Track
Just Track - A simple budget tracker made in java, made to help you be more financially responsible

## Folder structure
- src
    - auth
        - AuthManager
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


## What I learned through this project so far

### Date class in java
Java's DateHandler class how I implemented dates which can be called every time a transaction is made, so that instead of inputting the date manually, if the transaction was made on the same day, the system date is automatically obtained.

If the system date is not properly adjusted on the user's end, an option with confirmation is given to the user, and in that case, the date input is manual.

The same manual way is used if the transaction was not made on the same day.

The date is also formatted using basic substring method, so that the entire complex format is not given, but only the basic date value is printed, instead of the entire String that the Date object is converted into.

### File Handling
To enable data storage at a basic level, I used the FileWriter and BufferWriter classes in java to enable the data provided by the user to be stored in a csv file. The comma seperated format makes it easy for the formatting to be done line by line. 

Earlier, I tried using the PrintWriter class for this purpose. However, this prevented the csv file to be persistent, and store the data permanently. 

This experience of working with the different classes which enable file handling helped me form a fundamental understanding of how input and output works in java. 


### Connection to MySQL Database and using JDBC 
To enable a proper user authentication system, I plan to expand my database using MySQL, which I'm curently learning to work with. For the meantime, there are placeholder methods that don't do much except handle passwords and work with user input, but this is going to be expanded on soon.

### Password handling
As quoted by this amazing video (https://www.youtube.com/watch?v=8ZtInClXe1Q&t=146s) I found on password storing by Computerphile, one should ideally NEVER store passwords, which is a flaw I acknowledge in my app currently. However, intead of plain text storing, I plan on using an SHA-256 algorithm, which is handled by predefined classes in java to store the string as a byte array and then process it through 64 rounds of operations, finally producing a 256-bit hash. Currently, the plan is to use MessageDigest to hash the data securely to produce a 64-character irreversible fingerprint to store the password.

### User Authentication
I also wish to implement a basic user authentication system using basic classes to allow multiple users to create multiple accounts on the same device.

## My experience refactoring code
This is my first time working on a project which requires clear distinction between the several layers, for which I plan to refactor my original idea to a cleaner codebase which is easier to read and add to. Furthurmore, this will enable me to potentially upgrade the project into a full CRUD-based app using Spring boot later in my learning journey. 