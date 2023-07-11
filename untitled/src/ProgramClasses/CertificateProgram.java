package ProgramClasses;
import Remaining.*;
public class CertificateProgram extends Program{
    private int capacity;
    private static int creditCost;

    public CertificateProgram() {
        super();
    }

    public CertificateProgram(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution, int capacity) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.capacity = capacity;
    }
    public CertificateProgram(CertificateProgram certificateProgram) {
        super(certificateProgram);
        this.capacity = certificateProgram.capacity;
    }

    public static int getCreditCost() {
        return creditCost;
    }

    public static void setCreditCost( int creditCostIn){
        creditCost = creditCostIn;
    }


}
