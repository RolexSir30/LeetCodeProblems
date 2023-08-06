package LeetCodeProblems;



class IntegerToRoman{
	
	public static void main(String[] args) {
		System.out.println(Integer_To_Roman(1546));

	}
	
	public static String Integer_To_Roman(int integer) {
		String roman="";
		Integer nums[]= {1000,900,500,400,100,90,50,40,10,9,5,4,1};
		String romans[]= {"M","IM","D","ID","C","IC","L","IL","X","IX","V","IV","I"};
		int parcour=0;
		while(parcour<13) {
			if(integer-nums[parcour]>=0) {
				roman+=romans[parcour];
				//System.out.println(nums[parcour]);
				integer=integer-nums[parcour];

			}
			else {
				parcour++;
			}
			
		}
		
		
		
		
		
		
		
		return roman;
	}
	
}
