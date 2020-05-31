package practice;

public class PingPong extends Thread {
    private String word;  // what word to print
    private int delay;    // how long to pause (in milliseconds)
  
    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public synchronized void run() {
        try {
            for (;;) {
                System.out.print(word + " ");
                sleep(delay);   // pause before printing next word
            }
        } catch (InterruptedException e) {
            return;   // end this thread
        }
    }

    public static void main(String[] args) {
        new PingPong("ping",  33).start();  // 1/30 second
        new PingPong("PONG", 100).start();  // 1/10 second
      
    }
}

