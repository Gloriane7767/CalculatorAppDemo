🧮 Console Calculator App

A simple yet powerful console-based calculator application built in Java (Maven project).
This app allows users to perform basic mathematical operations such as addition, subtraction, multiplication, and division — with support for multiple operands, continuous calculations, and robust error handling.

🚀 Features

✅ Basic Operations: Addition, Subtraction, Multiplication, and Division

➕➖ Multiple Operands: Addition and subtraction can handle any number of operands

🔄 Continuous Mode: The app keeps running until the user decides to exit

⚠️ Exception Handling: Graceful handling of invalid inputs and division by zero

🧪 JUnit Tests: Each mathematical operation is tested for correctness

🏗️ Maven Project: Easy to build, run, and extend

📂 Project Structure
calculator-app/
│── src/main/java/com/gloriane/
│   └── CalculatorAppDemo.java   # Main console application
│
│── src/test/java/com/gloriane/
│   └── CalculatorAppTest.java   # JUnit tests
│
│── pom.xml                      # Maven configuration
│── README.md                    # Project documentation

⚙️ Requirements

Java 8 or higher

Maven 3.x or higher

▶️ How to Run

Clone the repository:

git clone https://github.com/Gloriane7767/calculator-app.git
cd calculator-app


Build the project with Maven:

mvn clean install


Run the application:

mvn exec:java -Dexec.mainClass="com.gloriane.CalculatorAppDemo"

🧑‍💻 Usage Example
Welcome to Calculator!
Enter first number: 10
Enter operation (+, -, *, /): *
Enter second number: 5
Result: 50.0
Continue? (y/n): y

Enter first number: 20
Enter operation (+, -, *, /): /
Enter second number: 0
Error: Cannot divide by zero!
Continue? (y/n): n
Goodbye!

🧪 Running Tests

To verify the correctness of all operations:

mvn test

📌 Future Improvements

Add support for advanced operations (square root, power, modulus, etc.)

Introduce a GUI-based version

Store calculation history

🤝 Contributing

Contributions are welcome! Feel free to fork the repository, create a feature branch, and submit a pull request.

📜 License

This project is licensed under the MIT License.
