package LLD_basics.creationalDesigns.Buildertwo;

public class client {
    public static void main(String[] args) {
        UserExam userExam1=UserExam.getBuilder().setenglishMarks(90).setMathsMarks(100).setName("Rupesh").build();
        System.out.println(userExam1.getMathsMarks());

    }
}
