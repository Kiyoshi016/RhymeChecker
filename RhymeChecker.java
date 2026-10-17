import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RhymeChecker {

    public static void main(String[] args) {
        
    String word1, word2, sub;        
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter first word: ");
    word1 = sc.nextLine();
    
    System.out.print("Enter second word: ");
    word2 = sc.nextLine();
    
    sub = word1.substring(word1.length() - 2);
    System.out.println("Sub = " + sub);
    
    Pattern pattern = Pattern.compile("[A-Za-z]{1,2}" + sub);
    Matcher matcher = pattern.matcher (word2);
    
    if (matcher.matches()) {
        System.out.println("The words rhyme!");
    } else {
        System.out.println("The words do not rhyme!");
        sc.close();
        }   
    }
}