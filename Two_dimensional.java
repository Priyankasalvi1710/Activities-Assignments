package learning;

public class Two_dimensional {

	public static void main(String[] args) {
		
		int[][] numbers = { {11, 12, 13, 14}, {15, 16, 17} };
		
		System.out.println(numbers[0][3]);

//		replace specific array
		numbers[1][2] = 30;
		System.out.println(numbers[1][2]);
	
//		finding length of array
		
		System.out.println(numbers[0].length);
		System.out.println(numbers[1].length);
		
//		For loop
		
		for (int i = 0; i < numbers.length; ++i) {
		      for(int j = 0; j < numbers[i].length; ++j) {
		        System.out.println(numbers[i][j]);
		      }
		    }
	}

}
