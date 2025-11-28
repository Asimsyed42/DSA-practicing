package Assigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KthFactor {
    public int kthFactor(int n, int k) {
        List<Integer> list = new ArrayList<>();

        // Collect all factors
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                list.add(i);
                if (i != n / i) {   // avoid duplicate when i*i == n
                    list.add(n / i);
                }
            }
        }

        // Sort factors in ascending order
        Collections.sort(list);

        // If k is larger than number of factors
        if (k > list.size()) {
            return -1;
        }

        return list.get(k - 1);
    }
}
