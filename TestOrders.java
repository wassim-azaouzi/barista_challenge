import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item ("mocha", 10.25);
        Item item2 = new Item ("latte",8.25);
        Item item3 = new Item ("drip coffee",5.50);
        Item item4 = new Item ("capuccino",10.25);


        // Order variables -- order1, order2 etc.
        Order order1 = new Order ();
        Order order2 = new Order ();
        Order order3 = new Order ("Cindhuri");
        Order order4 = new Order ("Jimmy");
        Order order5 = new Order ("Sam");

        order1.addItem(item1);
        order1.addItem(item2);
        
        order2.addItem(item1);
        order2.addItem(item4);

        order3.addItem(item1);
        order3.addItem(item3);
        order3.addItem(item4);

        order4.addItem(item2);
        order4.addItem(item3);
        order4.addItem(item4);
        
        order5.addItem(item1);
        order5.addItem(item4);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        order2.setReady(true);
        order3.setReady(true);
        order5.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        order1.getOrderTotal();
        order2.getOrderTotal();
        order3.getOrderTotal();
        order4.getOrderTotal();
        order5.getOrderTotal();

        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
        // Order order2 = new Order ();
        // order2.getName="Jimmy";
        // order2.setItems.add(item1);
        // order2.getOrderTotal=item1.price;
        // order2.isReady=true;


        // Order order3 = new Order ();
        // order3.getName="Noah";
        // order3.setItems.add(item4);
        // order3.getOrderTotal+=item4.price;

        // Order order4 = new Order ();
        // order4.getName="Sam";
        // order4.setItems.add(item2);
        // order4.getOrderTotal+=item2.price;

        // order4.setItems.add(item2);
        // order4.getOrderTotal+=item2.price;
        // order4.setItems.add(item2);
        // order4.getOrderTotal+=item2.price;

        // order1.total=;
        // order1.ready=;
        // order1.items=;

        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);
        // System.out.printf("Items: %s\n", order1.items);

        // System.out.printf("Name: %s\n", order2.name);
        // System.out.printf("Total: %s\n", order2.total);
        // System.out.printf("Ready: %s\n", order2.ready);
        // System.out.printf("Items: %s\n", order2.items);

        // System.out.printf("Name: %s\n", order3.name);
        // System.out.printf("Total: %s\n", order3.total);
        // System.out.printf("Ready: %s\n", order3.ready);
        // System.out.printf("Items: %s\n", order3.items);

        // System.out.printf("Name: %s\n", order4.name);
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.ready);
        // System.out.printf("Items: %s\n", order4.items);

    }
}
