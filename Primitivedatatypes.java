public class Primitivedatatypes {
    public static void main(String a[]) {
        
        int num1 = 5888;
        byte num2 = 127;           // -128 yo 127
        short num3 = 599;
        long num4 = 5645l;         // for long at the end 'l' is compulsory

        float fly = 5.6f;          // for float at the end 'f' is compulsory
        double dell = 2.5;

        char alpha = 'a';
        char nume = '8';
  
        boolean b = true;
                                   // this requires + to appear
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        System.out.println(fly);
        System.out.println(dell);
        System.out.println(alpha);
        System.out.println(nume);
        System.out.println(b);          // this doesn't requires + to appear directly


        System.out.println("The value of num1 is " + num1);
        System.out.println("The value of num2 is " + num2);
        System.out.println("The value of num3 is " + num3);
        System.out.println("The value of num4 is " + num4);
        System.out.println("The value of fly is " + fly);
        System.out.println("The value of dell is " + dell);
        System.out.println("The value of alpha is " + alpha);
        System.out.println("The value of alpha is " + nume);
        System.out.println("b is " + b);
    }
}