package sort;

import java.util.Scanner;

public class Sort {

    public static void main(String args[]) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        System.out.print("ARRAY: ");
        printArray(arr);
        Scanner sc = new Scanner(System.in);

        System.out.print("Choices:\n"
                + "\t [1]Ascending\n"
                + "\t [2]Descending\n"
                + "Enter Choice: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("ASCENDING");

            Asc(arr);
        } else if (choice == 2) {
            System.out.println("DESCENDING");

            Desc(arr);
        } else {
            System.out.println("invalid input");

        }

    }

    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int ktr = 0; ktr < arr.length; ktr++) {
            if (arr[ktr] > max) {
                max = arr[ktr];
            }
        }
        return max;
    }

    public static void Asc(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap temp and arr[i] 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }

    public static void Desc(int arr[]) {
        int max = maxValue(arr);
        int n = arr.length;
        for (int i = n - 1; i > 0; i--) {//start 6 loop end at 0
            //System.out.println("1st loop start at" + i +" /0 --");
            for (int j = n - 1; j > 0; j--) { //j(7-6)=6 ; 6 > 0; 6-- 
                //System.out.println("2nd loop start at "+j+" /0 --");
                if (arr[j] > arr[j - 1]) { //array 6 = 90 > arr 7-1= 6=90 // since its equal next 
                    //System.out.println("condition if arr["+j+"]= "+arr[j]+" is greater than(>) arr["+ (j - 1) +"] ="+arr[j-1]);
                    // swap temp and arr[i] 
                    int temp = arr[j]; //holds arr 6
                    //System.out.println("temp holds arr["+j+"] = arr["+j+"] ="+arr[j]);
                    arr[j] = arr[j - 1]; // arr 6 holds arr (6j-1)5 =11
                    //System.out.println("then arr["+j+"] holds arr["+(j - 1)+"] = "+arr[j - 1]);
                    arr[j - 1] = temp;//arr 5 holds arr 6=90
                    //System.out.println("arr["+ (j - 1) +"] holds temp="+ temp);
                }
            }
        }
        printArray(arr);

    }

    /* Prints the array */
    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}