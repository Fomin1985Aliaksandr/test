public class meters {
    String name;
    int readings;
    int tariff;
    int calc;
    int AmountGas;
    int AmountWater;
    int AmountElectro;
    int skidka=2;




    public int calculation (int readings,int tariff){return readings*tariff;}
        public int totalAmount (int AmountGas,int AmountWater,int AmountElectro) {return AmountWater+AmountGas+AmountElectro;}




}




