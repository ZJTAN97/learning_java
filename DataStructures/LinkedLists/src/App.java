public class App {
    public static void main(String[] args) throws Exception {
        LinkedList list = new LinkedList();

        list.insertAtHead(5);
        list.insertAtHead(10);
        list.insertAtHead(12);
        list.insertAtHead(19);

        list.deleteFromHead();

        System.out.println(list);
        System.out.println(list.length());

        System.out.println(list.find(5));

    }
}
