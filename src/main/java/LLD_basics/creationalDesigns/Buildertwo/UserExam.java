package LLD_basics.creationalDesigns.Buildertwo;

import java.security.InvalidParameterException;

public class UserExam {


    private int englishMarks;
    private int mathsMarks;
    private String name;
    private UserExam(){}

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getMathsMarks() {
        return mathsMarks;
    }

    public String getName() {
        return name;
    }

    public static UserExamBuilder getBuilder(){
        return new UserExamBuilder();
    }
    public static class UserExamBuilder{
        private int englishMarks=0;
        private int mathsMarks=0;
        private String name="default";

        public UserExamBuilder setenglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public UserExamBuilder setMathsMarks(int mathsMarks) {
            this.mathsMarks = mathsMarks;
            return this;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserExam build(){

            if (englishMarks > 100 ||mathsMarks > 100) {
                throw new InvalidParameterException("Marks can't be greater than 100");
            }

            if (mathsMarks + englishMarks > 200) {
                throw new InvalidParameterException("Maths + English can't be greater than 150");
            }

            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with 0");
            }


            UserExam userExam=new UserExam();
            userExam.englishMarks=this.englishMarks;
            userExam.mathsMarks=this.mathsMarks;
            userExam.name=this.name;
            return userExam;
        }
    }

}
