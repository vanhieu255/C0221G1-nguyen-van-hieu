package bai_tap;

import java.util.Arrays;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
//        this.startTime = System.currentTimeMillis();
//
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
    public long stop(){
        this.endTime=System.currentTimeMillis();
        return this.endTime;

    }
    public long start(){
       this.startTime=System.currentTimeMillis();
       return this.startTime;
    }

    public long getElapsedTime(){
        return endTime-startTime;
    }


    public static void main(String[] args) {
        StopWatch a=new StopWatch();

        int[] arr=new int[100000];
        for(int i=0;i<100000;i++){
            arr[i]=(int)(Math.random()*1000);
        }
        a.start();
        System.out.println(a.start());
        Arrays.sort(arr);
        a.stop();
        System.out.println("hien thi thoi gian tieu ton "+a.getElapsedTime());


    }

}
