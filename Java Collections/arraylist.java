import java.util.*;

public class arraylist {

	static int max(int a[]) {
		int maximum = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maximum)
				maximum = a[i];
		}
		return maximum;
	}

	static int position(int a[]) {
		int maximum = a[0];
		int pos = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > maximum) {
				maximum = a[i];
				pos = i;
			}
		}
		return pos;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		System.out.println(list);

		int temp;
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (((int) list.get(i)) < ((int) list.get(j))) {
					temp = (int) list.get(i);
					list.set(i, (int) list.get(j));
					list.set(j, temp);
					count++;
				}

			}
		}
		System.out.println("Sorting in Descending Order:" + list);
		System.out.println("Number of swaps:" + count);
	}
}
