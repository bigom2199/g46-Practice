package lexicon.se;

import lexicon.se.interfaces.Product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Product> products = new ArrayList<Product>();


        Product product1 = new Product("Sprite", 200, 0);
        Product product2= new Product( "Banana" ,8,00, 4);
        Product product3= new Product("Fruit",50, 2);




        products.add(product1);
        products.add(product2);
        products.add(product3);
        System.out.println("Fruit");


        products.stream().filter(p -> p.getStock() == 0).forEach(System.out::println);
        products.stream().filter( p -> p.getProductName().startsWith("B")).forEach(System.out::println);
        Product.stream().filter(p-> p.getProductThanPrice(). lowerThan(150)).forEach(System.out::println);
        Product.stream().filter(P->  P.getPriceOfAllProducts().lessThan(10)).forEach(System.out::println);
    }
}
