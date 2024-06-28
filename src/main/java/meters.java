
public class meters {

    String name;

    int readings;

    int tariff;

    public static void main (String[] arg) {
        meters gas = new meters();

        gas.name = "gas";
        gas.readings=10;
        gas.tariff = 2;

       System.out.println("Мы сздали счетчик по"+gas.name + " Показания при установке" + gas.readings + "тариф на газ = " + gas.tariff);

    }

}
