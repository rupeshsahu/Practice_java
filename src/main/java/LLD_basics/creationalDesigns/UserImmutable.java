package LLD_basics.creationalDesigns;

public final class UserImmutable {

    private final String firstName;
    private final String lastName;
    private final String qualification;
    private final double hieght;
    private final String userName;
    private final String emailId;

    public UserImmutable(String firstName, String lastName, String qualification, double hieght, String userName, String emailId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.qualification = qualification;
        this.hieght = hieght;
        this.userName = userName;
        this.emailId = emailId;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getQualification() {
        return qualification;
    }


    public double getHieght() {
        return hieght;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmailId() {
        return emailId;
    }

}
