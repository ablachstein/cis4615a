import java.io.File;

public class R08_FIO16_J {

    public static void main(String[] args) {

        String filename = args.length > 0 ? args[0] : "example.txt";

        File file = new File(filename);

        if (file.getAbsolutePath().startsWith("/safe/")) {
            System.out.println("Access granted.");
        } else {
            System.out.println("Access denied.");
        }
    }
}
