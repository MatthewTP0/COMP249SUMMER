package ProgramClasses;
import Remaining.*;
public class GraduateProgram extends Program{
    private String coordinator;
    private static int creditCost;

    public GraduateProgram() {
        super();
    }
    public GraduateProgram(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution, String coordinator) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.coordinator = coordinator;
    }
    public GraduateProgram(GraduateProgram graduateProgramCopy) {
        super(graduateProgramCopy);//will call superclass constructor for the copy of the subclass
        this.coordinator=graduateProgramCopy.coordinator;
    }

    public static int getCreditCost() {
        return creditCost;
    }

    public static void setCreditCost( int creditCostIn){
        creditCost = creditCostIn;
    }
    public String toString() {
        return super.toString().substring(0 , super.toString().length()-1) + ", coordinator=" + coordinator + "]" ;
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }	

        if (!(obj instanceof GraduateProgram)) {
            return false;
        }

        GraduateProgram program = (GraduateProgram) obj;
        return coordinator == program.coordinator;
    }
}
