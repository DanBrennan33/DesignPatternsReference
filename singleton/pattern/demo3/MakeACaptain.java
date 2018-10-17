package singleton.pattern.demo3;

public class MakeACaptain {
    private static MakeACaptain _captain;

    // We make the constructor private to prevent the use of "new"
    private MakeACaptain() {}

    private static class SingletonHelper {
        //Nested class is referenced after getCaptain() is called
        private static final MakeACaptain _captain = new MakeACaptain();
    }
    public static MakeACaptain getCaptain() {
        return SingletonHelper._captain;
    }
}
