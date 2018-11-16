package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static int x;

    public static void main(String[] args) {
        user();
        display();
    }
    
    public static void user(){
        Scanner va = new Scanner(System.in);
        System.out.println("Enter a number: ");
        x = va.nextInt(); 
   }
    
    public static int show(int a){
        if(a == 0){
            return 0;
        }
        else if(a == 1) {
            return 1;
        }
        else
            return show(a-1) + show(a-2);
    }
    
    public static void display(){
        for(int i = 0; i <= x; i++){
            System.out.print("f(" + i + ")\t");
        }
        
        for(int a = 0; a <= x; a++){
            System.out.println("");
            
            for (int i = 0; i <= a; i++) {
                System.out.print("" + show(i) + "\t");
            }
 
        }
        
    }
}

