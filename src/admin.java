

public class admin {

    // prywatne imie, nazwisko, pesel
    private  String imie;
    private String nazwisko;
    private Integer pesel;
    private  String email;


    public admin(String imie, String nazwisko, Integer pesel, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setPesel(Integer pesel) {
        this.pesel = pesel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public Integer getPesel() {
        return pesel;
    }


    @Override
    public String toString() {
        return "admin{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel=" + pesel +
                ", email='" + email + '\'' +
                '}';
    }
}