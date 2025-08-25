public class Switchstatements {

    public static void main(String[] args){
        String day = "Monday";

        //setting alarm time according to day
        // switch (day){
        //     case "Sunday" -> System.out.println("9am");             // instead of break we use "->"
        //     case "Monday","Tuesday" -> System.out.println("6am");
        //     default -> System.out.println("7am");

    //         switch (day){
    //             case "Sunday" -> result = "9am";             // instead of break we use "->"
    //             case "Monday","Tuesday" -> result = "6am";
    //             default -> result = "7am"; }
    // System.out.println(result);

//    String result = switch(day){
//         case "Sunday" -> "9am";             // instead of break we use "->"
//         case "Monday","Tuesday" -> "6am";
//         default -> "7am"; 
//     };
// System.out.println(result);
    
String res = switch(day){
    case "Sunday" : yield "9am";             
    case "Monday","Tuesday" : yield "6am";
    default : yield "7am"; 
};
System.out.println(res);

    }
}

        