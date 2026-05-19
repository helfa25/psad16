public class NodeAntrian {
    Pembeli data;
    int noAntrian;
    boolean prioritas;
    NodeAntrian prev, next;
    
    public NodeAntrian(Pembeli data, int noAntrian, boolean prioritas) {
        this.data = data;
        this.noAntrian = noAntrian;
        this.prioritas = prioritas;
    }
}
