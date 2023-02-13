package arrayDivideAndCheck;

public class Application {

	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 0, 7, 1, 1};
		int leftSum = 0, rightSum = 0;
		boolean exists = false;
		
		for(int i = 0; i < arr.length; i++) {
			
			
			for(int j = 0; j < i; j++) {
				leftSum+=arr[j];
			}
			for(int k = arr.length-1; k > i; k--) {
				rightSum+=arr[k];
			}
			if(leftSum == rightSum) {
				System.out.println("That number's index is : " + i + " | The number itself is : " + arr[i]);
				System.out.println(leftSum + " | " + rightSum);
				exists = true;
			}
			leftSum = 0;
			rightSum = 0;
			
		}
		
		if(!exists) {
			System.out.println("That number does not exist.");
		}
		
	}

}
