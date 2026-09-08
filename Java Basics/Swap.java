import java.util.Scanner;

public class Swap{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a value : ");
        int a = sc.nextInt();

        System.out.print("Enter b value : ");
        int b = sc.nextInt();

        int temp=a;
        a=b;
        b=temp;

        System.out.println("\nAfter swapping : ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);



    }
}