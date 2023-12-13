import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 7;
        int input;
        String decision = null;

        while (true) {
            System.out.println("Введите число");
            input = scanner.nextInt();

            if (input > num) {
                System.out.println("Привет");
            }

            System.out.println("Продолжить ввод? Введите да/нет");
            scanner.nextLine();
            decision = scanner.nextLine();

            if (decision.equals("да")) {
                System.out.println("Введите число");

                input = scanner.nextInt();
                if (input > num) {
                    System.out.println("Привет");
                } else {
                    System.out.println("Число меньше 7");
                    break;
                }
            } else break;
        }

        String name = "Вячеслав";
        String inputName;
        String decision2;
        while (true) {
            System.out.println("Введите имя");
            inputName = scanner.nextLine();
            if (inputName.equals(name)) {
                System.out.println("Привет, Вячеслав");
            } else {
                System.out.println("Нет такого имени");
            }

            System.out.println("Продолжить ввод? Да/нет");
            decision2 = scanner.nextLine();

            if(decision2.equals("да")){
                System.out.println("Введите имя");
                inputName = scanner.nextLine();
                if (inputName.equals(name)) {
                    System.out.println("Привет, Вячеслав");
                } else {
                    System.out.println("Нет такого имени");
                }
            } else break;


        }
        int[] mas = {1, 27, 1, 18, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                System.out.println(mas[i]);
            }
        }
    }
    //Ответ на 4 задание: Скобочная последовательность правильная
}