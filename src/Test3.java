public class Test3 {
    void show(int a)
    {
        System.out.println("1");
    }
    void show3(String a)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Test3 t= new Test3();
        t.show("abc");
    }
}
