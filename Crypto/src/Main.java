import org.apache.commons.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {



    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("sonnet18.txt");
        String body = IOUtils.toString(in, StandardCharsets.UTF_8.name());
        System.out.println(body);
        PrintStream out = new PrintStream(new FileOutputStream("sonnet18.enc"));
        ROT13 rot13 = new ROT13();
        String output = rot13.encrypt(body);
        out.append(output);
        out.flush();
    }
}
