package question7;

import java.util.ArrayList;

public class PersonExec {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<Person>();
        list.add( new Person("Andrew", 125.5, 55.1));
        list.add( new Person("Boyd", 150.0, 67));
        list.add( new Person("Cathy", 135, 72.3));
        list.add( new Person("Donna", 190, 64));

        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if (i == 2) {
                System.out.println("BMI category for " + p.getName() +
                        " with a weight of " + p.getWeight() + " pounds, " +
                        " and a height of " + p.getHeight() + " inches, is " +
                        p.getCategory()
                );
            } else {
                System.out.println("BMI category for " + p.getName() +
                        " with a weight of " + p.getWeight() + " pounds, " +
                        " and a height of " + p.getHeight() + " inches, is " +
                        p.getCategory(p.getBMI())
                );
            }
        }
    }
}
