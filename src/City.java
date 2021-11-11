import java.util.Objects;

public class City implements Comparable<City> {
    private String name;
    private int value;
    private int initialValue;

    public City(String name, int value) {
        this.name = name;
        this.value = value;
        initialValue = value;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public int getInitialValue() {
        return initialValue;
    }
    @Override
    public String toString() {
        return name + " (" + value + ")";
    }

    public void reset() {
        value = initialValue; //assign initialValue to value to reset the value of value.
    }

    public void changeValue(int amount) {
        value += amount; //add amount to value.
    }

    public int compareTo(City other) {
            return name.compareTo(other.name); //Sorts the cities in alphabetical order.
    }

    public int hashCode() {
        int hc = 0;
        for(int i = 0; i < name.length(); i++) {
            hc = 31 * hc + name.charAt(i);
        }
        return hc;
    }

    public boolean equals(Object otherObject) {
        if(this == otherObject) {
            return true;
        }
        if(otherObject == null) {
            return false;
        }
        if(getClass() != otherObject.getClass()) {
            return false;
        }
        City other = (City) otherObject;
        if(name.equals(other.name)) {
            return true;
        }
        return false;
    }
}