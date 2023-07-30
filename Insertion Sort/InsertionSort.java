public class InsertionSort {
	public void insertionsort(int a[]){
		int val;
		int n=a.length;
		for(int i=1;i<n;i++){
			val=a[i];
			int j=i-1;
			while(j>=0 && a[j]>val){
		    	a[j+1]=a[j];
		    	j=j-1;
		    }
			a[j+1]=val;
		}    	
	}
	public void display(int a[])
	{
		System.out.println("Sorted Array is:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}
}