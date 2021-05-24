public class ThirdApp {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("Second line");
        printSomeText("GOIT");
        System.out.println(sum(1 , 3));

    }

    public static void printSomeText(String text) {
        System.out.println(text);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
