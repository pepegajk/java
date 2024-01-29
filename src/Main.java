import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("Добро пожаловать!");

        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите ваше имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите ваше отчество: ");
        String middleName = scanner.nextLine();

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();


        if (age < 18) {
            System.out.println("Вы несовершеннолетний!");
        }

        else {
            System.out.println("Меню:");
            System.out.println("1. Нахождение P");
            System.out.println("2. Нахождение S");
            System.out.println("3. Нахождение R");
            System.out.println("0. Выход");

            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double perimeter = calculateP();
                    System.out.println("Периметр: " + perimeter);
                    break;
                case 2:
                    double area = calculateS();
                    System.out.println("Площадь: " + area);
                    break;
                case 3:
                    double radius = calculateR();
                    System.out.println("Радиус: " + radius);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Выход");
                    break;
                default:
                    System.out.println("Неправильный выбор. Повторите попытку.");
                    break;
            }
        }
    }

    public static double calculateP() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        return 2 * Math.PI * radius;
    }

    public static double calculateS() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();
        return Math.PI * Math.pow(radius, 2);
    }

    public static double calculateR() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите периметр круга: ");
        double perimeter = scanner.nextDouble();
        return perimeter / (2 * Math.PI);
    }
}