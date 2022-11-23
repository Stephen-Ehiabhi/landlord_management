public class Tenant extends User {
    private String rentalPeriod;

    public Tenant(long id, String fullname, int phone_number, String email, String identification, String nationality, String rentalPeriod) {
        super(id, fullname, phone_number, email, identification, nationality);
        this.rentalPeriod = rentalPeriod;
    }

    //Getter
    public String getRentalPeriod() {
        return this.rentalPeriod;
    }

    //Setter
    public String setRentalPeriod(String period) {
        return this.rentalPeriod = period;
    }

    public String toString() {
        return " " + getId() + " " + getFullName() + " " + getPhoneNumber() + " " + getEmail() + " " + getIdentification() + " " + getNationality() + " " + getRentalPeriod();
    }
}