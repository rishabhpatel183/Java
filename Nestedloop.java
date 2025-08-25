public class Nestedloop {
    public static void main(String [] args){
    int a = 1;
        while (a <= 4) 
        {
            System.out.println("Hello! " + a);
            int b = 1;
            while (b <= 3 ){
                System.out.println("Kese ho" + b);
            b++;
            }
            a++;
        }

    }
}