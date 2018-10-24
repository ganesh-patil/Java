class BreakWithLabel{
	public static void main(String[] args){
	
		int[][] nNumbers = {
		{1, 2, 3, 4},
		{5,6,7},
		{8,9},
		{10}
		};
		
		loop:
	    for(int[] row: nNumbers){
			for(int number: row){
				if(number == 6){
				  System.out.println("found6");
				  break loop;
				}
			}
			System.out.println("round completed");
		}
	}
}