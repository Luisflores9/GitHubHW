package GroupProject;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] numbers = {
				{100, 200, 300, 400, 500},
				{1000, 2000, 3000, 4000, 5000},
				{10000, 20000, 30000, 40000, 50000}
		};
		
		for (int i=0; i < numbers.length ; i++) {
			for( int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
				
				
			}
			
		}

	}

}
