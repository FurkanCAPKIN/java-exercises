import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the word: ");
        String word = input.nextLine();

        int high = word.length()-1;
        int low = 0;
        boolean isPolindrome = true;
        System.out.println(high);

        while(low<high){
            if(word.charAt(low) != word.charAt(high)){
                isPolindrome = false;
                break;
            }
            low++;
            high--;
        }
        high = word.length()-1;

        if(isPolindrome){
            System.out.println(word+" is a polindrome!!");
            while(high != -1){
                System.out.println(word.charAt(high));
                high--;
            }
        }else{
            System.out.println(word+" is not a polindrome");
        }

    }
}