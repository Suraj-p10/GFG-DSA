<h2><a href="https://www.geeksforgeeks.org/problems/smallest-subset-with-greater-sum/1">Smallest Subset with Greater Sum</a></h2><h3>Difficulty Level : Difficulty: Easy</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 14pt;">You are given an array <strong><code>arr[]</code></strong> containing non-negative integers. Your task is to select the minimum number of elements such that the sum of the selected elements is greater than the sum of the remaining elements in the array.</span></p>
<p><span style="font-size: 14pt;"><strong>Examples:</strong></span></p>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [2, 17, 7, 3]
<strong>Output: </strong>1
<strong>Explanation: </strong>By selecting only the element <code>17</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">, the sum of the remaining elements is </span><code>2 + 3 + 7 = 12</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">, which is less than </span><code>17</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">. Thus, the minimum number of elements required is </span><code>1</code><span style="font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, Cantarell, 'Open Sans', 'Helvetica Neue', sans-serif;">.</span></span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [20, 12, 18, 4]
<strong>Output: </strong>2
<strong>Explanation: </strong>By selecting <code>12</code> and <code>18</code>, their sum becomes <code>12 + 18 = 30</code>, which is greater than the sum of the remaining elements <code>20 + 4 = 24</code>. Alternatively, selecting <code>20</code> and <code>18</code> would also satisfy the condition. Thus, the minimum number of elements required is <code>2</code>.</span></pre>
<pre><span style="font-size: 14pt;"><strong>Input: </strong>arr[] = [1, 1, 1, 1, 10]
<strong>Output: </strong>1
<strong>Explanation: </strong>Selecting only the element 10 gives a sum of 10, which is greater than the sum of the remaining elements (1 + 1 + 1 + 1 = 4). Therefore, the minimum number of elements required is 1.</span></pre>
<p><span style="font-size: 14pt;"><strong>Constraints:</strong><br>1 &lt;= arr.size() &lt;= 10<sup>5</sup><br>1 &lt;= arr[i] &lt;= 10<sup>4</sup><br></span></p></div><br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Arrays</code>&nbsp;<code>Greedy</code>&nbsp;<code>Sorting</code>&nbsp;<code>Data Structures</code>&nbsp;<code>Algorithms</code>&nbsp;