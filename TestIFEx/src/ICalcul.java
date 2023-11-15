@FunctionalInterface
public interface ICalcul {

    int calculer(int x1,int x2);



   default void afiiche(){
        System.out.println("test");
    }

   static void test(){
        System.out.println("test static");
    }
}
