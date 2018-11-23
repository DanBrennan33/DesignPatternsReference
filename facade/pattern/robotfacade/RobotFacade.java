package facade.pattern.robotfacade;

import facade.pattern.robotparts.RobotBody;
import facade.pattern.robotparts.RobotColor;
import facade.pattern.robotparts.RobotMetal;

public class RobotFacade {
    RobotColor rc;
    RobotMetal rm;
    RobotBody rb;

    public RobotFacade() {
        rc = new RobotColor();
        rm = new RobotMetal();
        rb = new RobotBody();
    }

    public void constructRobot(String color, String metal) {
        System.out.println("\nCreation of the Robot starting: ");
        rc.setColor(color);
        rm.setMetal(metal);
        rb.createBody();
        System.out.println("\n Robot Creation completed\n");
    }
}
