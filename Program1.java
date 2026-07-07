class Product{
    int productId;
    String productName;
    String brand;
    double price;
    String warranty;
    String regionPlace;

    Product(int productId, String productName, String brand,
            double price, String warranty, String regionPlace) {

        this.productId = productId;
        this.productName = productName;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
        this.regionPlace = regionPlace;
    }

    void details() {
        System.out.println("Product ID      : " + productId);
        System.out.println("Product Name    : " + productName);
        System.out.println("Brand           : " + brand);
        System.out.println("Price           : " + price);
        System.out.println("Warranty        : " + warranty);
        System.out.println("Region Place    : " + regionPlace);
    }
}

class RegionalProduct extends Product {

    String location;

    RegionalProduct(int productId, String productName, String brand,
                    double price, String warranty,
                    String regionPlace, String location) {

        super(productId, productName, brand, price, warranty, regionPlace);
        this.location = location;
    }

    void showDetails() {
        super.details();
        System.out.println("Location        : " + location);
        System.out.println("-----------------------------------");
    }
}

public class Program1 {

    public static void main(String[] args) {

        RegionalProduct product1 =
                new RegionalProduct(
                        5902,
                        "Smart Phone",
                        "Samsung S23",
                        58000.00,
                        "6 Months",
                        "Nandyal",
                        "Andhra Pradesh");

        RegionalProduct product2 =
                new RegionalProduct(
                        5902,
                        "Smart Phone",
                        "Samsung S23",
                        58000.00,
                        "6 Months",
                        "Hyderabad",
                        "India");

        System.out.println("Original Product Details");
        product1.showDetails();

        System.out.println("New Product Details");
        product2.showDetails();
    }
}