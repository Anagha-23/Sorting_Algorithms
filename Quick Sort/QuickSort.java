import java.util.Scanner;
import java.util.Random;
public class QuickSort{
    public void quickSort(int array[], int low, int high) {
        if (low < high) {
        	Partition p=new Partition();
            int j = p.partition(array, low, high);
            quickSort(array, low, j - 1);
            quickSort(array, j + 1, high);
        }
	}
    public void display(int array[],int n) {
    	for(int i=0;i<n;i++)
    		System.out.println(array[i]+"\t");
    }

}
