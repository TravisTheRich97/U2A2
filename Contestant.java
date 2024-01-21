/* Contestant.java:  
 * This class extends Person while adding attributes and methods
 * related to recording performance in the specified contest. 
 *     
 * Author: [Travis Rich 1719541]
 * Last updated: [21Jan2023]
 */

 public class Contestant extends Person {

    private int currentPosition;
    private int totalRounds;
    private double averagePosition;

    public Contestant(String name, int age) {
        super(name, age);
        this.currentPosition = -1;
        this.totalRounds = 0;
        this.averagePosition = 0.0;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public void setCurrentPosition(int currentPosition) {
        this.currentPosition = currentPosition;
        incrementTotalRounds();
        updateAveragePosition(currentPosition);
    }

    public int getTotalRounds() {
        return totalRounds;
    }

    private void incrementTotalRounds() {
        this.totalRounds++;
    }

    public double getAveragePosition() {
        return averagePosition;
    }

    private void updateAveragePosition(int newPosition) {
        averagePosition = ((averagePosition * (totalRounds - 1)) + newPosition) / totalRounds;
    }

    @Override
    public String toString() {
        return "Contestant [name=" + getName() + ", age=" + getAge() + ", currentPosition=" + currentPosition
                + ", totalRounds=" + totalRounds + ", averagePosition=" + averagePosition + "]";
    }
}
