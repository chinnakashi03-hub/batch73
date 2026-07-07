public class const1 {
    //default constructor in java
    int id;
    String name;
    const1(){
        System.out.println("these is constructor block");
        id=544;
        name="kashireddy";
    }
    public static void main(String[]aegs){
        System.out.println("this is main method block");
        const1 c=new const1();
        // System.out.println("this is my details");
        // System.out.println(c.id);
        // System.out.println(c.name);
        c.display();
    }
    void display(){
        System.out.println("this is my id :"+id);
        System.out.println("this is my details name :"+name);

    }
        

    }
    

