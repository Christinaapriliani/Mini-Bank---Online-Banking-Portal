# Bank CHRISTINA - Online Banking Portal

This is a simple online banking portal project for Bank CHRISTINA built using Spring Boot.

## Features

- View account information.
- Transfer funds between accounts.
- View transaction history.

## Project Structure

bank_christina_online_banking/
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ ├── com/
│ │ │ │ ├── christina/
│ │ │ │ │ ├── onlinebanking/
│ │ │ │ │ │ ├── controller/
│ │ │ │ │ │ │ ├── AccountController.java
│ │ │ │ │ │ ├── model/
│ │ │ │ │ │ │ ├── Account.java
│ │ │ │ │ │ │ ├── Transaction.java
│ │ │ │ │ │ ├── service/
│ │ │ │ │ │ │ ├── AccountService.java
│ │ │ │ │ │ │ ├── AccountServiceImpl.java
│ │ │ │ │ │ │ ├── TransactionService.java
│ │ │ │ │ │ │ ├── TransactionServiceImpl.java
│ │ │ │ │ │ ├── web/
│ │ │ │ │ │ │ ├── HomeController.java
├── pom.xml
└── README.md

## Usage

1. Clone the repository.
2. Build the project using Maven.
3. Run the application using `java -jar target/bank-christina-online-banking.jar`.
4. Access the web application by visiting `http://localhost:8080` in your browser.

## License

This project is licensed under CHRISTINA License.