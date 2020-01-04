import java.util.*; 
public class Palindrome {
   public static void main (String[] args) {
       System.out.println("Palindrome Checker-- Ayush Gaur\n");
       String phrase = "";
       //Asks for phrase
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter phrase: ");
       String current = sc.nextLine();
       //Loops if not "done"
       while (!current.equals("done")) {
           int j = 0;
           String reverse = "";
           //Makes lowercase
           phrase = current.toLowerCase();
           //Removes non-necessary charactars
           phrase = phrase.replaceAll("[^A-Za-z0-9]","");
           //Reverses
           for (int i = phrase.length()-1; 0<= i; i--) {
             reverse = reverse + phrase.charAt(i);
           }
           //Gives output
           if (reverse.equals(phrase)) {
               System.out.println("That is a palindrome");
           } else {
               System.out.println("That is not a palindrome");
            }
           System.out.println("Enter phrase: ");
           current = sc.nextLine();
       }
   }     
}
