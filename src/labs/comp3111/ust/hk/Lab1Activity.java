package labs.comp3111.ust.hk;

public class Lab1Activity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		for(int Item : arr) {
			sum += Item;
		}
		System.out.println(String.format("Sum of the number is %d", sum));
	}

}
