public class FourMultipleChoice extends Question {

    private String [] choices;
    private int arrayCounter;

    public FourMultipleChoice(String text, String answer, String[] choices){
        super(text, answer);
        this.choices = choices;
        this.arrayCounter = 0;
    }

    public FourMultipleChoice(){
        super();
        this.choices = new String[5];
    }

    public void addChoice(String choice, boolean correct){

        if(this.arrayCounter >= 4){
            ;
        
    }else{
        choices[this.arrayCounter+1] = choice;
        this.arrayCounter = this.arrayCounter +1;
            if (correct == true){

                this.answer = id + "." + this.arrayCounter;
            }
    }
    }
    public void printQuestion() {
        System.out.println(id + "." + text);
        for (int i = 1; i <= arrayCounter; i++)
            System.out.println(id + "." + (i) + " " + choices[i]);
 
        
    }
}