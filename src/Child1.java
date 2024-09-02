public class Child1 extends Parent implements Printable {
    private int property1;

    public Child1(String commonProperty, int property1) {
        super(commonProperty);
        this.property1 = property1;
    }

    @Override
    public void print() {
        System.out.println("Child1 - Common Property: " + getCommonProperty() + ", Property1: " + property1);
    }
}