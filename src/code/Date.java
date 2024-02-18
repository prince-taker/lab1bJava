/**
 * @author Prince Lesapo and Mbadaliga Arehone Brenden.
 */
public class Date
{
    private int year;
    private int month;
    private int day;

    /**
     * Initializes the variables when the date class is called.
     * @param year holds the year for a date.
     * @param month hold the month for a date.
     * @param day holds the date for a date.
     */
    Date(final int year, final int month, final int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Return the date is the year-month-date format. e.g. 2021-12-31.
     * @return Formatted date.
     */
    public String getYyMmDd()
    {
        return this.year + "-" + this.month + "-" + this.day;
    }

    /**
     * Returns the day of the given date.
     * @return the day.
     */
    public int getDay()
    {
        return this.day;
    }

    /**
     * Returns the year from the given date.
     * @return the year.
     */
    public int getYear(){
        return this.year;
    }

    /**
     * Returns the month from the given month.
     * @return the month.
     */
    public int getMonth(){
        return this.month;
    }

    /**
     * Updates the year for the date.
     * @param year The new date year for the date.
     */
    void setYear(final int year){
        this.year = year;
    }

    /**
     * Updates the month for the date.
     * @param month The new month for the date.
     */
    void setMonth(final int month){
        this.month = month;
    }

    /**
     * Updates the day for the date.
     * @param day The new day for the date.
     */
    void setDay(final int day){
        this.day = day;
    }
}
