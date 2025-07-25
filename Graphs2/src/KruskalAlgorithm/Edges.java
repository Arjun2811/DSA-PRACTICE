package KruskalAlgorithm;

public class Edges implements Comparable<Edges> {

    int source;
    int destination;
    int weight;

    public int compareTo(Edges o)
    {
        return this.weight-o.weight;
    }
}
