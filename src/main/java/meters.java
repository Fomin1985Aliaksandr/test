
public class meters {

    String name;

    int readings;

    int tariff;

    public static void main (String[] arg) {
        meters gas = new meters();

        gas.name = "gas";
        gas.readings=10;
        gas.tariff = 2;

       System.out.println("�� ������ ������� ��"+gas.name + " ��������� ��� ���������" + gas.readings + "����� �� ��� = " + gas.tariff);

    }

}
