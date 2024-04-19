public class Main {

    // overload methods = methods that share the same name but have
    // different parameters
    // method name + parameters = method signature
    public static void main(String[] args) {
        System.out.println(add(1,2));
    }

    static int add(int a, int b){
        return a + b;
    }

    static int add(int a, int b, int c){
        return a + b + c;
    }

    static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    static double add(double a, double b){
        return a + b;
    }
}