package im.linsama.begin;

import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        Arrays.sort(citations);
        int index = citations.length - 1;
        int hIndex = 0;
        while(index >= 0 && citations[index--] >= (hIndex + 1)) {
            hIndex++;
        }
        return hIndex;
    }

    public int rangeBitwiseAnd(int m, int n) {
        if (m == 0) return 0;
        int move = 1;
        while (m != n) {
            m >>= 1;
            n >>= 1;
            move <<= 1;
        }
        return move * m;
    }

    public static void main(String[] args) {
        int[] citations = new int[] {1};
        System.out.println(new Solution().rangeBitwiseAnd(13, 15));
    }
}
