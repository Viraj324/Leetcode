import java.util.Arrays;
import java.util.Comparator;

public class FKnapSack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};

        int W = 50;
        double ratio[][] = new double[val.length][2];

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];
        }

        // Ascending Order Sorting
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        double finalVal = 0; // Use double to store fractional value
        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {
                finalVal += val[index]; // Use the original 'val' array
                capacity -= weight[index];
            } else {
                // for fractional item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value : " + finalVal); // Output should be 240
    }
}
