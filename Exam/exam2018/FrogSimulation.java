package exam2018;

public class FrogSimulation {

    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops) {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance() {
        return (int)(-40 + Math.random()*(40 - (-40) + 1));
    }

    public boolean simulate() {

        int endValue = 0;
        boolean isSimulate = false;
        for (int i = 0; i < maxHops; i++) {
            if (endValue < goalDistance && endValue >= 0)
                endValue += hopDistance();
            if (endValue >= goalDistance) {
                isSimulate = true;
                break;
            }
        }
        return isSimulate;

    }

    public double runSimulations(int num) {

        int count = 0;
        for (int i = 0; i < num; i++) {
            if (simulate() == true)
                count++;
        }
        return (double)(count / num);

    }

}
