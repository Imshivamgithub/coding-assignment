package Java;

import java.util.Scanner;

public class RomanToInt {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in) ;
         System.out.println("Plese! give input in Roman Number ");
        String roman = sc.next() ;
        long result = conRomanToInt(roman);
        System.out.println("The corresponding integer value is : "+ result);

    }

    static int charValue(char ch){
      switch (ch) {
        case 'I': return 1 ;
        case 'V': return 5 ;
        case 'X': return 10 ;
        case 'L': return 50 ;   
        case 'C': return 100 ;
        case 'D': return 500 ;
        case 'M': return 1000 ;
        default:
           return -1 ;
      }
    }

    static long conRomanToInt (String roman) {  //  "XIX"

     long sum = 0;
     int len = roman.length() ;
      for (int i = 0; i < len; i++) {
           if (charValue(roman.charAt(i))==-1) {
           return -1 ;
       }
         int temp1 = charValue(roman.charAt(i)) ;
         if (i+1 < len) {
            int temp2 = charValue(roman.charAt(i+1));
            if (temp1>= temp2) {
                sum = sum + temp1 ;
            } else {
                sum = sum - temp1 ;
            }
         } else {
            sum = sum +temp1 ;
         }
      }
      return sum ;
    }
}
