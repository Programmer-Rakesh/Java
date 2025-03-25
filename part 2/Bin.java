// Running a diff function ousdie the main function

public class Bin {
    
    public static void main(String[] args){
        System.out.println("Before say hii");
        sayHi();
        System.out.println("After say hii");
        sayHii();
    }

    public static void sayHi(){
        System.out.println("Hi This is Rakesh");
    }

    private static void sayHii(){
        System.out.println("Private one");
    }
}
