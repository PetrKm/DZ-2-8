import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> nobelList = new LinkedList<>();

        nobelList.add(new Person("George", "Louis Augustus", 67));
        nobelList.add(new Person("William", "Frederick Henry Alexand", 55));
        nobelList.add(new Person("Albert", "Williams", 56));
        nobelList.add(new Person("Christian", "George Andrew Patrick David", 77));
        nobelList.add(new Person("Elizabeth", "Alexandra Mary", 96));

        printList(nobelList); // Не сортарованный список

        Collections.sort(nobelList, new NobelComparator(2));

        printList(nobelList); // Список по возростанию знатности

        Collections.sort(nobelList, new NobelComparator(4));

        printList(nobelList); // Список по возростанию знатности, если в фамилии более 4х слов. если меньше то по возрасту.
    }

    public static void printList(List<Person> nobelList) {
        System.out.println();

        for (int i = 0; i < nobelList.size(); i++) {
            System.out.println((i + 1) + ". " + nobelList.get(i));
        }
    }
}