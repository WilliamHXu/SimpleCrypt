import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {



     public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter the key. (How many places you want each letter to shift):"); //Added custom number shift
        String key = input.nextLine();
        try {
            Integer.parseInt(key);
            try {
                if ((Integer.parseInt(key) > 26) || 0 > (Integer.parseInt(key))) {
                    System.out.println("Invalid Range");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.out.println("It needs to be a number. ");
            }
        }catch (Exception e) {
            System.out.println("An unknown error has occured");
        }


        int keys = Integer.parseInt(key);


        InputStream in = new FileInputStream("sonnet18.txt");
        String body = IOUtils.toString(in, StandardCharsets.UTF_8.name());
        System.out.printf("\n\nNormal: \n\n%s\n\n", body); // Added formatting for user accessibility
        PrintStream out = new PrintStream(new FileOutputStream("sonnet18.enc"));
        ROT13 rot13 = new ROT13(keys);
        String output = rot13.encrypt(body);
        System.out.printf("Encrypted:\n\n%s\n\n", output); // Shows the output/ result of the encryption
        out.append(output);
        out.flush();





}}
