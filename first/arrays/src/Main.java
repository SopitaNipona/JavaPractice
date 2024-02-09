public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        String[] cars = new String[3];

        cars[0] = "Camaro";
        cars[1] = "Corvette";
        cars[2] = "Tesla";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        String[] secondCars = {"Camaro", "Mustang", "Corvette"};

        secondCars[0] = "Chevy";

        System.out.println(secondCars[1]);

        String[][] thirdCars = {
                {"Camaro", "Mustang", "Corvette"},
                {"Fiesta", "Chevy", "Shelby"},
                {"Supra", "Corolla", "Impresa"}
        };
    }
}