package Thread;

import java.util.Timer;
import java.util.TimerTask;

public class TimeTask {   
   
    public static void main(String[] args) { 
       for (int h = 0; h < 24; h++) {
			
			for(int m = 0; m < 60; m++) {
				
				for(int s = 1; s < 60; s++) {
					System.out.println(h+"小时" +m+"分钟" +s+"秒" );
					

					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		
	
		}
	
	

    	
    	
    	
        TimeTask tTask=new TimeTask();
        tTask.timeVoid();
}
    
    public void timeVoid(){
        final Timer timer = new Timer();
        TimerTask tt=new TimerTask() { 
            @Override
            public void run() {
                System.out.println("到点啦！");
                timer.cancel();
            }
        };
        timer.schedule(tt, 3000);
    }
}