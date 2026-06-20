public class QuickSort {

    public int partition(Order [] arr, int low , int high){
        int i= low -1;
        int pivot=arr[high].getTotalPrice();

        for(int j=low;j<high;j++){
            if(arr[j].getTotalPrice()<pivot){
                i++;

                Order temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        Order temp =arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;
    }

    public Order [] quickSort(Order [] arr ,int low ,int high){
        if(low<high){
            int part=partition(arr,low,high);
            quickSort(arr,part+1,high);
            quickSort(arr,low,part-1);
        }
        return arr;
    }
}
