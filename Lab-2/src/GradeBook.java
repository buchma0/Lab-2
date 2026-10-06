public class GradeBook {

    String studentName;
    int assigmentScore;
    int examScore;
    double finalGrade;

    public GradeBook(String name, int aScore, int eScore) {

        studentName = name;
        assigmentScore = aScore;
        examScore = eScore;

    }

    public void calculateResult() {

        finalGrade = (double) assigmentScore * 0.4 + (double) examScore * 0.6;

    }

    public void displaySummary() {

        System.out.println("Name: " + studentName);
        System.out.println("Raw Scores: " + assigmentScore + " | " + examScore);
        System.out.println("Final Weighted Grade: " + finalGrade + "%");

    }

    public static void main(String[] args) {

        GradeBook student1 = new GradeBook("Alex", 80, 90);
        student1.calculateResult();
        student1.displaySummary();

    }
}
