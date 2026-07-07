class Product2 {
    int i;
    String productname;
    String brandname;
    double price;
    int warranty;
    String region;

    Product2() {
        i = 89765;
        productname = "smartphone";
        brandname = "samsung-s23";
        price = 56000.00;
        warranty = 2;
        region = "Nandyala";
    }

    Product2(int i, String productname, String brandname,double price, int warranty, String region) {

        this.i = i;
        this.productname = productname;
        this.brandname = brandname;
        this.price = price;
        this.warranty = warranty;
        this.region = region;
    }

    void display() {
        System.out.println("Product ID   : " + i);
        System.out.println("Product Name : " + productname);
        System.out.println("Brand Name   : " + brandname);
        System.out.println("Price        : " + price);
        System.out.println("Warranty     : " + warranty);
        System.out.println("Region       : " + region);
    }
}

class Product3 extends Product2 {

    Product3(int i, String productname, String brandname,double price, int warranty, String region) {

        super(i, productname, brandname, price, warranty, region);
    }

    void displayCompleteDetails() {
        super.display();
        System.out.println("----------------------------");
    }
}

class User1 {
    public static void main(String[] args) {

        Product2 p = new Product2();
        p.display();

        System.out.println();

        Product3 p1 = new Product3(
                567899,
                "Smart Mobile",
                "Vivo",
                56000.0,
                2,
                "Nandyala");

        p1.displayCompleteDetails();
    }
}