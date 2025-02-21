# **2025-OBJPROG-LAB019**
Week 05 - Methods in Java

Laboratory # 19 - Group Activity # 01 - Problem 03: Factorial Calculator with Input and Calculation Functions

## **Instructions**

### **Step 1.1: Accept the Assignment**

   1. Click on the assignment link provided by your instructor.
   2. GitHub Classroom will create a **private repository** under your GitHub account.
   3. After the repository is created, click **"Go to Repository"** to view your assignment.

---

### **Step 1.2: Setup your Git Environment**
Only perform this if this is the first time you will setup your Git Environment

   1. Create a GitHub Account:
   ```bash
   https://github.com/signup?source=login
   ```
      
   2. Download and Install Git on your Laptop/Desktop:
   ```bash
   https://git-scm.com/downloads
   ```
   
   3. Create a Folder in your Laptop/Desktop
   4. Right-click anywhere in the created folder and select "Open Git Bash Here".
   5. In the Git Bash Terminal, set your git name, perform command:
   ```bash
   git config --global user.name "Your Name"
   ```
   
   6. In the Git Bash Terminal, set your git email, perform command:
   ```bash
   git config --global user.email "your.email@example.com"
   ```
   
   7. Create your SSH Key, just follow the instructions, no need to provide filename and passphrase. In the Git Bash Terminal, perform command:
   ```bash
   ssh-keygen -t rsa -b 4096 -C "your_email@example.com"
   ```
   
   8. Copy your SSH Keys into clipboard. In the Git Bash Terminal, perform command:
   ```bash
   clip < ~/.ssh/id_rsa.pub
   ```
   
   9. Log in to your GitHub account.
   10. In the upper-right corner of GitHub, click your profile picture and select Settings.
   11. In the left sidebar, click on SSH and GPG keys.
   12. Click the New SSH key button.
   13. In the Title field, give the key a recognizable name (e.g., "My Windows Laptop").
   14. In the Key field, CTRL + V or paste the keys copied into your clipboard. Save the key.
   15. Go Back to terminal, use command:
   ```bash
   ssh -T git@github.com
   ```

### **Step 2: Clone the Repository to Your Local Machine**

   1. On your repository page, click the green **"Code"** button.
   2. Copy the repository URL (choose HTTPS for simplicity).
   3. Open your terminal (or Git Bash, Command Prompt, or PowerShell) and run:
   
   ```bash
   git clone <git_repo_url>
   ```
   
   4. Navigate into the cloned folder:
   
   ```bash
   cd <git_cloned_folder>
   ```

### **Step 3: Complete the Assignment**

**Laboratory # 19 - Group Activity # 01 - Problem 03: Factorial Calculator with Input and Calculation Functions**

   **Objective:**
   - Develop a Java program that calculates the factorial of a non-negative integer.
   - Demonstrate the use of methods to handle user input and perform calculations.

   **File Naming Convention:**
   - `FactorialCalculator.java`

   **Desired Output:**
   ```txt
   Enter a non-negative integer: 6
   The factorial of 6 is: 720
   
   Enter a non-negative integer: 0
   The factorial of 0 is: 1
   ```

   **Notable Observations:**
   - This activity emphasizes the use of methods for input validation and complex calculations.
   - Input validation is important to prevent unexpected errors and ensure program robustness.

   **Java Programming Best Practices:**
   - Use meaningful method names that clearly describe their purpose.
   - Keep your methods concise and focused on a single task.
   - Add comments to your code to explain the logic and purpose of each method.
   - Validate user input to prevent unexpected errors.
   - Handle edge cases, such as when the input is 0 (factorial of 0 is 1).
      
   **Method Requirements:**

   1. getNonNegativeInteger()
      - Purpose: To get a valid non-negative integer input from the user.
      - Requirements:
         - Prompt the user to enter a non-negative integer.
         - Read the user's input from the console.
         - Validate the input to ensure it is a non-negative integer. If the input is invalid, provide an error message and prompt the user again (consider using a loop for this).
         - Return the validated non-negative integer.
            
   2. calculateFactorial(n)
      - Purpose: To calculate the factorial of the given non-negative integer.
      - Requirements:
         - Take a non-negative integer n as a parameter.
         - Handle the base case: if n is 0, return 1 (factorial of 0 is 1).
         - For n greater than 0, use a loop (e.g., for loop) to iterate from 1 to n (inclusive) and calculate the factorial.
         - Return the calculated factorial.

   3. Main Program Flow
      - Call the getNonNegativeInteger() method to get a valid input from the user.
      - Pass the obtained integer to the calculateFactorial() method to compute the factorial.
      - Display the result to the user, including the original number and its calculated factorial.

   **Conclusion**

   By completing this coding challenge, you will gain experience in:
   - Designing and implementing methods in Java.
   - Using loops for iterative calculations.
   - Validating user input.
   - Handling edge cases in calculations.
   - Following Java programming best practices for clean and maintainable code.

### **Step 4: Push Changes to GitHub**
Once you've completed your changes, follow these steps to upload your work to your GitHub repository.

1. Check the status of your changes:
   Open the terminal and run:
   
   ```bash
   git status
   ```
   This command shows any modified or new files.
   
2. Stage the changes:
   Add all modified files to staging:
   
   ```bash
   git add .
   ```
   
3. Commit your changes:
   Write a meaningful commit message:
   
   ```bash
   git commit -m "Submitting OBJPROG Week 05 - Laboratory # 19"
   ```
   
4. Push your changes to GitHub:
   Upload your changes to your remote repository:
   
   ```bash
   git push origin main
   ```
