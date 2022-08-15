import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem1430 { //NumbersOnWhiteboard

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			List<Integer> l = new ArrayList<Integer>();
			for (int i = 1; i <= n; i++) {
				l.add(i);
			}
			solve(l, n);
		}
	}

	private static void solve(List<Integer> l, int n) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>((a, b) -> b - a);
		q.addAll(l);
		int k = n - 1;
		StringBuilder sb = new StringBuilder();
		while (!q.isEmpty() && q.size() > 1 && k > 0) {
			int a = q.poll();
			if (!q.isEmpty()) {
				int b = q.poll();
				int mid = (a + b) % 2 == 0 ? (a + b) / 2 : (a + b + 1) / 2;
				q.offer(mid);
//				System.out.println(a + " " + b);
				sb.append(a + " " + b + "\n");
				k--;
			}
		}
		System.out.println(q.poll() + " \n" + sb.toString());
	}

}