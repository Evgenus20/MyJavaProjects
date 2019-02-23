import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputCityName = scanner.nextLine();
        CitiesOfUkraine citiesOfUkraine = new CitiesOfUkraine(CityNames.valueOf(inputCityName));
    }
}
