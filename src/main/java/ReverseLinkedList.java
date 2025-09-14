import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original LinkedList: " + list);

        // Reverse manually
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }

        System.out.println("Reversed LinkedList: " + list);
    }
}
