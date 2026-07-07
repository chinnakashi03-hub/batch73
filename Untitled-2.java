// Main outer class representing the product
public class first1 {
    int id;
    String productname;
    String productbrand;
    double price;
    int warranty;
    String region;

    // Default Constructor
    first1() {
        id = 5433;
        productname = "smartphone";
        productbrand = "vivof7";
        price = 56.0098;
        warranty = 1;
        region = "nandyal";
    }

    // Parameterized Constructor
    first1(int id, String productname, String productbrand, double price, int warranty, String region) {
        System.out.println("this is a constructor block!");
        this.id = id;
        this.productname = productname;
        this.productbrand = productbrand;
        this.price = price;
        this.warranty = warranty;
        this.region = region;
        // Tip: Avoid calling display() inside the constructor if you plan to call it manually later
    }

    void display() {
        System.out.println("*******************************");
        System.out.println("this is my phoneid: " + id);
        System.out.println("this is my productname: " + productname);
        System.out.println("this is my productbrand: " + productbrand);
        System.out.println("this is my price: " + price);
        System.out.println("this is my warranty: " + warranty);
        System.out.println("this is my region: " + region);
    }
}

// Child class extending first1 (Moved outside to keep it clean)
class first2 extends first1 {
    first2(int id, String productname, String productbrand, double price, int warranty, String region) {
        // super() handles assigning all these fields to the parent class
        super(id, productname, productbrand, price, warranty, region);
    }
}

// Separate Runner class containing the main method
class user1 {
    public static void main(String[] args) {
        System.out.println("this is main method");
        
        // 1. Testing default constructor
        first1 f = new first1();
        f.display();
        
        // 2. Testing parameterized constructor 
        // Note: This will print the display output twice now because it's called inside the constructor AND here.
        first1 f1 = new first1(546373, "smartmobile", "vivof7", 56.000, 1, "nandyal");
        f1.display();
        
        first1 f2 = new first1(590289, "smartmobile", "samsungs23", 50.000, 1, "hyderabad");
        f2.display();
        
        System.out.println("*******************************");
        System.out.println("Direct access verification:");
        System.out.println(f.id);
        System.out.println(f.productname);
        System.out.println(f.productbrand);
        System.out.println(f.price);
        System.out.println(f.warranty);
        System.out.println(f.region);
    }
}