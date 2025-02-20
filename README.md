# Title: Console-Based CRUD Application Using JDBC API

Description:
----------------------------------------------------------------------------
Developed a console-based Java application that performs all possible CRUD (Create, Read, Update, Delete) operations using JDBC API. This project interacts with a relational database, showcasing my expertise in Java programming, SQL execution, and database management.

Key Features:
-----------------------------------------------------------------------------
✅ Establishes a seamless connection with the database using JDBC
✅ Implements CRUD operations for effective data management
✅ Uses PreparedStatement to prevent SQL injection
✅ Handles transactions to maintain data integrity
✅ Follows exception handling and best coding practices

🚀 Steps Followed in JDBC API:
-----------------------------------------------------------------------------
1️. Load the JDBC Driver – Class.forName("com.mysql.cj.jdbc.Driver");
2️. Establish a Connection – Connection con = DriverManager.getConnection(url, user, password);
3️. Create a Statement – PreparedStatement stmt = con.prepareStatement(query);
4️. Execute SQL Queries – stmt.executeUpdate(); or ResultSet rs = stmt.executeQuery();
5️. Process the Results – Iterate over ResultSet to fetch data
6️. Close the Connection – con.close(); to free up resources

Technologies Used:
🔹 Java (Core & Advanced)
🔹 JDBC API
🔹 MySQL / PostgreSQL (or any DB used)
🔹 SQL Queries

This project deepened my understanding of database connectivity, query optimization, and efficient data handling in Java applications.

