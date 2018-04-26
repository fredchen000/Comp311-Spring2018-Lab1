package labs.comp3111.ust.hk;
// test test testt tets
public class Lab1Activity {
	public static void findMin(int[] arr) {
		int min = arr[0];
		for(int i = 0 ; i<arr.length; ++i) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.print("Min ="+ min + "; ");
		return;
	}
	
	public static void findMax(int[] arr) {
		int max = arr[0];
		for(int i = 0 ; i<arr.length; ++i) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.print("Max ="+ max);
		return;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int Item : arr) {
			sum += Item;
		}
		System.out.println(String.format("Sum of the number is %d", sum));
		findMin(arr);
		findMax(arr);
	}

}
