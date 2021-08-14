#300 Must do Coding Interview Questions

Link to the question: https://www.interviewbit.com/problems/gas-station/#

Question featured in the following companies:
* GOOGLE
* FLIPKART
* DESHAW
* AMAZON
* BLOOMBERG

Explanation to solution under solution.java:

We start at distance 0, and at each station(index) we get the distance to next station(index) and the fuel available at the current station.
we get the add the value of fuel to distance and then reduce the cost to next station.
when the value of distance<0, then the particular start node is unfit. Int this fashion, we iterate the indexes to find the soltion.

Time complexity: O(N^2). Space Complexity: O(N)


Lesson learned:
By checking the forum discussion, there seems to a solution with much better complexity O(N) which lies on a much more simpler logic.

Let's say, in the above logic while starting the node 1 as the starting point and I find the fuel accumalted until point 4, is not enough to cross 5, then naturally
points 2,3,4 cannot be ths start point. we can straight away assume the point has to be from 5. In this way, we can elimate the first iterator in the above solution
which maintains the state of the starting point.

Time complexity: O(N).

