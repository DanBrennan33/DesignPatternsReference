package adapter.pattern.demo2;

public class ClassAndObjectAdapter {
    public static void main(String[] args) {
        System.out.println("***CLASS AND OBJECT ADAPTER DEMO***");
        ClassAdapter ca1 = new ClassAdapter();
        System.out.println("Class Adapter is returning: " + ca1.getInteger());

        ClassAdapter ca2 = new ClassAdapter();
        ObjectAdapter oa = new ObjectAdapter(new IntegerValue());
        System.out.println("Object Adapter is returning: " + oa.getInteger());
    }
}
