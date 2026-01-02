//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(36);
        list.insertFirst(62);
        list.insertFirst(32);
        list.insertLast(99);
        list.insert(100,3);

        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.delete(2));
        list.display();
    }
}