package account2;

import java.util.Scanner;

public class Account2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        double add;
        double sub;
        double mul;
        double div;
        double mod;
        
        System.out.print("Input first number: ");
        double f = sc.nextDouble();
        
        System.out.print("Input arithmetic symbol: ");
        String as = sc.next();
        
        System.out.print("Input second number: ");
        double s = sc.nextDouble();
        
        if(as.equals("+") || as.equals("addition")){
            add = f + s;
            System.out.println(add);
        }
        else if(as.equals("-") || as.equals("subtraction")){
            sub = f - s;
            System.out.println(sub);
        }
        else if(as.equals("*") || as.equals("multiplication")){
            mul = f * s;
            System.out.println(mul);
        }
        else if(as.equals("/")|| as.equals("division")){
            div = f / s;
        System.out.println(div);
        }
        else if(as.equals("%") || as.equals("modulo")){
            mod = f % s;
            System.out.println(mod);
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}