
import java.util.Scanner;
import java.util.Random;
public class Print {
    public static void main(String[] args) {
        bubbleSort ob = new bubbleSort();
		Scanner sc=new Scanner(System.in);
        Random r=new Random();
		int array[]=new int[100];
		int n,op;
		System.out.print("Enter the array size : ");
		n=sc.nextInt();
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
        System.out.println("Unsorted Array : ");
        ob.display(array,n);
        long start=System.nanoTime();
        ob.bubblesort(array,n);
		long stop=System.nanoTime();
		System.out.println("Sorted array elements : ");
		ob.display(array,n);
		System.out.println("Time Complexity : "+(stop-start));

	    }

    }
}
