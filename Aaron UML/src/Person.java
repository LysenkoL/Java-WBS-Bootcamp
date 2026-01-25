public class Person {
    public void etwasTrinken (GetraenkeAutomat automat){
        Getrank drink = automat.entnehmeGetraenk();
        if(drink==null){
            System.out.println("Es gibt keine Getränke mehr!");
            return;
        }
        if(drink instanceof Warmgetraenk){
            Warmgetraenk warm = (Warmgetraenk) drink;
            if(warm.getTemperatur() == TrinkTemperatur.ZU_HEISS){
                System.out.println("Pusten");
            }
        }
    }
}
