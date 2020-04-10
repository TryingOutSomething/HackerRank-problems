# Problem:

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

1. If the book is returned on or before the expected return date, no fine will be charged (i.e.: ***fine* = 0**).
2. If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, ***fine* = 15 Hackos X (the number of days late)**.
3. If the book is returned after the expected return month but still within the same calendar year as the expected return date, the ***fine* = 500 Hackos X (the number of months late)**.

4. If the book is returned after the calendar year in which it was expected, there is a fixed fine of **10000 Hackos**.

Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be **10000 Hackos**.

**Function Description**

Complete the libraryFine function in the editor below. It must return an integer representing the fine due.

libraryFine has the following parameter(s):

* d1, m1, y1: returned date day, month and year
* d2, m2, y2: due date day, month and year

<a href="https://www.hackerrank.com/challenges/library-fine/problem" target="_blank">Click here to view the question on HackerRank!</a>