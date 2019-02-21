public class Sweel {
    private String sweelBeep;

    public String getSweelBeep(){
        return sweelBeep;
    }

    public void setSweelBeep(String sweelBeep){
        this.sweelBeep = sweelBeep;
    }

    Sweel(String sweelBeep){
        this.sweelBeep = sweelBeep;
    }

    @Override
    public String toString() {
        return "" + sweelBeep + "";
    }
}
