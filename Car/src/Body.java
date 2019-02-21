public class Body {
    private double bodyLength;

    public double getLength() {
        return bodyLength;
    }

    public void setLength(double bodyLength){
        this.bodyLength = bodyLength;
    }

    public Body(double bodyLength){
        this.bodyLength = bodyLength;
    }

    @Override
    public String toString() {
        return ""+ bodyLength + "";
    }
}
