# Calculator
A simple calculator that performs basic arithmetic operations such as addition, subtraction, multiplication and division.

# Prerequisites
Java Development Kit (JDK)
Java Integrated Development Environment (IDE)

# Installation
1. Clone the repository to your local machine.
2. Open the project in your preferred IDE.
3. Build and run the project.

# Usage
Use the buttons on the calculator interface to enter numbers and perform operations.
The result of the operation will be displayed in the text field.
To clear the current calculation, press the "C" button.

# Code
The code for the calculator is written in Java and uses the Java Swing library to create the user interface. The Calculator class extends JFrame and implements ActionListener to handle user interactions with the calculator buttons. The calculator interface is built in the buildCalculator method and the arithmetic operations are performed in the actionPerformed method. The Main class contains the main method which is the entry point of the program. It creates an instance of the Calculator class and calls the buildCalculator() method to build the graphical user interface for the calculator. The Main class imports the javax.swing.* and java.awt.* packages to use the Swing components and the Abstract Window Toolkit (AWT) for creating the graphical interface.
