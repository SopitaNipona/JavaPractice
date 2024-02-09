public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();

        Car myCar2 = new Car();

        System.out.println(myCar.model);
        System.out.println(myCar.make);

        myCar.drive();
        myCar.brake();
        myCar2.brake();

        Human human = new Human("Bob",65,70);
    }
}