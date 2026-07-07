public class const2 {
    //2.No-args constructors in constructors.
    int id;
    String name;
    double salary;
    const2(){
        System.out.println("constructor block 1");
        id=544;
        name="siddhireddy chinnakashireddy";
        salary=10000;

    }
    public static void main(String[]args){
        System.out.println("main method started");
        const2 obj=new const2();
        obj.display();
        const2 obj1=new const2();
        obj1.display();
        const2 obj2=new const2();
        obj2.display();
        const2 obj3=new const2();
        obj3.display();
    }
    void display(){
        System.out.println("my id value is:"+id);
        System.out.println("my name is:"+name);
        System.out.println("my salary is:"+salary);
        System.out.println("***********************");
    }
}

