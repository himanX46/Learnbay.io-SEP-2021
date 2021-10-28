package Learnbay;

import java.util.Arrays;

public class MeetingRooms2 {
    public static void main(String[] args) {
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(minMeetingRooms(intervals));
    }

    public static int minMeetingRooms(int[][] intervals){
        int[] start = new int[intervals.length];
        int[] end = new int[intervals.length];

        for(int i=0;i< intervals.length;i++){
            start[i] = intervals[i][0];
            end[i] = intervals[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);

        int rooms = 0, endPtr = 0;
        for(int st=0;st<start.length;st++){
            if(start[st]<end[endPtr])
                rooms++;
            else
                endPtr++;
        }
        return rooms;
    }
}
