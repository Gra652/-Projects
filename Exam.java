/**
 Constructor
 @param questions The number of questions on the exam.
 @param missed The number of questions the student missed.
 */
public Exam(int questions, int missed) {
    try {
        if (questions <= 0) {
            throw new IllegalArgumentException("Number of questions must be greater than zero.");
        }

        if (missed < 0 || missed > questions) {
            throw new IllegalArgumentException("Missed questions must be between 0 and the total number of questions.");
        }

        this.questions = questions;
        this.missed = missed;
        this.pointsEach = 100.0 / questions;
        int numericScore = (int)Math.round(100.0 - (missed * pointsEach));
        setScore(numericScore);

    } catch (IllegalArgumentException e) {
        System.out.println("Error: " + e.getMessage());
        setScore(0); // Default score if input is invalid
    } catch (Exception e) {
        System.out.println("Unexpected error: " + e.getMessage());
        setScore(0);
    }
}
