package com.company.JavaSourceLearn.sources.JavaUtil.collectionClass.otherClass.timer_test;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Timer
 * @date : 2021-01-11 20:49:41
 */
public class TimerExample1 {
    public static void main(String[] args) {
        // 计时器
        // 构造 创建一个新计时器
        /*
         * public Timer() {
         *         this("Timer-" + serialNumber());
         *     }
         */
        // 创建一个计时器 可以执行是否为守护进程
        /*
         * public Timer(boolean isDaemon) {
         *         this("Timer-" + serialNumber(), isDaemon);
         *     }
         */
        // 指定名称的计时器
        /*
         * public Timer(String name) {
         *         thread.setName(name);
         *         thread.start();
         *     }
         */
        // 指定名称和是否为守护进程
        /*
         * public Timer(String name, boolean isDaemon) {
         *         thread.setName(name);
         *         thread.setDaemon(isDaemon);
         *         thread.start();
         *     }
         */
        // 获取序号
        /*
         * private static int serialNumber() {
         *         return nextSerialNumber.getAndIncrement();
         *     }
         */
        // 在delay毫秒后计划执行任务task
        /*
         * public void schedule(TimerTask task, long delay) {
         *         if (delay < 0)
         *             throw new IllegalArgumentException("Negative delay.");
         *         sched(task, System.currentTimeMillis()+delay, 0);
         *     }
         */
        // 指定Date执行任务task
        /*
         * public void schedule(TimerTask task, Date time) {
         *         sched(task, time.getTime(), 0);
         *     }
         */
        // 在delay毫秒后执行任务task period毫秒后重复执行
        /*
         * public void schedule(TimerTask task, long delay, long period) {
         *         if (delay < 0)
         *             throw new IllegalArgumentException("Negative delay.");
         *         if (period <= 0)
         *             throw new IllegalArgumentException("Non-positive period.");
         *         sched(task, System.currentTimeMillis()+delay, -period);
         *     }
         */
        // firstTime执行task在period毫秒后重复执行
        /*
         * public void schedule(TimerTask task, Date firstTime, long period) {
         *         if (period <= 0)
         *             throw new IllegalArgumentException("Non-positive period.");
         *         sched(task, firstTime.getTime(), -period);
         *     }
         */
        // 以固定时间执行task
        // 从指定的延迟后开始，调度指定的任务以重复执行固定速率。
        // 随后的执行大约每隔固定的时间间隔执行一次，并间隔指定的时间。
        /*
         * public void scheduleAtFixedRate(TimerTask task, long delay, long period) {
         *         if (delay < 0)
         *             throw new IllegalArgumentException("Negative delay.");
         *         if (period <= 0)
         *             throw new IllegalArgumentException("Non-positive period.");
         *         sched(task, System.currentTimeMillis()+delay, period);
         *     }
         */
        // 以固定时间执行task
        // 从指定时间开始安排指定任务以重复执行固定速率。
        // 随后的执行大约每隔固定的时间间隔执行一次，并间隔指定的时间
        /*
         * public void scheduleAtFixedRate(TimerTask task, Date firstTime,
         *                                     long period) {
         *         if (period <= 0)
         *             throw new IllegalArgumentException("Non-positive period.");
         *         sched(task, firstTime.getTime(), period);
         *     }
         */
        // 安排指定的计时器任务在指定的时间以指定的时间（以毫秒为单位）执行。
        // 如果period为正，则计划任务重复执行； 如果period为零，则将任务安排为一次性执行。
        // 时间以Date.getTime（）格式指定。 此方法检查计时器状态，任务状态和初始执行时间，但不检查周期。
        /*
         * private void sched(TimerTask task, long time, long period) {
         *         if (time < 0)
         *             throw new IllegalArgumentException("Illegal execution time.");
         *
         *         // Constrain value of period sufficiently to prevent numeric
         *         // overflow while still being effectively infinitely large.
         *         if (Math.abs(period) > (Long.MAX_VALUE >> 1))
         *             period >>= 1;
         *
         *         synchronized(queue) {
         *             if (!thread.newTasksMayBeScheduled)
         *                 throw new IllegalStateException("Timer already cancelled.");
         *
         *             synchronized(task.lock) {
         *                 if (task.state != TimerTask.VIRGIN)
         *                     throw new IllegalStateException(
         *                         "Task already scheduled or cancelled");
         *                 task.nextExecutionTime = time;
         *                 task.period = period;
         *                 task.state = TimerTask.SCHEDULED;
         *             }
         *
         *             queue.add(task);
         *             if (queue.getMin() == task)
         *                 queue.notify();
         *         }
         *     }
         */
        // 终止此计时器，放弃任何当前计划的任务。
        // 不干扰当前正在执行的任务（如果存在）。
        // 计时器终止后，其执行线程将正常终止，并且无法在其上安排更多任务。
        // 请注意，从此计时器调用的计时器任务的run方法中调用此方法
        // 绝对可以保证正在进行的任务执行是此计时器将执行的最后一个任务执行。
        // 可以重复调用此方法。 第二次及以后的调用无效。
        /*
         * public void cancel() {
         *         synchronized(queue) {
         *             thread.newTasksMayBeScheduled = false;
         *             queue.clear();
         *             queue.notify();  // In case queue was already empty.
         *         }
         *     }
         */
        // 从此计时器的任务队列中删除所有已取消的任务。
        // 调用此方法不会影响计时器的行为，但会从队列中删除对已取消任务的引用。
        // 如果没有外部引用这些任务，则它们有资格进行垃圾回收。
        /*
         * public int purge() {
         *          int result = 0;
         *
         *          synchronized(queue) {
         *              for (int i = queue.size(); i > 0; i--) {
         *                  if (queue.get(i).state == TimerTask.CANCELLED) {
         *                      queue.quickRemove(i);
         *                      result++;
         *                  }
         *              }
         *
         *              if (result != 0)
         *                  queue.heapify();
         *          }
         *
         *          return result;
         *      }
         */
        // 任务队列
        // private final TaskQueue queue = new TaskQueue();
        // 定时器线程
        // private final TimerThread thread = new TimerThread(queue);
        // 当没有实时引用Timer对象且计时器队列中没有任务时，此对象会使计时器的任务执行线程正常退出。
        // 它优先于Timer上的终结器使用，因为这样的终结器将易于子类的终结器忘记调用它。
        /*
         *     private final Object threadReaper = new Object() {
         *         protected void finalize() throws Throwable {
         *             synchronized(queue) {
         *                 thread.newTasksMayBeScheduled = false;
         *                 queue.notify(); // In case queue is empty.
         *             }
         *         }
         *     };
         */
        // 生成定时器的序号
        // private final static AtomicInteger nextSerialNumber = new AtomicInteger(0);
        // helperCLass
        // 实现了计时器的任务执行线程，该线程等待计时器队列上的任务，在它们触发时执行它们，
        // 重新计划重复的任务，并从队列中删除已取消的任务和已花费的非重复任务。
        // TimerThread
        // 构造
        /*
         * TimerThread(TaskQueue queue) {
         *         this.queue = queue;
         *     }
         */
        // 线程run方法
        /*
         * public void run() {
         *         try {
         *             mainLoop();
         *         } finally {
         *             // Someone killed this Thread, behave as if Timer cancelled
         *             synchronized(queue) {
         *                 newTasksMayBeScheduled = false;
         *                 queue.clear();  // Eliminate obsolete references
         *             }
         *         }
         *     }
         */
        // 定时器主循环
        /*
         * private void mainLoop() {
         *         while (true) {
         *             try {
         *                 TimerTask task;
         *                 boolean taskFired;
         *                 synchronized(queue) {
         *                     // Wait for queue to become non-empty
         *                     while (queue.isEmpty() && newTasksMayBeScheduled)
         *                         queue.wait();
         *                     if (queue.isEmpty())
         *                         break; // Queue is empty and will forever remain; die
         *
         *                     // Queue nonempty; look at first evt and do the right thing
         *                     long currentTime, executionTime;
         *                     task = queue.getMin();
         *                     synchronized(task.lock) {
         *                         if (task.state == TimerTask.CANCELLED) {
         *                             queue.removeMin();
         *                             continue;  // No action required, poll queue again
         *                         }
         *                         currentTime = System.currentTimeMillis();
         *                         executionTime = task.nextExecutionTime;
         *                         if (taskFired = (executionTime<=currentTime)) {
         *                             if (task.period == 0) { // Non-repeating, remove
         *                                 queue.removeMin();
         *                                 task.state = TimerTask.EXECUTED;
         *                             } else { // Repeating task, reschedule
         *                                 queue.rescheduleMin(
         *                                   task.period<0 ? currentTime   - task.period
         *                                                 : executionTime + task.period);
         *                             }
         *                         }
         *                     }
         *                     if (!taskFired) // Task hasn't yet fired; wait
         *                         queue.wait(executionTime - currentTime);
         *                 }
         *                 if (taskFired)  // Task fired; run it, holding no locks
         *                     task.run();
         *             } catch(InterruptedException e) {
         *             }
         *         }
         *     }
         */
        // 收割者将此标志设置为false，以通知我们不再有对Timer对象的实时引用。
        // 一旦此标志为true，并且队列中没有其他任务，便没有工作要做，因此我们可以正常终止。
        // 请注意，此字段受队列的监视器保护！
        // boolean newTasksMayBeScheduled = true;
        // 我们的计时器队列。 我们优先于对Timer的引用存储此引用，因此该引用图保持非循环状态。
        // 否则，将永远不会对Timer进行垃圾回收，并且该线程也永远不会消失。
        // private TaskQueue queue;
        // 此类表示计时器任务队列：TimerTasks的优先级队列，在nextExecutionTime上排序。
        // 每个Timer对象都具有其中之一，并与其TimerThread共享。
        // 在内部，此类使用堆，该堆为add，removeMin和rescheduleMin操作提供log（n）性能，
        // 并为getMin操作提供恒定时间性能。
        // TaskQueue
        // 返回当前任务队列的数量
        /*
         * int size() {
         *         return size;
         *     }
         */
        // 添加一个新任务到队列中
        /*
         * void add(TimerTask task) {
         *         // Grow backing store if necessary
         *         if (size + 1 == queue.length)
         *             queue = Arrays.copyOf(queue, 2*queue.length);
         *
         *         queue[++size] = task;
         *         fixUp(size);
         *     }
         */
        // 获取队列首任务
        /*
         * TimerTask getMin() {
         *         return queue[1];
         *     }
         */
        // 获取指定位置的任务 i从1开始
        /*
         * TimerTask get(int i) {
         *         return queue[i];
         *     }
         */
        // 移除队列首任务
        /*
         * void removeMin() {
         *         queue[1] = queue[size];
         *         queue[size--] = null;  // Drop extra reference to prevent memory leak
         *         fixDown(1);
         *     }
         */
        // 从队列中删除第i个元素，而无需考虑保持堆不变性。
        // 回想一下该队列是基于一个的，因此1 <= i <=大小。
        /*
         * void quickRemove(int i) {
         *         assert i <= size;
         *
         *         queue[i] = queue[size];
         *         queue[size--] = null;  // Drop extra ref to prevent memory leak
         *     }
         */
        // 将队列首的下次执行时间设置为指定值
        /*
         * void rescheduleMin(long newTime) {
         *         queue[1].nextExecutionTime = newTime;
         *         fixDown(1);
         *     }
         */
        // 判断任务队列是否为空
        /*
         * boolean isEmpty() {
         *         return size==0;
         *     }
         */
        // 清空队列中的所有元素
        /*
         * void clear() {
         *         // Null out task references to prevent memory leak
         *         for (int i=1; i<=size; i++)
         *             queue[i] = null;
         *
         *         size = 0;
         *     }
         */
        // 假设堆满足不变式，则建立堆不变式（如上所述），
        // 除了可能用k索引的叶子节点（其下一个ExecutionTime小于其父节点的索引）之外。
        // 此方法通过重复“升级”队列[k]（通过与父级交换）来起作用，
        // 直到queue [k]的nextExecutionTime大于或等于其父级。
        /*
         * private void fixUp(int k) {
         *         while (k > 1) {
         *             int j = k >> 1;
         *             if (queue[j].nextExecutionTime <= queue[k].nextExecutionTime)
         *                 break;
         *             TimerTask tmp = queue[j];  queue[j] = queue[k]; queue[k] = tmp;
         *             k = j;
         *         }
         *     }
         */
        // 在以k为根的子树中建立堆不变式（如上所述），
        // 假定除了节点k本身（其nextExecutionTime可能大于其子节点的k）之外，满足堆不变式。
        // 此方法的作用是通过反复地将“ queue [k]降级”到层次结构下（通过与其较小的子代交换），
        // 直到queue [k]的nextExecutionTime小于或等于其子代的时间。
        /*
         * private void fixDown(int k) {
         *         int j;
         *         while ((j = k << 1) <= size && j > 0) {
         *             if (j < size &&
         *                 queue[j].nextExecutionTime > queue[j+1].nextExecutionTime)
         *                 j++; // j indexes smallest kid
         *             if (queue[k].nextExecutionTime <= queue[j].nextExecutionTime)
         *                 break;
         *             TimerTask tmp = queue[j];  queue[j] = queue[k]; queue[k] = tmp;
         *             k = j;
         *         }
         *     }
         */
        // 在整个树中建立堆不变式（如上所述），不假设调用之前元素的顺序
        /*
         * void heapify() {
         *         for (int i = size/2; i >= 1; i--)
         *             fixDown(i);
         *     }
         */
        // 任务队列
        // private TimerTask[] queue = new TimerTask[128];
        // 队列中的任务数
        // private int size = 0;
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时器执行了"+System.currentTimeMillis());
            }
        };
//        timer.schedule(timerTask,100L,1000L);
        timer.schedule(timerTask,100L);
    }
}
