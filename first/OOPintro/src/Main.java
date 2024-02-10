public class Main {
    public static void main(String[] args) {

        //Classes
        Car myCar = new Car();

        Car myCar2 = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();
        myCar.brake();
        myCar2.brake();

        //Use of constructures

        Human human = new Human("Bob",65,70);

        Human human2 = new Human("Tom",30,80);

        System.out.println(human.age);
        System.out.println(human2.age);
        human2.eat();

        //Constructure overload

        Human human3 = new Human("Ethan", 16);


    }
}