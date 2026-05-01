package lowLevelDesign;

import java.util.concurrent.locks.StampedLock;

class Resource{
    int x=0;
    StampedLock lock=new StampedLock();
    int read(){
        long stamp =  lock.tryOptimisticRead();
        int val = x;
        if(!lock.validate(stamp)){
            stamp = lock.readLock();
            try{
                System.out.println("rollback read operation---");
                val=x;
            }finally {
                lock.unlockRead(stamp);
            }
        }
        return val;
    }

    void write(int val){
        long stamp = lock.writeLock();

        try{
            this.x= val;
            System.out.println("write operation---");
        }finally {
            lock.unlockWrite(stamp);
        }
    }
}
public class StampedLockExample {
    public static void main(String[] args){
        Resource resource = new Resource();
        Thread thread1 = new Thread(() -> resource.write(87));
        Thread thread2 = new Thread(() -> {
            System.out.println("thread1 start and read vlaue  " + resource.read());
        });

        thread1.start();
        thread2.start();
    }
}
