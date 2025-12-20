package assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {

		// First Store all the transactions in any data structure of Your Choice from
		// collections
		Map<Integer, Integer> bankTransactions = new LinkedHashMap<Integer, Integer>();
		bankTransactions.put(1, 50000);
		bankTransactions.put(2, -2000);
		bankTransactions.put(3, 3000);
		bankTransactions.put(4, -15000);
		bankTransactions.put(5, -200);
		bankTransactions.put(6, -300);
		bankTransactions.put(7, 4000);
		bankTransactions.put(8, -3000);

		// Print total number of credit and debit transactions completed
		System.out.println("Total number of credit and debit transactions completed :" + bankTransactions.size());

		int creditCount = 0;
		int finalCreditAmount = 0;

		int debitCount = 0;
		int finalDebitAmount = 0;

		int suspiciousCount = 0;
		int finalBalance = 0;

		for (int i = 1; i <= bankTransactions.size(); i++) {

			int amount = bankTransactions.get(i); // getting transaction values from Map

			if (amount < 0) {
				debitCount++; // checking debit count
				finalDebitAmount = finalDebitAmount + amount; // adding final debit amount

				if (amount < -10000) {
					System.out.println("Total number of transactions completed :" + amount);
					suspiciousCount++; // checking suspeciousCount
				}
			} else {

				creditCount++; // checking credit count
				finalCreditAmount = finalCreditAmount + amount; // adding final credit amount

				if (amount > 10000) {
					System.out.println("Suspicious credit Transaction with Amount :" + amount);
					suspiciousCount++; // suspeciousCount
				}
			}
		}

		// 1. Print total number of credit and debit transactions completed
		System.out.println("Total number of debit transactions completed :" + debitCount);
		System.out.println("total number of credit transactions completed :" + creditCount);

		// 2. Print the total amount credited and debited in account
		System.out.println("Total amount credited in account :" + finalCreditAmount);
		System.out.println("Total amount debited in account :" + finalDebitAmount);

		// 3. Print total amount remaining at the end in Bank Account
		finalBalance = finalCreditAmount + finalDebitAmount;
		System.out.println("Total amount remaining at the end in Bank :" + finalBalance);

		// 4. Total number of suspicious transactions
		System.out.println("Total number of suspicious transactions :" + suspiciousCount);

	}

}
