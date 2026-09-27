/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        Interval prev = new Interval(-1, -1);

        if (intervals == null) {
            return false;
        }
        Collections.sort(intervals, Comparator.comparingInt(i -> i.start));
        for (Interval interval : intervals) {
            if (prev.start != -1 && prev.end != -1 && interval.start < prev.end) {
                return false;
            }
            prev.start = interval.start;
            prev.end = interval.end;
        }
        return true;
    }
}
