package widest_vertical_area;

public class WidestVerticalArea {
    public static void main(String[] args) {
        int[][] points = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        System.out.println(maxWidthOfVerticalArea(points));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        int n = points.length;
        int[] xCoordinates = new int[n];

        for (int i = 0; i < n; i++) {
            xCoordinates[i] = points[i][0];
        }

        for (int i = 1; i < n; i++) {
            int key = xCoordinates[i];
            int j = i - 1;

            while (j >= 0 && xCoordinates[j] > key) {
                xCoordinates[j + 1] = xCoordinates[j];
                j = j - 1;
            }
            xCoordinates[j + 1] = key;
        }

        int maxWidth = 0;
        for (int i = 1; i < n; i++) {
            int width = xCoordinates[i] - xCoordinates[i - 1];
            if (width > maxWidth) {
                maxWidth = width;
            }
        }

        return maxWidth;
    }
}
