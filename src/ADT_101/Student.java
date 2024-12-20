package ADT_101;
/**
  672115047 Samakom Prompanya
 */

class Student {
    private String SID;
    private String firstName;
    private String lastName;

    public Student(String SID, String firstName, String lastName) {
        this.SID = SID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSID() {
        return SID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        return this.SID + " " + this.firstName + " " + this.lastName+"\n";
    }
}