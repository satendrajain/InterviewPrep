package com.prog.vipul.dp;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
	int start;
	int end;

	Interval() {
		start = 0;
		end = 0;
	}

	Interval(int s, int e) {
		start = s;
		end = e;
	}
}

public class MaxLengthChainOfPairs {

	public static void main(String[] args) {

		// This problem is similar to meeting rooms problem

		// https://www.geeksforgeeks.org/find-maximum-meetings-in-one-room/
		// https://www.interviewbit.com/problems/meeting-rooms/
		// https://www.youtube.com/watch?v=i2bBG7CaVxs

		Interval i1 = new Interval(5, 24);
		Interval i2 = new Interval(15, 25);
		Interval i3 = new Interval(27, 40);
		Interval i4 = new Interval(50, 60);

		Interval[] intervals = { i1, i2, i3, i4 };

		// Problem 2 : Given an array of meetings time intervals consisting of start and
		// end times. Determine number of conference rooms required.
		int numMeetings = minMeetingRooms(intervals);
		System.out.println(numMeetings);

	}

	public static int minMeetingRooms(Interval[] intervals) {
		int[] starts = new int[intervals.length];
		int[] ends = new int[intervals.length];

		for (int i = 0; i < intervals.length; i++) {
			starts[i] = intervals[i].start;
			ends[i] = intervals[i].end;
		}

		Arrays.sort(starts);
		Arrays.sort(ends);

		int rooms = 0;
		int endsItr = 0;

		for (int i = 0; i < starts.length; i++) {
			if (starts[i] < ends[endsItr]) {
				rooms++;
			} else {
				endsItr++;
			}
		}

		return endsItr+1;
	}

}
