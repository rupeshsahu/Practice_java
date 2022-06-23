package LLD_basics.creationalDesigns.Builderone;

public class UserExam {

    private int englishMarks;
    private int mathsMarks;
    private int scienceMarks;
    private String name;

    public UserExam(UserExamParameters userExamParameters){

        this.englishMarks=userExamParameters.englishMarks;
        this.mathsMarks=userExamParameters.mathsMarks;
        this.scienceMarks=userExamParameters.scienceMarks;
        this.name=userExamParameters.name;

    }
    

}
