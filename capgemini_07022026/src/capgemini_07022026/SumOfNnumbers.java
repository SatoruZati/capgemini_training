package capgemini_07022026;

public class SumOfNnumbers {

	public static void main(String[] args) {
		// recursion causes error sometimes, due to stack overflow, because of too many recursive calls. 
		// Suppose, 5+Sum(4) -> 5+4+Sum(3) -> 5+4+3+Sum(2) -> 5+4+3+2+Sum(1) -> 5+4+3+2+1+Sum(0) -> 5+4+3+2+1+0 = 15
		// Therefore, we can use Dynamic Programming to solve this problem.
		
		// Suppose Fibonacci series, 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
		// Fibonacci series can be solved using Dynamic Programming, because it has optimal substructure and overlapping subproblems.
		// Using Fibonacci Tree, we can see that Fibonacci(5) = Fibonacci(4) + Fibonacci(3) = (Fibonacci(3) + Fibonacci(2)) + (Fibonacci(2) + Fibonacci(1)) = ((Fibonacci(2) + Fibonacci(1)) + (Fibonacci(1) + Fibonacci(0))) + ((Fibonacci(1) + Fibonacci(0)) + (Fibonacci(0) + Fibonacci(-1))) = (((Fibonacci(1) + Fibonacci(0)) + (Fibonacci(0) + Fibonacci(-1))) + ((Fibonacci(0) + Fibonacci(-1)) + (Fibonacci(-1) + Fibonacci(-2)))) + (((Fibonacci(0) + Fibonacci(-1)) + (Fibonacci(-1) + Fibonacci(-2))) + ((Fibonacci(-1) + Fibonacci(-2)) + (Fibonacci(-2) + Fibonacci(-3)))))
		
		

	}

}
