package question7;

/**
 *
 */
public class Person {
    private double bmi;
    private double height;
    private double weight;
    private String category;
    private String name;

    /**
     *
     * @return
     */
    public double getBMI() {
        return bmi;
    }

    /**
     *
     * @return
     */
    public double getHeight() {
        return height;
    }

    /**
     *
     * @return
     */
    public double getWeight() {
        return weight;
    }

    /**
     *
     * @param name
     * @param weight
     * @param height
     */
    public Person(String name, double weight, double height) {
        setName(name);
        setHeight(height);
        setWeight(weight);
        double kg = getWeight() / 2.205;
        double m = Math.pow((getHeight() / 39.37), 2);
        setBMI(kg/m);
    }

    /**
     *
     * @param bmi
     * @return
     */
    public String getCategory(double bmi) {
        if (getBMI() >= 30) {
            category = "obese";
        } else if (getBMI() >= 25) {
            category = "overweight";
        } else if (getBMI() >= 18.5) {
            category = "normal weight";
        } else {
            category = "underweight";
        }
        return category;
    }

    /**
     *
     * @return
     */
    public String getCategory() {
        if (category == null)
            return "category has not been set.";
        else
            return category;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param bmi
     */
    public void setBMI(double bmi) {
        this.bmi = bmi;
    }

    /**
     *
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
