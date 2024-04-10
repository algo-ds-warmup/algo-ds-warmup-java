package reveal_cards;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class RevealCards {

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);

        Queue<Integer> queue = new LinkedList<>();

        for (int i = deck.length - 1; i >= 0; i--) {
            if (!queue.isEmpty()) {
                queue.add(queue.poll());
            }
            queue.add(deck[i]);
        }

        int[] result = new int[deck.length];
        for (int i = deck.length - 1; i >= 0; i--) {
            result[i] = queue.poll();
        }

        return result;
    }

}
