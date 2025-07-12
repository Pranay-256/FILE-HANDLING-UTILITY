# FILE-HANDLING-UTILITY

COMPANY: CODTECH IT SOLUTIONS

NAME: Pranay Jha

INTERN ID: CT04DH539

DOMAIN: Java Programming

DURATION: 4 WEEKS

MENTOR: NEELA SANTOSH

##This Java program is designed to help beginners understand how to work with text files using Java. It shows how to create a file, write content into it, read the content, add more text (append), change specific words (modify), delete lines based on certain words, and finally display the updated content. The program uses common file handling classes in Java such as FileWriter, FileReader, and BufferedReader, along with try-catch blocks to handle errors.

The program starts by creating a file named hello.txt in a folder on the D drive. It uses the FileWriter class to write the first line into the file. The line written is:
HELLO TO EVERYONE PRESENT HERE I AM PRANAY
This content will replace anything that was already in the file. After writing, the file is closed properly using the close() method to make sure the data is saved.

After writing the file, the program reads the content to check if it was written correctly. It uses the FileReader class and reads the file one character at a time using a loop. Each character is printed on the screen. This helps verify that the content exists in the file.

Next, the program demonstrates how to append new text to the existing file. Instead of replacing the original text, it adds a new line to the end of the file. This is done using FileWriter in append mode, where true is passed as a second argument. The text added is:
I AM LEARNING JAVA FILE HANDLING
This is useful when you want to keep old data and just add something new.

Once again, the file is read to show both the old and new content together. This helps in understanding how appending works differently from normal writing.

The program then moves on to modifying text in the file. Specifically, it replaces the word "HELLO" with "HI". This is done by reading the file line-by-line using BufferedReader, which is better than reading character-by-character when you are working with lines. Each line is checked for the word "HELLO", and if found, it is replaced with "HI" using the replace() method. After all lines are changed, the new content is written back into the same file.

After modification, the program reads and prints the file again to confirm that the word was successfully replaced.

The next part of the program shows how to delete lines from a file if they contain a specific word. In this case, any line that contains the word "PRESENT" is removed from the file. The program reads each line and checks if the line contains that word. If it doesn’t, it is kept; otherwise, it is skipped. The remaining lines are then written back into the file.

Finally, the program reads the file one last time and prints the final result. This shows how the file looks after all the changes — writing, appending, modifying, and deleting lines.

This program is a great way for beginners to understand how to work with files in Java. It covers all the important file operations in a simple and clear way. Each task is done step-by-step, and errors are handled properly using try-catch blocks. This makes the program safe and easy to follow.
