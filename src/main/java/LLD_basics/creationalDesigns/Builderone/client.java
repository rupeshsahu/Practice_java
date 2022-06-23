package LLD_basics.creationalDesigns.Builderone;

public class client {
    public static void main(String[] args) {

        UserExamParameters parameters=new UserExamParameters();
        parameters.englishMarks=89;
        parameters.mathsMarks=75;

        UserExam userExam=new UserExam(parameters);

    }
}
