public enum Profession {
    POLICEMAN("полицейский"), DOCTOR("доктор"), FIREFIGTER("пожарник"), CABMAN("таксист");

    private final String profession;

    Profession(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public String toString() {
        return profession;
    }
}
