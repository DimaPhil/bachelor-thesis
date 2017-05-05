package cocktailParty;

class Pair implements Comparable<Pair> {
    private static final double EPS = 1e-9;

    private int id;
    private double value;
    
    Pair(int id, double value) {
        this.id = id;
        this.value = value;
    }

    int getId() {
        return id;
    }

    public double getValue() {
        return value;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair p = (Pair)o;
        return p.id == this.id && Math.abs(p.value - this.value) < EPS;
    }

    @Override
    public int compareTo(Pair p) {
        if (value != p.value) {
            return value < p.value ? -1 : 1;
        }
        return id - p.id;
    }
    
    @Override
    public int hashCode()
    {
        return new Integer(id).hashCode();
    }
}
