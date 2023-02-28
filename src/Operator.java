import java.util.List;
import java.util.Scanner;

public class Operator {// Single-Responsibility principle создал отдельный класс, чтобы он занимался консультацией

    Scanner scanner = new Scanner(System.in);
    private final List<Person> persons;

    public Operator(List<Person> persons) {
        this.persons = persons;
    }

    public void showMenu() throws InterruptedException {
        int myChoice = persons.size(); //Использую размер списка переданного, как аргумент
        System.out.println("Это меню, которое поможет вам выбрать нужную службу!");
        Thread.sleep(2000);
        System.out.println("Это список людей, которые могут вам помочь:");
        Thread.sleep(2000);
        for (int i = 0; i < persons.size(); i++) {//DRY Использую цикл, чтобы представить каждого человека
            persons.get(i).whatName();//Open-Closed principle Даже если добавим еще профессию, тут все сработает
            persons.get(i).act();
            System.out.println("Обратиться?(Да/Нет)");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("Да")) {
                myChoice = i;
                break;
            }
        }
        
        if (myChoice == persons.size()) { //Использую размер списка, чтобы в будущем можно было расширить возможности
            System.out.println("Значит вам и не нужна помощь!!!");
        } else {
            Profession person = persons.get(myChoice).getProfession();

            switch (person) {
                case POLICEMAN -> {
                    Policeman policeman = (Policeman) persons.get(myChoice);//Dependency inversion principle
                    policeman.help();
                    policeman.savePeople();
                    policeman.driveCar();
                }
                case DOCTOR -> {
                    Doctor doctor = (Doctor) persons.get(myChoice);
                    doctor.savePeople();
                    doctor.driveCar();
                }
                case FIREFIGTER -> {
                    Firefighter firefighter = (Firefighter) persons.get(myChoice);
                    firefighter.help();
                    firefighter.savePeople();
                    firefighter.driveCar();
                }
                case CABMAN -> {
                    Cabman cabman = (Cabman) persons.get(myChoice);
                    cabman.driveCar();
                }
            }
        }
}
}
