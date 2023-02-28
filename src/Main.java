import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Person> persons = new ArrayList<>();

        persons.add(new Policeman("Игорь"));
        persons.add(new Doctor("Ольга"));
        persons.add(new Firefighter("Евгений"));
        persons.add(new Cabman("Дмитрий"));

        Operator operator = new Operator(persons);

        int myChoice = operator.showMenu();

        operator.resultOperation(myChoice);
    }
}
