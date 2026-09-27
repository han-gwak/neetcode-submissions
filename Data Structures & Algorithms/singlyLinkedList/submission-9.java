class Node {
    public int val;
    public Node next;
}

class LinkedList {
    public Node head;
    public Node tail;

    public LinkedList() {

    }

    public int get(int index) {
        Node tmp = head;
        if (tmp == null) {
            return -1;
        }
        for (int i = 0; i < index; i++) {
            if (tmp.next == null) {
                return -1;
            }
            tmp = tmp.next;
        }
        return (tmp != null) ? tmp.val : -1;
    }

    public void insertHead(int val) {
        Node tmp = head;
        head = new Node();
        head.val = val;
        head.next = tmp;
        if (tail == null) {
            tail = head;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node();
        newNode.val = val;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int index) {
        if (head == null) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }

        Node tmp = head, prev = null;
        for (int i = 0; i < index; i++) {
            if (tmp == null) {
                return false;
            }
            prev = tmp;
            tmp = tmp.next;
        }
        if (tmp == null) {
            return false;
        }
        prev.next = tmp.next;
        if (tmp == tail) {
            tail = prev;
        }
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> values = new ArrayList<>();
        Node curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        return values;
    }
}
