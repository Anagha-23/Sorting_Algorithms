import java.util.Random;

public class Partition {
	int low,high,i,j;
	public int partition(int array[],int low,int high) {
		int pivot = array[low];
        int i = low ;
        int j = high;
        while (i <=j) {
            while (i <=high && array[i] <= pivot) {
                i=i+1;
            }
            while (j>=low && array[j] >= pivot) {
                j=j-1;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        while (i<j) {
            array[low] = array[j];
            array[j] = pivot;
        }  
        return j;
	}
}
