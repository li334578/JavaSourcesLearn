synchronized 不能用String常量和基础的数据类型

volatile 保证线程可见性 禁止指令重排序
MESI(CPU的缓存一致性协议)
new Object() 1.申请内存(值为默认值) 2.赋值 3.对象指向该内存地址

loadfence 原语指令 读屏障
storefence 原语指令 写屏障

CAS(无锁优化)
compare and set swap

cas(V,Expected,NewValue)
CPU原语支持 不能被打断

ABA问题 A->B->A 加个version
基础类型无所谓

你的前对象跟你复合 中间经历了n个别人

Unsafe
直接操作内存
 allocateMemory putXX freeMemory pageSize
 
直接生成类的实例
 allocateInstance
直接操作类或者实例变量
 objectFieldOffset
 getInt
 getObject
CAS相关操作
 weakCompareAndSetObject Int Long
 
c -> malloc free c++ -> new delete
Java -> Unsafe allocateMemory() freeMemory()


公平锁 默认会到队列中等待不会抢占
非公平锁 会抢占

ReentrantLock vs synchronized
  cas vs sync
  trylock
  lockinterupptibly
  可以设定公平锁还是非公平锁
semaphore 限流
  (通行证,拿到通行证的线程才可以执行)