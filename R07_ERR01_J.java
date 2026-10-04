public class R07_ERR01_J {

    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
