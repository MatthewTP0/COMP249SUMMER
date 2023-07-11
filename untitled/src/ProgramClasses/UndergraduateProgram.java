package ProgramClasses;
import Remaining.*;

public class UndergraduateProgram extends Program{
    private boolean accredited;
    private static int creditCost;

    public UndergraduateProgram() {
        super();
    }

    public UndergraduateProgram(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution, boolean accredited) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.accredited = accredited;
    }
    public UndergraduateProgram(UndergraduateProgram undergraduateProgram) {
        super(undergraduateProgram);
        this.accredited = undergraduateProgram.accredited;
    }
}
