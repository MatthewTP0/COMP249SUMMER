package ProgramClasses;

public class SpecialProgram extends Program{
    private int duration;
    private static int creditCost;

    public SpecialProgram() {
        super();
    }
    public SpecialProgram(String name, String specialization, String[] requiredCourses, String[] electiveCourses, int totalCredits, String institution, int duration) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.duration = duration;
    }
    public SpecialProgram(SpecialProgram specialProgram) {
        super(specialProgram);
        this.duration = specialProgram.duration;
    }
}
