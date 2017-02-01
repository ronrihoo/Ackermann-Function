import java.util.ArrayList;

public class Ackermann {

    public static void main(String[] args) {
        System.out.println(A(1, 2));
    }

    // Ackermann for loop implementation with the familiar look
    public static int A(int x, int y) {
        ArrayList<Integer> xList = new ArrayList<>();
        for (int i = 1; i > 0; i++) {
            if (x == 0) {
                y = y + 1;
                if (xList.size() > 0) {
                    x = xList.get(xList.size() - 1);
                    xList.remove(xList.size() - 1);
                } else {
                    return y;
                }
            } else if (y == 0) {
                y = 1;
                x = x - 1;
            } else {
                y = y - 1;
                xList.add(x - 1);
            }
        }
        // An unreachable statement in this case
        return y;
    }

    // Ackermann for loop implementation with the unfamiliar look
    public static int A2(int x, int y) {
        ArrayList<Integer> xList = new ArrayList<>();
        for (; true;) {
            if (x == 0) {
                y = y + 1;
                if (xList.size() > 0) {
                    x = xList.get(xList.size() - 1);
                    xList.remove(xList.size() - 1);
                } else {
                    return y;
                }
            } else if (y == 0) {
                y = 1;
                x = x - 1;
            } else {
                y = y - 1;
                xList.add(x - 1);
            }
        }
    }

}
