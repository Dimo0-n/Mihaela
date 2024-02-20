public class Angajator extends Lucrator{
    public int lucratori;
    public String numeCompanie;

    public int getLucratori() {
        return lucratori;
    }

    public void setLucratori(int lucratori) {
        this.lucratori = lucratori;
    }

    public String getNumeCompanie() {
        return numeCompanie;
    }

    public void setNumeCompanie(String numeCompanie) {
        this.numeCompanie = numeCompanie;
    }

    public Angajator(String nume, String prenume, String idnp, String departament, int salariu, int lucratori, String numeCompanie) {
        super(nume, prenume, idnp, departament, salariu);
        this.lucratori = lucratori;
        this.numeCompanie = numeCompanie;
    }

    public Angajator(int lucratori, String numeCompanie) {
        this.lucratori = lucratori;
        this.numeCompanie = numeCompanie;
    }

    public String informatiiAngajator() {
        return "Angajator{" +
                "nume" + getNume() +
                "prenume" + getPrenume() +
                "departament" + getDepartament() +
                "lucratori=" + lucratori +
                ", numeCompanie='" + numeCompanie + '\'' +
                "} ";
    }

    public String informatiiCompanie(){
        return "lucratori=" + lucratori +
                ", numeCompanie='" + numeCompanie + '\'' +
                "} ";
    }

    public String mesajDeAngajare(){
        return "Suntem gata sa va angajam exact acum";
    }

}
