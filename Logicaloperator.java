public class Logicaloperator {
    public static void main(String args[]) {
        int a = 4;
        int b = 4;
        int c = 6;
        int d = 10;

        boolean result = a >= b && c < a;
        boolean ans = a <= c || c == a;   

        System.out.println(result);
        System.out.println(ans);
        System.out.println(!result);   // ! change the result 
    }
}
        