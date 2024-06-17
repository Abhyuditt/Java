import java.util.Scanner;

/**
 * LargestNumber
 */
public class LargestNumber {
public static void main(String[] args) {
    Scanner inputt = new Scanner(System.in);
    int a = inputt.nextInt();
    int b = inputt.nextInt();
    int c = inputt.nextInt();
    int max = a;
    if(b>max){
        max = b;
    }
    if (c>max){
        max=c;
    }
    System.out.println(max);
}
    
}