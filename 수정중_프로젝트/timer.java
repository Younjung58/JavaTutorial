package 수정중_프로젝트;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
    public static void main(String[] args) {
    	long start = System.currentTimeMillis();
    	long end = start + 40*1000;
    	for (; System.currentTimeMillis() < end; ) {
    		if((System.currentTimeMillis()-start)%10==0)
    			System.out.println("안녕");
		}
//    	Timer time = new Timer();
//    	TimerTask task=new TimerTask(){
//		    @Override
//		    public void run() {
//		    //TODO Auto-generated method stub
//				if(count <= 10){ //count값이 10보다 작거나 같을때까지 수행
//					System.out.println("[카운트다운 : "+count+"]");
//					count++; //실행횟수 증가 
//				}
//				else{
//					timer.cancel(); //타이머 종료
//					System.out.println("[카운트다운 : 종료]");
//				}
//		    }	
//		};
//		time.schedule(System.out.println("안녕"), 1*1000, end);
    }
}