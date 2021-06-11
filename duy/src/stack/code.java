package stack;

public class code {
	public static void rvereseArray(int a[], int start, int end) {
		int tmp;

		while (start < end) {
			tmp = a[start];
			a[start] = a[end];
			a[end] = tmp;
			start++;
			end--;
		}
	}

	public static void printArray(int a[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(a[i] + " ");

		System.out.println();
	}

	public static void main(String args[]) {

		int a[] = { 1, 2, 3, 4, 5, 6 };
		printArray(a, 6);
		rvereseArray(a, 0, 5);
		System.out.print("Reversed array is \n");
		printArray(a, 6);

	}

}