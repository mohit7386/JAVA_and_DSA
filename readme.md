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

### Step 6: Explore Further Learning
Ab jab tumne Java setup kar liya hai, tum aage ke steps ko follow karke development start kar sakte ho.
====================================================================================================================
