public class Road implements Comparable<Road>{
    private City from;
    private City to;
    private int length;

    public Road(City from, City to, int length) {
        this.from = from;
        this.to = to;
        this.length = length;
    }

    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public int getLength() {
        return length;
    }
    @Override
    public String toString() {
        return from.toString() + " -> " + to.toString() + " : " + length;
    }
    @Override
    public int compareTo(Road other) {
        if(!from.equals(other.getFrom())) {
            return from.compareTo(other.getFrom());
        } else if
            (!to.equals(other.getTo())) {
                return to.compareTo(other.getTo());
            }
        return length - other.getLength();
    }
    @Override
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
        Road other = (Road) otherObject;
        if(to.equals(other.to) && from.equals(other.from) && length == other.length) {
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return 17 * from.hashCode() + to.hashCode() + length;
    }
}
