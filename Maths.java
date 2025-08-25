public class Maths{
    public static void main (String [] args){
    System.out.println(Math.max(4,8));
    System.out.println(Math.min(2,90));
    System.out.println(Math.sqrt(64));
    System.out.println(Math.abs(-72));
    System.out.println(Math.random());
    System.out.println(Math.random()*101);  //if needed from 1 to 100

    ////     If needed random number in int 
    int randomNumber = (int)(Math.random()*101);   
    System.out.println(randomNumber);
    }
}