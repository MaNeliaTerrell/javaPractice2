import java.sql.SQLOutput;

public class Methods {

    //----Global variables  ---- outside methods but inside a class
    //static String section = "A";  //static to make it accessible anywhere (within methods/functions

//    public static void main(String[] args){
//
//
//
//        System.out.println(section);
//            //sayHello();
//
//        //String greetings = "What's Up";
//        //System.out.println(greetings);
//        greet(); //calling the greet method
//    }
////    static void sayHello(){
////        //System.out.println("Hello");
////    }
//    static void greet(){
////        String greetings = "What's Up";
////        System.out.println(greetings);
//        System.out.println(section);
//
//}

    //--------CALLING METHODS ---------------

//public static void main(String[] args){
//
//    String x = "David";  //from the print method
//    print("Hello " + x);   //from the print method
//
//    add(5, 6); //arguments inside the () ==== from the add method
//
//    greet("Nelia", 25);  //from the greet method
//}

//    static void add(int num1, int num2){
//
//        System.out.println(num1 + num2);
//        // == add(1, 2);  Calling a method within the same method creates a recursion -- stackoverflow
//        print("Good day"); // calling from the print method
//    }
//    static void print(String word) {
//        System.out.println(word);
//        greet("Anne", 16); //can call another method here
//    }
//
//    static void greet(String name, int age){
//
//        System.out.println("Hello " + name);
//        System.out.println("You are " + age);
//    }

    //==========RETURN TYPES =============
     /// ---- return types can be void, String, int, etc

    public static void main(String[] args){

      int sum = add(5, 2);  /// calling the add method and assign it to a variable
        System.out.println(sum);

        int diff = subtract(20, 15);   ///calling the subtract method
        System.out.println(diff);

        System.out.println(isLegalAge(25));  //calling the isLegalAge method with an argument

        int sum2 = add(3, 7, 8);  //calling the add method with 3 params
        System.out.println(sum2);

        double sumOfDec = add(3.5, 5.3);  //calling the add method with double return type
        System.out.println(sumOfDec);
    }

    //==========INT and Boolean RETURN TYPES=====

    static int add( int num1, int num2){
        return num1 + num2;
    }

    static int subtract( int num1, int num2){
        return num1 - num2;
    }

    static boolean isLegalAge(int age){
        if(age >= 18) return true;
        else return false;
    }

    //// ------ OVERLOADING -- SAME METHOD BUT WITH DIFFERENT PARAMETERS-----
    static int add( int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    // ----same METHOD Name but different return type ------

    static double add(double dec1, double dec2){
        return dec1 + dec2;
    }

}
