
// Q:-1:- In a progrmm, input 3 numbers : A, B, C. You have to output the average of these 3 numbers.

import java.util.*;
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("average of numbers : "+ average);
    }
}
