import java.util.Scanner;
public class Main {
    public static void main(String[] arg) {


        System.out.println("Отгадаешь загадку "+ "да/нет");




        String scan;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Отгадай загадку.Зимой и летом одним цветом.");
            scan = scanner.nextLine();
            if (scan.equals("елка")) { System.out.println("правильный ответ.");
                break;
            } else {
                System.out.println("Неправильный ответ.");


            }
        }
    }
}
