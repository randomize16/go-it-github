public class ThirdApp {
    public static void main(String[] args) {
        User currentUser = new User();
        currentUser.printUserName();
    }

    public static void printSomeText(String text) {
        System.out.println(text);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
