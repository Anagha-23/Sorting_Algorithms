import java.util.Random;
import java.util.Scanner;

public class PrintSort {
    public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Random r=new Random();
			int n,op;
			System.out.print("Enter the size of the array : ");
			n=sc.nextInt();
			int array[]=new int[n];
	        int low = 0;
	        int high = n - 1;
	        long start,stop;
	        while(true) {
	        	System.out.println("Enter choice\t1:Best Case\t2Average Case\t3:Worst Case");
	        	op=sc.nextInt();
	        	switch(op) {
	        		case 1 :for(int i=0;i<n;i++)
	        					array[i]=i;
	        				break;
	        		case 2: for(int i=0;i<n;i++)
	        					array[i]=r.nextInt();
	        				break;
	        		case 3: for(int i=0;i<n;i++)
	        					array[i]=n-i;
	        				break;	
	        	}
	            QuickSort ob=new QuickSort();
                System.out.println("Unsorted Array : ");
	            ob.display(array,n);
	            start=System.nanoTime();
	            ob.quickSort(array,low,high);
	            stop=System.nanoTime();
	            System.out.print("Time Efficiency : "+(stop-start)+"\n");
                System.out.println("Sorted Array : ");
	            ob.display(array, n);
	    }
	}
}