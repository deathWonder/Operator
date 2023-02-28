public class Policeman extends Person implements IHelper, IDriver, ISavePeople {

    private final Profession profession;

    public Policeman(String name) {
        super(name);
        profession = Profession.POLICEMAN;
    }

    public Profession getProfession() {
        return profession;
    }

    @Override
    public void help() {
        System.out.println("Я вам подскажу, моя профессия: " + profession + ".");
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
        System.out.println("Я защищаю людей.");
    }
}
