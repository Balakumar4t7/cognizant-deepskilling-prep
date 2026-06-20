//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Order [] order = {
                new Order(1,"Luffy",45000),
                new Order(2,"JARR",4500),
                new Order(3,"JAGRA",40000),
                new Order(4,"GJAGI",75000),
                new Order(5,"Abdc",45200),
        };

        System.out.println("Before Sorting   \n");
        for(Order o :order){
            System.out.println(o);
        }
        BubbleSort bs =new BubbleSort();
        Order [] bubbleOrder=bs.bubbleSort(order).clone();

        System.out.println("\nAfter Sorting With Bubble Sort by Descending Order \n");
        for(Order o : bubbleOrder){
            System.out.println(o);
        }
        QuickSort qs = new QuickSort();
        Order [] quickOrder = qs.quickSort(order,0, order.length-1).clone();
        System.out.println("\nAfter Sorting With Quick Sort By Ascending Order \n");
        for(Order o : quickOrder){
            System.out.println(o);
        }
    }
}