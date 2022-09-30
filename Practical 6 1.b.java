//Created By 21CE129 Moxshang Shah

// Write a program to create thread which display “Hello World” message.
// A. by extending Thread class
// B. by using Runnable interface.


class MyThread1 implements Runnable{
    
    public void run()
    {
        try {
                System.out.println("Hello World 1 "+Thread.currentThread().getName());
        } catch (Exception e) {
            System.out.println("Exception Occured");
        }
    }
}
public class PR_6_1_2 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        Thread t = new Thread(t1);
        t.run();
    }
}
