import java.util.ArrayList;

// Definition for an interval
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

public class InsertInterval11 {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();

        // Iterate through each interval in the list
        for (Interval interval : intervals) {
            // If newInterval's end is less than current interval's start, no overlap
            if (interval.end < newInterval.start) {
                result.add(interval);
            }
            // If newInterval's start is greater than current interval's end, no overlap
            else if (interval.start > newInterval.end) {
                result.add(newInterval);
                newInterval = interval; // Update newInterval to current interval
            }
            // If there is overlap, merge intervals
            else if (interval.end >= newInterval.start || interval.start <= newInterval.end) {
                newInterval = new Interval(
                    Math.min(interval.start, newInterval.start),
                    Math.max(newInterval.end, interval.end)
                );
            }
        }

        result.add(newInterval); // Add the last merged interval or newInterval itself

        return result;
    }

    public static void main(String[] args) {
        InsertInterval11 solution = new InsertInterval11();

        // Example usage
        ArrayList<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(6, 9));
        Interval newInterval = new Interval(2, 5);

        ArrayList<Interval> mergedIntervals = solution.insert(intervals, newInterval);

        // Output the merged intervals
        for (Interval interval : mergedIntervals) {
            System.out.println("[" + interval.start + ", " + interval.end + "]");
        }
    }
}
