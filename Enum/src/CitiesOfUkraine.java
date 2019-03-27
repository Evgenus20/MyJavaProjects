public class CitiesOfUkraine {
 /*   public void noName(CityNames getCityNames){
        CityNames[] cityNames = CityNames.values();
        for(CityNames i : cityNames){
            if (getCityNames != cityNames[i]) {
                System.out.println("");
            }
        }
    }*/


    CitiesOfUkraine(CityNames cityNames){
        switch(cityNames){
            case KIEV:
            System.out.println("Kiev is the Capital of Ukraine");
            break;
            case LVOV:
            System.out.println("Lvov is City in west Ukraine");
            break;
            case KHARKOV:
            System.out.println("Kharkov is city in East Ukraine");
            break;
            case KIROVOGRAD:
            System.out.println("Kirovograd is Kropivnitsky for now");
            break;
            case ODESSA:
            System.out.println("ODESSA is pearl by the sea");
            break;

        }

    }


}
