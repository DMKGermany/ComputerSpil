import java.util.*;

public class Country {

    private String name;
    private Map<City, Set<Road>> network;

    public Country(String name) {
        this.name = name;
        network = new TreeMap<>();
    }
    public Set<City> getCities() {
        return dd
    }
    public String getName() {
        return name;
    }

    public City getCity(String name) {
       if (network.containsKey(name)) {
          // Missing return type!
       }
           return null;
    }

    public String toString() {
        return name;
    }

    public Set<Road> getRoads(City c) {

    }
}
