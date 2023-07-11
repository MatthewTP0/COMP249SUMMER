package ProgramClasses;
import Remaining.*;
public class Program {
    private String name;
    private String specialization;
    private Course[] requiredCourses;
    private Course[] electiveCourses;
    private int totalCredits;
    private String institution;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Course[] getRequiredCourses() {
        return requiredCourses;
    }

    public void setRequiredCourses(Course[] requiredCourses) {
        this.requiredCourses = requiredCourses;
    }

    public Course[] getElectiveCourses() {
        return electiveCourses;
    }

    public void setElectiveCourses(Course[] electiveCourses) {
        this.electiveCourses = electiveCourses;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }


    public Program() {}

    public Program(String name, String specialization, Course[] requiredCourses, Course[] electiveCourses, int totalCredits, String institution) {
        this.name = name;
        this.specialization = specialization;
        this.requiredCourses = requiredCourses;
        this.electiveCourses = electiveCourses;
        this.totalCredits = totalCredits;
        this.institution = institution;
    }

    public Program (Program programCopy) {
        this.name = programCopy.name;
        this.specialization = programCopy.specialization;
        this.requiredCourses = programCopy.requiredCourses;
        this.electiveCourses = programCopy.electiveCourses;
        this.totalCredits = programCopy.totalCredits;
        this.institution = programCopy.institution;
    }
    @Override
    public String toString() {
        return "Program [name=" + name + ", specialization=" + specialization + ", requiredCourses="
                + ", totalCredits=" + totalCredits + ", institution=" + institution + "]";
    }



}
