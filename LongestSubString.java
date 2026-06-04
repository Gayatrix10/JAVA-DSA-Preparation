import java.util.HashMap;

public class Longestsubstring {
    public static void main(String[] args) {

        String s = "aabcbabad";
        int k = 2;

        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {

            char curr = s.charAt(r);

            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while (map.size() > k) {

                if (map.get(s.charAt(l)) == 1) {
                    map.remove(s.charAt(l));
                } else {
                    map.put(s.charAt(l),
                            map.get(s.charAt(l)) - 1);
                }

                l++;
            }

            max = Math.max(max, r - l + 1);
        }

        System.out.println(max);
    }
}