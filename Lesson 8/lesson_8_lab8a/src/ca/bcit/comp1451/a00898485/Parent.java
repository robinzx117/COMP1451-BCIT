package ca.bcit.comp1451.a00898485;

/**
 * class Parent
 *
 * @author Xin Zhao (A00898485) with Nazar Poverlo
 * @version 1.0
 */

public class Parent extends Employee {
    // Symbolic Constants:
    public static final double OVERTIME_PAY_RATE = -2.0;

    // Instance Variables:
    private int numberOfHoursSpentPerWeekWithKids;

    /**
     * Constructor for objects of class Parent.
     * @param numberOfHoursSpentPerWeekWithKids An integer to set the number of hours spent per week with kids of the Parent.
     */
    public Parent(String name, int numberOfHoursSpentPerWeekWithKids) {
        super(name);
        setNumberOfHoursSpentPerWeekWithKids(numberOfHoursSpentPerWeekWithKids);
    }

    /**
     * @return The name of the Parent in String.
     */
    @Override
    public String getName() {
        return "mother";
    }

    /**
     * @return The number of hours spent per week with kids of the Parent in integer.
     */
    public int getNumberOfHoursSpentPerWeekWithKids() {
        return this.numberOfHoursSpentPerWeekWithKids;
    }

    /**
     * Sets the number of hours spent per week with kids of the Parent.
     * @param numberOfHoursSpentPerWeekWithKids An integer to set the number of hours spent per week with kids of the Parent.
     */
    public void setNumberOfHoursSpentPerWeekWithKids(int numberOfHoursSpentPerWeekWithKids) {
        if(numberOfHoursSpentPerWeekWithKids >= 0) {
            this.numberOfHoursSpentPerWeekWithKids = numberOfHoursSpentPerWeekWithKids;
        }
        else {
            throw new IllegalArgumentException("Error: Invalid Parent::numberOfHoursSpentPerWeekWithKids.");
        }
    }

    /**
     * @return A String to indicate the dress code.
     */
    @Override
    public String getDressCode() {
        return "anything";
    }

    /**
     * @return A boolean to indicate if the Parent is paid salary or not.
     */
    @Override
    public boolean isPaidSalary() {
        return false;
    }

    /**
     * @return A boolean to indicate if the post secondary education is required or not.
     */
    @Override
    public boolean postSecondaryEducationRequired() {
        return false;
    }

    /**
     * @return A String to indicate the work verb.
     */
    @Override
    public String getWorkVerb() {
        return "care";
    }

    /**
     * @return A double to indicate the over time pay rate.
     */
    @Override
    public double getOverTimePayRate() {
        return OVERTIME_PAY_RATE;
    }

    /**
     * @return A boolean to indicate if the Parent gets paid or not.
     */
    @Override
    public boolean getsPaid(){
        return false;
    }
}