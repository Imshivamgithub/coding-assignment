package Java;

import java.util.Random;

public class ArrShuffle {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7 } ;
   
        shuffle(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }

    static void shuffle(int[] arr){
     Random rnd = new Random() ;
     int index ,temp;
     for (int i = arr.length-1; i > 0 ; i--) {
         index =  rnd.nextInt(i+1) ;
         temp =arr[index] ;
         arr[index] = arr[i];
         arr[i] = temp ;
     }
    }
}