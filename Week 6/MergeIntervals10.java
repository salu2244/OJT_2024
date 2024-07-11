import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MergeIntervals10 {
    public static class Interval {
        int start;
        int end;
        
        public Interval() {
            start = 0;
            end = 0;
        }
        
        public Interval(int s, int e) {
            start = s;
            end = e;
        }
    }
    
    public static class Solution {
        public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
            if (intervals == null || intervals.size() <= 1)
                return intervals;
            
            // Sort intervals by start time using a comparator
            Collections.sort(intervals, new IntervalComparator());
            
            ArrayList<Interval> result = new ArrayList<>();
            Interval prev = intervals.get(0);
            
            for (int i = 1; i < intervals.size(); i++) {
                Interval curr = intervals.get(i);
                
                if (prev.end >= curr.start) {
                    // Merge intervals
                    Interval merged = new Interval(prev.start, Math.max(prev.end, curr.end));
                    prev = merged; // Update previous interval to merged interval
                } else {
                    result.add(prev); // Add previous interval to result
                    prev = curr; // Update previous interval to current interval
                }
            }
            
            result.add(prev); // Add the last interval
            
            return result;
        }
    }
    
    static class IntervalComparator implements Comparator<Interval> {
        public int compare(Interval i1, Interval i2) {
            return i1.start - i2.start;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        Solution solution = new Solution();
        ArrayList<Interval> mergedIntervals = solution.merge(intervals);

        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
