public class Position {
    private City from;
    private City to;
    private int distance;
    private int total;


    public Position(City from, City to, int distance) {
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.total = distance;
    }
/**
 * 
 */
    public City getFrom() {
        return from;
    }

    public City getTo() {
        return to;
    }

    public int getDistance() {
        return distance;
    }

    public int getTotal() {
        return total;
    }

    public boolean move() {
        if(distance > 0) {
            distance--;
            return true;
        }
        return false;
    }

    public void turnAround() {
        City temporary = to;
        to = from;
        from = temporary;
        distance = total - distance;
    }

    public boolean hasArrived() {
        if(distance == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return from.toString() + " -> " + to.toString() + " : " + distance + "/" + total;
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
        Position other = (Position) otherObject;
        if(other.getDistance() == distance && other.getFrom().equals(from) && other.getTo().equals(to) && other.getTotal() == total) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return 7 * from.hashCode() + to.hashCode() + distance + total;
    }
}
