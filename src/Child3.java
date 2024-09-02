public class Child3 extends Parent implements Printable {
    private double property3;

    public Child3(String commonProperty, double property3) {
        super(commonProperty);
        this.property3 = property3;
    }

    @Override
    public void print() {
        System.out.println("Child3 - Common Property: " + getCommonProperty() + ", Property3: " + property3);
    }
}