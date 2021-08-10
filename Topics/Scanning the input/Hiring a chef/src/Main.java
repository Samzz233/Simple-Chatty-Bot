//put imports you need here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        String[] a = new String[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = input.next();
        }
        System.out.println("The form for " + a[0] +
                " is completed. We will contact you " +
                "if we need a chef that cooks "
                + a[a.length - 1] + " dishes.");
    }
}