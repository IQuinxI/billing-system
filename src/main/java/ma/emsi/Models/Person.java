package ma.emsi.Models;

public class Person {
    private String idPerson = "";
    private String email = "";
    private String password = "";
    private int numeroTel = 0;

    public Person(String email, String password, int numeroTel) {
        setEmail(email);
        setPassword(password);
        setNumeroTel(numeroTel);
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(int numeroTel) {
        this.numeroTel = numeroTel;
    }
}
