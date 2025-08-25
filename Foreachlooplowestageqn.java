public class Foreachlooplowestageqn {
    public static void main(String[] args) {
        
        int[] ages = {43,45,76,12,24,34};
        int lowestage = ages[0];

        for (int age : ages) {
            if(lowestage >= age)
            {
                lowestage = age;
            }

        }
        System.out.println("The lowest age is " + lowestage);
    }
    }