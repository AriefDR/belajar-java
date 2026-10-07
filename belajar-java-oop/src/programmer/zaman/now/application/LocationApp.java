package programmer.zaman.now.application;

import programmer.zaman.now.data.City;
import programmer.zaman.now.data.Location;

public class LocationApp {
    static void main(String[] args) {

        // var location = new Location(); Error
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
