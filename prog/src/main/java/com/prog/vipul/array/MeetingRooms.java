package com.prog.vipul.array;

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

public class MeetingRooms {

	public static void main(String[] args) {

		// https://www.geeksforgeeks.org/find-maximum-meetings-in-one-room/
		// https://www.interviewbit.com/problems/meeting-rooms/
		// https://www.youtube.com/watch?v=i2bBG7CaVxs

		Interval i1 = new Interval(0, 30);
		Interval i2 = new Interval(5, 10);
		Interval i3 = new Interval(15, 20);

		Interval[] intervals = { i1, i2, i3 };

		// int[][] A = { { 0, 30 }, { 5, 10 }, { 15, 20 } };

		// Problem 1 : Given an array of meetings time intervals consisting of start and
		// end times. Determine if a person could attend all the meetings
		boolean canAttendMeetings = canAttendMeetings(intervals);
		System.out.println(canAttendMeetings);
		
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

		return rooms;
	}

	public static boolean canAttendMeetings(Interval[] intervals) {
		if (intervals == null) {
			return false;
		}

		// Sort the intervals by start time
		Arrays.sort(intervals, new Comparator<Interval>() {
			public int compare(Interval a, Interval b) {
				return a.start - b.start;
			}
		});

		for (int i = 1; i < intervals.length; i++) {
			if (intervals[i].start < intervals[i - 1].end) {
				return false;
			}
		}

		return true;
	}
}
