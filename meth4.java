public class meth4 {
    String getName(String name) {
        return name;
    }
    public static void main(String[]args){



        meth4 obj = new meth4();

        String result = obj.getName("Kashireddy");

        System.out.println("Name = " + result);
    }
}

