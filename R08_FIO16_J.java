import java.io.File;
import java.io.IOException;

public class R08_FIO16_J {

    public static void main(String[] args) throws IOException {

        String filename = args.length > 0 ? args[0] : "example.txt";

        File file = new File(filename);

        String canonicalPath = file.getCanonicalPath();

        if (canonicalPath.startsWith("/safe/")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
