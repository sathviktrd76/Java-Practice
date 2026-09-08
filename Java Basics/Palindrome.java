import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int reverse = 0;
        int org=num;

        while(num!=0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        }

        if(org==reverse){
            System.out.println("Given number"+" "+org+" is a Palindrome");
        }
        else{
            System.out.println("Given number"+" "+org+" is not a palindrome");
        }

    }
}