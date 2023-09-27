package Practice;

public class LL {

    private int size;
    private Node head;
    private Node tail;

    public LL(){
        size = 0;
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val){
            this.val = val;
        }

        public Node(int val, Node next){
            this.val = val;
            this.next = next;
        }

    }
    public void display(){
        Node temp = head;
        if(size == 0){
            System.out.println("EMPTY");
            return;
        }
        while(temp!= null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insertRec(int val, int idx){

    }

    public static void main(String[] args) {

    }
}
