package main.recursion;

public class HanoiTowers {

    public void solve(int numberOfDisks) {
        moveDisks(numberOfDisks, "START", "END", "HELPER");
    }

    public void moveDisks(int numberOfDisks, String start, String end, String helper) {
        if (numberOfDisks < 1) {
            return;
        }
        if (numberOfDisks == 1) {
            System.out.println("Move disk " + numberOfDisks + " from " + start + " to " + end);
        } else {
            moveDisks(numberOfDisks - 1, start, helper, end);
            System.out.println("Move " + numberOfDisks + " from " + start + " to " + end);
            moveDisks(numberOfDisks - 1, helper, end, start);
        }

    }
}
