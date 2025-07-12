import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        // creating and writing the content in the file
        try {
            FileWriter w = new FileWriter("D:\\DSA questions\\hello.txt");
            w.write("HELLO TO EVERYONE PRESENT HERE I AM PRANAY\n");
            w.close();
            System.out.println("File created and written");
        } catch (IOException e) {
            System.out.println("Sorry, file could not be created");
        }

        // reading the content of the file
        try {
            FileReader r = new FileReader("D:\\DSA questions\\hello.txt");
            int i;
            System.out.println("\nReading the file for first time");
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // appending the content of the file
        try {
            FileWriter w = new FileWriter("D:\\DSA questions\\hello.txt", true);
            w.write("I AM LEARNING JAVA FILE HANDLING\n");
            w.close();
            System.out.println("\nAppending successful");
        } catch (IOException e) {
            System.out.println("Unable to append to the file");
        }

        // reading after appending
        try {
            FileReader r = new FileReader("D:\\DSA questions\\hello.txt");
            int i;
            System.out.println("\nReading file after appending");
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        // modifying the content of the file("HELLO" to "HI")
        try {
            // Reading the file using BufferedReader
            BufferedReader reader = new BufferedReader(new FileReader("D:\\DSA questions\\hello.txt"));
            StringBuilder modifiedText = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.replace("HELLO", "HI"); // Modify line
                modifiedText.append(line).append("\n");
            }
            reader.close();

            // Writing modified content to the file
            FileWriter writer = new FileWriter("D:\\DSA questions\\hello.txt");
            writer.write(modifiedText.toString());
            writer.close();
            System.out.println("\nReplacement done HELLO to HI");

        } catch (IOException e) {
            System.out.println("Error while modifying content");
        }
        // Reading the file after doing modification
        try {
            FileReader r = new FileReader("D:\\DSA questions\\hello.txt");
            int i;
            System.out.println("\nReading modified file content");
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
            r.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
        // Deleting the line where the word "PRESENT" is present in the file
        try {
            BufferedReader r = new BufferedReader(new FileReader("D:\\DSA questions\\hello.txt"));
            StringBuilder finalContent = new StringBuilder();
            String line;
            while ((line = r.readLine()) != null) {
                if (!line.contains("PRESENT")) {
                    finalContent.append(line).append("\n");
                }
            }
            r.close();
            // Writing the final content back to the file
            FileWriter w = new FileWriter("D:\\DSA questions\\hello.txt");
            w.write(finalContent.toString());
            w.close();
            System.out.println("\nLine with word 'PRESENT' is now deleted from the file");
        } catch (IOException e) {
            System.out.println("Sorry cannot delete 'PRESENT' from the file");
        }
        // Reading the file after all the modifications
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\DSA questions\\hello.txt"));
            String line;
            System.out.println("Final content of the file");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }

    }
}
//source for this code : College notes , Youtube and ChatGpt
