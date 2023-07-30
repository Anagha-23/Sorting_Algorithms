public class bubbleSort{
    int temp;
    public void bubblesort(int array[],int n){
        for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
    }
    public void display(int array[],int n){
        for(int i=0;i<n;i++)
			System.out.print(array[i]+"\t");
        System.out.println();
    }
}