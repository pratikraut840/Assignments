/*Given a number n, determine whether it is a prime number or not. A prime number is a
number greater than 1 that has no positive divisors other than 1 and itself.
*/

function checkPrimeNumber(number: number): void {

    // Prime numbers must be greater than 1
    if (number <= 1) {
        return console.log("Given number is not prime");
    }

    // Check divisibility using modulus operator from 2 
    for (let i = 2; i < number; i++) {
        if (number % i === 0) {
            return console.log("Given number is not prime");
        }
    }
    return console.log("Given number is prime");
}

checkPrimeNumber(7)