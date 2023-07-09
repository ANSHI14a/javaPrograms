
import java.util.*;



public class array{
    static void printarray(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println(" ");
        
    }
    
    public static void main(String[]args){
       /*  Scanner sc=new Scanner(System.in);/* */
       // int n=sc.nextInt();
        int[]arr = new int[5];
        arr[0]=5;
        arr[1]=12;
        arr[2]=67;
        arr[3]=5;
        arr[4]=12;
        



        //System.out.println("Enter the elements");
      //  for(int i=0;i<arr.length;i++){
       //     arr[i]=sc.nextInt();

        //}
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

        }
        printarray(arr);
        //trying to copy array 1 to array2
        int[]arr_2=arr;
        printarray(arr_2);
        
        //changing values of array 2
        arr_2[0]=0;
        arr_2[1]=23;
        System.out.println("orignal Array after vhanging values of array 2");
        printarray(arr);
    }
}


    
