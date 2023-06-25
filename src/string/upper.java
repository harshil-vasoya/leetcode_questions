package string;//package string;
//
//import java.util.Arrays;
//import java.util.List;
//
//public class upper {
//
//    public static void main(String[] args) {
//        String[] strings = {"ABC", "ABC123", "abcABC", "abc123ABC"};
//        for (int i=0;i<strings.length;i++) {
//           strings[i]=toUpperCase(strings[i]);
//        }
//        List<String> harshil=Arrays.asList(strings);
//        System.out.println(harshil);
//
//    }
//
//    /**
//     this function is use to convert if input s=abc then return ABC
//     */
//    public static String toUpperCase(String s) {
//        char[] values = s.toCharArray();
//        for (int i = 0; i < values.length; ++i) {
//            if (Character.isLetter(values[i]) && Character.isLowerCase(values[i])) {
//                values[i] = Character.toUpperCase(values[i]);
//            }
//        }
//        return new String(values);
//    }
//}

public class upper {
    public static long temp(int[] pref, int left, int mid, int right) {
        int[] ref = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        int cnt = 0;
        long inversionCount = 0;

        while (i <= mid && j <= right) {
            if (pref[i] <= pref[j]) {
                ref[k++] = pref[i++];
            } else {
                // Counting inversions
                inversionCount += (mid - i + 1);
                ref[k++] = pref[j++];
            }
        }

        while (i <= mid) {
            ref[k++] = pref[i++];
        }

        while (j <= right) {
            ref[k++] = pref[j++];
        }

        k = 0;
        for (int itr = left; itr <= right; itr++) {
            pref[itr] = ref[k++];
        }

        return inversionCount;
    }

    public static long countInversions(int[] pref, int left, int right) {
        long leftCount = 0, rightCount = 0, mergeCount = 0;

        if (left < right) {
            int mid = (left + right) / 2;
            leftCount = countInversions(pref, left, mid);
            rightCount = countInversions(pref, mid + 1, right);
            mergeCount = temp(pref, left, mid, right);
        }

        return leftCount + rightCount + mergeCount;
    }

    public static long slove(String s) {
        int n=s.length();
        int[] pref = new int[n];

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                pref[i] = -1;
            } else {
                pref[i] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            pref[i] += pref[i - 1];
        }

        long total = 0;
        for (int i = 0; i < n; i++) {
            if (pref[i] > 0) {
                total++;
            }
        }

        int j = n - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = pref[i];
            pref[i] = pref[j];
            pref[j] = temp;
        }

        total += countInversions(pref, 0, n - 1);
        return total;
    }
    public static void main(String[] args) {
        String s = "1011011111";
        int n = s.length();
        long count = slove(s);
        System.out.println("Count of substrings: " + count);
    }
}
