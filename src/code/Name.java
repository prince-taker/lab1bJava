/**
 * @author Prince Lesapo and Mbadaliga Arehone Brenden.
 */
public class Name {

    private final String firstName;
    private final String lastName;

    /**
     * Initializes the variables when the name class is called.
     * @param firstName First name.
     * @param lastName Last name.
     */
    Name(final String firstName, final String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Returns the both the first name and last name. e.g. Sam Richie.
     * @return The full name.
     */
    public String getFullName()
    {
        return firstName + " " + lastName;
    }

    /**
     * Returns the users initials.
     * @return Initials.
     */
    public String getInitials()
    {
        return firstName.toUpperCase().charAt(0) + "." + lastName.toUpperCase().charAt(0) + ".";
    }

    /**
     * Returns the first name.
     * @return First name.
     */
    public String getFirstName()
    {
        return this.firstName;
    }

    /**
     * Returns the last name.
     * @return Last name.
     */
    public String getLastName()
    {
        return this.lastName;
    }
}
