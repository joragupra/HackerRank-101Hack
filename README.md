HackerRank-101Hack
==================

Common Child (30 points)
------------------------

Given two strings a and b of equal length, what’s the longest string (S) that can be constructed such that S is a child to both a and b.

String x is said to be a child of string y if x can be formed by deleting 0 or more characters from y

Input format

Two strings a and b with a newline separating them

Constraints

All characters are upper-cased and lie between ascii values 65-90 The maximum length of the strings is 5000

Output format

Length of the string S

Sample Input #0

HARRY
SALLY

Sample Output #0

2

The longest possible subset of characters that is possible by deleting zero or more characters from HARRY and SALLY is AY, whose length is 2.

Sample Input #1

AA
BB

Sample Output #1

0

AA and BB has no characters in common and hence the output 0

Similar Pair (50 points)
------------------------

You are given a tree where each node is labeled from 1, 2, …, n. How many similar pairs(S) are there in this tree?

A pair (A,B) is a similar pair iff

    node A is the ancestor of node B
    abs(A - B) <= T.

Input format:
The first line of the input contains two integers n and T. This is followed by n-1 lines each containing two integers si and ei where node si is a parent to node ei.

Output format:
Output a single integer which denotes the number of similar pairs in the tree

Constraints:

1 <= n <= 100000
0 <= T <= n
1 <= si, ei <= n.

Sample Input:

5 2
3 2
3 1
1 4
1 5

Sample Output:

4

Explanation:
The similar pairs are: (3, 2) (3, 1) (3, 4) (3, 5)
