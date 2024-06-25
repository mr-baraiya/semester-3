/*Design anagram game using array.
 Allow a user to enter N words and store it in an array.
 Generate a random number between 0 to N-1.
 Based on the random number generated display the word stored at that
index of an array and allow user to enter its anagram.
 Check whether the word entered by the user is an anagram of displayed
number or not and display an appropriate message.
 Given a word A and word B. B is said to be an anagram of A if and only if
the characters present in B is same as characters present in A,
irrespective of their sequence. For ex: “LISTEN” == “SILENT” */
import java.util.*;
import java.io.*;
public class DS_LAB_32 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many word do you want to enter : ");
        int n =sc.nextInt();
        
        String [] words = new String[n];
        for(int i=0 ;i<n;i++){
            System.out.println("Enter word "+(i+1)+" : ");
            words[i] = sc.next();
        }

        int randomNumber = (int)Math.ceil(Math.random()*(n-1));
        System.out.println("Random number genrated : "+randomNumber);
        System.out.println("Word At index "+randomNumber+" is = "+words[randomNumber]);
        System.out.println("Enter the Anagram of the word : ");
        String anagram = sc.next();

        char [] word1 = new char[words[randomNumber].length()];
        for(int i=0 ; i<words[randomNumber].length();i++){
            word1[i] = words[randomNumber].toLowerCase().charAt(i);
        }
        char [] word2 = new char[anagram.length()];
        for(int i=0;i<anagram.length();i++){
            word2[i] = anagram.toLowerCase().charAt(i);
        }

        if (areAnagram(word1, word2))
        System.out.println("The two strings are anagram of each other.");
        else
        System.out.println("The two strings are not anagram of each other.");
    }   
    
    public static boolean areAnagram(char[] str1, char[] str2){

        int n1 = str1.length;
        int n2 = str2.length;
 
        // If length of both strings is not same,
        // then they cannot be anagram
        if (n1 != n2)
            return false;
 
        // Sort both strings
        Arrays.sort(str1);
        Arrays.sort(str2);
 
        // Compare sorted strings
        for (int i = 0; i < n1; i++){
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }
}
