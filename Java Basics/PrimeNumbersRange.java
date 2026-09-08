import java.util.Scanner;

public class PrimeNumbersRange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number : ");
        int start = sc.nextInt();

        System.out.print("Enter Ending number : ");
        int end = sc.nextInt();

        for(int num=start;num<=end;num++){
            boolean isPrime=true;

            if(num<=1){
                isPrime=false;
            }

            else{
                for(int i=2;i<num;i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }


    }
}