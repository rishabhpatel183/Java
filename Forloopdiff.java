public class Forloopdiff{
    public static void main (String [] args){
    
    for (int a = 1;a <= 5; a++) {
            System.out.println("Day " + a);
            for(int b = 1;b < 9 ;b++){
                System.out.println("       " + (b+8) + " to " + (b+9));
            }
        }  
   
    }
}
