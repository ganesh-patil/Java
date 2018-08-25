public class Reminder {

    public static void main(String[] args){
        Reminder rm = new Reminder();
        rm.getNumreminder(13,4,3);

    }

    public  int getNumreminder(int n1, int n2, int n3){
        for (int i=1; i<n3;i++){
//            if(i%n1 == i%n2 &&  n3 == i%n2){
                System.out.println(i);
//            }
          /*  System.out.println(i%n1);
            System.out.println(i%n2);*/
        }
        return 0;
    }
}
