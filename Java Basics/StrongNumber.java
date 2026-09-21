import java.util.Scanner;
public class StrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int org=num;
        int sum=0;

        while(num>0){
            int digit=num%10;

            int factorial=1;
            for(int i=1;i<=digit;i++){
                factorial*=i;
            }

            sum+=factorial;
            num=num/10;
        }

        if(sum==org){
            System.out.println("Strong number");
        }else{
            System.out.println("Not a strong number");
        }

    }
}