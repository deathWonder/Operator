public abstract class Person {//Liskov substitution principle Предок всех профессий

    private final String name;

    protected Person(String name) {
        this.name = name;
    }

    public void whatName() {
        System.out.println("Меня зовут " + name + "!");
    }

    abstract void act();

    abstract Profession getProfession();
}
