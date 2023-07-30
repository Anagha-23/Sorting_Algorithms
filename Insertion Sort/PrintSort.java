import java.util.Random;
import java.util.Scanner;

public class PrintSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        System.out.println("Enter the Array Size");
        int n=sc.nextInt();
        int a[]=new int[n];
        while(true) {
            System.out.println("Enter Choice:\n 1.Best Case\n 2.Average Case\n 3.Worst Case\n");
            int ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Best Case");
                        for(int i=0;i<n;i++)
                            a[i]=i;
                        break;
                case 2:System.out.println("Average Case");
                        for(int i=0;i<n;i++)
                            a[i]=r.nextInt();
                        break;
                case 3:System.out.println("Worst Case");
                        for(int i=0;i<n;i++)
                            a[i]=n-i;
                        break;
                default:System.exit(0);		
            }
            long start,stop;
            InsertionSort ob=new InsertionSort();
            start=System.nanoTime();
            ob.insertionsort(a);
            stop=System.nanoTime();
            System.out.println("Time Taken to Sort " +n+ " elements = " +(stop-start) +"ns" );
        }
    }
}
