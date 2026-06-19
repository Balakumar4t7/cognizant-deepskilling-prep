import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name of the Product : ");
        String find = sc.nextLine();

        Products p[] = {new Products(1, "Samsung", "phone"),
                new Products(2, "Nokia", "Phone"),
                new Products(3, "Lenavo", "Laptop"),
                new Products(4, "Shirt", "Clothes"),
                new Products(5, "Coca Cola", "Soft Drinks")};


        LinearSearch ls = new LinearSearch();
        Products found = ls.linearSearch(p, find);

        System.out.println("*****Using Linear Search  ***** \n");
        if (found != null) {
            System.out.println("Found : " + found);
        } else {
            System.out.println("Not Found");
        }

        System.out.println();

        Products [] sortedProducts = p.clone();

        Arrays.sort(sortedProducts , (p1,p2)-> p1.getProductName().compareToIgnoreCase(p2.getProductName()));


        BinarySearch bs =new BinarySearch();
        Products found1=bs.binarySearch(sortedProducts,find);

        System.out.println(" ***** Using Binary Search ******* \n");
        if (found1 != null) {
            System.out.println("Found : " + found1);
        } else {
            System.out.println("Not Found");
        }


    }
}