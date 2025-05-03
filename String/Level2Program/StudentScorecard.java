import java.util.Random;

public class StudentScorecard {
    public static int[][] generateMarks(int studentCount) {
        Random rand = new Random();
        int [][] marks = new int[studentCount][3]; // 3 subjects

        for(int i = 0; i < studentCount; i++) {
            for(int j = 0; j < 3; j++) {
                marks[i][j] = 50 +  rand.nextInt(51);
            }
        }
        return marks;
    }

    public static double[][] calculateStatics(int [][] marks) {
        int studentCount = marks.length;
        double[][] stats = new double[studentCount][3]; // 3 subjects

        for(int i = 0; i < studentCount; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            stats[i][0] = average;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;

        }
        return stats;
    }

    public static String[] assignGrades(double [][] stats) {
        int studentCount = stats.length;
        String[] grades = new String[studentCount];
        for(int i = 0; i < studentCount; i++) {
            double percentage = stats[i][2];
            if(percentage >= 90) {
                grades[i] = "A+";
            } else if(percentage >= 80) {
                grades[i] = "A";
            } else if(percentage >= 70) {
                grades[i] = "B+";
            } else if(percentage >= 60) {
                grades[i] = "B";
            } else if(percentage >= 50) {
                grades[i] = "C+";
            } else if(percentage >= 40) {
                grades[i] = "C";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    public static void displayScorecard(int [][] marks, double [][]stats, String[] grades) {
        System.out.println("Student\tSubject1\tSubject2\tSubject3\tAverage\tPercentage\tGrade");
        for(int i = 0; i < marks.length; i++) {
            System.out.print((i + 1) + "\t");
            for(int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + "\t\t");
            }
            System.out.print(stats[i][1] + "\t" + stats[i][2] + "\t\t" + grades[i]);
            System.out.println();
        }
    }
}
