public class BubbleSort {
    public  Order[] bubbleSort(Order [] arr ){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0; j<arr.length-i-1;j++){
                if(arr[j].getTotalPrice() < arr[j+1].getTotalPrice()){
                    Order temp =arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr ;
    }
}
