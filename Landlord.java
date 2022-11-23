public class Landlord extends User {
    private int[] houses;

    public Landlord(long id, String fullname, int phone_number, String email, String identification, String nationality, int[] houses) {
        super(id, fullname, phone_number, email, identification, nationality);
        this.houses = houses;
    }

    public int[] getHouses() {
        return this.houses;
    }

    public void setHouses(int[] houses) {
         this.houses = houses;
    }

    public String toString() {
        return " " + getId() + " " + getFullName() + " " + getPhoneNumber() + " " + getEmail() + " " + getIdentification() + " " + getNationality() + " " + getHouses().toString();
    }

}