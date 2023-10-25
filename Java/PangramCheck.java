package Java;

import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Input the String You want to check for Pangram :");
        String str = sc.nextLine() ;
        str = str.toLowerCase();
        int len= str.length();
        checkPangram(str, len);
    
    }

   static void checkPangram(String str, int len){
       int freqency[] = new int[26] ;
       for (int i : freqency) {
        // making every index value to 0 
          freqency[i] = 0;
       }
     for (int j = 0; j < len; j++) {
        if (str.charAt(j) != ' ') {
      freqency[str.charAt(j)-'a']++;
    } 
}
  int temp =0;

    for (int i = 0; i < 26; i++) {
        if (freqency[i]==0) {
            temp = 1;
            break ;
        }
    }

    if (temp==1) {
        System.out.println(" Not a Pangram string");
    } else {
         System.out.println("The input string is  a Pangram string");
    }



   }  
}
