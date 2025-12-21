package conditionalStatements;

public class ConditionalStatements {

	// Conditional Statements : Statements along with conditions
	// We always tell JVM to satisfy the condition and if satisfy then only allow it
	// to execute

	// if -else statement ==> when we don't know the result of condition
	// switch-case statement ==> when we know the result of condition and we want to
	// choose one among many options

	public static void main(String[] args) {

		// if -else statement ==> when we don't know the result of condition

		// 1. only if
		// syntax:if(condition) { //code }

		// 2. if-else
		// syntax:if(condition) { //code } else { //code }

		// 3. if-else if-else (unlimited else if)
		// syntax:if(condition) { //code } else if(condition) { //code } else { //code }

		// 4. nested if-else
		// syntax:if(condition) { if(condition) { //code } else { //code } } else {
		// //code }

		// switch-case statement ==> when we know the result of condition and we want to
		// choose one among many options
		// When working with switch-case, break is necessary

		// syntax:
		// switch(variable/expression) { case value1: //code break; case value2: //code
		// break; ... default: //code }

		// Jumping statements in Java
		// 1. break: break the flow/iteration
		// 2. continue: skip the flow/iteration
		// 3. return: return the variable/method which written with return
	}

}
