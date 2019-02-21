public class Weel {
    private double weelPressue;

    public double getWeelPressue() {
        return weelPressue;
    }

    public void setWeelPressue(double weelPressue) {
        this.weelPressue = weelPressue;
    }

    public Weel(double weelPressue){
        this.weelPressue = weelPressue;
    }

    @Override
    public String toString() {
        return "" + weelPressue + "";
    }
}
