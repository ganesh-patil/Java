public class Generics<K, V> {
    K kTest;
    V vTest;
    public Generics(K var1, V var2){
        kTest = var1;
        vTest = var2;
    }

    public K getKTest(){
        return kTest;
    }

    /**
     * @auther - gpatil
     * @param ktest
     */
    public void setkTest(K ktest){
        kTest = ktest;
    }

    public static void main(String[] args){
        Generics ge = new Generics<>(2, "two");
        System.out.println(ge.getKTest());
        ge.setkTest("Ganesh");
        System.out.println(ge.getKTest());
    }
}
