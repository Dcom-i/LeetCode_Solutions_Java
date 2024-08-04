package LeetCode_Solutions_Java;

public class Guess_Number_Higher_or_Lower {

    public static void main(String[] args) {

    }

    public static int guess(int n) {

        return 0;
    }

    public static int guessNumber(int n) {

        int pickedNum = 0;
        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = n / 2;

            if (guess(mid) == -1) {

                left = mid - 1;

            }

        }

    }

}
