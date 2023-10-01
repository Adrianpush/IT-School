package session8_arrays.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiesList {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("London");
        cities.add("Babadag");
        cities.add("Paris");
        cities.add("Shanghai");

        addCityToList(cities);
        System.out.println(cities);
    }

    public static void addCityToList(List<String> cities){
        System.out.println("Please enter a city name.");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        scanner.close();
        boolean userInputFound = false;
        for (String cityName : cities) {
            if (userInput.equals(cityName)){
                System.out.println("City " + userInput + " is already in the list.");
                userInputFound = true;
                break;
            }
        }
        if (!userInputFound) {
            cities.add(userInput);
        }
    }
}
