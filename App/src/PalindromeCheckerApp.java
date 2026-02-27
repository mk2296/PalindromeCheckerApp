import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Input text:");
        String input=sc.nextLine();
        String copyString="";
        for(int i=input.length()-1;i>=0;i--){
            copyString=copyString+input.charAt(i);

        }
        if(input.equals(copyString)){
            System.out.println("Is it a palindrome?: true");
        }
        else{
            System.out.println("Is it a palindrome?: false");
        }


    }
}

