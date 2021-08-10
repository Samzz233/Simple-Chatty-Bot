import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String[] a = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.next();
            System.out.println(a[i]);
        }
    }
}