public class Child2 extends Parent implements Printable {
    private String property2;

    public Child2(String commonProperty, String property2) {
        super(commonProperty);
        this.property2 = property2;
    }

    @Override
    public void print() {
        System.out.println("Child2 - Common Property: " + getCommonProperty() + ", Property2: " + property2);
    }
}