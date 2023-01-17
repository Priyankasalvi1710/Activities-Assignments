package learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class P1 {
	public static void main(String[] args) {
		vector<int> addToArrayForm(vector<int>& A, int K) {
		    reverse(A.begin(), A.end());
		    for (int i = 0; i < A.size(); i++) {
		        A[i] += K;
		        K = A[i] / 10;
		        A[i] %= 10;
		    }
		    while (K) {
		        A.push_back(K%10);
		        K /= 10;
		    }
		    reverse(A.begin(), A.end());
		    return A;
		}
	}
}