package Remaining;

public class Main {


    public static void main(String[] args) {
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



















    }
}