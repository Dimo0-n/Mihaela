public class Main {
    public static void main(String[] args) {
        // a) Obiectul clase de bază folosind constructorul clasei de bază
        Lucrator lucrator = new Lucrator("Nume1", "Prenume1", "IDNP123456", "Departament1", 3000);

        // c) Obiectul clasei derivate folosind constructorul clasei derivate
        Angajator angajator = new Angajator("Nume2", "Prenume2", "IDNP654321", "Departament2", 4000, 10, "CompaniaX");

        // Apelarea metodelor pentru obiectul Lucrator
        System.out.println(lucrator.detaliiLucrator());
        System.out.println(lucrator.informatiiPersonaleLucrator());

        // Apelarea metodelor pentru obiectul Angajator
        System.out.println(angajator.informatiiAngajator());
        System.out.println(angajator.informatiiCompanie());
        System.out.println(angajator.mesajDeAngajare());
    }
}
