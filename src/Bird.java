public class Bird extends Animal{
    private boolean flightless;

    public Bird(double WEIGHT,boolean FLIGHTLESS) {
        super(WEIGHT);
        flightless = FLIGHTLESS;
    }
    public boolean getFlightless(){
        return flightless;
    }
    public void setFlightless(boolean FLIGHTLESS){
        flightless = FLIGHTLESS;
    }

}
