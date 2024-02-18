/**
 * @author Prince Lesapo and Mbadaliga Arehone Brenden.
 */
public class Student {
    private final Name name;
    private final String studentNumber;
    private final Date dateOfBirth;
    private boolean graduationStatus;
    Student(final Name      name,
            final String    studentNumber,
            final Date      dateOfBirth,
            final boolean   isGraduated)
    {
        this.name = name;
        this.studentNumber = studentNumber;
        this.dateOfBirth = dateOfBirth;
        this.graduationStatus = isGraduated;
    }

    /**
     * Returns the entire Name object.
     * @return The Name object.
     */
    public Name getName(){
        return this.name;
    }

    /**
     * Returns the student number.
     * @return Student number.
     */
    public String getStudentNumber()
    {
        return this.studentNumber;
    }

    /**
     * Returns the entire date object.
     * @return The date object.
     */
    public Date getDateOfBirth(){
        return this.dateOfBirth;
    }

    /**
     * Returns the graduation status.
     * @return Yes if graduated and false if not.
     */
    public boolean isGraduated(){
        return this.graduationStatus;
    }

    /**
     * Updates the graduation status.
     * @param status the new status.
     */
    void setGraduationStatus(final boolean status){
        this.graduationStatus = status;
    }

}
