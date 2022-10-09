public class testing {
    public static void main(String[] args) {
        String a = new String("butterfly A");
        String b = new String("butterfly B");
        String c = b;
        if (c == a) {
            System.out.println("a == b");
        }
        else {
            System.out.println("a != b");
        }
    }
}
