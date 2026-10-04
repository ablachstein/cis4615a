import java.io.File;

public class R02_EXP00_J {

    public static void main(String[] args) {
        deleteFile();
    }

    public static void deleteFile() {
        File someFile = new File("someFileName.txt");

        // Do something with someFile
        if (!someFile.delete()) {
            System.out.println("Failed to delete the file.");
        }
    }
}
