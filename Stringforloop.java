
public class Stringforloop {
    public static void main(String args[]) {
    
    char[] characterArray = {'a','b','c'};

    String[] stringArray = {"1","b","c"};

    double[] intArray = {2.1,3.4,4.3,5.1};
    
    String word = "happy";
    String bword = " bir  thday  ";
    
    String result="";
    for(int i =0; i <bword.length() ;i++){
        if(bword.charAt(i) != ' '){
            result = result +bword.charAt(i);
        }
        System.out.println(i);
    }

    System.out.println(result);


  

}    
}


