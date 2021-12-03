class Test4
{
    void show(int a, String b)
    {
        System.out.println("1");
    }
    void show(String b,int a)
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        {
            Test4 t= new Test4();
            t.show("abc");

        }
    }


}
