package oddeven;

import java.util.ArrayList;
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args){
        Scanner va = new Scanner(System.in);
        
        int array[] = {13,3,9,15,20,65,23,18,4,2,14,21};
        
        ArrayList<Integer> o = new ArrayList<>();
        ArrayList<Integer> e = new ArrayList<>();
        
        System.out.println("Elements:");
        for(int i = 0; i<array.length; i++){
            System.out.println(array[i]);
        }
        
        for(int i = 0; i < array.length; i++){
            if(array[i] %2==0){
                o.add(array[i]);
            }
            else if(array[i] %2!=0){
                e.add(array[i]);
            }
        }
        
        System.out.println("*-* Even *-* \t *-* Odd *-*");
        for (int v = 0; v < 5; v++){
            System.out.println("\t" + o.get(v) + "\t \t" + e.get(v));
        }
    }       
}
