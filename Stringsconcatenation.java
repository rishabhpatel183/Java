public class Stringsconcatenation{
    public static void main (String [] args){
    
        String del = "Hello World.";
        String jack = "What The Hell!!";

    System.out.println(del + jack);
    System.out.println(del + " " + jack);  // for considering good practice we use " "
    // or 
    System.out.println(del.concat(jack));  // for considering good practice we use " "

//     Java uses the + operator for both addition and concatenation.
// Numbers are added. Strings are concatenated.
    }
}
