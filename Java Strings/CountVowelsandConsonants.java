import java.util.Scanner;

public class CountVowelsandConsonants{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        str=str.toLowerCase();

        int vowel=0;
        int consonants=0;

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='a'&&ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    vowel++;
                }
                else{
                consonants++;
                }
            }
        }

        System.out.println("Vowels = "+vowel);
        System.out.println("Consonants = "+consonants);

        sc.close();


    }
}