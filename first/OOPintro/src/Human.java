public class Human {

    String name;
    int age;
    double weight;
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    //Constructure overload

    Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    void eat(){
        System.out.println("\"ñam ñam\" said: "+name);
    }
}
