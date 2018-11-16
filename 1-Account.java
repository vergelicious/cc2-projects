package account;

import java.util.Scanner;

public class Account {
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
        System.out.print("Username: ");
        String n = sc.nextLine();
        System.out.print("Password: ");
        String pass = sc.nextLine();
        System.out.print("Verify Password: ");
        String p = sc.nextLine();
        
        if(pass.equals(p)){
            System.out.println("Correct Password!");
        }
        else{
            System.out.println("Invalid Output!");
        }
        
    }
    
}
