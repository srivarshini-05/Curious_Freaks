//Mtd 1:using sort and checking  o(n log n)  o(1)
//Mtd 2:hashing o(n) o(n)
import java.util.Map;
import java.util.HashMap;

class Solution {
    public static boolean checkEqual(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;  // Arrays of different lengths can’t be equal
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int n = a.length;
        int c;

        for (int i = 0; i < n; i++) {
            if (map.get(a[i]) == null) {
                map.put(a[i], 1);
            } else {
                c = map.get(a[i]);
                c++;
                map.put(a[i], c);
            }
        }
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(b[i])) {
                return false;
            }
            if (map.get(b[i]) == 0) {
                return false;
            }
            c = map.get(b[i]);
            --c;
            map.put(b[i], c);
        }
        return true;
    }
}
