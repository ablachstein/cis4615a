import java.io.DataInputStream;
import java.io.IOException;

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        int value = getInteger(input);

        System.out.println("Value: " + value);
    }

    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt();
    }
}
