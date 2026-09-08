import java.util.Scanner;

public class FactorialMethod{
    static int findFactorial(int n){

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        int result=findFactorial(num);
        System.out.print("Factorial : "+result);
    }
}