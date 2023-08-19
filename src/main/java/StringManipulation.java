public class StringManipulation {

    public static void main(String[] args) {
        String str="rupesh-sahu-sdet";
        String substr=str.substring(4,10);
        String substr1=str.substring(5);
        System.out.println(substr1+" | "+substr);
        System.out.println(str.indexOf('s')+"  |"+str.lastIndexOf('s'));
        String replacedash=str.replace("-","");
        System.out.println("replaced - "+replacedash );
        System.out.println(str.startsWith("ru"));
        System.out.println(str.endsWith("ett"));
        String split[]=str.split("-",3);
        System.out.println(split[1]);
        System.out.println(str.compareTo("rupesh"));
        System.out.println(isEmailValid("rupesh@gmail.co"));

    }

    public static boolean isEmailValid(String email){
        boolean isValidEmail = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}");
        return isValidEmail;
    }
}
