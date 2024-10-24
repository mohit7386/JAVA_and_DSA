STEPS HOW TO SETUP JAVA IN OUR SYSTEMS:- 
---------------------------------------------------------------------------
Java ko apne system me setup karne ke liye tumhe kuch steps follow karne padhenge. Main Windows, Mac, aur Linux systems ke liye instructions bataunga.

### Step 1: Download and Install Java Development Kit (JDK)
JDK (Java Development Kit) ko install karna hota hai, kyunki isi ke through tum Java applications ko run aur compile kar paoge.

#### 1.1 **Visit the Official Oracle Website:**
   - Go to [Oracle's Java Download page](https://www.oracle.com/java/technologies/javase-downloads.html).
   - Download the latest version of **JDK** according to your system (Windows, Mac, or Linux).

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
2. Edit the `~/.bash_profile` (for Mac) or `~/.bashrc` (for Linux) file:
   ```bash
   nano ~/.bash_profile  # For Mac
   nano ~/.bashrc        # For Linux
   ```
3. Add the following lines:
   ```bash
   export JAVA_HOME=$(/usr/libexec/java_home)  # Mac only
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
   Java(TM) SE Runtime Environment (build 17.0.1+12-LTS-39)
   Java HotSpot(TM) 64-Bit Server VM (build 17.0.1+12-LTS-39, mixed mode)
   ```

### Step 4: Install an IDE (Integrated Development Environment)
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
1. Open a text editor (like Notepad or VS Code) and write this simple Java program:
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
1. Open your IDE (IntelliJ or Eclipse).
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
out: This is the standard output stream (usually your console or terminal).
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

Alphabetic Characters: Identifiers sirf letters (a-z, A-Z), digits (0-9), underscore (_), aur dollar sign ($) se shuru ho sakte hain. Lekin, pehli character letter ya underscore ya dollar sign hona chahiye.

Valid Examples:

myVariable
number1
_temp
$price
Invalid Examples:

1stVariable (digit se shuru nahi ho sakta)
my-variable (hyphen nahi allow hai)
Case Sensitivity: Identifiers case-sensitive hote hain. Matlab myVariable aur MyVariable alag identifiers hain.

Reserved Keywords: Aap identifiers ke roop mein Java ke reserved keywords (jese int, class, public, etc.) ka use nahi kar sakte. Ye keywords Java ki syntax ka hissa hote hain.

2. Identifier Naming Conventions
Java mein identifiers ke naam rakhne ke liye kuch best practices hain:

Meaningful Names: Identifiers ka naam aisa hona chahiye jo us variable ya class ke purpose ko clearly bataye. Jaise:

studentName better hai sn.
Camel Case: Variables aur method names mein camelCase convention use karna accha hota hai (e.g., myVariableName).

Pascal Case: Class names mein PascalCase convention use karna chahiye (e.g., StudentDetails).

3. Examples of Identifiers
java
Copy code
public class Student {
    // Valid Identifiers
    private String studentName;
    private int studentAge;
    
    // Method with valid identifier
    public void displayInfo() {
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

Java mein **variables** woh containers hote hain jisme hum data ko store karte hain. Har variable ka ek specific **data type** hota hai, jo define karta hai ki usme kis type ka data store hoga (jaise `int` for integers, `String` for text, etc.).

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
  public void calculateSum() {
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
- Variable names should start with a **letter** (a-z, A-Z) or an **underscore** (`_`), and should be meaningful.
- Follow **camelCase** convention (e.g., `studentAge`, `totalMarks`).

### 4. **Primitive Data Types**
Java mein kuch common primitive data types hote hain jo variables ke liye use kiye jaate hain:
- `int` (integers): e.g., `int age = 25;`
- `float` (floating-point numbers): e.g., `float price = 10.99f;`
- `double` (large floating-point numbers): e.g., `double salary = 50000.75;`
- `char` (characters): e.g., `char grade = 'A';`
- `boolean` (true/false values): e.g., `boolean isStudent = true;`

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
- Java variables alag-alag types ke hote hain (local, instance, static).
- Har variable ka ek specific scope aur lifetime hota hai.
- Java mein variable ko declare karte waqt uska type aur naam define karna padta hai.

Aap deep me samajh rahe ho, agar koi aur point unclear ho ya aur detail mein jaana ho, toh poochna!




