
public class CircularTourProblem {

    static class PetrolPump {

        int petrol, distance;

        public PetrolPump(int petrol, int distance) {
            this.petrol = petrol;
            this.distance = distance;
        }
    }

    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalSurplus = 0;
        int currentSurplus = 0;
        int start = 0;

        for (int i = 0; i < pumps.length; i++) {
            int gain = pumps[i].petrol - pumps[i].distance;
            totalSurplus += gain;
            currentSurplus += gain;

            
        }

        

    }

    public static void main(String[] args) {
        PetrolPump[] pumps = {
            new PetrolPump(4, 6),
            new PetrolPump(6, 5),
            new PetrolPump(7, 3),
            new PetrolPump(4, 5)
        };
        int start = findStartingPoint(pumps);
        if (start == -1) {
            System.out.println("No solution");
        } else {
            System.out.println("Start at petrol pump: " + start);
        }
    }

}
