*****STEPS HOW TO SETUP JAVA IN OUR SYSTEMS:- 
---------------------------------------------------------------------------
Java ko apne system me setup karne ke liye tumhe kuch steps follow karne padhenge. Main Windows, Mac, aur Linux systems ke liye instructions bataunga.

### Step 1: Download and Install Java Development Kit (JDK)
JDKJava Development Kitko install karna hota hai, kyunki isi ke through tum Java applications ko run aur compile kar paoge.

#### 1.1 **Visit the Official Oracle Website:**
   - Go to [Oracle's Java Download page](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Download the latest version of **JDK** according to your systemWindows, Mac, or Linux).

#### 1.2 **Install JDK:**
   - **Windows:**
     1. Download the JDK installer `.exe` file.
     2. Double-click the installer and follow the instructions to install.
     3. By default, JDK will install in the directory `C:\Program Files\Java\jdk-version`.

   - **Mac:**
     1. Download the `.dmg` file from the website.
     2. Double-click the file and follow the instructions to install JDK.

   - **Linux:**
     - Open terminal and run the following commands:
       ```bash
       sudo apt update
       sudo apt install openjdk-17-jdk
       ```
     - This will install the JDK on your system.

### Step 2: Set Up Environment Variables
After installing Java, tumhe system me **JAVA_HOME** environment variable set karna hoga, taaki system ko pata chale ki Java kahaan install hai.

#### 2.1 **For Windows:**
1. Right-click on **This PC** or **My Computer** and click **Properties**.
2. Click **Advanced system settings**.
3. Click **Environment Variables**.
4. Under **System Variables**, click **New** and add the following:
   - Variable Name: `JAVA_HOME`
   - Variable Value: The path where JDK is installed, e.g., `C:\Program Files\Java\jdk-version`.
5. Find the **Path** variable in the list, select it, and click **Edit**.
6. Click **New** and add `%JAVA_HOME%\bin` to the list.
7. Click **OK** on all windows.

#### 2.2 **For Mac and Linux:**
1. Open a terminal.
2. Edit the `~/.bash_profile`for Mac) or `~/.bashrc` (for Linuxfile:
   ```bash
   nano ~/.bash_profile  # For Mac
   nano ~/.bashrc        # For Linux
   ```
3. Add the following lines:
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home # Mac only
   export PATH=$JAVA_HOME/bin:$PATH
   ```
4. Save the file and run `source ~/.bash_profile` or `source ~/.bashrc` to apply the changes.

### Step 3: Verify Java Installation
Java installation ko verify karne ke liye tum command line/terminal me check kar sakte ho.

1. **Open Command Prompt (Windows)** or **Terminal (Mac/Linux)**.
2. Type the following command:
   ```bash
   java -version
   ```
   If Java is successfully installed, you will see the installed version like this:
   ```
   java version "17.0.1" 2021-10-19 LTS
   Java(TMSE Runtime Environmentbuild 17.0.1+12-LTS-39)
   Java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12-LTS-39, mixed mode)
   ```

### Step 4: Install an IDEIntegrated Development Environment)
Java development ke liye IDE ka use karna kaafi helpful hota hai. IDE tumhe code likhne, debug karne, aur manage karne me madad karta hai.

1. **IntelliJ IDEA (Recommended):**
   - Download: [IntelliJ IDEA](https://www.jetbrains.com/idea/download)
   - Install it, and then open it.
   - Start a new project and choose Java as the project type.

2. **Eclipse:**
   - Download: [Eclipse](https://www.eclipse.org/downloads/)
   - Install it and create a new Java project.

3. **VS Code (with Java extensions):**
   - Download: [Visual Studio Code](https://code.visualstudio.com/)
   - Install the **Java Extension Pack** from the extensions marketplace.

### Step 5: Write Your First Java Program
Now that Java is set up, you can write and run your first program.

#### 5.1 Using Command Line:
1. Open a text editor (like Notepad or VS Codeand write this simple Java program:
   ```java
   public class HelloWorld {
       public static void main(String[] args) {
           System.out.println("Hello, World!");
       }
   }
   ```
2. Save the file as `HelloWorld.java` in a folder of your choice.
3. Open the command prompt/terminal, navigate to the folder where you saved the file using the `cd` command, and compile the program:
   ```bash
   javac HelloWorld.java
   ```
4. After compiling, run the program:
   ```bash
   java HelloWorld
   ```

You should see the output:
```
Hello, World!
```

#### 5.2 Using an IDE:
1. Open your IDEIntelliJ or Eclipse).
2. Create a new Java project.
3. Write the same "Hello World" program in the editor.
4. Click **Run** to execute the program.

====================================================================================================================
>>> Writing Your First Java Program - Let's Break It Down
Here's the classic Hello World program in Java, which we'll break down line by line.

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!"); // This will print Hello, World! on the screen
    }
}
Explanation:

public class HelloWorld:

public: public means this class can be accessed from anywhere.
class: Class is the blueprint of objects in Java.
HelloWorld: is the name of the class. It should match the file name (HelloWorld.java).

public static void main(String[] args):

public: This means the main method can be accessed by the JVM from anywhere.
static: This means we can call the main method without creating an instance of the class.
void: This method doesn't return any value.
main: This is the entry point of every Java application. When you run the program, this method gets executed first.
String[] args: This is an array of strings that stores command-line arguments. We won't use this now, but it's good to know.

System.out.println():

System: This is a built-in class in Java that provides access to system resources like input and output.
out: This is the standard output streamusually your console or terminal).
println: This method prints whatever is inside the parentheses and moves to a new line.
=============================================================================================================

Public Class: Agar aapki class ko public declare kiya gaya hai, to file ka naam bhi us class ke naam se match karna chahiye. Yani agar aapki class ka naam HelloWorld hai, to file ka naam HelloWorld.java hona chahiye.

Non-Public Class: Agar class public nahi hai, to file ka naam us class ke naam se match karne ki zaroorat nahi hai. Lekin, ye best practice hai ki aap file ka naam kisi bhi class ke naam se match karein jo us file mein pehli bar declare ki gayi ho.

import java.util.*; ka matlab hai java.util package ke saare classes ko include karna aur ek saath saare classes ko access kar lena, jo Java programming mein kaafi useful hote hain.

Case Sensitivity

Java is a case-sensitive language, which means that the identifiers AB, Ab, aB , and ab are different in Java.

System.out.println("GeeksforGeeks"); // valid syntax
system.out.println("GeeksforGeeks"); // invalid syntax because of the first letter of System keyword is always in uppercase. 

Java Identifiers Kya Hote Hain?
Identifiers aise names hote hain jo aap Java mein variables, classes, methods, aur other entities ko define karne ke liye use karte hain. Identifiers ko samajhne ke liye kuch important points hain:

1. Identifier Rules
Identifiers ke liye kuch specific rules hote hain:

Alphabetic Characters: Identifiers sirf lettersa-z, A-Z), digits (0-9), underscore (_), aur dollar sign$) se shuru ho sakte hain. Lekin, pehli character letter ya underscore ya dollar sign hona chahiye.

Valid Examples:

myVariable
number1
_temp
$price
Invalid Examples:

1stVariabledigit se shuru nahi ho sakta)
my-variablehyphen nahi allow hai)
Case Sensitivity: Identifiers case-sensitive hote hain. Matlab myVariable aur MyVariable alag identifiers hain.

Reserved Keywords: Aap identifiers ke roop mein Java ke reserved keywordsjese int, class, public, etc.) ka use nahi kar sakte. Ye keywords Java ki syntax ka hissa hote hain.

2. Identifier Naming Conventions
Java mein identifiers ke naam rakhne ke liye kuch best practices hain:

Meaningful Names: Identifiers ka naam aisa hona chahiye jo us variable ya class ke purpose ko clearly bataye. Jaise:

studentName better hai sn.
Camel Case: Variables aur method names mein camelCase convention use karna accha hota hai (e.g., myVariableName).

Pascal Case: Class names mein PascalCase convention use karna chahiyee.g., StudentDetails).

3. Examples of Identifiers
java
Copy code
public class Student {
    // Valid Identifiers
    private String studentName;
    private int studentAge;
    
    // Method with valid identifier
    public void displayInfo({
        System.out.println("Name: " + studentName + ", Age: " + studentAge);
    }
}
4. Summary
Identifiers aise names hote hain jo aap Java mein entities ko define karne ke liye use karte hain.
Inhe specific rules aur conventions follow karne chahiye.
Meaningful aur descriptive names rakhna hamesha behtar hota hai.

Java Keywords

Keywords or Reserved words are the words in a language that are used for some internal process or represent some predefined actions. These words are therefore not allowed to use as variable names or objects.

abstract

assert

boolean

break

byte

case

catch

char

class

const

continue

default

do

double

else

enum

extends

final

finally

float

for

goto

if

implements

import

instanceof

int

interface

long

native

new

package

private

protected

public

return

short

static

strictfp

super

switch

synchronized

this

throw

throws

transient

try

void

volatile

while
==============================================================================================================================

Chalo, ab hum **Java variables** ke baare mein detail se samajhte hain, aur aaram se karenge. **Variables** Java mein ek basic concept hai jisse hum data ko store karte hain aur us data ko manipulate kar sakte hain.

### Variables Kya Hote Hain?

Java mein **variables** woh containers hote hain jisme hum data ko store karte hain. Har variable ka ek specific **data type** hota hai, jo define karta hai ki usme kis type ka data store hogajaise `int` for integers, `String` for text, etc.).

### 1. **Types of Variables**
Java mein teen tarah ke variables hote hain:
- **Local Variables**
- **Instance Variables (Non-Static Fields)**
- **Static Variables (Class Variables)**

#### 1.1 **Local Variables**
- Local variables method ke andar declare kiye jaate hain, aur sirf us method ke andar hi use kiye jaa sakte hain.
- Ye variables sirf tabhi exist karte hain jab method execute ho raha ho.

  **Example**:
  ```java
  public void calculateSum({
      int num1 = 10; // Local variable
      int num2 = 20; // Local variable
      int sum = num1 + num2;
      System.out.println("Sum: " + sum);
  }
  ```

#### 1.2 **Instance Variables**
- Instance variables class ke andar, lekin kisi method ke bahar declare kiye jaate hain.
- Ye variables **non-static** hote hain, matlab inka ek unique copy hota hai har object ke liye.
  
  **Example**:
  ```java
  public class Student {
      String studentName; // Instance variable
      int studentAge;     // Instance variable
  }
  ```

#### 1.3 **Static Variables**
- Static variables ko **class level** par declare kiya jaata hai, aur ye variables class ke saath hi belong karte hain.
- Static variables ka ek hi copy hota hai, jo saare objects ke liye common hota hai.

  **Example**:
  ```java
  public class Student {
      static String schoolName = "ABC School"; // Static variable
  }
  ```

### 2. **Variable Declaration and Initialization**

Variables ko declare karte waqt aapko uska **data type** aur **naam** specify karna hota hai, aur uske baad aapko usme value assign kar sakte ho.

#### Declaration:
```java
int age;  // Data type: int, Variable name: age
```

#### Initialization:
```java
age = 25;  // Variable age ko value assign ki gayi
```

#### Declaration and Initialization Together:
```java
int age = 25;  // Ek hi line mein variable declare aur initialize kiya
```

### 3. **Variable Naming Conventions**
- Variable names should start with a **letter**a-z, A-Zor an **underscore**`_`), and should be meaningful.
- Follow **camelCase** conventione.g., `studentAge`, `totalMarks`).

### 4. **Primitive Data Types**
Java mein kuch common primitive data types hote hain jo variables ke liye use kiye jaate hain:
- `int`integers): e.g., `int age = 25;`
- `float` (floating-point numbers): e.g., `float price = 10.99f;`
- `double` (large floating-point numbers): e.g., `double salary = 50000.75;`
- `char` (characters): e.g., `char grade = 'A';`
- `boolean`true/false values): e.g., `boolean isStudent = true;`

### 5. **Example of Variables in a Java Program**

public class Student {
    // Instance Variables
    String name;
    int age;
    
    // Static Variable
    static String schoolName = "ABC School";
    
    public void displayInfo() {
        // Local Variables
        String info = name + " is " + age + " years old and studies in " + schoolName;
        System.out.println(info);
    }

    public static void main(String[] args) {
        // Object creation
        Student student1 = new Student();
        student1.name = "Rahul";
        student1.age = 18;
        student1.displayInfo();
    }
}


### 6. **Variable Scope**
- **Local Variables**: Sirf us method ke andar accessible hote hain jahan declare kiye gaye hain.
- **Instance Variables**: Class ke andar har object ke liye available hote hain.
- **Static Variables**: Class ke level par hote hain, aur har object ke liye shared hote hain.

### Summary
- Java variables alag-alag types ke hote hainlocal, instance, static).
- Har variable ka ek specific scope aur lifetime hota hai.
- Java mein variable ko declare karte waqt uska type aur naam define karna padta hai.
=========================================================================================================================
1. Primitive Data Types

Primitive data types woh basic data types hote hain jo Java mein pre-defined hote hain aur directly values ko store karte hain. Ye sabse simple data types hain aur inka fixed memory size hota hai.

Primitive Data Types ke Examples:

int: Integer valuese.g., int age = 25;)
float: Floating-point numbers (e.g., float price = 19.99f;)
double: Larger floating-point numberse.g., double salary = 50000.50;)
char: Single characters (e.g., char grade = 'A';//Supports Unicode Character in java not ASCII
boolean: True/false valuese.g., boolean isStudent = true;)
byte, short, long: Different integer types with different ranges.
Characteristics of Primitive Data Types:

Inka size fixed hota hai (e.g., int ka size 4 bytes hota hai).
Ye values ko directly memory mein store karte hain.
Inka default value hota hai, jaise int ka default 0 hota hai aur boolean ka default false.
Primitive data types call by value follow karte hain, matlab ye copy of value pass karte hain, reference nahi.

2. Non-Primitive Data Types

Non-Primitive data types, ya Reference Types, woh types hain jo Java mein classes aur objects ko define karte hain. Ye user-defined hote hain aur inka size fixed nahi hota, ye reference ke through memory mein store hote hain.

Non-Primitive Data Types ke Examples:

String: Sequence of characters (e.g., String name = "Rahul";)
Arrays: Collection of similar type values (e.g., int[] numbers = {1, 2, 3};)
Classes: User-defined types (e.g., Student, Employee)
Interfaces: Abstraction ke liye use hoti hain.
Characteristics of Non-Primitive Data Types:

Inka size fixed nahi hota; ye dynamically change ho sakte hain.
Ye reference ke through memory mein store hote hain, aur reference variable memory address ko point karta hai.
Inka default value null hota hai, agar inko initialize nahi kiya gaya ho.
Non-primitive data types mein call by reference ka concept hota hai, matlab ye object ke reference ko pass karte hain, value ko nahi.
Comparison Table:
Feature	Primitive Data Types	Non-Primitive Data Types
Size	Fixed	Not Fixed
Stored in	Stack memorydirectly)	Heap memory (through reference)
Default Value	Depends on typee.g., int = 0)	null
Examples	int, char, boolean, etc.	String, Array, Class, Interface
Call by	Value	Reference
Memory Allocation	Less memory required	More memory required
Example:
java
Copy code
// Primitive data type example
int age = 30;
boolean isStudent = false;

// Non-Primitive data type example
String name = "Rahul";
int[] scores = {90, 85, 88}; // Array of integers
Summary:
Primitive types simple data ko directly store karte hain aur memory mein fixed size rakhte hain.
Non-Primitive types complex data structures hain jo objects aur references ko store karte hain, aur inka size fixed nahi hota.
--------------------------------------------------------------------------------------------------------------------------------
JAVA UNICODE Globally adopted character hai jo har language ko support karta hai aur saare characters aur symbols ko use karta hai to jisse ki aap koi bhi symbol use kar sakte hain aur koi bhi characters use kar sakte hain but ASCII me kewal English charaters ko hi use kiya jaata hai 

Size of Unicode - 16 Bit , 32 Bit 
Size of ASCII - 7-8 Bits
===================================================================================================================================

Operators in JAVA:- 

Operators basically used for performing some calculations and operations. Operatoers make tasks like multiplication , addition , comaprison etc.

1- Arithmetic Operators
2- Unary Operators
3- Assignment Operator
4- Relational Operators
5- Logical Operators
6- Ternary Operator
7- Bitwise Operators
8- Shift Operators
9- instance of operator
-------->>>>>>
1. Arithmetic Operators
Ye to aapko samajh aa gaya hoga, bas addition, subtraction, multiplication, etc. ke liye hote hain:

+, -, *, /, %
Ye sab simple mathematical operations ke liye kaam aate hain.

2. Unary Operators
Ye operators ek hi operand par kaam karte hain (matlab sirf ek variable ke saath use hote hain):

+ (Positive sign)
- (Negative sign)
++ (Increment: Value ko 1 se badhata hai)
-- (Decrement: Value ko 1 se ghatata hai)
! (Logical NOT: Jo bhi boolean value hai, uska opposite kar deta hai)
Example:

int a = 5;
System.out.println(++a);  // Pehle increment, fir print: Output 6
System.out.println(a--);  // Pehle print, fir decrement: Output 6

3. Assignment Operators
Ye operators variables mein values ko assign karne ke liye kaam aate hain. Common ones:

= (Basic assignment: a = 5;)
+=, -=, *=, /= : Combine karte hain operations aur assignment ko.
Example:

int a = 5;
a += 2;  // Same as a = a + 2, now a becomes 7

4. Relational Operators
Ye operators do values ko compare karte hain aur result boolean (true/false) mein hota hai:

== (Equal to)
!= (Not equal to)
> (Greater than)
< (Less than)
>= (Greater than or equal to)
<= (Less than or equal to)

5. Logical Operators
Jab aapko multiple conditions check karni ho to ye kaam aate hain:

&& (Logical AND)
|| (Logical OR)
! (Logical NOT)
Example:

int a = 10, b = 5;
System.out.println(a > b && b > 0);  // Output: true
System.out.println(a > b || b < 0);  // Output: true

6. Ternary Operator
Ye ek concise form hai if-else condition ko likhne ka. Iska syntax hota hai:

condition ? valueIfTrue : valueIfFalse;
Example:

int a = 10, b = 5;
String result = (a > b) ? "a is greater" : "b is greater";
System.out.println(result);  // Output: "a is greater"

7. Bitwise Operators
Ye operators binary values (bits) par kaam karte hain. Ye aapko abhi immediately zaroori nahi hain, but samajhne ke liye:

& (AND)
| (OR)
^ (XOR)
~ (NOT)
Example (Bit-level comparison):

int a = 5;  // In binary: 0101
int b = 3;  // In binary: 0011
System.out.println(a & b);  // Output: 1 (Binary: 0001) (Jo Output aayega left ya Right Shift ka wo decimal ke equivalent aayegaa kyuki binary me internally process karta hai computer and output me decimal ke equivalent show hota hai)

8. Shift Operators
Ye bits ko left ya right shift karte hain:

<< (Left shift)
>> (Right shift)
>>> (Unsigned right shift)
Example:


int a = 5;  // Binary: 0101
System.out.println(a << 1);  // Output: 10 (Binary: 1010, shifts 1 bit left)

9. instanceof Operator
Ye operator check karta hai ki koi object kis class ka instance hai. Ye aapko object-oriented programming mein aage kaam aayega.

Example:

String str = "Hello";
boolean result = str instanceof String;  // Output: true
=====================================================================================================================================
1. Variable kya hai?

Ek variable memory ka ek location hai jismein hum data store karte hain. Variable ek naam ke saath associate hota hai aur jab hum is naam ko refer karte hain, toh system memory mein us data tak pahunchta hai.

Syntax:

java
Copy code
dataType variableName = value;
Example:

int age = 25;
Yahaan int data type hai, age variable ka naam hai, aur 25 uska assigned value hai.

2. Variable ke Types
Java mein humare paas teen main types ke variables hote hain:

Local Variable
Instance Variable
Static Variable

Chalo, inko ek-ek karke discuss karte hain.

a) Local Variable
Local variables woh variables hote hain jo kisi specific method, constructor, ya block ke andar declare hote hain.
Yeh variables sirf usi method ya block mein access hote hain jismein yeh declare hote hain.
Local variables ko initialize karna mandatory hai, warna compiler error dega.
Example:

public class Example {
    public void display() {
        int localVariable = 10; // local variable
        System.out.println("Local Variable: " + localVariable);
    }
}

b) Instance Variable
Instance variables class ke andar declare hote hain, par kisi specific method ya block ke andar nahi.
Yeh variables har instance (ya object) ke liye alag-alag hote hain.
Yeh automatically default value ke saath initialize hote hain agar hum khud value assign nahi karte.
Example:

public class Example {
    int instanceVariable = 5; // instance variable

    public void display() {
        System.out.println("Instance Variable: " + instanceVariable);
    }
}

c) Static Variable
Static variables class ke andar static keyword ke saath declare kiye jate hain.
Yeh variables class ke sabhi objects ke liye common hote hain.
Inko access karne ke liye object ki zaroorat nahi hoti, hum inko class name ke through bhi access kar sakte hain.
Example:

public class Example {
    static int staticVariable = 20; // static variable

    public static void display() {
        System.out.println("Static Variable: " + staticVariable);
    }
}

3. Variable Naming Rules
Variable names case-sensitive hote hain (e.g., Age aur age alag hain).
Names mein spaces allowed nahi hain, aur start letter ya underscore (_) se hona chahiye, number se nahi.
Reserved keywords (like int, class) ko variable name ke taur par use nahi kar sakte.

4. Data Types ke Saath Variable Declaration
Java mein har variable ka ek specific data type hota hai jo define karta hai ki kis type ka data woh store karega. Example:

int age = 30;        // integer type
double salary = 5000.75;  // decimal type
char grade = 'A';     // character type
boolean isActive = true; // boolean type
====================================================================================================================
Java mein **literals** woh fixed values hote hain jo directly code mein assign kiye jaate hain aur ye values program mein run-time pe change nahi hoti. Yeh literals alag-alag data types ke hisaab se categorize kiye jaate hain, jaise:

1. **Integer Literals** - Yeh integer type ki values ko represent karte hain, jaise `10`, `200`, `-5` etc.
2. **Floating-Point Literals** - Yeh decimal numbers ya floating-point numbers ko represent karte hain, jaise `3.14`, `2.5`, `-0.01` etc.
3. **Character Literals** - Yeh single character ko represent karte hain aur single quotes (`' '`) ke andar likhe jaate hain, jaise `'A'`, `'z'`, `'1'` etc.
4. **String Literals** - Yeh ek sequence of characters ko represent karte hain aur double quotes (`" "`) ke andar likhe jaate hain, jaise `"Hello"`, `"Java"`, `"123"` etc.
5. **Boolean Literals** - Yeh sirf `true` ya `false` value ko represent karte hain, jaise `true` ya `false`.

In literals ka use variables ko initialize karne mein hota hai aur yeh directly values assign karte hain bina kisi expression ya calculation ke.
===============================================================================================================================================

Decision Making in Java (if, if-else, switch, break, continue, jump)
Last Updated : 18 Feb, 2023
Decision Making in programming is similar to decision-making in real life. In programming also face some situations where we want a certain block of code to be executed when some condition is fulfilled. 

A programming language uses control statements to control the flow of execution of a program based on certain conditions. These are used to cause the flow of execution to advance and branch based on changes to the state of a program. 

Java’s Selection statements: 

if
if-else
nested-if
if-else-if
switch-case
jump – break, continue, return

1. if: if statement is the most simple decision-making statement. It is used to decide whether a certain statement or block of statements will be executed or not i.e if a certain condition is true then a block of statements is executed otherwise not. 

Syntax: 

if(condition) 
{
   // Statements to execute if
   // condition is true
}

Here, the condition after evaluation will be either true or false. if statement accepts boolean values – if the value is true then it will execute the block of statements under it. 
If we do not provide the curly braces ‘{‘ and ‘}’ after if( condition ) then by default if statement will consider the immediate one statement to be inside its block. For example, 

if(condition)  //Assume condition is true
   statement1;  //part of if block
   statement2;    // separate from if block

// Here if the condition is true 
// if block will consider statement1 as its part and executes in only true condition
// statement2 will be separate from the if block so it will always executes whether the condition is true or false.
if-statement-in-java

Example:

import java.util.*;
 
class IfDemo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i < 15)
            System.out.println("Inside If block"); // part of if block(immediate one statement after if condition)
            System.out.println("10 is less than 15"); //always executes as it is outside of if block
        // This statement will be executed
        // as if considers one statement by default again below statement is outside of if block
        System.out.println("I am Not in if");
    }
}

Output
Inside If block
10 is less than 15
I am Not in if

Time Complexity: O(1)
Auxiliary Space : O(1)

2. if-else: The if statement alone tells us that if a condition is true it will execute a block of statements and if the condition is false it won’t. But what if we want to do something else if the condition is false? Here comes the else statement. We can use the else statement with the if statement to execute a block of code when the condition is false. 

Syntax: 

if (condition)
{
    // Executes this block if
    // condition is true
}
else
{
    // Executes this block if
    // condition is false
}

if-else-statement

Example:

import java.util.*;
 
class Ifelse Demo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i < 15)
            System.out.println("i is smaller than 15");
        else
            System.out.println("i is greater than 15");
    }
}

Output
i is smaller than 15

Time Complexity: O(1)
Auxiliary Space : O(1)

3. nested-if: A nested if is an if statement that is the target of another if or else. Nested if statements mean an if statement inside an if statement. Yes, java allows us to nest if statements within if statements. i.e, we can place an if statement inside another if statement. 

Syntax: 

if (condition1) 
{
   // Executes when condition1 is true
   if (condition2) 
   {
      // Executes when condition2 is true
   }
}

nested-if

Example:

import java.util.*;
 
class NestedIf Demo {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }
    }
}
Output
i is smaller than 15
i is smaller than 12 too

Time Complexity: O(1)
Auxiliary Space: O(1)

4. if-else-if ladder: Here, a user can decide among multiple options.The if statements are executed from the top down. As soon as one of the conditions controlling the if is true, the statement associated with that ‘if’ is executed, and the rest of the ladder is bypassed. If none of the conditions is true, then the final else statement will be executed. There can be as many as ‘else if’ blocks associated with one ‘if’ block but only one ‘else’ block is allowed with one ‘if’ block.

if (condition)
    statement;
else if (condition)
    statement;
.
.
else
    statement;

Example:

import java.util.*;
 
class ifelseif Demo {
    public static void main(String args[])
    {
        int i = 20;
 
        if (i == 10)
            System.out.println("i is 10");
        else if (i == 15)
            System.out.println("i is 15");
        else if (i == 20)
            System.out.println("i is 20");
        else
            System.out.println("i is not present");
    }
}
Output
i is 20

Time Complexity: O(1)
Auxiliary Space: O(1)

5. switch-case: The switch statement is a multiway branch statement. It provides an easy way to dispatch execution to different parts of code based on the value of the expression. 

Syntax: 

switch (expression)
{
  case value1:
    statement1;
    break;
  case value2:
    statement2;
    break;
  .
  .
  case valueN:
    statementN;
    break;
  default:
    statementDefault;
}


import java.io.*;
 
class GFG {
    public static void main (String[] args) {
        int num=20;
          switch(num){
          case 5 :  System.out.println("It is 5");
                    break;
          case 10 : System.out.println("It is 10");
                    break;
          case 15 : System.out.println("It is 15");
                    break;
          case 20 : System.out.println("It is 20");
                    break;
          default:  System.out.println("Not present");
             
        }
    }
}
Output

It is 20

Time Complexity: O(1)

Space Complexity: O(1)

The expression can be of type byte, short, int char, or an enumeration. Beginning with JDK7, the expression can also be of type String.
Duplicate case values are not allowed.
The default statement is optional.
The break statement is used inside the switch to terminate a statement sequence.
The break statements are necessary without the break keyword, statements in switch blocks fall through.  
If the break keyword is omitted, execution will continue to the next case.
6. jump: Java supports three jump statements: break, continue and return. These three statements transfer control to another part of the program. 

Break: In Java, a break is majorly used for: 
Terminate a sequence in a switch statement (discussed above).
To exit a loop.
Used as a “civilized” form of goto.
Continue: Sometimes it is useful to force an early iteration of a loop. That is, you might want to continue running the loop but stop processing the remainder of the code in its body for this particular iteration. This is, in effect, a goto just past the body of the loop, to the loop’s end. The continue statement performs such an action. 
continue-in-java

Example:




// Java program to illustrate using
// continue in an if statement
import java.util.*;
 
class ContinueDemo {
    public static void main(String args[])
    {
        for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(i + " ");
        }
    }
}
Output
1 3 5 7 9 
Time Complexity: O(1)
Auxiliary Space: O(1)

Return: The return statement is used to explicitly return from a method. That is, it causes program control to transfer back to the caller of the method.
Example:




// Java program to illustrate using return
import java.util.*;
 
public class Return {
    public static void main(String args[])
    {
        boolean t = true;
        System.out.println("Before the return.");
 
        if (t)
            return;
 
        // Compiler will bypass every statement
        // after return
        System.out.println("This won't execute.");
    }
}
Output
Before the return.
Time Complexity: O(1)
Auxiliary Space: O(1)
===============================================================================================================================================
Strings in JAVA - 

Strings is an object that represents a sequence of characters and every characters is stored in 16 bits of using UTF-16 encoding and strings acts same as an array of characters in java. and it also acts like a data type.

Ways of Creating a String -
There are two ways to create a string in Java: 

1- String Literal
2- Using new Keyword
Syntax:  

<String_Type> <string_variable> = "<sequence_of_string>"; 

1. String literal
To make Java more memory efficient (because no new objects are created if it exists already in the string constant pool). 

Example:

String demoString = “GeeksforGeeks”;

2. Using new keyword
String s = new String(“Welcome”);
In such a case, JVM will create a new string object in normal (non-pool) heap memory and the literal “Welcome” will be placed in the string constant pool. The variable s will refer to the object in the heap (non-pool)
In the given example only one object will be created. Firstly JVM will not find any string object with the value “Welcome” in the string constant pool, so it will create a new object. After that it will find the string with the value “Welcome” in the pool, it will not create a new object but will return the reference to the same instance.

Example:

String demoString = new String (“GeeksforGeeks”);

NOTE- Strings are immutable which means a constant that cannot be changed once it is created. If wish to changed the value then it will always create the new object. 
======================================================================================================================================

Java me loops ka use hum repeated tasks ko simplify karne ke liye karte hain. Jab hume same code baar-baar execute karna hota hai, toh loop help karta hai us task ko efficiently perform karne me, bina same code baar-baar likhe.

### Types of Loops in Java

Java me mainly **3 types** ke loops hote hain:

1. for loop
2. while loop
3. do-while loop

Ab in teeno ko detail me samajhte hain:

### 1. **for loop**

`for loop` ka use tab hota hai jab hume kisi block of code ko fixed number of times repeat karna ho. Isme initialization, condition aur increment/decrement sab ek hi line me likhte hain.

**Syntax:**

for (initialization; condition; update) {
    // code to be executed
}
```

**Example:**

for (int i = 1; i <= 5; i++) {
    System.out.println("Hello, World! " + i);
}
```

**Explanation:**

- `int i = 1;` → Initialization (yaha hum i ko 1 set kar rahe hain)
- `i <= 5;` → Condition (loop tab tak chalega jab tak i ki value 5 se choti ya barabar hai)
- `i++` → Update (har iteration ke baad i ki value 1 se badh jaayegi)

Ye code output me "Hello, World!" 5 baar print karega.

---

### 2. **while loop**

`while loop` ka use tab hota hai jab hume pehle condition check karni ho aur phir code execute karna ho. Agar condition false hai toh loop shuru se hi execute nahi hoga.

**Syntax:**

while (condition) {
    // code to be executed
}
```

**Example:**

int i = 1;
while (i <= 5) {
    System.out.println("Counting: " + i);
    i++;
}
```

**Explanation:**

- Pehle `i = 1` se start hota hai.
- Jab tak `i <= 5` hai, loop chalega aur har baar `i` ki value 1 se badhegi.
- Ye loop bhi 5 baar chalega aur `Counting: 1` se `Counting: 5` tak print karega.

---

### 3. **do-while loop**

`do-while loop` thoda different hai kyunki ye pehle code execute karta hai aur phir condition check karta hai. Matlab ye loop at least ek baar toh execute hoga hi.

**Syntax:**

do {
    // code to be executed
} while (condition);
```

**Example:**

int i = 1;
do {
    System.out.println("Counting (do-while): " + i);
    i++;
} while (i <= 5);
```

**Explanation:**

- Yaha bhi pehle `i = 1` hai.
- Sabse pehle `System.out.println` line execute hogi, phir condition `i <= 5` check hogi.
- Agar condition true hai, toh loop phir se chalega.

Isme bhi output "Counting (do-while): 1" se leke "Counting (do-while): 5" tak aayega.

### Summary

| Loop Type   | Description                        | Condition Check |
|-------------|------------------------------------|-----------------|
| `for loop`  | Fixed repetitions ke liye          | Pehle condition check hoti hai |
| `while loop` | Condition-based repetitions ke liye | Pehle condition check hoti hai |
| `do-while loop` | At least ek baar run karna zaroori hai | Baad me condition check hoti hai |

### Real-Life Example:-   

Agar hume kisi array ke elements ko print karna hai, toh hum `for loop` ka use kar sakte hain:

int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
==============================================================================================================================

Great! Strings in Java ek bahut hi important topic hai, aur kai programming scenarios mein kaam aata hai. Chalo, step-by-step Strings ke basics se shuru karte hain:

### 1. **String Introduction:**
   - **String** ek non-primitive data type hai jo character ka sequence store karta hai.
   - Java mein Strings ko `" "` (double quotes) mein define kiya jata hai, jaise `"Hello World"`.
   - Strings Java mein immutable (unchangeable) hoti hain, matlab ek baar create hone ke baad unka content change nahi ho sakta.

### 2. **String Creation:**
   Java mein String create karne ke do tareeke hain:
   - **String Literal**:
     ```java
     String str1 = "Hello"; // Directly quotes ke through create kiya
     ```
   - **Using the `new` Keyword**:
     ```java
     String str2 = new String("Hello"); // Ye explicit way hai String object banane ka
     ```

### 3. **Common String Methods:**
   String ke saath kaam karne ke liye Java mein kai helpful methods hote hain. Kuch important methods yahan diye hain:

   - **length()**: String ki length return karta hai.
     ```java
     String str = "Hello";
     System.out.println(str.length()); // Output: 5
     ```

   - **charAt(int index)**: Given index par character return karta hai.
     ```java
     System.out.println(str.charAt(1)); // Output: 'e'
     ```

   - **substring(int beginIndex, int endIndex)**: String ka ek part (substring) return karta hai.
     ```java
     System.out.println(str.substring(1, 4)); // Output: "ell"
     ```

   - **toUpperCase() / toLowerCase()**: String ko uppercase ya lowercase mein convert karta hai.
     ```java
     System.out.println(str.toUpperCase()); // Output: "HELLO"
     ```

   - **equals()**: Do Strings ke content ko compare karta hai.
     ```java
     String str2 = "Hello";
     System.out.println(str.equals(str2)); // Output: true
     ```

   - **contains()**: Check karta hai ki ek substring String mein hai ya nahi.
     ```java
     System.out.println(str.contains("ll")); // Output: true
     ```

### 4. **Concatenation (Joining Strings):**
   - **Using `+` Operator**:
     ```java
     String firstName = "John";
     String lastName = "Doe";
     String fullName = firstName + " " + lastName;
     System.out.println(fullName); // Output: "John Doe"
     ```

   - **Using `concat()` Method**:
     ```java
     System.out.println(firstName.concat(lastName)); // Output: "JohnDoe"
     ```

### 5. **Example Code:**

   ```java
   public class StringExample {
       public static void main(String[] args) {
           String name = "OpenAI";
           System.out.println("Original String: " + name);

           // Length
           System.out.println("Length: " + name.length());

           // Character at index
           System.out.println("Character at index 1: " + name.charAt(1));

           // Substring
           System.out.println("Substring from index 1 to 4: " + name.substring(1, 4));

           // Uppercase and Lowercase
           System.out.println("Uppercase: " + name.toUpperCase());
           System.out.println("Lowercase: " + name.toLowerCase());

           // Concatenation
           String greeting = "Hello, ";
           String message = greeting + name;
           System.out.println("Greeting message: " + message);
       }
   }
   ```

Is example mein humne kaafi saari String methods ko use kiya hai. Ab tum in methods ko apne code mein use karke practice kar sakte ho.
=================================================================================================================================
Bilkul! Pehle hum `StringBuilder` aur `StringBuffer` ke concepts ko samjhte hain aur fir inka working aur use dekhenge. Java mein strings **immutable** hote hain, iska matlab jab bhi aap kisi string ko modify karte ho (e.g., append, concatenate), to uska ek naya object create hota hai. Yeh inefficient ho sakta hai jab aapko frequent string modifications karne hote hain. Is problem ka solution hai **StringBuilder** aur **StringBuffer**, jo **mutable** hain aur efficiently modify kiye ja sakte hain.

### 1. StringBuilder
**StringBuilder** Java mein ek class hai jo mutable strings ke liye use hoti hai. Iska matlab hai ki aap ek `StringBuilder` object ko modify kar sakte ho bina naye objects banaye.

- **Fast and Efficient**: `StringBuilder` ko **single-threaded environments** mein use karte hain kyunki ye **thread-safe** nahi hai.
- **Modifications**: Ismein aap `append`, `insert`, `delete`, aur `reverse` jaise methods ka use kar sakte ho bina naye objects create kiye.

#### Example and Explanation
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb.toString()); // Output: Hello World
```

**Explanation**:
1. `StringBuilder sb = new StringBuilder("Hello");`
   - Yahan pe humne ek `StringBuilder` object `sb` banaya hai jismein initial value "Hello" hai.
   
2. `sb.append(" World");`
   - `append` method use karke hum " World" ko "Hello" ke saath concatenate karte hain. 
   - Yahan koi naya object create nahi hota, ye directly `sb` ke content mein hi modification karta hai.
   
3. `System.out.println(sb.toString());`
   - `toString()` method se `sb` ke current value ko hum print karte hain, jo ab `Hello World` ho gaya hai.

### 2. StringBuffer
**StringBuffer** bhi `StringBuilder` ki tarah ek mutable string ko represent karta hai, lekin ye **thread-safe** hota hai. Matlab, ye **synchronized** hai aur ismein simultaneous modifications safe hain. Iska use multi-threaded environments mein hota hai jahan multiple threads ko same string modify karna ho.

- **Slightly Slower**: Kyunki `StringBuffer` synchronized hai, ye `StringBuilder` se thoda slow hota hai.
- **Thread Safety**: Agar multiple threads ek hi `StringBuffer` object pe kaam kar rahe hain, toh ye safe hai aur koi `inconsistent data` issue nahi aayega.

#### Example and Explanation
```java
StringBuffer sbf = new StringBuffer("Good");
sbf.append(" Morning");
System.out.println(sbf.toString()); // Output: Good Morning
```

**Explanation**:
1. `StringBuffer sbf = new StringBuffer("Good");`
   - Yahan humne ek `StringBuffer` object `sbf` create kiya hai jismein initial value "Good" hai.
   
2. `sbf.append(" Morning");`
   - `append` method se " Morning" ko "Good" ke saath concatenate kiya ja raha hai. Ismein bhi koi naya object create nahi hota.

3. `System.out.println(sbf.toString());`
   - `toString()` method se hum final value "Good Morning" print karte hain.

### Difference Between StringBuilder and StringBuffer

| Feature               | StringBuilder                   | StringBuffer                    |
|-----------------------|---------------------------------|---------------------------------|
| **Mutability**        | Mutable                         | Mutable                         |
| **Thread Safety**     | Not Thread-Safe (Fast)          | Thread-Safe (Synchronized)      |
| **Performance**       | Faster (in single-threaded)     | Slower (due to synchronization) |
| **Use Case**          | Single-threaded environments    | Multi-threaded environments     |

### Important Methods in StringBuilder and StringBuffer

1. **`append(String str)`**: String ke end mein specified string ko add karta hai.
   ```java
   sb.append("text");
   ```

2. **`insert(int offset, String str)`**: String ke specific index par specified string ko insert karta hai.
   ```java
   sb.insert(5, "text");
   ```

3. **`delete(int start, int end)`**: Specified range ke characters ko delete karta hai.
   ```java
   sb.delete(2, 5);
   ```

4. **`reverse()`**: String ke characters ko reverse karta hai.
   ```java
   sb.reverse();
   ```

5. **`replace(int start, int end, String str)`**: Specified range ke characters ko replace karta hai given string ke saath.
   ```java
   sb.replace(1, 4, "text");
   ```

### Example Showing More Methods
```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");                 // Adds " World" to "Hello"
sb.insert(6, "Beautiful ");           // Inserts "Beautiful " at index 6
sb.replace(0, 5, "Hi");               // Replaces "Hello" with "Hi"
sb.delete(3, 12);                     // Deletes characters from index 3 to 12
sb.reverse();                         // Reverses the entire string
System.out.println(sb.toString());    // Prints the final modified string
```

### Summary
- **StringBuilder**: Efficient for frequent string modifications in **single-threaded** environments. Fast but not thread-safe.
- **StringBuffer**: Suitable for **multi-threaded** environments where thread safety is important, though slightly slower due to synchronization.

### Key Takeaway
String modifications ke liye `StringBuilder` aur `StringBuffer` bohot powerful tools hain. Dono mein difference sirf thread-safety ka hai, aur ye decide karta hai kaunsa class use hoga based on your environment.
============================================================================================================================================

Arrays in Java:- 

Arrays programming mein data ki efficiently store aur manage karne ka ek tareeka hai. Java mein array ek data structure hai jo **fixed-size** aur **same type** ke elements ko ek sath store karta hai.Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. They are useful for managing collections and storing the data efficiently. The size of an array is fixed, and its elements can be accessed using their **indexing Value**.

Why use Arrays?: Jab hume multiple values ko ek saath handle karna hota hai aur unka size fix hota hai, tab arrays ka use karte hain.

2. Array Ka Syntax (Declaration and Initialization)
Java me Array ko banane ke 3 main steps hote hain:

Declaration: Array ka naam batate hain.
Creation: Memory allocate hoti hai.
Initialization: Values assign hoti hain.

Example 1: Ek Array Banate Hain

public class ArrayExample {
    public static void main(String[] args) {
        // Step 1: Declaration
        int[] numbers; 
        
        // Step 2: Creation
        numbers = new int[5]; // Array ka size 5 hai
        
        // Step 3: Initialization
        numbers[0] = 10;  
        numbers[1] = 20;  
        numbers[2] = 30;  
        numbers[3] = 40;  
        numbers[4] = 50;  

        // Array ko print karna
        System.out.println("Array ke elements hain:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

Output:

Array ke elements hain:
10
20
30
40
50

3. Array Ka Declaration Aur Initialization Shortcut
Agar hume ek hi line me array ko declare aur initialize karna hai to hum shortcut use karte hain:

public class ArrayShortcut {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Direct initialization
        
        System.out.println("Array ke elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

Output:

Array ke elements:
10
20
30
40
50

4. Array Ki Properties

Fixed Size: Array ka size banne ke baad change nahi hota.
Indexing: Array ka index 0 se shuru hota hai.
Length: Array ka size nikalne ke liye array.length ka use hota hai.

5. Array Ka Looping
Arrays ko traverse karne ke liye hum 2 tarike use karte hain:

For Loop
Enhanced For Loop (for-each loop)

Example 2: Enhanced For Loop

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Enhanced For Loop ka use:");
        for (int num : numbers) { // num array ke har ek element ko represent karega
            System.out.println(num);
        }
    }
}
Output:

Enhanced For Loop ka use:
10
20
30
40
50

6. Common Mistake - Array Index Out of Bounds
Jab hum invalid index ko access karte hain, to error aata hai:
Array
public class ArrayError {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        System.out.println("Invalid Index Access:");
        System.out.println(numbers[5]); // Error aayega yahan
    }
}
Output:

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
Ye error tab aata hai jab hum array ki limit se bahar ki value ko access kar rahe hote hain like size=5; , and we want to access the ith value of 6th position
==========================================================================================================================
2D Array:-
2D Array is like a grid (Matrix). where data is stored in rows and columns. It is same as like 1D array in which we can store multiple values of same data type in the form of rows and columns.

Syntax of an array:-
dataType[][] arrayName = new dataType[rows][columns]; //datatype could be anything 
Ex- int[][] arr = new int[3][4]; // A 2D array with 3 rows and 4 columns.
==========================================================================================================================================
Methods or Functions - 
In java we called functions is a method. Function ek block of code hota hai jo ek specific task perform karta hai.
🔹 Code ko reuse karne ke liye functions ka use hota hai.
🔹 Har Java program main() method se start hota hai.
🔹 Functions ko methods bhi bola jata hai Java me.
1. Function Kya Hota Hai? (Sabse Basic Definition)
💡 Imagine Karo: Tum ek chai ka thela chala rahe ho!
Agar har customer ke liye tum manually chai banao, to kya hoga?
👉 Time waste hoga
👉 Energy zyada lagegi
👉 Har baar same kaam repeat karna padega

🛠 Solution:
Ek automatic chai-making machine le lo!

Tum sirf button dabao aur chai ready ho jayegi.
Bar-bar same kaam karne ki zaroorat nahi hai.
Har baar same quality ka output milega.
💡 Java me functions wahi chai-making machine jaisa kaam karte hain!
Ek function likh do jo ek baar kaam kare.
Usko jitni baar chaho call kar ke use kar sakte ho.
Code reusability badhti hai, time bachta hai, aur error kam hoti hai.
📌 2. Function Ka Structure (Deep Explanation)
💡 Ek function likhne ke 3 steps hote hain:
✔ Function Declaration (Batao function exist karega)
✔ Function Definition (Uska kaam likho)
✔ Function Calling (Usko use karo)

🔹 Function Syntax Samjho:

returnType functionName(parameters) {
    // Function body (jo kaam function karega)
    return value;  // Agar koi value return karni ho
}

💡 Breakdown (Har cheez deeply):
✅ returnType → Function kya return karega? (e.g. int, String, void)
✅ functionName → Function ka naam meaningful hona chahiye (camelCase me likhna best practice hai).
✅ parameters → Function ke inputs hote hain (optional hote hain).
✅ return → Function agar koi value return karega to yaha likhna padega (optional).


📌 1. Java Me Functions Kitne Types Ke Hote Hain?
Java me functions ko 2 categories me divide kiya jata hai:

🔹 (A) Predefined Functions (Built-in)
👉 Ye functions already Java ke library me available hote hain.
👉 Hume bas unko call karna hota hai, likhna nahi padta.
👉 Example: Math.sqrt(), System.out.println(), Arrays.sort(), etc.

🔹 (B) User-Defined Functions
👉 Ye functions hum khud likhte hain.
👉 Jab koi task baar-baar repeat ho raha ho, to hum usko function me likh lete hain.

📌 2. Predefined Functions (Built-in Functions)
Java me bahut saare built-in functions hote hain jo already defined hote hain.
💡 Inka use karne ke liye hume sirf function ko call karna hota hai.

🔹 Example: Math Class Ke Functions
Java ke Math class me bahut saare useful functions hote hain:

Function	Kaam Kya Karta Hai?	Example Output
Math.sqrt(x)	Square root nikalta hai	Math.sqrt(25) → 5.0
Math.pow(a, b)	a ki power b nikalta hai	Math.pow(2, 3) → 8.0
Math.abs(x)	Absolute value nikalta hai	Math.abs(-10) → 10
Math.max(a, b)	Max value return karta hai	Math.max(5, 9) → 9
Math.min(a, b)	Min value return karta hai	Math.min(5, 9) → 5

public class Main {
    public static void main(String[] args) {
        System.out.println(Math.sqrt(25));   // 5.0
        System.out.println(Math.pow(2, 3));  // 8.0
        System.out.println(Math.abs(-10));   // 10
        System.out.println(Math.max(5, 9));  // 9
        System.out.println(Math.min(5, 9));  // 5
    }
}
📌 Output:

5.0
8.0
10
9
5
📌 3. User-Defined Functions
User-Defined Functions wo hote hain jo hum khud likhte hain.
Inko 4 types me divide kiya jata hai:

Function Type	Return Type	Parameters
1️⃣ No Return, No Parameters	❌ No Return	❌ No Parameters
2️⃣ No Return, With Parameters	❌ No Return	✅ With Parameters
3️⃣ With Return, No Parameters	✅ With Return	❌ No Parameters
4️⃣ With Return, With Parameters	✅ With Return	✅ With Parameters

📌 4. User-Defined Function Types (Deep Explanation)
🔹 (1) No Return, No Parameters
✅ Koi input nahi leta
✅ Koi value return nahi karta
👉 Bas function call karo, aur ye kuch print kar dega

public class Main {
    static void sayHello() { // Function Declaration + Definition
        System.out.println("Hello, Welcome to Java!");
    }

    public static void main(String[] args) {
        sayHello(); // Function Call
    }
}
📌 Output:

Hello, Welcome to Java!
🔹 (2) No Return, With Parameters
✅ Koi input leta hai (parameters)
❌ Koi value return nahi karta
👉 Function call karte waqt input dena hota hai

public class Main {
    static void greet(String name) { // Function with parameter
        System.out.println("Hello " + name + ", Welcome!");
    }

    public static void main(String[] args) {
        greet("Rahul");
        greet("Aman");
    }
}
📌 Output:

Hello Rahul, Welcome!
Hello Aman, Welcome!
🔹 (3) With Return, No Parameters
❌ Koi input nahi leta
✅ Ek value return karta hai

public class Main {
    static int getNumber() { // Function return karega
        return 100;
    }

    public static void main(String[] args) {
        int num = getNumber();
        System.out.println("The number is: " + num);
    }
}
📌 Output:
The number is: 100

🔹 (4) With Return, With Parameters
✅ Koi input leta hai (parameters)
✅ Ek value return karta hai

java
Copy
Edit
public class Main {
    static int add(int a, int b) { // Function return karega
        return a + b;
    }

    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);
    }
}
📌 Output:
Sum: 30
====================================================================================================================================
## 🔥 **Method Overloading in Java – Step by Step Deep Explanation**  

Method Overloading ek **compile-time polymorphism** ka example hai jisme **ek hi naam ke multiple methods** hote hain, lekin **unke parameters different hote hain**.  

### **📌 Step 1: What is Method Overloading?**  
Jab ek **class ke andar ek hi naam ke multiple methods** hote hain, par **unki parameters list different hoti hai**, tab **method overloading hoti hai**.  

🔹 **Same method name, but different parameters**  
🔹 **Return type does not matter**  
🔹 **Java automatically decides which method to call based on arguments**  

---

### **📌 Step 2: Example of Method Overloading**
```java
public class OverloadingExample {
    // Method 1: Add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method 2: Add three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method 3: Add two double values
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 integers: " + add(5, 10));      // Calls method 1
        System.out.println("Sum of 3 integers: " + add(5, 10, 15));  // Calls method 2
        System.out.println("Sum of 2 doubles: " + add(5.5, 2.5));   // Calls method 3
    }
}
```
✅ **Output:**  
```
Sum of 2 integers: 15  
Sum of 3 integers: 30  
Sum of 2 doubles: 8.0  
```

📌 **🔍 How does Java choose the method?**  
- Jab hum `add(5, 10)` likhte hain, compiler **2 integers accept karne wale method** ko dhundhta hai.  
- Jab hum `add(5, 10, 15)` likhte hain, compiler **3 integers accept karne wale method** ko dhundhta hai.  
- Jab hum `add(5.5, 2.5)` likhte hain, compiler **2 double values accept karne wale method** ko dhundhta hai.  

---

### **📌 Step 3: Rules for Method Overloading**
1️⃣ **Method name same hona chahiye**  
2️⃣ **Parameters different hone chahiye (type, number, or sequence)**  
3️⃣ **Return type alag ho sakta hai, but sirf return type change karne se overloading nahi hogi!**  
4️⃣ **Static ya non-static hone ka koi farq nahi padta**  

---

### **📌 Step 4: Wrong Example (Why Only Return Type Change is NOT Overloading?)**
❌ **Invalid Overloading Example:**
```java
public class WrongExample {
    static int add(int a, int b) {
        return a + b;
    }

    // ❌ ERROR! Same method signature but different return type
    static double add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(5, 10));  
    }
}
```
✅ **Ye code compile nahi hoga! Kyunki sirf return type change karne se overloading nahi hoti.**  

---

### **📌 Step 5: Different Ways to Achieve Method Overloading**
#### **1️⃣ By Changing Number of Parameters**
```java
class OverloadExample {
    static void show(int a) {
        System.out.println("Integer: " + a);
    }

    static void show(int a, int b) {
        System.out.println("Two Integers: " + a + ", " + b);
    }

    public static void main(String[] args) {
        show(10);       // Calls method with 1 parameter
        show(10, 20);   // Calls method with 2 parameters
    }
}
```

---

#### **2️⃣ By Changing Data Type of Parameters**
```java
class OverloadExample {
    static void show(int a) {
        System.out.println("Integer: " + a);
    }

    static void show(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        show(10);   // Calls method with int
        show(10.5); // Calls method with double
    }
}
```

---

#### **3️⃣ By Changing Sequence of Parameters**
```java
class OverloadExample {
    static void show(int a, double b) {
        System.out.println("Int and Double: " + a + ", " + b);
    }

    static void show(double a, int b) {
        System.out.println("Double and Int: " + a + ", " + b);
    }

    public static void main(String[] args) {
        show(10, 20.5); // Calls method (int, double)
        show(10.5, 20); // Calls method (double, int)
    }
}
```

---

### **📌 Step 6: Real-Life Use Case of Method Overloading**
Imagine a calculator app jisme **addition, subtraction, multiplication, etc.** karni ho. Different types of inputs ke liye alag-alag methods likhna inefficient hoga.  

#### ✅ **Calculator Using Method Overloading**
```java
class Calculator {
    // Addition of two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Addition of three integers
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Addition of two doubles
    static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Addition of 2 integers: " + add(5, 10));
        System.out.println("Addition of 3 integers: " + add(5, 10, 15));
        System.out.println("Addition of 2 doubles: " + add(2.5, 3.5));
    }
}
```

---

### **📌 Step 7: Why Use Method Overloading?**
✅ **Readability** – Same method name use karne se code readable hota hai.  
✅ **Reusability** – Bar-bar naye method likhne ki zaroorat nahi hoti.  
✅ **Clean & Structured Code** – Method names manage karna easy hota hai.  
✅ **Code Optimization** – Jyada efficient aur optimized programming.  

---

### **📌 Step 8: When NOT to Use Method Overloading?**
🔴 **Jab Methods Ka Kaam Bilkul Alag Ho** – Agar ek method `calculateInterest()` hai aur doosra `printStatement()`, to alag naam hi better hai.  
🔴 **Jab Parameters Same Ho Par Different Behavior Ho** – Agar method ka kaam hi alag hai, to same naam confuse karega.  

---

## 🎯 **Final Summary**
1️⃣ **Method Overloading me ek hi naam ke multiple methods ho sakte hain, bas parameters alag hone chahiye.**  
2️⃣ **Return type change karne se overloading nahi hoti.**  
3️⃣ **3 tareeke se overloading ho sakti hai – (1) Number of parameters, (2) Data type change, (3) Parameter order change.**  
4️⃣ **Iska use readability, reusability aur optimized code ke liye hota hai.**  
================================================================================================================================
Recursion:- 
## **🔷 Recursion Kya Hota Hai? (Definition)**
Recursion ek **technique hai jisme ek function khud ko call karta hai** jab tak ek **base condition** satisfy na ho jaye.  

Matlab, recursion ka **koi end point hota hai** jisme function rukta hai. Agar end condition nahi likhi to program **infinite recursion me chala jayega** aur crash ho sakta hai.  

---

## **🔷 Recursion Ki Working (Basic Example)**
Chalo ek simple recursion ka example dekhte hain:

### **Example: 1 se n tak numbers print karna**
```java
public class RecursionExample {
    static void printNumbers(int n) {
        if (n == 0) return;  // Base condition (jab n 0 ho to function ruk jaye)
        System.out.println(n);  
        printNumbers(n - 1);  // Recursive call (function khud ko call kar raha hai)
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
```
### **🟢 Output:**  
```
5  
4  
3  
2  
1  
```
### **🔥 Breakdown (Execution Flow)**
| Call Stack | Function Call | Output |
|------------|--------------|--------|
| Step 1 | `printNumbers(5)` | `5` |
| Step 2 | `printNumbers(4)` | `4` |
| Step 3 | `printNumbers(3)` | `3` |
| Step 4 | `printNumbers(2)` | `2` |
| Step 5 | `printNumbers(1)` | `1` |
| Step 6 | `printNumbers(0)` (Base Case, Stop) | - |

---

## **🔷 Recursion Ke 2 Important Parts**
1️⃣ **Base Condition (Stopping Condition)**  
   - Yeh condition recursion ko **infinite hone se bachati hai**.  
   - **Example:** `if (n == 0) return;`  

2️⃣ **Recursive Call (Self Calling)**  
   - Yeh function **khud ko call karta hai**.  
   - **Example:** `printNumbers(n - 1);`  

---

## **🔷 Types of Recursion**
1️⃣ **Head Recursion:** Pehle function khud ko call kare, baad me kaam kare.  
2️⃣ **Tail Recursion:** Pehle kaam kare, baad me function ko call kare.  

### **🔥 Recursion Tree - Deep Explanation!**  

Recursion ko **properly visualize** karne ke liye **Recursion Tree** use hota hai. Ye ek tree-like structure hai jo batata hai ki **recursive function kaise call hota hai** aur **kaise return hota hai**.  

---

## **🌳 Recursion Tree for Head Recursion**
Agar hum **Head Recursion** ka example lein:  

```java
public class HeadRecursion {
    static void printNumbers(int n) {
        if (n == 0) return;
        printNumbers(n - 1); // 🔄 Recursive Call (First)
        System.out.println(n);  // 📌 Print after recursion
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
```
### **🔥 Recursion Tree (Head Recursion)**  
```
printNumbers(5)
 ├── printNumbers(4)
 │   ├── printNumbers(3)
 │   │   ├── printNumbers(2)
 │   │   │   ├── printNumbers(1)
 │   │   │   │   ├── printNumbers(0)  ❌ (Base Case, Stop)
 │   │   │   │   └── print 1
 │   │   │   └── print 2
 │   │   └── print 3
 │   └── print 4
 └── print 5
```
### **🟢 Output:**
```
1
2
3
4
5
```

📌 **Notice:**  
- Pehle **recursive calls execute hoti hain** (`printNumbers(n - 1)`)  
- Jab **sabse chhoti call return hoti hai**, tab **printing start hoti hai**  
- **LIFO (Last In First Out)** order follow hota hai  

---

## **🌳 Recursion Tree for Tail Recursion**
Agar hum **Tail Recursion** ka example lein:  

```java
public class TailRecursion {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.println(n);  // 📌 Print first
        printNumbers(n - 1); // 🔄 Recursive Call (After print)
    }

    public static void main(String[] args) {
        printNumbers(5);
    }
}
```
### **🔥 Recursion Tree (Tail Recursion)**
```
printNumbers(5) → print 5
 ├── printNumbers(4) → print 4
 │   ├── printNumbers(3) → print 3
 │   │   ├── printNumbers(2) → print 2
 │   │   │   ├── printNumbers(1) → print 1
 │   │   │   │   ├── printNumbers(0) ❌ (Base Case, Stop)
```
### **🟢 Output:**
```
5
4
3
2
1
```

📌 **Notice:**  
- Pehle **kaam hota hai** (printing), **baad me recursive call hoti hai**  
- Recursive calls **directly return hoti hain**, **LIFO stack use nahi hota**  
- Isiliye **Tail Recursion optimize hoti hai**  

---

## **🔥 Summary (Key Differences with Tree)**
| Feature | **Head Recursion** | **Tail Recursion** |
|---------|------------------|------------------|
| **Call Order** | **Recursive Call Pehle** | **Kaam Pehle, Call Baad Me** |
| **Return Order** | **Ulta Order Me Return Hota Hai** | **Return Direct Hota Hai** |
| **Tree Flow** | **Bottom-up Execution** | **Top-down Execution** |
| **Optimization** | **Difficult** | **Easy (Tail Call Optimization)** |

---

## **🎯 Conclusion**
✅ **Recursion Tree se pata chalta hai** ki **kaise calls execute hoti hain aur return hota hai**.  
✅ **Head Recursion me recursion calls stack me store hoti hain**, aur **return order reverse hota hai**.  
✅ **Tail Recursion me pehle kaam hota hai, aur recursion stack maintain nahi hoti**, isiliye **fast hoti hai**.  

---
### **🔥 Q1: Tail Recursion vs Head Recursion - Industry Use Case**  

#### **1️⃣ Kya Tail Recursion hi use kiya jaaye?**  
👉 **Tail Recursion zyada optimize hoti hai**, kyunki **recursive calls stack me store nahi hoti**, aur **direct return hoti hai**.   
👉 **Head Recursion me zyada memory use hoti hai**, kyunki **saari calls stack me store hoti hain, aur phir return hoti hain**.  

#### **📌 Industry Standard (Real-World Use Cases)**  
✅ **Tail Recursion preferred hoti hai**, kyunki **optimized hai aur recursion stack overflow ka chance nahi hota**.   
✅ **Head Recursion tab use hoti hai**, jab **hume answer wapas return karna ho aur kisi computation ko recursion ke baad process karna ho**.  

#### **🎯 Example 1: Factorial Calculation** (Best Tail Recursion Use Case)  
```java
public class Factorial {
    static int factorial(int n, int result) {  // ✅ Extra parameter for accumulation (Tail Recursion)
        if (n == 0) return result; 
        return factorial(n - 1, result * n);  // Recursive Call after doing multiplication
    }

    public static void main(String[] args) {
        System.out.println(factorial(5, 1));  // Output: 120
    }
}
```
✅ **Ye Tail Recursion optimized hai**, kyunki **recursive call ke andar sirf ek aur call ho rahi hai, aur koi stack me extra data store nahi ho raha**.  

---

#### **🎯 Example 2: Fibonacci Series (Head Recursion)**
```java
public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);  // ❌ Two recursive calls (Head Recursion)
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));  // Output: 5
    }
}
```
❌ **Ye recursion inefficient hai**, kyunki **recursive calls ek tree bana rahi hain, aur bahut zyada function calls stack me store ho rahi hain**.  

📌 **Conclusion:**  
- **Tail Recursion** (✅) **Jab computation directly return ho sakti ho**.  
- **Head Recursion** (❌) **Jab extra processing baad me karni ho**.  
- **Most industries prefer Tail Recursion**, **lekin agar Tail Recursion optimize nahi ho rahi to iteration better hota hai**.  

---

## **🔥 Q2: LIFO (Last In First Out) - Deep Explanation**
LIFO ka matlab hai **jo last me enter hota hai, wo sabse pehle bahar aata hai**. **Recursion stack bhi LIFO principle pe kaam karta hai**.  

### **📌 Example: Stack of Plates (Real-Life Example)**
Imagine karo ki ek **stack of plates** rakha hai.  
- **Jab naya plate aata hai, wo upar rakha jata hai**.  
- **Jab plate uthana ho, to sabse upar wala plate uthate hain**.  

#### **🍽 Stack Visualization:**
```
Plate 4  <-- Sabse Last (Top) (Sabse pehle niklega)
Plate 3
Plate 2
Plate 1  <-- Sabse Pehle Rakha (Sabse last niklega)
```
Jab hum **stack me se plates nikalenge**, to **sabse pehle Plate 4 niklegi, phir Plate 3, phir Plate 2, aur last me Plate 1**.  

👉 **Yehi LIFO principle hai:** **Last In, First Out!**  

---

## **🔥 LIFO in Recursion**
```java
public class LifoExample {
    static void lifoTest(int n) {
        if (n == 0) return;
        System.out.println("Pushing: " + n);
        lifoTest(n - 1);  // 🔄 Recursive Call
        System.out.println("Popping: " + n);
    }

    public static void main(String[] args) {
        lifoTest(3);
    }
}
```

### **🔥 Execution Flow (LIFO Stack Visualization)**
```
Pushing: 3
 ├── Pushing: 2
 │   ├── Pushing: 1
 │   │   ├── Pushing: 0  ❌ (Base Case, Stop)
 │   │   └── Popping: 1  ✅ (Last call returns first)
 │   └── Popping: 2  ✅
 └── Popping: 3  ✅
```
### **🟢 Output:**
```
Pushing: 3
Pushing: 2
Pushing: 1
Popping: 1
Popping: 2
Popping: 3
```
📌 **Notice:**  
- **Sabse last call sabse pehle return hoti hai** → **LIFO Follow ho raha hai!**  
- **Recursion ke andar calls stack me store hoti hain**, aur **jab base case aata hai, tab wapas return hota hai (LIFO Stack Execution)**.  

---

## **🔥 Final Conclusion**
✅ **Tail Recursion better hai**, aur industry me **optimize recursion** ke liye use hoti hai.  
✅ **Head Recursion bhi useful hai**, par agar zyada stack usage ho raha hai to **iteration better hota hai**.  
✅ **LIFO ka matlab hai ki jo sabse last me enter hota hai, wo sabse pehle exit hota hai** (Jaise Plates Stack).  
✅ **Recursion bhi LIFO principle follow karta hai**, jisme **sabse pehle call stack me store hoti hai, aur sabse last call sabse pehle return hoti hai**.  
---------------------------------------------------------------------------------------------------------------------
Complexity Analysis:- 

# 🔥 **Worst Case Complexity Kaise Nikalte Hain? (Deep Explanation)**
Bhai, **worst-case complexity nikalna** ek **bahut important skill hai**, jo **coding interviews & industry level programming** me kaam aata hai.  
Aaj mai tujhe **step-by-step** samjhaunga **kaise worst case nikalte hain, kaise optimize karte hain, aur kaunse algorithms worst case me slow ya fast hote hain!** 🚀

---

## **1️⃣ Worst-Case Complexity Hota Kya Hai?**
**Worst Case:**  
👉 Jab kisi algorithm ko **sabse zyada time lagta hai** kisi **sabse bekaar input** par.  
👉 Jab algorithm **sabse slow** chalega.  
👉 **Hamesha worst-case scenario pe focus karna chahiye kyunki industry me worst-case handling zaroori hoti hai!**  

🛠 **Industry me worst-case analysis kyu important hai?**  
- **Real-world applications** me **slow cases** handle karne hote hain.  
- **System optimization** aur **load balancing** ke liye **worst-case complexity analyze** karna zaroori hota hai.  

---

## **2️⃣ Worst-Case Complexity Nikalne Ke Steps**
### **📌 Step 1: Algorithm ko Samjho (Logic Clear Karo)**
Sabse pehle algorithm ka **logic samajhna** zaroori hai. Ye dekho:
1. **Loops hain ya nahi?**
2. **Recursion use ho raha hai ya nahi?**
3. **Nested loops hain ya nahi?**
4. **Sorting, Searching ya Data Structures use ho rahe hain?**

---

### **📌 Step 2: Sabse Worst Input Dekho (Sabse Slow Case)**
Har algorithm ka ek **worst input hota hai**, jisme **sabse zyada time lagta hai**.  
✅ **Example:**  
- **Linear Search (O(N))** → Jab target element **last me ya nahi mile**.  
- **Binary Search (O(log N))** → Jab har baar worst split ho.  
- **Sorting (O(N²))** → Jab input already **reverse sorted** ho.  

---

### **📌 Step 3: Number of Operations Count Karo**
Algorithm me **kitni operations chal rahi hain**, uska **formula banao**.  
- **Loops ka count karo.**
- **Recursion depth dekho.**
- **Nested loops ka multiplication lo.**

🚀 **Example ke saath samjho!**

---

## **3️⃣ Examples: Worst-Case Complexity Nikalna**

### **Example 1️⃣: Linear Search (O(N))**
```java
int linearSearch(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) { // Loop chal raha hai
        if (arr[i] == target) {
            return i;  // Element mil gaya
        }
    }
    return -1;  // Element nahi mila
}
```
### **Worst-Case Analysis**
✅ **Loop ka Maximum Iterations:** **N (poore array me search karega)**  
✅ **Worst Case Input:** Jab target element **last me ho ya na ho!**  
✅ **Worst Time Complexity:** **O(N)**

---

### **Example 2️⃣: Binary Search (O(log N))**
```java
int binarySearch(int[] arr, int target) {
    int left = 0, right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] < target) left = mid + 1;
        else right = mid - 1;
    }
    return -1;
}
```
### **Worst-Case Analysis**
✅ **Worst Input:** Jab har step pe **incorrect split ho**, element **nahi mile**.  
✅ **Iterations:** Har baar array **half ho raha hai**, **log N steps lagenge**.  
✅ **Worst Time Complexity:** **O(log N)** (Binary Search hamesha fast hota hai!)  

---

### **Example 3️⃣: Bubble Sort (O(N²))**
```java
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```
### **Worst-Case Analysis**
✅ **Loops:** **Nested Loops hain (O(N²))**  
✅ **Worst Input:** Jab array **reverse sorted ho** (Descending order).  
✅ **Swaps + Comparisons:** Har element ko **maximum compare karna padega**.  
✅ **Worst Time Complexity:** **O(N²)** (Bahut slow hota hai!)

---

## **4️⃣ Worst-Case Complexity Table (Sabse Best & Worst Algorithms)**  
| Algorithm | Best Case | Worst Case | Notes |
|-----------|------------|------------|----------|
| **Linear Search** | O(1) | **O(N)** | Agar first element mil jaye to best case |
| **Binary Search** | O(1) | **O(log N)** | Sorted array me binary search ka use hota hai |
| **Bubble Sort** | O(N) | **O(N²)** | Best case jab array already sorted ho |
| **Quick Sort** | O(N log N) | **O(N²)** | Worst case jab pivot selection poor ho |
| **Merge Sort** | **O(N log N)** | **O(N log N)** | Merge sort always stable hota hai |
| **Fibonacci (Recursion)** | O(N) | **O(2ⁿ)** | Exponential time recursion slow hota hai |

🚀 **Industry me O(N²) ya Exponential Complexity avoid karte hain!**

---

## **5️⃣ Time Complexity Ko Optimize Kaise Karein?**
Agar **code slow ho raha hai**, to **optimization** ke ye tareeke use karo:

✅ **Loop Optimization** (Nested Loops Hatao)  
❌ **O(N²) → O(N log N) → O(N)**  
```java
// BAD (O(N²))
for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
        System.out.println(i + j);
    }
}

// GOOD (O(N log N))
Arrays.sort(arr);
```
---
✅ **Recursion Optimize Karo (Memoization & DP Use Karo)**  
```java
// BAD: Fibonacci Recursion (O(2^N))
int fibonacci(int n) {
    if (n <= 1) return n;
    return fibonacci(n - 1) + fibonacci(n - 2);
}

// GOOD: Fibonacci DP (O(N))
int fibonacciDP(int n) {
    int[] dp = new int[n + 1];
    dp[0] = 0; dp[1] = 1;
    for (int i = 2; i <= n; i++) {
        dp[i] = dp[i - 1] + dp[i - 2];
    }
    return dp[n];
}
```
---
✅ **Data Structures Ka Use Karo!**  
- **Linear Search (O(N)) → HashSet Search (O(1))**
- **Brute Force Pair Search (O(N²)) → Sorting + Two Pointer (O(N log N))**

---

## **🔥 Summary:**
- **Worst-case analysis me sabse slow input case dekhna hota hai.**  
- **Loops, Recursion, Sorting Algorithms ka analysis karna hota hai.**  
- **Best & Worst Case Complexity nikalna industry me zaroori hota hai.**  
- **Optimization ke tareeke use karna chahiye to improve efficiency.**  
---------------------------------------------------------------------------------------------------------------
### **🔥 Java OOPS (Object-Oriented Programming) - Step by Step from Scratch!** 🚀  

Bhai, **OOPS ka importance industry me bahut zyada hai** kyunki **real-world applications isi par based hoti hain.**  
🛠 **Software development, backend, frameworks (Spring Boot, Hibernate), Android, Web Applications – sab kuch OOPS pe depend karta hai.**  

---

## **📌 Step 1: Pehle Samjho OOPS Hota Kya Hai?**
💡 **OOPS (Object-Oriented Programming) ek programming paradigm hai jo objects aur classes pe based hota hai.**  
- **Procedural Programming (C, Old Style Java):** Code functions aur statements ka set hota hai.  
- **OOPS (Modern Java, C++, Python):** Code objects aur real-world entities me divide hota hai.  

### **🛠 Why OOPS? (Industry Benefits)**
✅ **Reusability:** Code reuse hota hai (Inheritance).  
✅ **Modularity:** Code manageable aur structured hota hai.  
✅ **Scalability:** Badi applications me maintain karna easy hota hai.  
✅ **Security:** Data hiding aur abstraction se security badhti hai.  

---

## **📌 Step 2: OOPS ke 4 Pillars (Core Concepts)**
🔥 **OOPS ke ye 4 pillars sabse important hai:**  
1️⃣ **Encapsulation (Data Hiding, Getters/Setters)**  
2️⃣ **Abstraction (Hiding Implementation, Focus on Functionality)**  
3️⃣ **Inheritance (Code Reusability, Parent-Child Relation)**  
4️⃣ **Polymorphism (Same Name, Different Work – Method Overloading & Overriding)**  

📌 **💡 Ye 4 pillars industry me real-world projects ka base banate hain!**  

---

## **📌 Step 3: First Concept – CLASS & OBJECT**
OOPS ka **sabse basic building block** **Class & Object** hote hain.  

### **🔹 Class Kya Hai?**
💡 **Class ek blueprint hoti hai jisme attributes (data members) aur methods (functions) hote hain.**  
💡 **Class ka object banane ke baad hum uska real-world use kar sakte hain.**  

📌 **Example:** **Ek `Car` class banao jisme `color`, `brand`, aur `speed` ho.**  
```java
// Class (Blueprint)
class Car {
    String color;
    String brand;
    int speed;

    // Method to display car details
    void displayCar() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed + " km/h");
    }
}

// Main Class (Driver Code)
public class OOPS_Intro {
    public static void main(String[] args) {
        // Object creation
        Car car1 = new Car();  
        car1.color = "Red";
        car1.brand = "Tesla";
        car1.speed = 200;
        
        car1.displayCar();  // Calling the method

        // Another Object
        Car car2 = new Car();
        car2.color = "Black";
        car2.brand = "BMW";
        car2.speed = 250;

        car2.displayCar();
    }
}
```
✅ **Output:**
```
Car Brand: Tesla
Car Color: Red
Car Speed: 200 km/h

Car Brand: BMW
Car Color: Black
Car Speed: 250 km/h
```
📌 **🔹 Explanation:**  
1️⃣ **Car class** ek blueprint hai jisme `color`, `brand`, `speed` attributes hai.  
2️⃣ **Objects (`car1`, `car2`) real-world entities hai jo class ke base pe bane hain.**  
3️⃣ **Methods (functions)** se hum car ka data display kar rahe hain.  

-----------------------------------------------------------------------------------------------------------------
🔹 What is a Constructor?
A constructor is a special method used to initialize an object when it is created.

🔹 Features of Constructors:
✅ Same name as the class
✅ No return type (not even void)
✅ Automatically called when an object is created

🔹 Types of Constructors in Java
1️⃣ Default Constructor (No parameters)
2️⃣ Parameterized Constructor (With parameters)
3️⃣ Copy Constructor (Creates a copy of another object)

✅ Example 1: Default Constructor

class Car {
    String brand;
    int speed;

    // Default Constructor
    Car() {
        System.out.println("🚗 Car object is created!");
        brand = "Tesla";
        speed = 200;
    }

    void displayCar() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object (Constructor is called automatically)
        Car myCar = new Car();
        myCar.displayCar();
    }
}

🔹 Output:

🚗 Car object is created!
Brand: Tesla
Speed: 200 km/h

✅ Example 2: Parameterized Constructor

class Student {
    String name;
    int age;

    // Parameterized Constructor
    Student(String studentName, int studentAge) {
        name = studentName;
        age = studentAge;
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Passing values when creating an object
        Student s1 = new Student("Mohit", 20);
        s1.displayStudent();
    }
}

🔹 Output:

Student Name: Mohit
Age: 20

✅ Example 3: Copy Constructor (Bonus Concept)

class Book {
    String title;

    // Constructor
    Book(String bookTitle) {
        title = bookTitle;
    }

    // Copy Constructor
    Book(Book b) {
        title = b.title;
    }

    void displayBook() {
        System.out.println("Book Title: " + title);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Book book2 = new Book(book1); // Copy Constructor

        book1.displayBook();
        book2.displayBook();
    }
}
🔹 Output:

Book Title: Java Programming
Book Title: Java Programming

OBJECT ORIENTED PROGRAMMING SYSTEMS
JAVA
Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies the software development and maintenance by providing some concepts defined below : 
Class is a user-defined data type which defines its properties and its functions. Class is the only logical representation of the data. For example, Human being is a class. The body parts of a human being are its properties, and the actions performed by the body parts are known as functions. The class does not occupy any memory space till the time an object is instantiated. 
Object is a run-time entity. It is an instance of the class. An object can represent a person, place or any other item. An object can operate on both data members and member functions. 
Example 1:
class Student {
   String name;
   int age;
  
   public void getInfo() {
       System.out.println("The name of this Student is " + this.name);
       System.out.println("The age of this Student is " + this.age);
   }
}


public class OOPS {
   public static void main(String args[]) {
       Student s1 = new Student();
       s1.name = "Aman";
       s1.age = 24;
       s1.getInfo();


       Student s2 = new Student();
       s2.name = "Shradha";
       s2.age = 22;
       s2.getInfo();
   }
}
Example 2:
class Pen {
   String color;
  
   public void printColor() {
       System.out.println("The color of this Pen is " + this.color);
   }
}


public class OOPS {
   public static void main(String args[]) {
       Pen p1 = new Pen();
       p1.color = blue;


       Pen p2 = new Pen();
       p2.color = black;


       Pen p3 = new Pen();
       p3.color = red;


       p1.printColor();
       p2.printColor();
       p3.printColor();
   }
}

Note : When an object is created using a new keyword, then space is allocated for the variable in a heap, and the starting address is stored in the stack memory.
‘this’ keyword :  ‘this’ keyword in Java that refers to the current instance of the class. In OOPS it is used to: 
pass the current object as a parameter to another method 
refer to the current class instance variable

Constructor : Constructor is a special method which is invoked automatically at the time of object creation. It is used to initialize the data members of new objects generally. 
Constructors have the same name as class or structure. 
Constructors don’t have a return type. (Not even void)
Constructors are only called once, at object creation.
There can be three types of constructors in Java. 

1. Non-Parameterized constructor : A constructor which has no argument is known as non-parameterized constructor(or no-argument constructor). It is invoked at the time of creating an object. If we don’t create one then it is created by default by Java.
class Student {
   String name;
   int age;
  
   Student() {
       System.out.println("Constructor called");
   }
}

2. Parameterized constructor : Constructor which has parameters is called a parameterized constructor. It is used to provide 
different values to distinct objects. 
class Student {
   String name;
   int age;
  
   Student(String name, int age) {
       this.name = name;
       this.age = age;
   }
}

3. Copy Constructor : A Copy constructor is an overloaded constructor used to declare and initialize an object from another object. There is only a user defined copy constructor in Java(C++ has a default one too).
class Student {
   String name;
   int age;
  
   Student(Student s2) {
       this.name = s2.name;
       this.age = s2.age;
   }
}

Note : Unlike languages like C++, Java has no Destructor. Instead, Java has an efficient  garbage collector that deallocates memory automatically.

Polymorphism 
Polymorphism is the ability to present the same interface for differing underlying forms (data types). With polymorphism, each of these classes will have different underlying data. Precisely, Poly means ‘many’ and morphism means ‘forms’. 
Types of Polymorphism IMP 
1. Compile Time Polymorphism (Static) 
2. Runtime Polymorphism (Dynamic) 
Let’s understand them one by one : 
Compile Time Polymorphism : The polymorphism which is implemented at the compile time is known as compile-time polymorphism. Example - Method Overloading 

Method Overloading : Method overloading is a technique which allows you to have more than one function with the same function name but with different functionality. Method overloading can be possible on the following basis: 
1. The type of the parameters passed to the function. 
2. The number of parameters passed to the function.

class Student {
   String name;
   int age;
  
   public void displayInfo(String name) {
       System.out.println(name);
   }


   public void displayInfo(int age) {
       System.out.println(age);
   }


   public void displayInfo(String name, int age) {
       System.out.println(name);
       System.out.println(age);
   }
}


Runtime Polymorphism : Runtime polymorphism is also known as dynamic polymorphism. Function overriding is an example of runtime polymorphism. Function overriding means when the child class contains the method which is already present in the parent class. Hence, the child class overrides the method of the parent class. In case of function overriding, parent and child classes both contain the same function with a different definition. The call to the function is determined at runtime is known as runtime polymorphism.

class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}

Inheritance 
Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes. 
In Java, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class. 
Types of Inheritance : 
1. Single inheritance : When one class inherits another class, it is known as single level inheritance 
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}

2. Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}

3. Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class. 
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println((1/2)*b*h);
   }  
}
class EquilateralTriangle extends Triangle {
   int side;
}

4. Hybrid inheritance : Hybrid inheritance is a combination of 
simple, multiple inheritance and hierarchical inheritance. 
--------------------------------------------------------------
Package in Java
Package is a group of similar types of classes, interfaces and sub-packages. Packages can be built-in or user defined.
Built-in packages - java, util, io etc.

import java.util.Scanner;

import java.io.IOException;

Access Modifiers in Java
Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class.
Default: The access level of a default modifier is only within the package. It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
Protected: The access level of a protected modifier is within the package and outside the package through child class. If you do not make the child class, it cannot be accessed from outside the package.
Public: The access level of a public modifier is everywhere. It can be accessed from within the class, outside the class, within the package and outside the package.

package newpackage;


class Account {
   public String name;
   protected String email;
   private String password;


   public void setPassword(String password) {
       this.password = password;
   }
}
public class Sample {
   public static void main(String args[]) {
       Account a1 = new Account();
       a1.name = "Apna College";
       a1.setPassword("abcd");
       a1.email = "hello@apnacollege.com";
   }
}




Encapsulation 
Encapsulation is the process of combining data and functions into a single unit called class. In Encapsulation, the data is not accessed directly; it is accessed through the functions present inside the class. In simpler words, attributes of the class are kept private and public getter and setter methods are provided to manipulate these attributes. Thus, encapsulation makes the concept of data hiding possible.(Data hiding: a language feature to restrict access to members of an object, reducing the negative effect due to dependencies. e.g. "protected", "private" feature in Java). 







Abstraction 
We try to obtain an abstract view, model or structure of a real life problem, and reduce its unnecessary details. With definition of properties of problems, including the data which are affected and the operations which are identified, the model abstracted from problems can be a standard solution to this type of problems. It is an efficient way since there are nebulous real-life problems that have similar properties. 
In simple terms, it is hiding the unnecessary details & showing only the essential parts/functionalities to the user.
Data binding : Data binding is a process of binding the application UI and business logic. Any change made in the business logic will reflect directly to the application UI. 
Abstraction is achieved in 2 ways :
Abstract class
Interfaces (Pure Abstraction)

Abstract Class
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
abstract class Animal {
   abstract void walk();
   void breathe() {
       System.out.println("This animal breathes air");
   }
   Animal() {
       System.out.println("You are about to create an Animal.");
   }
}


class Horse extends Animal {
   Horse() {
       System.out.println("Wow, you have created a Horse!");
   }
   void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


class Chicken extends Animal {
   Chicken() {
       System.out.println("Wow, you have created a Chicken!");
   }
   void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}


public class OOPS {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
      horse.breathe();
   }
}






2. Interfaces
All the fields in interfaces are public, static and final by default.
All methods are public & abstract by default.
A class that implements an interface must implement all the methods declared in the interface.
Interfaces support the functionality of multiple inheritance.
interface Animal {
   void walk();
}


class Horse implements Animal {
   public void walk() {
       System.out.println("Horse walks on 4 legs");
   }
}


class Chicken implements Animal {
   public void walk() {
       System.out.println("Chicken walks on 2 legs");
   }
}


public class OOPS {
   public static void main(String args[]) {
      Horse horse = new Horse();
      horse.walk();
   }
}



Static Keyword 
Static can be : 
Variable (also known as a class variable)
Method (also known as a class method)
Block
Nested class
class Student {
   static String school;
   String name;   
}


public class OOPS {
   public static void main(String args[]) {
       Student.school = "JMV";
       Student s1 = new Student();
       Student s2 = new Student();


       s1.name = "Meena";
       s2.name = "Beena";


       System.out.println(s1.school);
       System.out.println(s2.school);
   }
}
=================================================================================================================
Great! Now, let's move on to the next topic:  

# **5️⃣ Important Java Keywords (`this`, `super`, `static`, `final`, etc.)**  

These keywords play a crucial role in **object-oriented programming (OOPs)** in Java. Let's understand them deeply with **examples**.  

---

## **1️⃣ `this` Keyword**  
The **`this` keyword** refers to the **current object** of a class. It is mainly used to:  
✔ Differentiate **instance variables** from **local variables** when they have the same name.  
✔ Call another **constructor** within the same class.  
✔ Pass the **current instance** as a parameter to a method.  

### **Example 1: Using `this` to differentiate variables**
```java
class Student {
    String name;

    // Constructor with parameter
    Student(String name) {
        this.name = name; // "this.name" refers to the instance variable
    }

    void display() {
        System.out.println("Student Name: " + this.name);
    }
}

public class ThisExample {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        s1.display();
    }
}
```
✅ **Output:**  
```
Student Name: John
```
🔹 **Key Point:** `this.name` refers to the **instance variable**, while `name` is the **constructor parameter**.  

---

## **2️⃣ `super` Keyword**  
The **`super` keyword** is used to refer to the **parent class (superclass)** from a **child class (subclass)**. It is mainly used to:  
✔ Call **parent class's constructor**.  
✔ Call **parent class's method** that has been overridden in the child class.  
✔ Access **parent class variables** if they are hidden by child class variables.  

### **Example 2: Using `super` to call the parent constructor**
```java
// Parent Class
class Animal {
    Animal() {
        System.out.println("Animal is created.");
    }
}

// Child Class
class Dog extends Animal {
    Dog() {
        super(); // Calls the parent class constructor
        System.out.println("Dog is created.");
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Dog d = new Dog();
    }
}
```
✅ **Output:**  
```
Animal is created.
Dog is created.
```
🔹 **Key Point:** `super();` calls the **parent class constructor** before executing the child class constructor.  

---

## **3️⃣ `static` Keyword**  
The **`static` keyword** is used for **memory management**. It can be applied to:  
✔ **Variables** (Shared across all instances)  
✔ **Methods** (Can be called without creating an object)  
✔ **Blocks** (Executes before the main method)  

### **Example 3: Using `static` with variables and methods**
```java
class Counter {
    static int count = 0; // Static variable (shared among all objects)

    Counter() {
        count++; // Increases count for every object
    }

    static void displayCount() { // Static method
        System.out.println("Number of objects: " + count);
    }
}

public class StaticExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        Counter.displayCount(); // Accessing static method
    }
}
```
✅ **Output:**  
```
Number of objects: 3
```
🔹 **Key Points:**  
✔ `static` variables are **shared among all objects**.  
✔ `static` methods **can be called without an object** (`Counter.displayCount();`).  

---

## **4️⃣ `final` Keyword**  
The **`final` keyword** is used to **restrict modifications** in Java. It can be applied to:  
✔ **Variables** (Makes them constants – cannot be changed)  
✔ **Methods** (Prevents method overriding)  
✔ **Classes** (Prevents inheritance)  

### **Example 4: Using `final` with variables**
```java
class Bike {
    final int speedLimit = 100; // Constant variable

    void displaySpeed() {
        System.out.println("Speed Limit: " + speedLimit);
    }
}

public class FinalExample {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.displaySpeed();
    }
}
```
✅ **Output:**  
```
Speed Limit: 100
```
🔹 **Key Point:** **`speedLimit` cannot be changed** because it is `final`.  

---

## **5️⃣ `abstract` Keyword**  
The **`abstract` keyword** is used with **abstract classes and abstract methods**.  
✔ **An abstract class cannot be instantiated.**  
✔ **An abstract method must be implemented in a subclass.**  

### **Example 5: Using `abstract` with classes and methods**
```java
abstract class Animal {
    abstract void sound(); // Abstract method (No body)
}

// Child class implementing abstract method
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks!");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}
```
✅ **Output:**  
```
Dog barks!
```
🔹 **Key Point:** `abstract` methods **must be implemented** in child classes.  

---

## **6️⃣ `synchronized` Keyword (For Multithreading)**
The **`synchronized` keyword** is used in **multi-threading** to prevent **race conditions** by allowing only **one thread to access a method at a time**.  

### **Example 6: Using `synchronized` to prevent thread interference**
```java
class Table {
    synchronized void printTable(int n) { // Synchronized method
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread {
    Table t;
    Thread1(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    Table t;
    Thread2(Table t) {
        this.t = t;
    }
    public void run() {
        t.printTable(10);
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Table obj = new Table(); // Shared object
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
    }
}
```
✅ **Output:** (Numbers printed without interference)
```
5
10
15
20
25
10
20
30
40
50
```
🔹 **Key Point:** `synchronized` ensures **one thread executes the method at a time**, preventing **data inconsistency**.  

---

## **🔹 Summary of Java Keywords**
| **Keyword** | **Usage** | **Purpose** |
|------------|----------|------------|
| `this` | Refers to the **current object** | Avoids naming conflicts, calls constructor |
| `super` | Refers to the **parent class** | Calls parent methods/constructors |
| `static` | Used with **variables, methods, and blocks** | Shared across objects, no need to create an instance |
| `final` | Used with **variables, methods, and classes** | Prevents modification, inheritance, or overriding |
| `abstract` | Used with **classes and methods** | Forces subclasses to implement methods |
| `synchronized` | Used in **multithreading** | Prevents thread interference |
--------------------------------------------------------------------------------------------------------------------

EXCEPTIONAL HANDLING IN JAVA ----
What is an Exception?
An exception is an unexpected event that occurs during the execution of a program and disrupts the normal flow of program. Exception hamare code ko wahin pe rok dega aage kuch bhi agar apne code likha hai to aage kuch print nahi hogaa....

Example: Dividing a number by zero, accessing an invalid array index, etc.

⚠️ Why do we need Exception Handling?
To prevent program crash during unexpected situations.

To handle errors gracefully.

To ensure the user gets proper messages instead of cryptic system errors.

To continue program execution even if something goes wrong.

✅ Step 1: Basic Structure of Exception Handling
In Java, we use these keywords:

try → Code that might cause an exception.

catch → Block that handles the exception.

finally → Always executes (whether exception occurred or not).

throw → Used to manually throw an exception.

throws → Declares exceptions a method might throw.

Syntax:-> try {
    // risky code
} catch (ExceptionType e) {
    // handling code
} finally {
    // optional: cleanup code
}

Types of Exceptions in Java
There are 2 major types:

✅ 1. Checked Exceptions
These are checked at compile-time

You must handle or declare them

Examples:

IOException

SQLException

FileNotFoundException

FileReader fr = new FileReader("file.txt"); // Compile-time error if not handled

❗ 2. Unchecked Exceptions
Checked at runtime

Not mandatory to handle

Examples:

ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

int a = 5 / 0; // ArithmeticException

💻 Full Code Example:
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;  // Risky
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e);
        } finally {
            System.out.println("This block always runs");
        }
    }
}
🟢 Output:

Caught exception: java.lang.ArithmeticException: / by zero
This block always runs

⚙️ throw vs throws
👉 throw: Used to manually throw an exception
throw new ArithmeticException("Don't divide by zero!");

👉 throws: Used in method signature to declare exceptions

void readFile() throws IOException {
    FileReader fr = new FileReader("file.txt");
}

🔧 Multiple catch Blocks

try {
    String s = null;
    System.out.println(s.length());
} catch (ArithmeticException e) {
    System.out.println("Arithmetic error");
} catch (NullPointerException e) {
    System.out.println("Null Pointer error");
}
Output:

Null Pointer error
🛠️ Custom Exceptions (User-Defined)

class MyException extends Exception {
    public MyException(String msg) {
        super(msg);
    }
}

public class Test {
    public static void main(String[] args) throws MyException {
        throw new MyException("This is a custom error!");
    }
}

🧠 Summary:
✅ try – risky code
✅ catch – handles the exception
✅ finally – always runs
✅ throw – manually throw exception
✅ throws – declare exception in method signature
✅ Custom - You can create your own exception class by extending Exception or RuntimeException
✅ Checked vs Unchecked exceptions
-------------------------------------------------------------------------------------------------------------------
 Wrapper class in java -> In Java, Wrapper Classes are used to convert primitive types (like int, char, boolean) into objects. Kyunki Java collections only work with objects, not primitives and wrapper classes are immutable like Strings.
 * Primitive Type	   Wrapper Class
    int	                  Integer
    char	              Character
    double	              Double
    float	              Float
    long	              Long
    short	              Short
    byte	              Byte
    boolean	              Boolean

Why Wrapper Classes?
Collections only work with Objects, not primitives.

Wrapper classes “wrap” primitive types into objects.

Enable utility methods (e.g., parsing, comparisons).

Help in Autoboxing / Unboxing.

Autoboxing (primitive → object)

int x = 10;
Integer y = x; // Java automatically does: Integer y = Integer.valueOf(x);

✅ Unboxing (object → primitive)
Integer a = 20;
int b = a; // Java automatically does: int b = a.intValue();
------------------------------------------------------------------------------------
What is Iterator?
Iterator ek Java utility object hai jo humko collections ko safely iterate (ghumane) aur elements ko remove karne deta hai.

🧠 Jab hum list me se elements ko remove karte hain while looping, to normal for-each ya for se error aata hai (ConcurrentModificationException).

Isliye hum Iterator ka use karte hain.

🔸 Iterator Syntax:

Iterator<DataType> it = list.iterator();

while (it.hasNext()) {
    DataType value = it.next();

    // use value
    // optionally remove
}

===================================================================================================================
 What is Collection Framework?
👉 Collection framework is a set of classes and interfaces in Java used to store, manage, and manipulate groups of objects.

Think of it like:

“Instead of writing your own logic to handle data structures (like arrays, linked lists, maps, stacks, etc.), Java gives you ready-made tools under this framework.”

🔹 Why is it needed?
Problems with Arrays:
Fixed size

Can store only same type

No built-in methods for sorting/searching/etc.

Collection Framework solves these:
✅ Dynamic size
✅ Ready-made methods (add(), remove(), sort(), contains() etc.)
✅ Different types of data structures: List, Set, Map, Queue, etc.

🔹 Package:
All collection classes are in the package:

import java.util.*;
🔹 Collection Hierarchy (Just overview for now)
                Collection (interface)
                   /    |     \     \
              List   Set   Queue    Map (Map is not a part of collection but part of framework)
               |       |       |
        ArrayList   HashSet  PriorityQueue
        LinkedList  LinkedHashset   LinkedList
        Vector      TreeSet          Deque & Arraydeque
Map (like HashMap) is not part of Collection, but part of the framework.

✅ Example: Using List (Basics of Collection)

import java.util.*;

public class CollectionDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Krishna");
        names.add("Arjun");
        names.add("Karna");

        System.out.println("Names: " + names);
    }
}
🧠 Explanation:

We imported java.util.* which has List, ArrayList, etc.

Created a List of Strings using ArrayList implementation.

Added 3 elements.

Printed them — boom! 🧨

🔁 Step 1 Practice Questions — Beginner
Q1. Create a list of integers and print them.
Q2. Create a list of 5 fruits and print each using a for-each loop.
Q3. Remove an item from a list and show before & after list.
Want me to solve these and explain or should I give them to you to try first?

🔄 Intermediate Questions
Q4. Check if an element exists in the list using contains().
Q5. Sort a list of numbers using Collections.sort().
Q6. Reverse a list using Collections.reverse().
🔥 Advanced Level (Still Step 1 but Pro-Level)
Q7. Create a List<Student> where Student is a custom class and print all students.
Q8. Count frequency of words using Map (intro to upcoming topic)
Q9. Remove duplicates from a list using Set (sneak peek to Set)

📚 Keywords to Know in Step 1
Keyword	Meaning
Collection	Root interface
List	Ordered collection with duplicates
ArrayList -	Dynamic array
add() -	Add element
remove() -	Remove element
contains() - Check presence
size() - Get number of elements
get(index) - Access element
for-each loop -	Loop through collection
Collections.sort() - Sort a list
Collections.reverse() -	Reverse a list
indexOf() - Pehli baar element kahan mila uska index deta hai
lastindexOf() - Last baar index kahan mila uska index deta hai
retainAll() - First list me second list ke common elements ko add kar deta hai

Step 1: What is List in Java?
🔹 Definition:
List is an ordered collection that allows duplicate elements.
It maintains the insertion order and provides index-based access to elements.

🔑 Key Features of List:
Feature	Description
✅ Ordered Elements are stored in the order they're added
✅ Allows Duplicates	You can store repeated values
✅ Index Based	Access via index like array (list.get(0))
✅ Dynamic Size	Size grows/shrinks automatically

66🔧 List is an Interface. Implemented by:
Class	Description
ArrayList	Resizable array, best for searching
LinkedList	Doubly linked list, best for insertion/deletion
Vector	Thread-safe version of ArrayList
Stack	LIFO structure built on Vector

Syntax of List->
List <DataType> listname = new ArrayList<>(); //Here listname is a variable and we can change as per we want

ArrayList is a resizable array (also called dynamic array) in Java that is part of the Java Collection Framework.
It stores elements in a linear order and automatically resizes when you add or remove elements.

📌 Key Points:

Belongs to java.util package.

Implements the List interface.

Allows duplicate elements.

Maintains insertion order.

Can contain null values.

Provides random access (via index, like get(2)).

Under the hood, it uses a dynamic array (not a linked list).

📎 Syntax:

ArrayList<Type> listName = new ArrayList<>();

🔹 Example:

ArrayList<String> cities = new ArrayList<>();
cities.add("Delhi");
cities.add("Mumbai");













