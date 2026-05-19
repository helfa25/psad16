public class DLLPesanan {
    NodePesanan head, tail;
    
    public void add(Pesanan data) {
        NodePesanan newNode = new NodePesanan(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    public void sortByName() {
        if (head == null || head.next == null) return;
        boolean swapped;
        do {
            swapped = false;
            NodePesanan curr = head;
            while (curr.next != null) {
                if (curr.data.namaPesanan.compareToIgnoreCase(curr.next.data.namaPesanan) > 0) {
                    Pesanan temp = curr.data;
                    curr.data = curr.next.data;
                    curr.next.data = temp;
                    swapped = true;
                }
                curr = curr.next;
            }
        } while (swapped);
    }
    
    public void print() {
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        NodePesanan curr = head;
        while (curr != null) {
            System.out.printf("%-15d %-20s %-15d\n", curr.data.kodePesanan, curr.data.namaPesanan, curr.data.harga);
            curr = curr.next;
        }
    }
}