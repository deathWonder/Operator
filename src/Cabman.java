public class Cabman extends Person implements IDriver {
    private final Profession profession;

    public Cabman(String name) {
        super(name);
        profession = Profession.CABMAN;
    }

    public Profession getProfession() {
        return profession;
    }

    @Override
    public void driveCar() {
        System.out.println("Я отвезу вас куда захотите. Я " + profession + ".");
    }

    @Override
    public void act() {
        System.out.println("Я " + profession + ".");
        System.out.println("Я отвожу людей.");
    }
}
