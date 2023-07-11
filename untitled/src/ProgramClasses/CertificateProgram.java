package ProgramClasses;

public class CertificateProgram extends Program{
    private int capacity;
    private static int creditCost;

    public CertificateProgram() {
        super();
    }

    public CertificateProgram(String name, String specialization, String[] requiredCourses, String[] electiveCourses, int totalCredits, String institution, int capacity) {
        super(name, specialization, requiredCourses, electiveCourses, totalCredits, institution);
        this.capacity = capacity;
    }
    public CertificateProgram(CertificateProgram certificateProgram) {
        super(certificateProgram);
        this.capacity = certificateProgram.capacity;
    }


}
