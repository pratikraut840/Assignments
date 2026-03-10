/* Bank Transactions
    Positive value refers Credit and Negative refers Debit Transaction
    Transactions Amount
    1 50000
    2 -2000
    3 3000
    4 -15000
    5 -200
    6 -300
    7 4000
    8 -3000
    First Store all the transactions in any data structure of Your Choice from collections, and by using
    Loops and conditional statements
    1. Print total number of credit and debit transactions completed
    2. Print the total amount credited and debited in account
    3. Print total amount remaining at the end in Bank Account
    4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
    Transaction with Amount” and also print total number of suspicious transactions
*/

// Interface representing a single bank transaction
interface bankTransactions {
    transactionId: number,  // Unique ID of the transaction
    amount: number          // Transaction amount (+credit / -debit)
}

// Array storing all bank transactions
const transactions: bankTransactions[] = [
    { transactionId: 1, amount: 50000 },
    { transactionId: 2, amount: -2000 },
    { transactionId: 3, amount: 3000 },
    { transactionId: 4, amount: -15000 },
    { transactionId: 5, amount: -200 },
    { transactionId: 6, amount: -300 },
    { transactionId: 7, amount: 4000 },
    { transactionId: 8, amount: -3000 }
]

//Variables to store:
let creditTransactions: number = 0;
let debitTransactions: number = 0;

let totalCredit = 0;
let totalDebit = 0;

let suspeciouscreditTransactions = 0;
let suspeciousdebitTransactions = 0;
let totalSuspiciousTransactions = 0;

//Loop through each transaction
for (let t of transactions) {

    // Check if transaction is Credit or Debit
    if (t.amount > 0) {
        creditTransactions++;
        totalCredit = totalCredit + t.amount;
    } else {
        debitTransactions++
        totalDebit = totalDebit + t.amount
    }

    // Check for suspicious Credit transaction (> 10000)
    if (t.amount > 10000) {
        suspeciouscreditTransactions++;
        console.log("suspicious credit transaction with amount :" + t.amount)
    }
    // Check for suspicious Debit transaction (< -10000)
    else if (t.amount < -10000) {
        suspeciousdebitTransactions++
        console.log("suspicious debit transaction with amount :" + t.amount);
    }

}

//1. Total number of credit and debit transactions
console.log("total number of credit transactions completed :" + creditTransactions);
console.log("total number of debit transactions completed :" + debitTransactions);

//2. Print total credited and debited amounts
console.log("total amount credited in account :" + totalCredit);
console.log("total amount debited in account :" + totalDebit);

//3. Calculate and print final balance
const totalAmount = totalCredit + totalDebit;
console.log("total amount remaining at the end in Bank Account :" + totalAmount);

// 4. Calculate and print total suspicious transactions
totalSuspiciousTransactions = suspeciouscreditTransactions + suspeciousdebitTransactions
console.log("Total Suspicious Transactions :" + totalSuspiciousTransactions)
