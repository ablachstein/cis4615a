import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class R14_SER01_J implements Serializable {

    private static final long serialVersionUID = 123456789L;

    private R14_SER01_J() {
        // Initialize
    }

    private void writeObject(final ObjectOutputStream stream)
            throws IOException {
        stream.defaultWriteObject();
    }

    private void readObject(final ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
        stream.defaultReadObject();
    }
}
