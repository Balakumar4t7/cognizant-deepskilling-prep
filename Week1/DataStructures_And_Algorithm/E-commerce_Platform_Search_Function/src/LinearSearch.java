public class LinearSearch {
    public Products linearSearch(Products [] products,String name){
        for(Products p : products){
            if(p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }
}
