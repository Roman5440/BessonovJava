import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 7;
        int input;
        String decision = null;

        while (true) {
            System.out.println("������� �����");
            input = scanner.nextInt();

            if (input > num) {
                System.out.println("������");
            }

            System.out.println("���������� ����? ������� ��/���");
            scanner.nextLine();
            decision = scanner.nextLine();

            if (decision.equals("��")) {
                System.out.println("������� �����");

                input = scanner.nextInt();
                if (input > num) {
                    System.out.println("������");
                } else {
                    System.out.println("����� ������ 7");
                    break;
                }
            } else break;
        }

        String name = "��������";
        String inputName;
        String decision2;
        while (true) {
            System.out.println("������� ���");
            inputName = scanner.nextLine();
            if (inputName.equals(name)) {
                System.out.println("������, ��������");
            } else {
                System.out.println("��� ������ �����");
            }

            System.out.println("���������� ����? ��/���");
            decision2 = scanner.nextLine();

            if(decision2.equals("��")){
                System.out.println("������� ���");
                inputName = scanner.nextLine();
                if (inputName.equals(name)) {
                    System.out.println("������, ��������");
                } else {
                    System.out.println("��� ������ �����");
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
    //����� �� 4 �������: ��������� ������������������ ����������
}