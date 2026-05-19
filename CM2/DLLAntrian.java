public class DLLAntrian {
    private NodeAntrian headPrioritas, tailPrioritas;
    private NodeAntrian headNormal, tailNormal;

    private int jumlahNormal() {
        int count = 0;
        NodeAntrian curr = headNormal;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        return count;
    }

    public void enqueue(Pembeli data, int no, boolean prioritas) {
        NodeAntrian newNode = new NodeAntrian(data, no, prioritas);

        if (prioritas) {
            if (headPrioritas == null) {
                headPrioritas = tailPrioritas = newNode;
            } else {
                tailPrioritas.next = newNode;
                newNode.prev = tailPrioritas;
                tailPrioritas = newNode;
            }
        } else {
            if (headNormal == null) {
                headNormal = tailNormal = newNode;
            } else {
                tailNormal.next = newNode;
                newNode.prev = tailNormal;
                tailNormal = newNode;
            }
        }
    }

    // Aturan: jika user memilih normal, tapi jumlah antrian normal > 5
    // maka otomatis dialihkan menjadi prioritas.
    public void enqueueDenganAturan(Pembeli data, int no, boolean prioritasInput) {
        boolean prioritasFinal = prioritasInput;
        if (!prioritasInput && jumlahNormal() > 5) {
            prioritasFinal = true;
        }
        enqueue(data, no, prioritasFinal);
    }


    public NodeAntrian dequeuePrioritas() {
        if (headPrioritas == null) return null;
        NodeAntrian temp = headPrioritas;

        if (headPrioritas == tailPrioritas) {
            headPrioritas = tailPrioritas = null;
        } else {
            headPrioritas = headPrioritas.next;
            headPrioritas.prev = null;
        }

        temp.next = temp.prev = null;
        return temp;
    }

    public NodeAntrian dequeueNormal() {
        if (headNormal == null) return null;
        NodeAntrian temp = headNormal;

        if (headNormal == tailNormal) {
            headNormal = tailNormal = null;
        } else {
            headNormal = headNormal.next;
            headNormal.prev = null;
        }

        temp.next = temp.prev = null;
        return temp;
    }

    public NodeAntrian dequeue() {
        NodeAntrian p = dequeuePrioritas();
        if (p != null) return p;
        return dequeueNormal();
    }

    public void print() {
        System.out.println("-- Antrian Prioritas --");
        printList(headPrioritas);
        System.out.println("-- Antrian Normal --");
        printList(headNormal);
    }

    private void printList(NodeAntrian head) {
        System.out.printf("%-15s %-15s %-15s\n", "No Antrian", "Nama", "No HP");
        NodeAntrian curr = head;
        while (curr != null) {
            System.out.printf("%-15d %-15s %-15s\n", curr.noAntrian, curr.data.namaPembeli, curr.data.NoHp);
            curr = curr.next;
        }
    }
}

