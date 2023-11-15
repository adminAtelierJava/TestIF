public class Test {


    public static void main(String[] args) {
Somme S1=new Somme();

        testCalcul(12,2,S1);
        testCalcul(12,2,new Soustraction());

        testCalcul(15, 3, new ICalcul() {
            @Override
            public int calculer(int x1, int x2) {
                return x1+x2;
            }
        });

testCalcul(15,3,(int x,int y)->{return  x+y;});

        testCalcul(15,3,(x,y)-> x+y);

        testCalcul(15,3,(x,y)-> x-y);

        ICalcul.test();
    }



    public static void testCalcul(int a,int b,ICalcul ic)
    {
        System.out.println(ic.calculer(a,b));
    }

}
