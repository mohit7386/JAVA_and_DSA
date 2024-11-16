þÿÿþSTEPS HOW TO SETUP JAVA IN OUR SYSTEMS:- 
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
Bilkul, chalo arrays ko zero se shuru karte hain!

### **Arrays in Java**

Arrays programming mein data ko efficiently store aur manage karne ka ek tareeka hai. Java mein array ek data structure hai jo **fixed-size** aur **same type** ke elements ko ek sath store karta hai.Arrays are fundamental structures in Java that allow us to store multiple values of the same type in a single variable. They are useful for managing collections and storing the data efficiently. The size of an array is fixed, and its elements can be accessed using their **indexing Value**.

**Example:** Agar humare paas ek array `int[] numbers = {10, 20, 30, 40};` hai, toh isme 4 integers store hain aur har element ka apna unique index hai.

```
numbers[0] = 10
numbers[1] = 20
numbers[2] = 30
numbers[3] = 40
```

> **Note**: Java mein array indexing 0 se start hoti hai.

#### **2. Array Declare aur Initialize kaise karein?**

Java mein array ko declare aur initialize karne ke do main steps hain:

1. **Declaration:** Batana ki array kis type ka hoga.
2. **Initialization:** Array mein elements store karna.

##### **Syntax**:
```java
dataType[] arrayName = new dataType[size];
```

#### **Example of Declaration and Initialization**

```java
int[] numbers = new int[5]; // integer type ka array of size 5
```

Yahaan `int[]` se hum batate hain ki yeh ek integer array hai aur `new int[5]` se hum batate hain ki is array mein 5 elements store ho sakte hain. 

Ab hum elements ko assign kar sakte hain:
```java
numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;
```

#### **Array ko directly initialize kar sakte hain with values:**
```java
int[] numbers = {10, 20, 30, 40, 50};
```

### **3. Types of Arrays**

1. **One-Dimensional Array** - Ye ek simple array hai jisme elements ek line mein store hote hain. (Jaise `int[] arr = {1, 2, 3};`)

2. **Multi-Dimensional Array** - 2D arrays (matrix) aur isse zyada dimensions bhi ho sakte hain. Ek 2D array ko rows aur columns ke form mein represent kiya jata hai. (Jaise `int[][] matrix = {{1, 2}, {3, 4}};`)

#### **4. Accessing Elements in an Array**
Array ke elements ko hum unke index ke through access karte hain. 

**Example**:
```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println(numbers[2]); // Output: 30
```

### **5. Array Length**
Java mein `array.length` property ka use karke array ka size (number of elements) pata kar sakte hain.

```java
int[] numbers = {10, 20, 30, 40, 50};
System.out.println("Array length: " + numbers.length); // Output: 5
```

### **6. Looping through Arrays**
Arrays ke elements ko access karne ke liye loops ka use kar sakte hain. Dono `for loop` aur `for-each loop` array elements ko access karne mein kaam aate hain.

#### Using `for loop`:
```java
int[] numbers = {10, 20, 30, 40, 50};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

#### Using `for-each loop`:
```java
int[] numbers = {10, 20, 30, 40, 50};
for (int number : numbers) {
    System.out.println(number);
}
```

### **Example Code with Explanation**
Yahaan ek example dekhte hain jisme hum ek array declare, initialize, aur uske elements ko print karenge:

```java
import java.util.*;

public class ArrayExample {
    public static void main(String[] args) {
        // Array declaration aur initialization
        int[] numbers = {5, 10, 15, 20, 25};
        
        // Array ke elements ko print karna using for loop
        System.out.println("Array elements using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + " : " + numbers[i]);
        }

        // Array ke elements ko print karna using for-each loop
        System.out.println("\nArray elements using for-each loop:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
```

#### **Output**:
```
Array elements using for loop:
Element at index 0 : 5
Element at index 1 : 10
Element at index 2 : 15
Element at index 3 : 20
Element at index 4 : 25

Array elements using for-each loop:
5
10
15
20
25
```

### **Summary**
- Array fixed size ka hota hai aur same type ke elements store karta hai.
- Arrays ko declare aur initialize kiya ja sakta hai.
- Indexing 0 se start hoti hai, aur hum `.length` property se size dekh sakte hain.
- `for` aur `for-each` loop se arrays ko iterate kar sakte hain.

Ye basics samajhne ke baad hum **2D arrays** aur **array ke saath kuch common operations** (like finding min/max, sorting) ko bhi dekhenge.
==========================================================================================================================================







