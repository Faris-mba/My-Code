public class TrueFalseQ extends Question{
    public TrueFalseQ(String text, String answer){

        super(text, answer);
    }
    public TrueFalseQ(){
        
        super();
    }
    public void setAnswer(String correctAnswer){

        if(correctAnswer == "True" || correctAnswer == "False"){
            super.setAnswer(correctAnswer);
        }else
        {
            System.out.println("A vaild answer must be either 'True' or 'False");
        }

        }
    
    public void printQuestion()
    {

        super.printQuestion();
        System.out.println("plase answer 'True' or 'False'");
    }
}