public class Ifelseif {

    public static void main(String[]  args){
        
        int a = 4;
        int b = 6;
        int c = 9;

        if (a > b && a > c){
        System.out.println("a is greater");
    }
        else if (b > a && b > c ){
            System.out.println("b is greater");   
        }
        else { 
            System.out.println("c is greater");
        }

    }
}