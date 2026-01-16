# Just-Track
Just Track - A simple budget tracker made in java, made to help you be more financially responsible

## Folder structure
Please note: While this project is being refactored, a lot of the past structure is also maintained, just in case the old code is to be reused in some way. However, the below structure is the plan for the final packages, as the refactoring process is being worked on.
- src
    - main\java
        - db
            - DatabaseConnection.java (provides connection to SQL connection)
        - dao
            - TransactionDAO.java
            - UserDAO. java
        - model
            - Transaction.java
            - User.java
            - TransactionType.java (enum to definite transaction types)
        - service
            - TransactionService.java
            - UserService.java
        - ui
            - TransactionUI.java
            - UserUI. java
        - Main.java

## Features
This budget tracker works as a basac CRUD application (Create, Read, Update, Delete) for your transactions, which are stored in a database for proper retrieval. These are properly assigned their own methods in each later to enable a modular approach to the code. <br>
Transactions done by a user can be evaluated in the following ways:
<br>
- They can be uploaded to the database (Create) 
- They can be read from the database and displayed to the user. (Read) 
- They can be updated by referring to their id (Update) 
- They can be deleted by referring to the same aforementioned id (Delete) 

    
## My experience refactoring code
This is my first time working on a project which requires clear distinction between the several layers, for which I plan to refactor my original idea to a cleaner codebase which is easier to read and add to. Furthurmore, this will enable me to potentially upgrade the project into a full CRUD-based app using Spring boot later in my learning journey.

I planned to refactor mainly since I saw it as a great opportunity to learn how to write better structured code, which would be comparitively easier to read


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
To enable a proper user authentication system and enhance data storage to be better, I expanded my database using MySQL, which is through JDBC.

### Password handling
As quoted by this amazing video (https://www.youtube.com/watch?v=8ZtInClXe1Q&t=146s) I found on password storing by Computerphile, one should ideally NEVER store passwords, which is a flaw I acknowledge in my app currently. However, intead of plain text storing, I plan on using an SHA-256 algorithm, which is handled by predefined classes in java to store the string as a byte array and then process it through 64 rounds of operations, finally producing a 256-bit hash. Currently, the plan is to use MessageDigest to hash the data securely to produce a 64-character irreversible fingerprint to store the password.

### User Authentication
I also wish to implement a basic user authentication system using basic classes to allow multiple users to create multiple accounts on the same device.

 
