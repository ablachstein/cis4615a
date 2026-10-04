public class R01_DCL00_J {

    static class A {
        static int value = 10;
    }

    static class B {
        static int value = A.value;
    }

    public static void main(String[] args) {
        System.out.println(B.value);
    }
}
