public class House {
    private int[] tenants;
    private long id;
    private long landlordId;
    private int rentAmount;

    public House(long id, long landlordId, int rentAmount, int[] tenants) {
        this.id = id;
        this.landlordId = landlordId;
        this.tenants = tenants;
        this.rentAmount = rentAmount;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getLandlordId() {
        return this.landlordId;
    }

    public void setLandlordId(long landlordId) {
        this.landlordId = landlordId;
    }

    public int[] getTenants() {
        return this.tenants;
    }

    public void setTenants(int[] tenants) {
        this.tenants = tenants;
    }

    public int getRentAmount() {
        return this.rentAmount;
    }

    public void setRentAmount(int rentAmount) {
        this.rentAmount = rentAmount;
    }

    public String toString() {
        return " " + getId() + " " + getLandlordId() + " " + getRentAmount() + " " + getTenants().toString();
    }
}
