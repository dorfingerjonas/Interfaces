public class Pupil {

    private String name;
    private int katalogNr;

    public Pupil (String name, int katalogNr) {
        this.name = name;
        this.katalogNr = katalogNr;
    }

    // region Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKatalogNr() {
        return katalogNr;
    }

    public void setKatalogNr(int katalogNr) {
        this.katalogNr = katalogNr;
    }


    // endregion


    @Override
    public String toString() {
        return "Name: " + getName() + "\nKatalognummer: " + getKatalogNr() + "\n";
    }

    public int compareTo (Pupil p) {
        if (this.getKatalogNr() < p.getKatalogNr()) {
            return -1;

        } else if (this.getKatalogNr() == p.getKatalogNr()) {
            return 0;

        } else {
            return 1;
        }
    }
}