https://chatgpt.com/share/a6d28a5e-44d3-4046-ac40-2e51b1d79d04



YourProject/
├── .vscode/
│   ├── settings.json
│   └── launch.json
├── lib/
│   └── mysql-connector-java-8.0.33.jar
├── src/
│   └── MySQLConnection.java
└── bin/ (this will be created after compilation)




javac -d bin -cp "lib/*" src/MySQLConnection.java
This command tells javac to:

-d bin: Place the compiled .class files in the bin directory.
-cp "lib/*": Include all JAR files in the lib directory in the classpath during compilation


Step 3: Run Your Compiled Java Application
After successful compilation, run your Java application with the following command:

Ensure you are still in your project directory in the terminal.

Run:

sh
Copy code
java -cp "lib/*:bin" MySQLConnection
Note: On Windows, use ; instead of : as the classpath separator:

sh
Copy code
java -cp "lib/*;bin" MySQLConnection

IF YOU WANT TO GIVE THE COMPLETE PATH
java  -cp "D:\BK-training-2024\backend-samples\Raj-Samples\ArrayExamples\" ArrayReverse


--------------------------

javac -cp "lib/*" -d bin src/**/*.java

java -cp "lib/*:bin" MySQLConnection


java -cp "lib/*;bin" MySQLConnection



