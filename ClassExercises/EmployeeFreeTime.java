class Solution{
  public List<Interval> employeeFreeTime(List<List<Interval>> schedule){
        List<Interval> result = new ArrayList<>();
        List<Interval> timeline = new ArrayList<>();
        schedule.forEach(e->timeline.addAll(e));
        Collections.sort(timeline,(a,b)->a.start-b.start);

        Interval temp = timeline.get(0);
        for(Interval  curr : timeline){
          if(temp.end<current.start){
            result.add(new Interval(temp.end,curr.start));
            temp = curr;
          }else{
            temp = temp.end<curr.end?curr:temp;
          }
        }
        return result;
  }
}
