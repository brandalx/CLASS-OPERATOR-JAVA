public class EgedMain {
    public static void main(String[] args) {


        Buses b1 = new Buses("12345", 60);
        Buses b2 = new Buses("54682", 60);
        Buses b3 = new Buses();
        Buses b4 = new Buses(b3);
        Eged e = new Eged();
//        System.out.println(e.addBus(b1));
//        b1.setNumOfSeats(100);
//        System.out.println(e.getBar()[0].getNumOfSeats());
//        System.out.println(b1.getNumOfSeats());
         e.addBus(b1);
        e.addBus(b2);
        e.addBus(b3);
        b1.setIsAvailable(false);
        b1.setIsAvailable(false);
//        e.addBus(b4);

        System.out.println(e.isMoreAvailable());
//        e.getBar()[0].setIsAvailable(false);

    }
}

