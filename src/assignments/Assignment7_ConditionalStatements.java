package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {

		
		int creditScore = 700; //1. Credit Score:
		int income = 50000;  //2. income
		boolean isEmployeed = true; //3. Employee Status
		int debtToIncomeRatio = 90; //4. Debt to income Ratio
		
		if(creditScore >= 750) {
			System.out.println("The is automatically Approved.");
			
		} else if(creditScore >= 650 && creditScore <= 750) {
			System.out.println("The additional checks are performed.");
			
			if(income >= 50000) {
				System.out.println("The loan to be considered for this Income");
				
				if(isEmployeed) {
					System.out.println("Customer is Employed, The loan is Approved");
					
					if(debtToIncomeRatio <= 40) {
						System.out.println("The DTO is satisfied, The load is Approved");
					} else {
						System.out.println("The DTO is not satisfied, The load is Denied");
					}
				} else {
					System.out.println("Customer is not Employed, The loan is not Approved");
				}
			}	
			
		} else {
			System.out.println("The loan is denied.");
		}
		
	}

}
