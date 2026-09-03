import java.io.*;

public class FileHandlingDemo {

    public static void main(String[] args) {

        try {
            
            FileWriter writer = new FileWriter("student.txt");

            writer.write("Student ID: 101\n");
            writer.write("Student Name: Yukta\n");
            writer.write("Course: Computer Science\n");
            writer.write("Marks: 85\n");

            writer.close();

            System.out.println("Student information written to file.");

            
            FileReader reader = new FileReader("student.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;

            System.out.println("\nStudent Records:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}