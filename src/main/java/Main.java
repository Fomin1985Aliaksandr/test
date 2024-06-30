public class Main {

    public static void main (String[] arg) {

        Meters electro = new Meters();
        Meters gas = new Meters();
        Meters water = new Meters();
        Meters sum   =  new Meters();

        gas.name = "gas";
        gas.readings = 10;
        gas.tariff = 2;
        gas.calc= gas.readings* gas.tariff;
        gas.AmountGas = gas.calc;

        water.name = " water";
        water.readings = 13;
        water.tariff = 5;
        water.calc = water.readings* water.tariff;
        water.AmountWater = water.calc;

        electro.name = "electro";
        electro.readings= 2;
        electro.tariff= 3;
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

        int calcDiscont = sum.totalAmount(gas.calc, water.calc,electro.calc);
        if (calcDiscont<500) {}else {System.out.println("Oplata so skidrkoy  " + calcDiscont/ sum.skidka+"$"+".Razmer skidki=50%" );}



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