package multid;
import java.util.*;
public class MultiD {


    public static void main(String[] args)  {
        Scanner va = new Scanner(System.in);
       
     
        System.out.println("Enter Rows: ");
        int row = va.nextInt();
        
        System.out.println("Enter Columns: ");
        int col = va.nextInt();
        
        int [][] rc = new int[row][col] ;
        
        for(int i=0; i<row; i++){ 
                for(int j =0; j<col; j++){
                    System.out.println("Enter a number for row: " + i + " and for column: " + j + ":");
                    rc[i][j] = va.nextInt();
                }
                    
        }
        for(int v = 0; v<rc.length; v++){
            System.out.println("\n Row:" + v+ "\t Column:" + v);
            for(int a = 0; a<rc[v].length; a++){
                System.out.print(rc[v][a] + "\t");
            }
        }
     
        
  
    
    }
}
