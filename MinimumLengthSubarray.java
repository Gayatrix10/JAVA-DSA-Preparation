public class MinimumLengthSubarray {

    public static int minLength(int[] arr, int k) {
        int n = arr.length;
        int minLen = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum >= k) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        return minLen == Integer.MAX_VALUE ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int k = 6;

        System.out.println(minLength(arr, k));
    }
}