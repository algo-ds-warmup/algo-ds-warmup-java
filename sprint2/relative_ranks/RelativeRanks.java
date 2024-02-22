package relative_ranks;

import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public static void main(String[] args) {
        int[] score = {5, 3, 4, 2, 1};
        String[] ranks = findRanks(score);
        for (String rank : ranks) {
            System.out.println(rank);
        }
    }

    public static String[] findRanks(int[] score) {
        int n = score.length;
        Map<Integer, Integer> scoreToIndex = new HashMap<>();
        for (int i = 0; i < n; i++) {
            scoreToIndex.put(score[i], i);
        }

        for (int i = 0; i < n; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (score[j] > score[maxIdx]) {
                    maxIdx = j;
                }
            }
            int temp = score[i];
            score[i] = score[maxIdx];
            score[maxIdx] = temp;
        }

        String[] ranks = new String[n];
        for (int i = 0; i < n; i++) {
            int index = scoreToIndex.get(score[i]);
            if (i == 0) ranks[index] = "Gold Medal";
            else if (i == 1) ranks[index] = "Silver Medal";
            else if (i == 2) ranks[index] = "Bronze Medal";
            else ranks[index] = String.valueOf(i + 1);
        }

        return ranks;
    }

}
