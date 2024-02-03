package exam2019;

public class StepTracker {

    public int minimumSteps;
    public int numberOfSteps;
    public int numberOfDays;
    public int activeDays;
    public double averageSteps;

    public StepTracker(int requiredSteps) {
        minimumSteps = requiredSteps;
        numberOfSteps = 0;
        numberOfDays = 0;
        activeDays = 0;
        averageSteps = 0.0;
    }

    public void addDailySteps(int dailySteps) {
        numberOfSteps += dailySteps;
    }

    public int activeDays() {
        if (numberOfDays >= minimumSteps)
            activeDays++;
        return activeDays;
    }

    public double averageSteps() {
        return averageSteps = numberOfSteps / numberOfDays;
    }

}
