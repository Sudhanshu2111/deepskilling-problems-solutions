1.	Understand Recursive Algorithms:

1.1 Explain the concept of recursion and how it can simplify certain problems.

Recursion is a programming technique where a function calls itself to solve a smaller instance of the same problem. It's like breaking down a large problem into identical, smaller pieces until the smallest piece (the base case) can be solved directly. Once the base case is solved, the solutions to the smaller problems are combined to solve the larger problem.

Key Components of a Recursive Function:
Base Case: Stops the recursion (direct solution for the simplest problem).
Recursive Step: Calls itself with modified (smaller) input.

Simplifies: Problems with natural self-similar structures (e.g., factorials, tree traversals, mathematical sequences). Makes code concise and elegant for such problems.


4.	Analysis:

4.1 Discuss the time complexity of your recursive algorithm.

The recursive future value algorithm has a time complexity of O(n), where n is the number of years. This is because it makes a linear number of recursive calls (one for each year), and each call performs a constant amount of work. While correct, it's less efficient than an iterative solution (also O(n) but with less overhead) or the direct mathematical formula (effectively O(1)).


4.2 Explain how to optimize the recursive solution to avoid excessive computation.

To optimize recursive solutions and avoid excessive computation:

Iterative Solution: Convert simple linear recursions into loops to reduce function call overhead.
Direct Mathematical Formulas: Use a direct formula if available (e.g., Math.pow for future value) for near O(1) efficiency.
Memoization (Top-Down DP): Cache results of subproblems to avoid recomputing them in recursions with overlapping subproblems (turns O(2^n) into O(n) or O(n^2)).
Dynamic Programming (Bottom-Up DP): Solve subproblems iteratively from the base case up, storing results, which is an alternative to memoization for overlapping subproblems.
For your future value problem, the direct formula or an iterative loop are the most effective optimizations.