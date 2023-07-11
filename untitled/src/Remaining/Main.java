package Remaining;
import ProgramClasses.*;
public class Main {

    public static String findLeastAndMostExpensiveProgram(Program[] programsArr) {
        Program highest = programsArr[0];
        String result = "";
        for(int i=0;i<programsArr.length;i++) {
            if (programsArr[i].getTotalCredits() > highest.getTotalCredits()){
                highest = programsArr[i];
            }
        }
        Program lowest = programsArr[0];
        for(int i=0;i<programsArr.length;i++) {
            if (programsArr[i].getTotalCredits() < highest.getTotalCredits()){
                lowest = programsArr[i];
            }
        }

        if (programsArr == null) {
            result =  "There is none";
        }
        if (highest!=null&&lowest!=null) {
            result = "The highest is "+highest.toString()+"\nThe lowest is "+lowest.toString();
        }
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

        UndergraduateProgram g0 = new UndergraduateProgram("Computer Science","Data Analytics",requiredCourses1, electiveCourses1, totalCredits1, "Concordia", true);




















    }
}