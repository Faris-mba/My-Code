public class Question {
    String text;
    String answer;
    int id;
    protected static int Qu = 1;

    public Question(String text, String answer) {

        this.text = text;
        this.answer = answer;
        this.id = Question.Qu++;
    }

    public Question() {
        this.text = "";
        this.answer = "";
        this.id = Question.Qu++;
    }

    public void setText(String textQuestion) {

        this.text = textQuestion;
    }

    public void setAnswer(String correctAnswer) {

        this.answer = correctAnswer;

    }

    public boolean checkAnswer(String response) {

        if (this.answer.equals(response) || this.answer == response) {
            return true;
        } else {
            return false;
        }
    }

    public void printQuestion() {

        System.out.println(id + "." + text);
    }

    public static void main(String[] args) {

        FourMultipleChoice fmc = new FourMultipleChoice();
        fmc.setText("when was python language created?");
        fmc.addChoice("1989", false);
        fmc.addChoice("1990", false);
        fmc.addChoice("1991", true);
        fmc.printQuestion();

        TrueFalseQ tfq = new TrueFalseQ();
        tfq.setText("Was Python created by Guido van Rossum?");
        tfq.setAnswer("True");
        tfq.printQuestion();

    }

}