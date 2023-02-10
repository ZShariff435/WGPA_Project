import java.util.*;

public class userValues {
    double qualityPoints = 0;
    double creditTotal = 0;
    ArrayList<String> courseNames = new ArrayList<String>();
  
    public userValues() {
        qualityPoints = 0;
        creditTotal = 0;
    }
   

    static double getQualityPoints(double credits) {
        double grade = getRegGrade();
        return (grade * credits);
    } //ends getQualityPoints function

    static double getHonorsQualityPoints(int credits) {
        double grade = getHonorsGrade();
        return (grade * credits);
    } //ends getHonorsQualityPoints function

    static double getRegGrade() {
        System.out.println("\n What was your overall/final grade in this course? (Enter Capital Letter i.e 'A')");
        Scanner regGradeInput = new Scanner(System.in);
        String regGrade = (String)regGradeInput.nextLine();
        if (regGrade.equals("A")) {
            return 4;
        }
        if (regGrade.equals("B")) {
            return 3;
        }
        if (regGrade.equals("C")) {
            return 2;
        }
        if (regGrade.equals("D")) {
            return 1;
        }
        if (regGrade.equals("F")) {
            return 0;
        }
        else {
            System.out.println("Not valid input, please enter a capital letter (i.e 'A')");
            return getRegGrade();
        } 
    }//ends Reg Grade Function

    static double getHonorsGrade() {
        System.out.println("\n What was your overall/final grade in this course? (Enter Capital Letter i.e 'A')");
        Scanner honorsGradeInput = new Scanner(System.in);
        String honorsGrade = (String)honorsGradeInput.nextLine();
        if (honorsGrade.equals("A")) {
            return 5;
        }
        if (honorsGrade.equals("B")) {
            return 4;
        }
        if (honorsGrade.equals("C")) {
            return 3;
        }
        if (honorsGrade.equals("D")) {
            return 2;
        }
        if (honorsGrade.equals("F")) {
            return 0;
        }
        else {
            System.out.println("Not valid input, please enter a capital letter (i.e 'A')");
            return getHonorsGrade();
        } 
    }//ends Honors Grade Function

  static void calculateWGPA(double qualityPoints, double creditTotal) {
        double weightedGPA = (qualityPoints)/(creditTotal);
        weightedGPA = (Math.round(weightedGPA*100.0)/100.0);
        System.out.println("Your Weighted GPA is: " + weightedGPA);
    } //ends calculateWGPA function
}
