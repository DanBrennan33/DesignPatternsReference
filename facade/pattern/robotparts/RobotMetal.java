package facade.pattern.robotparts;

public class RobotMetal {
    private String metal;

    public void setMetal(String metal) {
        this.metal = metal;
        System.out.println("metal is set to " + this.metal);
    }
}
