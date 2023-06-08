//Implementation of Linear Search

//Linear Search is a search algorithm which is used to find an element in the array.

//Time Complexity : O(n);



import java.util.Scanner;
import java.util.*;


public class main{
    public static void Main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int array[] = new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the element to be found:");
        int x = sc.nextInt();
        for(int i=0;i<n;i++){
            if(array[i] == x){
              System.out.println("Element is found at position " + i+1);
            }
            else{
                System.out.println("Element not found!");
            }
        }
    }

   
}