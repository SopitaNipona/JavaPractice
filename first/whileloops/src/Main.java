public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }while(name.isBlank());

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}