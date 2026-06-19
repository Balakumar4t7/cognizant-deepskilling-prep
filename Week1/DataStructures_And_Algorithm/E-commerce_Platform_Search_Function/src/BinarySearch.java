public class BinarySearch {
    public Products binarySearch(Products[] p , String name){
        int left =0;
        int right = p.length-1;
        while(left<=right){
            int mid= (left+right)/2;

            String s =p[mid].getProductName();
            int comp = s.compareToIgnoreCase(name);
            if(comp == 0){
                return p[mid];
            }
            else if(comp< 0){
                left= mid+1;
            }
            else {

                right = mid-1;
            }
        }
        return null;
    }
}
