package adapter.pattern.demo;

public class CalculatorAdapter {
    Calculator calc;
    Triangle triangle;

    public double getArea(Triangle t) {
        calc = new Calculator();
        triangle = t;
        Rect r = new Rect();
        r.l = triangle.b;
        r.w = 0.5*triangle.h;
        return calc.getArea(r);
    }
}
