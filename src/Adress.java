public class Adress {
    private String street;
    private int  houseNumber;
    private String city;

    public Adress(String street, int houseNumber, String city) {
        setStreet(street);
        setHouseNumber(houseNumber);
        setCity(city);
    }

    public Adress(Adress other) {
        setStreet(other.street);
        setHouseNumber(other.houseNumber);
        setCity(other.city);
    }

    @Override
    public String toString() {
        return houseNumber + " " + street + "st. " + city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}