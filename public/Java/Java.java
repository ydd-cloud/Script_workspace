public class Java {

    static class Obj {
        Obj() {
            System.out.println("Object: " + this);
        }
    }

    public static void main(String[] args) {
        Obj obj = new Obj();
        System.out.println(obj);
    }
}
