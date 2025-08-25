//////program that calculates the average of different ages:
public class Foreachloopagesarrayqn {
    public static void main(String[] args)
{
    int[] ages = {12,34,56,43,34,23};
    float sum=0;

    int length = ages.length;

   for (int i : ages) {
    sum += i;
   }
    
    float average = sum / length;

    System.out.println("The average age is " + average);
}}
