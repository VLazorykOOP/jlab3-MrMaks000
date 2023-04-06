class Trial {
    private int score;
    private int maxScore;

    private boolean validity;

    public Trial(int maxScore) {
        this.maxScore = maxScore;
        validity = false;
    }

    protected int getMaxScore() {
        return maxScore;
    }
    protected int getScore() {
        return score;
    }
    protected boolean getValidity() {
        return validity;
    }
    public void passingTheTest(int score) {
        if (score > this.maxScore) {
            validity = false;
            return;
        }
        validity = true;
        this.score = score;
    }

    public String show() {
        if (validity == false) return "test not started";
        return "The test is written for " + score + " out of " + maxScore;
    }
}


class Test extends Trial {
    private int numberOfTests;
    private int numberOfCorrectAnswers;

    public Test(int maxScore, int numberOfTests) {
        super(maxScore);
        this.numberOfTests = numberOfTests;
    }

    public void passingTheTest(int numberOfCorrectAnswers) {
        this.numberOfCorrectAnswers = numberOfCorrectAnswers;
        super.passingTheTest(numberOfCorrectAnswers * getMaxScore() / numberOfTests);
    }

    public String show() {
        if (getValidity() == false) return "test not started";
        return super.show() + "\n" + numberOfCorrectAnswers + " out of " + numberOfTests + " correct answers ";
    }
}


class Exam extends Test {
    private int passingScore;
    private String evaluation;

    public Exam(int maxScore, int numberOfTests, int passingScore) {
        super(maxScore, numberOfTests);
        this.passingScore = passingScore;
    }
    private void setEvaluation() {
        if (getScore() < passingScore) {
            evaluation = "test failed";
        }
        else {
            evaluation = "test is passed";
        }
    }


    public void passingTheTest(int numberOfCorrectAnswers) {
        super.passingTheTest(numberOfCorrectAnswers);
        setEvaluation();
    }

    public String show() {
        if (getValidity() == false) return "test not started";
        return super.show() + "\n" + evaluation;
    }

}


class FinalExam extends Exam {
    private String stringRating;

    public FinalExam(int maxScore, int numberOfTests) {
        super(maxScore, numberOfTests, maxScore / 2);
    }

    private void setStringRating() {
        if (getScore() > 90 * getMaxScore() / 100)
        {
            stringRating = "A";
        }
        else if (getScore() > 80 * getMaxScore() / 100)
        {
            stringRating = "B";
        }
        else if (getScore() > 70 * getMaxScore() / 100)
        {
            stringRating = "C";
        }
        else if (getScore() > 50 * getMaxScore() / 100)
        {
            stringRating = "D";
        }
        else
        {
            stringRating = "E";
        }
    }

    public void passingTheTest(int numberOfCorrectAnswers) {
        super.passingTheTest(numberOfCorrectAnswers);
        setStringRating();
    }

    public String show() {
        if (getValidity() == false) return "test not started";
        return super.show() + "\n" + "string rating: " + stringRating;
    }

}
