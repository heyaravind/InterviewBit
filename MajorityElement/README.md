#300 Must do Coding Interview Questions - InterviewBit(https://www.interviewbit.com/coding-interview-questions/)

Link to the question is here (https://www.interviewbit.com/problems/majority-element/)

Question featured in the following companies:

MICROSOFT

YAHOO

GOOGLE

AMAZON

Explanation to solution under solution.java:

We create an hashmap where we store the number in the List along with the occurrence. We iterate the initial list and check if it present in the hashmap. If it already present, then we get the value and increment by 1, or else we insert the number in the hashmap with the value being 1.

Later once we are done iterating the List, we iterate the hashmap to get the max number and also check if the occurrence is greater than n/2. Then the max value is returned from the iteration.

Time complexity: O(N). Space Complexity: O(N)

Lesson learned:

Much simpler solution is to convert the given List to Collection and use collections.sort() to sort the list and get the value of collection.size()/2 from the collection.

