//Assignment 2:  Checks whether a customer is eligible for a loan.

function checkLoanEligibility(
    customerName: string,
    creditScore: number,
    income: number,
    isEmployed: boolean,
    debtToIncome: number,
): void {
    //condition1: If the credit score is above 750, the loan is automatically approved.
    if (creditScore > 750) {
        console.log("The loan is automatically approved for: " + customerName);

        //condition2: If the credit score is between 650 and 750
    } else if (creditScore >= 650 && creditScore <= 750) {
        console.log("additional checks are performed");

        // condition3: For credit scores between 650 and 750, the customer’s income must be at least $50,000
        if (income >= 50000) {
            // condition4: the system checks whether the customer is employed.
            console.log("the loan to be considered");
            if (isEmployed == true) {
                console.log("The customer is employed");

                // condition5: If the DTI ratio is less than 40%, the loan is approved.
                if (debtToIncome < 40) {
                    console.log("The loan application is approved for: " + customerName);
                } else {
                    console.log("The loan application is denied for: " + customerName + " As DTO is too high");
                }

            } else {
                console.log("The customer is not employed");
            }

        } else {
            console.log("the loan is denied for " + customerName + "Income is below $50,000");
        }

    } else {
        // Condition 6: If credit score is below 650
        console.log("the loan is denied for " + customerName + "Credit score is below 650");
    }
}

checkLoanEligibility("Pratik", 700, 50000, true, 30);
