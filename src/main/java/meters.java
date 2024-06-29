public class meters {
    String name;
    int readings;
    int tariff;
    int calc;
    int totalAmoutGas;
    int totalAmoutWater;
    int totalAmoutElectro;
    int skidka=2;




    public int calculation (int readings,int tariff){return readings*tariff;}
        public int totalAmount (int totalAmoutGas,int totalAmoutWater,int totalAmoutElectro) {return totalAmoutWater+totalAmoutGas+totalAmoutElectro;}




}




