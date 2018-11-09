package templatemethod.pattern;

public abstract class BasicEngineering {
    // Papers() in the template method
    public void Papers() {
        // Common Papers:
        Math();
        SoftSkills();
        // Specialized Paper;
        SpecialPaper();
    }

    private void Math() {
        System.out.println("Mathematics");
    }

    public void SoftSkills() {
        System.out.println("Soft Skills");
    }

    public abstract void SpecialPaper();
}
