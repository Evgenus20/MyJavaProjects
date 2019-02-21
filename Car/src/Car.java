public class Car {
    Body body;
    Weel weel;
    Sweel sweel;

    public Car(double bodyLength, double weelPressue, String sweelBeep){
        this.body = new Body(bodyLength);
        this.weel = new Weel(weelPressue);
        this.sweel = new Sweel(sweelBeep);

    }

    @Override
    public String toString(){
        return "The length of the car is " + body + ". The pressue of the weel is " + weel + ". And the car says " + sweel;
    }


}




