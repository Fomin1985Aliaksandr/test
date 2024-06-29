public class Main {

        public static void main (String[] arg) {

                 meters electro = new meters();
                 meters gas = new meters();
                 meters water = new meters();
                 meters sum   =  new meters();

                gas.name = "gas";
                gas.readings = 10;
                gas.tariff = 2;
                gas.calc= gas.readings* gas.tariff;
                gas.AmountGas = gas.calc;

                 water.name = " water";
                 water.readings = 13;
                 water.tariff = 51556;
                 water.calc = water.readings* water.tariff;
                 water.AmountWater = water.calc;

                electro.name = "electro";
                electro.readings= 2;
                electro.tariff= 3;
                electro.calc= electro.readings* electro.tariff;
                electro.AmountElectro = electro.calc;

                 gas.calculation(gas.readings, gas.tariff) ;
                 water.calculation(water.readings, water.tariff);
                 sum.totalAmount(gas.calc, water.calc,electro.calc);

                 System.out.println("Summa k oplate za gaz v tekuchem mesatse = "+ gas.calc + "$");
                 System.out.println("Summa k oplate za vodu v tekuchem mesatse = " + water.calc + "$");
                 System.out.println("Summa k oplate za electro v tekuchem mesatse = " + electro.calc + "$");
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