# Just-Track
Just Track - A simple budget tracker made in java, made to help you be more financially responsible

## Folder structure
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
This was my first time working on a project which required clear distinction between the several layers, for which I refactored my original idea to a cleaner codebase which is easier to read and add to. Furthurmore, this will enable me to potentially upgrade the project into a full CRUD-based app using Spring boot later in my learning journey.

I planned to refactor mainly since I saw it as a great opportunity to learn how to write better structured code, which would be comparitively easier to read.


## What I learned through this project

### Working with Maven
I learned how to utilize Maven, an important build tool for Java applications. Modifying the pom.xml file taught me how dependencies can be added and modified to fit the needs of the application.

### Date handling
Before JDBC and SQL integration, I had used Java's DateHandler class to implement dates which can be called every time a transaction is made, so that instead of inputting the date manually, if the transaction was made on the same day, the system date is automatically obtained. The date was also formatted using basic substring method, so that the entire complex format was not given, but only the basic date value was printed, instead of the entire String that the Date object was converted into.

After the addition of the SQL database, I used the Timestamp data type in SQL, which automatically fetched the date from the user's system and avoided any formatting issues in the database.

### Enums
Through this project, I also learned to work with enums on a surface level. The enum 'TransactionType' provided a robust and reliable variable type for type of transactions.

### File Handling
Before utilizing a proper database on this application, I had worked on a simple file handling system as a temporary makeshift database.

To enable data storage at a basic level, I used the FileWriter and BufferWriter classes in java to enable the data provided by the user to be stored in a csv file. The comma seperated format made it easy for the formatting to be done line by line. 

Earlier, I tried using the PrintWriter class for this purpose. However, this prevented the csv file to be persistent, and store the data permanently. 

This experience of working with the different classes which enable file handling helped me form a fundamental understanding of how input and output works in java.

### Connection to MySQL Database and using JDBC 
To enable a proper user authentication system and enhance data storage to be better, I expanded my database using MySQL, which is through JDBC. Learning to write PreparedStatements and Statements and ResultSets was a major part of learning these processes.


### Error and exception handling
At several places, I also added try-catch blocks to handle exceptions related to input mismatch or SQL exceptions. This helped me think about edge cases where the situation turns out to be different than the ideal conditions.

 
