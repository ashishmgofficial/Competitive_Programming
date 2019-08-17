# Competitive_Programming
Solutions to some of the competitive programming Problems

# 1 .Coolness of a Number Problem from HackerRank

For a number X, let its "Coolness" be defined as the number of "101"s occurring in its binary representation. For example, the number 21 has Coolness 2, since its binary representation is 101012, and the string "101" occurs twice in this representation.

A number is defined as Very Cool if its Coolness is greater than or equal to K. Please, output the number of Very Cool integers between 1 and R.

Input:
The first line contains an integer T, the number of test cases.
The next T lines contains two space-separated integers, R and K.
Output:
Output T lines, the answer for each test case.
Constraints:
1<=T<=100
1<=R<=105
1<=K<=100

# 2 . New Year Chaos Problem from HackerRank

It's New Year's Day and everyone's in line for the Wonderland rollercoaster ride! There are a number of people queued up, and each person wears a sticker indicating their initial position in the queue. Initial positions increment by  from  at the front of the line to  at the back.

Any person in the queue can bribe the person directly in front of them to swap positions. If two people swap positions, they still wear the same sticker denoting their original places in line. One person can bribe at most two others. For example, if and  bribes , the queue will look like this: .

Fascinated by this chaotic queue, you decide you must know the minimum number of bribes that took place to get the queue into its current state!

Function Description

Complete the function minimumBribes in the editor below. It must print an integer representing the minimum number of bribes necessary, or Too chaotic if the line configuration is not possible.

minimumBribes has the following parameter(s):

q: an array of integers
Input Format

The first line contains an integer , the number of test cases.

Each of the next  pairs of lines are as follows:
- The first line contains an integer , the number of people in the queue
- The second line has  space-separated integers describing the final state of the queue.

Constraints

Subtasks

For  score
For  score

Output Format

Print an integer denoting the minimum number of bribes needed to get the queue into its final state. Print Too chaotic if the state is invalid, i.e. it requires a person to have bribed more than  people.
