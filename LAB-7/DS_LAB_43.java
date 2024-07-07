/*Given a set of time intervals in any order, our task is to merge all overlapping 
intervals into one and output the result which should have only mutually 
exclusive intervals
 Input: Intervals = {{1,3},{2,4},{6,8},{9,10}}
oOutput: {{1, 4}, {6, 8}, {9, 10}}
oExplanation: Given intervals: [1,3],[2,4],[6,8],[9,10], we have only 
two overlapping intervals here,[1,3] and [2,4]. Therefore we will 
merge these two and return [1,4],[6,8], [9,10]
 Input: Intervals = {{6,8},{1,9},{2,4},{4,7}}
oOutput: {{1, 9}} */

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

class Interval {
	int start, end;

	Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class DS_LAB_43 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of intervals: ");
		int n = sc.nextInt();
		Interval intervals[] = new Interval[n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter the start of interval " + (i+1) + ": ");
			int start = sc.nextInt();
			System.out.println("Enter the end of interval " + (i+1) + ": ");
			int end = sc.nextInt();
			intervals[i] = new Interval(start, end);
		}
		mergeIntervals(intervals);
		sc.close();
	}

	// The main function that takes a set of intervals,
	// merges overlapping intervals and prints the result
	public static void mergeIntervals(Interval intervals[]) {
		// Test if the given set has at least one interval
		if (intervals.length <= 0)
			return;

		// Create an empty stack of intervals
		Stack<Interval> stack = new Stack<>();

		// sort the intervals in increasing order of start
		// time
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval i1, Interval i2) {
				return i1.start - i2.start;
			}
		});

		// push the first interval to stack
		stack.push(intervals[0]);

		// Start from the next interval and merge if
		// necessary
		for (int i = 1; i < intervals.length; i++) {
			// get interval from stack top
			Interval top = stack.peek();

			// if current interval is not overlapping with
			// stack top, push it to the stack
			if (top.end < intervals[i].start)
				stack.push(intervals[i]);

			// Otherwise update the ending time of top if
			// ending of current interval is more
			else if (top.end < intervals[i].end) {
				top.end = intervals[i].end;
				stack.pop();
				stack.push(top);
			}
		}

		// Print contents of stack
		System.out.print("The Merged Intervals are: ");
		while (!stack.isEmpty()) {
			Interval t = stack.pop();
			System.out.print("[" + t.start + "," + t.end+ "] ");
		}
	}
}