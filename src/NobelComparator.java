import java.util.Comparator;

public class NobelComparator implements Comparator<Person> {

    protected int surnameWords;

    public NobelComparator(int surnameWords) {
        this.surnameWords = surnameWords;
    }

    @Override
    public int compare(Person o1, Person o2) {
        int surname1 = o1.getSurname().split("(?U)\\W").length;
        int surname2 = o2.getSurname().split("(?U)\\W").length;

        if (surname1 < surnameWords && surname2 < surnameWords) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }

        if (surname1 > surname2) {
            return 1;
        } else if (surname1 < surname2) {
            return -1;
        } else {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
    }
}