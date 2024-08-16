## Problem Statement: Read and add content to a file

**Given a file name and content read the file and add the content in the file using FileInputStream and try with resources**

**This exercise contains a class named FileEdition with the following method:**

     +fileEditor(String, String) : String  
         - Should take two String values as input and return a string as result
         - Should validate the input by checking whether it is null,empty or blank space    
         - Should append the second string, content in the file with file name, first string      
         - Should also handle exceptions thrown by logic using try with resources and catch      

## Example
    Sample Input:
    text.txt, Abraham Lincoln      
    
    Expected Output:
    Hi my name is Abraham Lincoln
--------------------------------------------------------
    Sample Input:
    test , Bill Clinton
        
    Expected Output:
    File 'test' not Found

## Instructions

- Avoid printing unnecessary values other than expected output as given in sample
- Take care of whitespace/trailing whitespace
- Do not change the provided class/method names unless instructed
- Follow best practices while coding