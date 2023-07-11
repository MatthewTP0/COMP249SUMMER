package Remaining;
import ProgramClasses.*;
public class Main {

    public static int getCreditCost(Program program) {
        if (program instanceof GraduateProgram) {
            return GraduateProgram.getCreditCost();
        } else if (program instanceof UndergraduateProgram) {
            return UndergraduateProgram.getCreditCost();
        } else {
            // Default value if the program type is unknown
            return 0;
        }
    }
    public static String findLeastAndMostExpensiveProgram(Program[] programsArr) {
        if (programsArr == null || programsArr.length == 0) {
            return "There are no programs.";
        }

        Program highest = programsArr[0];
        Program lowest = programsArr[0];

        for (int i = 1; i < programsArr.length; i++) {
            int highestTotalCost = highest.getTotalCredits() * getCreditCost(programsArr[i]);
            int currentTotalCost = programsArr[i].getTotalCredits() * getCreditCost(programsArr[i]);

            if (currentTotalCost > highestTotalCost) {
                highest = programsArr[i];
            } else if (currentTotalCost < highestTotalCost) {
                lowest = programsArr[i];
            }
        }

        String result = "The highest is " + highest.toString() + "\nThe lowest is " + lowest.toString();
        return result;
    }

    public static void main(String[] args) {

        Course c0 = new Course("Comp",4);
        Course c1 = new Course("Calculus",4);
        Course c2 = new Course("Programming",4);
        Course c3 = new Course("History", 3);
        Course c4 = new Course("Cooking",2);
        Course c5 = new Course("Swimming",2);
        Course c6 = new Course("Weightlifting",2);
        Course c7 = new Course("Economics",4);
        Course c8 = new Course("Software",5);
        Course c9 = new Course("Material Science", 5);
        Course c10 = new Course("Biology",5 );
        Course c11 = new Course("Psychology",3);
        Course c12 = new Course("Fishing", 2);
        Course c13 = new Course("Physics",5);
        Course c14 = new Course("Chemistry",5);
        Course c15 = new Course("Physical Science", 4);

        Course[] requiredCourses1 = new Course[2];
        requiredCourses1[0] = c1;
        requiredCourses1[1]= c2;

        Course[] electiveCourses1 = new Course[2];
        electiveCourses1[0] = c3;
        electiveCourses1[1] = c4;

        int totalCredits1 = 0;
        for(Course courseElement:requiredCourses1 ){
            totalCredits1 += courseElement.getCredits();
        }
        for(Course courseElement:electiveCourses1 ){
            totalCredits1 += courseElement.getCredits();
        }
        //UndergraduateProgram default1 = new UndergraduateProgram();
        UndergraduateProgram.setCreditCost(5);

        int totalCost1 = (UndergraduateProgram.getCreditCost())*totalCredits1;
        UndergraduateProgram p0 = new UndergraduateProgram("Computer Science","Data Analytics",requiredCourses1, electiveCourses1, totalCredits1, "Concordia", true);

        GraduateProgram p1 = new GraduateProgram("Computer Science","Data Analytics",requiredCourses1, electiveCourses1, totalCredits1, "Concordia", "John");
        Program[] programsArr = new Program[2];
        programsArr[0] = p0;
        programsArr[1] = p1;

        System.out.println(findLeastAndMostExpensiveProgram(programsArr));


















    }
}