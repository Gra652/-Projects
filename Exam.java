/**
 A class for an Exam that extends Assessment.
 */
public class Exam extends Assessment {
    private int questions;
    private int missed;
    private double pointsEach;

    /**
     Constructor
     @param questions The number of questions on the exam.
     @param missed The number of questions the student missed.
     */
    public Exam(int questions, int missed) {
        this.questions = questions;
        this.missed = missed;
        this.pointsEach = 100.0 / questions;
        int numericScore = (int)Math.round(100.0 - (missed * pointsEach));
        setScore(numericScore);
    }

    /**
     getPointsEach method
     @return The points each question is worth.
     */
    public double getPointsEach() {
        return pointsEach;
    }
}
