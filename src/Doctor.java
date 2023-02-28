public class Doctor extends Person implements ISavePeople, IDriver {

    private final Profession profession;

    public Doctor(String name) {
        super(name);
        profession = Profession.DOCTOR;
    }

    public Profession getProfession() {
        return profession;
    }

    @Override
    public void savePeople() {
        System.out.println("Я спасу вам жизнь, я " + profession + ".");
    }

    @Override
    public void driveCar() {
        System.out.println("Я еду к вам, я " + profession + ".");
    }

    @Override
    public void act() {
        System.out.println("Я " + profession + ".");
        System.out.println("Я лечу людей.");
    }
}
