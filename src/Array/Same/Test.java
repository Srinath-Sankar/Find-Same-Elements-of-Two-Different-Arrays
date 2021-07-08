package Array.Same;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int size=scan.nextInt();
        int[]array1=new int[size];
        int[]array2=new int[size];
        System.out.print("Enter the First Array:");
        for(int i=0;i<size;i++) array1[i]=scan.nextInt();
        System.out.print("Enter the Second Array:");
        for(int i=0;i<size;i++) array2[i]=scan.nextInt();
        new SameElements().find(size,array1,array2);
        
    }
    
}
