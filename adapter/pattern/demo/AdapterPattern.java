package adapter.pattern.demo;

public class AdapterPattern {
    public static void main(String[] args) {
        System.out.println("***ADAPTER PATTERN DEMO***");
        CalculatorAdapter calc = new CalculatorAdapter();
        Triangle t = new Triangle(20,10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is : " + calc.getArea(t));
    }
}
