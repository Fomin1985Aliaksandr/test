public class Meters {
    String name;
    int readings;
    int tariff;
    int calc;
    int AmountGas;
    int AmountWater;
    int AmountElectro;
    int skidka;




    public int calculation (int readings,int tariff){return readings*tariff;}
    public int totalAmount (int AmountGas,int AmountWater,int AmountElectro) {return AmountWater+AmountGas+AmountElectro;}
public int discont (int AmountGas,int AmountWater,int AmountElectro,int skidka)
{return AmountWater+AmountGas+AmountElectro- (AmountWater+AmountGas+AmountElectro*skidka/100);}



}