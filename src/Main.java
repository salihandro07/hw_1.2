public class Main {
    public static void main(String[] args) {
        Printable[] objects = new Printable[3];
        objects[0] = createObject("Child1");
        objects[1] = createObject("Child2");
        objects[2] = createObject("Child3");

        for (Printable obj : objects) {
            obj.print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {
            case "Child1":
                return new Child1("CommonValue", 123);
            case "Child2":
                return new Child2("CommonValue", "PropertyValue");
            case "Child3":
                return new Child3("CommonValue", 45.67);
            default:
                throw new IllegalArgumentException("Unknown class name: " + className);
        }
    }
}