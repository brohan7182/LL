import java.util.*;
public class Operations {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("is");
        list.add("a");
        list.addFirst("This");
        list.add("Linked");
        list.add("List");
        list.add("Hello");
        list.remove(5);
        for (int i=0;i<list.size();i++){
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
    }
}