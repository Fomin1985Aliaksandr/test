import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {


        System.out.println("��������� ������� "+ "��/���");




        String scan;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("������� �������.����� � ����� ����� ������.");
            scan = scanner.nextLine();
            if (scan.equals("����")) { System.out.println("���������� �����.");
                break;
            } else {
                System.out.println("������������ �����.");


            }
        }
    }
}
