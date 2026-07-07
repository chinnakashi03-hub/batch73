class first1 {
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
    first1(int id, String productname, String productbrand,double price, int warranty, String region) {

        System.out.println("This is a constructor block!");

        this.id = id;
        this.productname = productname;
        this.productbrand = productbrand;
        this.price = price;
        this.warranty = warranty;
        this.region = region;
    }

    // Display Method
    void display() {
        System.out.println("*******************************");
        System.out.println("Product ID      : " + id);
        System.out.println("Product Name    : " + productname);
        System.out.println("Product Brand   : " + productbrand);
        System.out.println("Price           : " + price);
        System.out.println("Warranty        : " + warranty + " Year");
        System.out.println("Region          : " + region);
    }
}

// Child Class
class first2 extends first1 {

    first2(int id, String productname, String productbrand,double price, int warranty, String region) {

        super(id, productname, productbrand, price, warranty, region);
    }
}

// Main Class
class user1 {

    public static void main(String[] args) {

        System.out.println("This is main method");

        // Default Constructor
        first1 f = new first1();
        f.display();

        // Parameterized Constructor
        first1 f1 = new first1(
                546373,
                "smartmobile",
                "vivof7",
                56.000,
                1,
                "nandyal");
        f1.display();

        first1 f2 = new first1(
                590289,
                "smartmobile",
                "samsungs23",
                50.000,
                1,
                "hyderabad");
        f2.display();

        first2 f3 = new first2(
                600001,
                "smartwatch",
                "vivof7",
                45.000,
                2,
                "karimnagar");
        f3.display();

        // Direct Variable Access
        System.out.println("*******************************");
        System.out.println("Direct Variable Access");
        System.out.println(f.id);
        System.out.println(f.productname);
        System.out.println(f.productbrand);
        System.out.println(f.price);
        System.out.println(f.warranty);
        System.out.println(f.region);
    }
}