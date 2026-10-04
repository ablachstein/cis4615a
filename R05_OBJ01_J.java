public class R05_OBJ01_J {

    private int value = 10;

    public static void main(String[] args) {

        R05_OBJ01_J object = new R05_OBJ01_J();

        System.out.println(object.getValue());

        object.setValue(100);

        System.out.println(object.getValue());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
