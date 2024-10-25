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
System.out.println(a & b);  // Output: 1 (Binary: 0001)

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





