package course;

import java.util.Scanner;

public class Course {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input course: ");
        String course = sc.nextLine();
        
        switch (course) {
            case "IT":
                System.out.println("Input major: \n"
                        + "[NS] = Network and Security \n"
                        + "[WT] = Web Technology \n"
                        + "[ERP] = Enterprise Resource Planning ");
                String it = sc.nextLine();
                switch (it) {
                    case "NS":
                    case "Network and Security":
                        System.out.println("You are an IT student and your major is Network and Security.");
                        break;
                    case "WT":
                    case "Web Technology":
                        System.out.println("You are an IT student and your major is Web Technology.");
                        break;
                    case "ERP":
                    case "Enterprise Resource Planning":
                        System.out.println("You are an IT student and your major is Enterprise Resource Planning.");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }   break;
            case "CS":
                System.out.println("Input major: \n"
                        + "[MD] = Mobile Developer \n"
                        + "[DA] = Digital Arts and Animation"
                        + "");
                String cs = sc.nextLine();
                switch (cs) {
                    case "MD":
                    case "Mobile Developer":
                        System.out.println("You are an Computer Science student and your major is Mobile Developer.");
                        break;
                    case "DA":
                        System.out.println("You are an Computer Science student and your major is Digital Arts and Animation.");
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }   break;
            case "BSDA":
                System.out.println("BSDA");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
    
}
