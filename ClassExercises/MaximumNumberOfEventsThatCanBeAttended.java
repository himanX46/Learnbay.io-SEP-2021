class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events,(o1,o2)->o1[0]-o2[0]);
        int d=0,res=0,i=0,n=events.length;
        //keep track of end times
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        while(!pq.isEmpty()||i<n){
            if(pq.isEmpty())
                d=events[i][0];
            while(i<n && events[i][0]<=d)
                pq.add(events[i++][1]);
            d++;
            res++;
            pq.poll();
            while(!pq.isEmpty()&&pq.peek()<d)
                pq.poll();
        }
        return res;
    }
}
