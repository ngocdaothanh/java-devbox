package dsa.recursion;

public class sumOfList {

    private int sumOfList(int position, int sum, int[] list) {
        if (position == list.length) {
            return sum;
        }
        return sumOfList(position + 1, sum + list[position], list);
    }

    public int sumOfList(int[] list) {
        if (list.length == 0) {
            return 0;
        }

        return sumOfList(0, 0, list);
    }
}
