public class meth2 {
    int getNumber() {
        return 100;
    }
    public static void main(String []args){
        meth2 obj = new meth2();
        int num = obj.getNumber();
        System.out.println("Returned Value: " + num);
    }

    }

