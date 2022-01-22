package Recursion;

import java.util.Scanner;

public class Find_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit to count : ");
        int a = sc.nextInt();
        System.out.println(digit(a));
    }
    public static int digit(int x){
        if((x/10) == 0)
            return 1;
        return 1 + digit(x/10);
    }
}
