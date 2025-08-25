public class Ternaryoperators {

    public static void main(String[]  args){
        
        int a = 5;
        int result = 0;

    //     if (a % 2 == 0){
    //         result = 10;}
    //     else {
    //         result = 20;
    //     }

    // instead 

    result = (a % 2 == 0)?  10  :  20;
                    //print 10 if true      20 if false
System.out.println(result);

    }
}