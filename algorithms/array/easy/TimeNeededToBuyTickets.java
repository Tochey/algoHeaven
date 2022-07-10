package array.easy;

import java.util.LinkedList;
import java.util.Queue;

//There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line and the (n - 1)th person is at the back of the line.
//
//        You are given a 0-indexed integer array tickets of length n where the number of tickets that the ith person would like to buy is tickets[i].
//
//        Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back to the end of the line (which happens instantaneously) in order to buy more tickets. If a person does not have any tickets left to buy, the person will leave the line.
//
//        Return the time taken for the person at position k (0-indexed) to finish buying tickets.
public class TimeNeededToBuyTickets {
    static class pair {
        int index;
        int val;
        pair(int index, int val) {
            this.index = index;
            this.val = val;
        }
    }
    public int solution(int[] tickets, int k) {
        int seconds = 0;
        Queue<pair> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.add(new pair(i, tickets[i]));
        }

        while (!queue.isEmpty()) {
            pair temp = queue.remove();
            seconds++;
            if (temp.val > 1) {
                queue.add(temp = new pair(temp.index, temp.val - 1));
                continue;
            }
            if (temp.val == 1 && temp.index == k) {
                return seconds;
            }


        }

        return 10;
    }

}
