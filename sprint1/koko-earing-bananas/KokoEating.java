import java.util.Arrays;

public class KokoEating {

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        return binarySearch(piles, h);
    }

    public static int hoursToEat(int[] piles, int speed) {

        int hours = 0;
        for (int pile : piles) {
            hours += (int) Math.ceil((double) pile / speed);
        }
        return hours;

    }

    public static int binarySearch(int[] piles, int hours) {
        int low = 1;
        int high = piles[piles.length - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (hoursToEat(piles, mid) <= hours) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}
