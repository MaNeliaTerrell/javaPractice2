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

public static void main(String[] args){

    String x = "David";  //from the print method
    print("Hello " + x);   //from the print method

    add(5, 6); //arguments inside the () ==== from the add method

    greet("Nelia", 25);  //from the greet method
}

    static void add(int num1, int num2){

        System.out.println(num1 + num2);
    }
    static void print(String word) {
        System.out.println(word);
    }

    static void greet(String name, int age){

        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }
}
