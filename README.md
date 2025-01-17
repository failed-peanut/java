# Experiments with Java

### Given a string find the distinct characters in it and count it. 
```java
Input:  DISTINCT
Output: DSNC 4
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/DistinctCharactersWithCount.java)

---
### Given a sorted array arr of distinct integers,return the lowest index i for which arr[i] == i. Return null if there is no such index.

```java
given the array [-5, -3, 2, 3], return 2 since arr[2] == 2 .
Even though arr[3] == 3, we return 2 since it's the lowest index.
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/LowestIndex.java)

---
### Given a list of strictly positive integers,partition the list into 3 contiguous partitions which each sum up to the same value.If not possible, return null.

```java
given the array [3, 5, 8, 0, 8]
Return the following 3 partitions:
[[3, 5],
 [8, 0],
 [8]]
Which each add up to 8.
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/IntegerListInto3ContiguousPartition.java)

---
### Given a string, find the longest palindromic contiguous substring. If there are more than one with the maximum length, return any one.

```java
The longest palindromic substring of "aabcdcb" is "bcdcb". 
The longest palindromic substring of "bananas" is "anana".
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/PalindromeSubString.java)

---
### Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.

```java
if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Follow-up: what if you can't use division?
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/ProductOfAllNumbers.java)

---
### Reverse a singly linked list.

```java
Input : 1->2->3->4->NULL
Output: 4->3->2->1->NULL
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/ReverseSinglyLinkedList.java)

---
### Given two strings A and B, return whether or not A can be shifted some number of times to get B.

```java
If A is abcde and B is cdeab, return true. 
If A is abc and B is acb, return false.
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/ShiftCharacter.java)

---
### Given a list of numbers L, implement a method sum(i, j) which returns the sum from the sublist L[i:j] (including i, excluding j).

```java
For example, given L = [1, 2, 3, 4, 5], sum(1, 3) should return sum([2, 3]), which is 5.
You can assume that you can do some pre-processing. 
sum() should be optimized over the pre-processing step.
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/SumSubList.java)

---
### Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.Return the number of clumps in the given array.

```java
For example, countClumps([1, 2, 2, 3, 4, 4]) -> 2
countClumps([1, 1, 2, 1, 1]) -> 2
countClumps([1, 1, 1, 1, 1]) -> 1
```
[code](https://github.com/failedpeanut/Java/blob/main/failedpeanut/src/com/failedpeanut/Clumps.java)

---
> **_NOTE:_** <br />
1. The above solution is not the only way to approach the
problem.<br />
2. Practice,Practice,Practice,Practice... than copying code and executing.<br />
3. There are ‘N’ number of ways to solve the issue.<br />
4. Comments and Suggestions are always welcome. *failedpeanut@gmail.com*

