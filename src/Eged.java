public class Eged
{




private int numOfBuses =0;
    private Buses bAr[];

    public Eged() {
        this.numOfBuses = 0;
        this.bAr=new Buses[50];
    }
    public boolean addBus(Buses b) {
        if(numOfBuses>=bAr.length){
            return false;
        }
        bAr[numOfBuses++]=new Buses(b);
        return true;
    }
    public Buses[] getBar(){
        return bAr;
    }

    public boolean isMoreAvailable(){
        int countAvailable = 0;
        for(int i=0;i<numOfBuses;i++){
            if(bAr[i].getIsAvailable()){
                countAvailable++;
            }
        }
        return countAvailable >= numOfBuses/2;
    }
    }

