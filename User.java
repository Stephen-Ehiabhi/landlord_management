public class User {
    private long id;
    private String fullname;
    private int phone_number;
    private String email;
    private String identification;
    private String nationality;

    public User(long id, String fullname, int phone_number, String email, String identification, String nationality) {
        this.id = id;
        this.fullname = fullname;
        this.phone_number = phone_number;
        this.email = email;
        this.identification = identification;
        this.nationality = nationality;
    }

    // Getters
    public long getId() {
        return this.id;
    }

    // Setter
    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullname;
    }

    public void setFullName(String fullname) {
        this.fullname = fullname;
    }

    public int getPhoneNumber() {
        return this.phone_number;
    }

    public void setPhoneNumber(int phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return this.identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}