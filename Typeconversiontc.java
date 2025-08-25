public class Typeconversiontc {
  public static void main(String args[]) {
    
    byte a = 20;
    byte b = 30;
    // as byte can't go more than 127 so coverting the multiplication in int
    int result = (int) a * b;        //(int) is not compulsory but for better understandings and readings
    byte byteResult=(byte) result;        // using byte here will give the wrong answer  //
    System.out.println(byteResult);       //// will be considered as not a good practice
    
    int maxScore = 500;
    int userScore = 423;
    float percentage = (float) userScore / maxScore * 100.0f; //(float) is not compulsory same as (int)
    System.out.println(percentage); 
  }
}