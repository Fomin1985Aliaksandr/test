public class Main {

    public static void main (String[] arg) {

        Meters electro = new Meters();
        Meters gas = new Meters();
        Meters water = new Meters();
        Meters sum   =  new Meters();
        Meters skidka = new Meters();



        gas.name = "gas";
        gas.readings = 100;
        gas.tariff = 2;
        gas.calc= gas.readings* gas.tariff;
        gas.AmountGas = gas.calc;

        water.name = " water";
        water.readings = 100;
        water.tariff = 2;
        water.calc = water.readings* water.tariff;
        water.AmountWater = water.calc;

        electro.name = "electro";
        electro.readings= 100;
        electro.tariff= 2;
        electro.calc= electro.readings* electro.tariff;
        electro.AmountElectro = electro.calc;

        electro.calculation(electro.readings, electro.tariff);
        gas.calculation(gas.readings, gas.tariff) ;
        water.calculation(water.readings, water.tariff);
        sum.totalAmount(gas.calc, water.calc,electro.calc);

        System.out.println("Summa k oplate za gaz v tekuchem mesatse = "+ gas.calculation(gas.readings, gas.tariff) + "$");
        System.out.println("Summa k oplate za vodu v tekuchem mesatse = " + water.calculation(water.readings, water.tariff) + "$");
        System.out.println("Summa k oplate za electro v tekuchem mesatse = " + electro.calculation(electro.readings, electro.tariff) + "$");
        System.out.println("Vsego k oplate bez skidki " + sum.totalAmount(water.calc,+gas.calc, electro.calc)+"$");



        sum.skidka =30;
        int discont =  sum.totalAmount(gas.calc, water.calc,electro.calc);



        int calcDiscont = sum.totalAmount(gas.calc, water.calc,electro.calc);
        if (calcDiscont<500) {}else {System.out.println("Oplata so skidkoy  " +  (discont-(calcDiscont* sum.skidka/100))   +"$"+".Razmer skidki="+ sum.skidka+"%");}



    }
}


////
////    String scan;
////    Scanner scanner = new Scanner(System.in);
////        while (true) {
////                System.out.println("Otgadai zagadky. Zimoi i letom odnim tsvetom ");
////                scan = scanner.nextLine();
////                if (scan.equals("elka")) { System.out.println("Pravelni otvet.");
////                break;
////                } else {
////                System.out.println("Nepravilni otvet.");