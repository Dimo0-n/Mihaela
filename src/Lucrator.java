public class Lucrator {
    private String nume;
    private String prenume;
    private String idnp;
    private String departament;
    private int salariu;

    public Lucrator(String nume, String prenume, String idnp, String departament, int salariu) {
        this.nume = nume;
        this.prenume = prenume;
        this.idnp = idnp;
        this.departament = departament;
        this.salariu = salariu;
    }

    public Lucrator() {
    }

    public Lucrator(String departament, int salariu) {
        this.departament = departament;
        this.salariu = salariu;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    public int getSalariu() {
        return salariu;
    }

    public void setSalariu(int salariu) {
        this.salariu = salariu;
    }

    public String detaliiLucrator() {
        return "Lucrator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", departament='" + departament + '\'' +
                ", salariu=" + salariu +
                '}';
    }

    public String informatiiPersonaleLucrator() {
        return "Lucrator{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", idnp='" + idnp + '\'' +
                '}';
    }

}
