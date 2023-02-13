public class Buses {


    private String licensePlate;
    private int numOfSeats;
    private boolean isAvailable;

    public Buses() {
        this("0000000",50);
    }
    public Buses(String licensePlate, int numOfSeats) {
        this.licensePlate = licensePlate;
        this.numOfSeats = numOfSeats;
        this.isAvailable=true;
    }
    public Buses(Buses other){
        this.licensePlate=other.licensePlate;
        this.numOfSeats=other.numOfSeats;
        this.isAvailable=other.isAvailable;
    }
    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean available) {
        isAvailable = available;
    }
    }

