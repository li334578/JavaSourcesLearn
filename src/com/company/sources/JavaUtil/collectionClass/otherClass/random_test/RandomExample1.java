package com.company.sources.JavaUtil.collectionClass.otherClass.random_test;

import java.util.Random;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Random
 * @date : 2021-01-11 21:35:18
 */
public class RandomExample1 {
    public static void main(String[] args) {
        // implements java.io.Serializable
        // 内部类
        // RandomIntsSpliterator
        // 用于int流的分隔符。
        // 通过将小于原点的界限视为无界，并通过将“无限”等同于Long.MAX_VALUE，
        // 将四个int版本复用为一个类。
        // 对于拆分，它使用标准的二分法。 此类的long和double版本相同，除了类型不同
        // 构造
        /*
         * RandomIntsSpliterator(Random rng, long index, long fence,
         *                               int origin, int bound) {
         *             this.rng = rng; this.index = index; this.fence = fence;
         *             this.origin = origin; this.bound = bound;
         *         }
         */
        // 分离
        /*
         * public RandomIntsSpliterator trySplit() {
         *             long i = index, m = (i + fence) >>> 1;
         *             return (m <= i) ? null :
         *                    new RandomIntsSpliterator(rng, i, index = m, origin, bound);
         *         }
         */
        // 预计大小
        /*
         * public long estimateSize() {
         *             return fence - index;
         *         }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (Spliterator.SIZED | Spliterator.SUBSIZED |
         *                     Spliterator.NONNULL | Spliterator.IMMUTABLE);
         *         }
         */
        // 遍历消费
        /*
         * public boolean tryAdvance(IntConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 consumer.accept(rng.internalNextInt(origin, bound));
         *                 index = i + 1;
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 遍历元素执行消费
        /*
         * public void forEachRemaining(IntConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 index = f;
         *                 Random r = rng;
         *                 int o = origin, b = bound;
         *                 do {
         *                     consumer.accept(r.internalNextInt(o, b));
         *                 } while (++i < f);
         *             }
         *         }
         */
        // final Random rng; 随机数
        // long index; 索引
        // final long fence; 围栏
        // final int origin; 原点
        // final int bound; 界限
        // RandomLongsSpliterator
        // 构造方法
        /*
         * RandomLongsSpliterator(Random rng, long index, long fence,
         *                                long origin, long bound) {
         *             this.rng = rng; this.index = index; this.fence = fence;
         *             this.origin = origin; this.bound = bound;
         *         }
         */
        // 分离器
        /*
         * public RandomLongsSpliterator trySplit() {
         *             long i = index, m = (i + fence) >>> 1;
         *             return (m <= i) ? null :
         *                    new RandomLongsSpliterator(rng, i, index = m, origin, bound);
         *         }
         */
        // 预估容量
        /*
         * public long estimateSize() {
         *             return fence - index;
         *         }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (Spliterator.SIZED | Spliterator.SUBSIZED |
         *                     Spliterator.NONNULL | Spliterator.IMMUTABLE);
         *         }
         */
        // 遍历元素执行consumer
        /*
         * public boolean tryAdvance(LongConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 consumer.accept(rng.internalNextLong(origin, bound));
         *                 index = i + 1;
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 遍历元素执行consumer
        /*
         * public void forEachRemaining(LongConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 index = f;
         *                 Random r = rng;
         *                 long o = origin, b = bound;
         *                 do {
         *                     consumer.accept(r.internalNextLong(o, b));
         *                 } while (++i < f);
         *             }
         *         }
         */
        // final Random rng; 随机数
        // long index; 索引
        // final long fence; 栅栏
        // final long origin; 原点
        // final long bound; 界限
        // RandomDoublesSpliterator
        // 构造
        /*
         * RandomDoublesSpliterator(Random rng, long index, long fence,
         *                                  double origin, double bound) {
         *             this.rng = rng; this.index = index; this.fence = fence;
         *             this.origin = origin; this.bound = bound;
         *         }
         */
        // 分离
        /*
         * public RandomDoublesSpliterator trySplit() {
         *             long i = index, m = (i + fence) >>> 1;
         *             return (m <= i) ? null :
         *                    new RandomDoublesSpliterator(rng, i, index = m, origin, bound);
         *         }
         */
        // 预计容量
        /*
         * public long estimateSize() {
         *             return fence - index;
         *         }
         */
        // 特点
        /*
         * public int characteristics() {
         *             return (Spliterator.SIZED | Spliterator.SUBSIZED |
         *                     Spliterator.NONNULL | Spliterator.IMMUTABLE);
         *         }
         */
        // 遍历元素执行consumer
        /*
         * public boolean tryAdvance(DoubleConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 consumer.accept(rng.internalNextDouble(origin, bound));
         *                 index = i + 1;
         *                 return true;
         *             }
         *             return false;
         *         }
         */
        // 遍历元素执行consumer
        /*
         * public void forEachRemaining(DoubleConsumer consumer) {
         *             if (consumer == null) throw new NullPointerException();
         *             long i = index, f = fence;
         *             if (i < f) {
         *                 index = f;
         *                 Random r = rng;
         *                 double o = origin, b = bound;
         *                 do {
         *                     consumer.accept(r.internalNextDouble(o, b));
         *                 } while (++i < f);
         *             }
         *         }
         */
        // 静态代码块
        /*
         * static {
         *     try {
         *         seedOffset = unsafe.objectFieldOffset
         *             (Random.class.getDeclaredField("seed"));
         *     } catch (Exception ex) { throw new Error(ex); }
         * }
         */
        // 创建一个新的随机数生成器。
        // 该构造函数将随机数生成器的种子设置为一个很有可能与该构造函数的其他调用不同的值。
        /*
         * public Random() {
         *         this(seedUniquifier() ^ System.nanoTime());
         *     }
         */
        // 使用单个long种子创建一个新的随机数生成器。
        // 种子是伪随机数生成器内部状态的初始值，该值由next方法维护。
        /*
         * public Random(long seed) {
         *         if (getClass() == Random.class)
         *             this.seed = new AtomicLong(initialScramble(seed));
         *         else {
         *             // subclass might have overriden setSeed
         *             this.seed = new AtomicLong();
         *             setSeed(seed);
         *         }
         *     }
         */
        // 种子统一符
        /*
         * private static long seedUniquifier() {
         *         // L'Ecuyer, "Tables of Linear Congruential Generators of
         *         // Different Sizes and Good Lattice Structure", 1999
         *         for (;;) {
         *             long current = seedUniquifier.get();
         *             long next = current * 181783497276652981L;
         *             if (seedUniquifier.compareAndSet(current, next))
         *                 return next;
         *         }
         *     }
         */
        // 初始化争夺
        /*
         * private static long initialScramble(long seed) {
         *         return (seed ^ multiplier) & mask;
         *     }
         */
        // 设置种子
        /*
         * synchronized public void setSeed(long seed) {
         *         this.seed.set(initialScramble(seed));
         *         haveNextNextGaussian = false;
         *     }
         */
        // 生成下一个伪随机数。 子类应覆盖此方法，因为所有其他方法都使用此方法。
        // next的一般约定是，它返回一个int值，并且如果参数bits在1到32 （含）之间，
        // 则返回值的许多低位将（大约）是独立选择的位值，每个位值（近似）相等地为0或1 。
        /*
         * protected int next(int bits) {
         *         long oldseed, nextseed;
         *         AtomicLong seed = this.seed;
         *         do {
         *             oldseed = seed.get();
         *             nextseed = (oldseed * multiplier + addend) & mask;
         *         } while (!seed.compareAndSet(oldseed, nextseed));
         *         return (int)(nextseed >>> (48 - bits));
         *     }
         */
        // 生成随机字节并将其放入用户提供的字节数组中。 产生的随机字节数等于字节数组的长度
        /*
         * public void nextBytes(byte[] bytes) {
         *         for (int i = 0, len = bytes.length; i < len; )
         *             for (int rnd = nextInt(),
         *                      n = Math.min(len - i, Integer.SIZE/Byte.SIZE);
         *                  n-- > 0; rnd >>= Byte.SIZE)
         *                 bytes[i++] = (byte)rnd;
         *     }
         */
        // LongStream Spliterators使用的nextLong形式。
        // 如果origin大于bound，则充当nextLong的无界形式，否则充当有界形式。
        /*
         * final long internalNextLong(long origin, long bound) {
         *         long r = nextLong();
         *         if (origin < bound) {
         *             long n = bound - origin, m = n - 1;
         *             if ((n & m) == 0L)  // power of two
         *                 r = (r & m) + origin;
         *             else if (n > 0L) {  // reject over-represented candidates
         *                 for (long u = r >>> 1;            // ensure nonnegative
         *                      u + m - (r = u % n) < 0L;    // rejection check
         *                      u = nextLong() >>> 1) // retry
         *                     ;
         *                 r += origin;
         *             }
         *             else {              // range not representable as long
         *                 while (r < origin || r >= bound)
         *                     r = nextLong();
         *             }
         *         }
         *         return r;
         *     }
         */
        // ntStream分隔器使用的nextInt形式。
        // 对于无限制的情况：使用nextInt（）。
        // 对于范围可表示的有界情况：使用nextInt（int bound）对于范围不可表示的有界情况：使用nextInt（）
        /*
         * final int internalNextInt(int origin, int bound) {
         *         if (origin < bound) {
         *             int n = bound - origin;
         *             if (n > 0) {
         *                 return nextInt(n) + origin;
         *             }
         *             else {  // range not representable as int
         *                 int r;
         *                 do {
         *                     r = nextInt();
         *                 } while (r < origin || r >= bound);
         *                 return r;
         *             }
         *         }
         *         else {
         *             return nextInt();
         *         }
         *     }
         */
        // DoubleStream分隔器使用的nextDouble形式。
        /*
         * final double internalNextDouble(double origin, double bound) {
         *         double r = nextDouble();
         *         if (origin < bound) {
         *             r = r * (bound - origin) + origin;
         *             if (r >= bound) // correct for rounding
         *                 r = Double.longBitsToDouble(Double.doubleToLongBits(bound) - 1);
         *         }
         *         return r;
         *     }
         */
        // 返回下一个伪随机数，它是此随机数生成器序列中均匀分布的int值
        /*
         * public int nextInt() {
         *         return next(32);
         *     }
         */
        // 返回一个伪随机数，它从此随机数生成器的序列中得出，
        // 其int值均匀地分布在0（含）和指定值（不含）之间
        /*
         * public int nextInt(int bound) {
         *         if (bound <= 0)
         *             throw new IllegalArgumentException(BadBound);
         *
         *         int r = next(31);
         *         int m = bound - 1;
         *         if ((bound & m) == 0)  // i.e., bound is a power of 2
         *             r = (int)((bound * (long)r) >> 31);
         *         else {
         *             for (int u = r;
         *                  u - (r = u % bound) + m < 0;
         *                  u = next(31))
         *                 ;
         *         }
         *         return r;
         *     }
         */
        // 字词始终保持签名是可以的
        /*
         * public long nextLong() {
         *         // it's okay that the bottom word remains signed.
         *         return ((long)(next(32)) << 32) + next(32);
         *     }
         */
        // 随机获取一个Boolean
        /*
         * public boolean nextBoolean() {
         *         return next(1) != 0;
         *     }
         */
        // 随机获取一个float
        /*
         * public float nextFloat() {
         *         return next(24) / ((float)(1 << 24));
         *     }
         */
        // 随机获取一个double
        /*
         * public double nextDouble() {
         *         return (((long)(next(26)) << 27) + next(27)) * DOUBLE_UNIT;
         *     }
         */
        // 返回下一个伪随机数，与该随机数生成器的序列的平均值为0.0 ，
        // 标准差为1.0高斯（“正态”）分布double值
        /*
         * synchronized public double nextGaussian() {
         *         // See Knuth, ACP, Section 3.4.1 Algorithm C.
         *         if (haveNextNextGaussian) {
         *             haveNextNextGaussian = false;
         *             return nextNextGaussian;
         *         } else {
         *             double v1, v2, s;
         *             do {
         *                 v1 = 2 * nextDouble() - 1; // between -1 and 1
         *                 v2 = 2 * nextDouble() - 1; // between -1 and 1
         *                 s = v1 * v1 + v2 * v2;
         *             } while (s >= 1 || s == 0);
         *             double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);
         *             nextNextGaussian = v2 * multiplier;
         *             haveNextNextGaussian = true;
         *             return v1 * multiplier;
         *         }
         *     }
         */
        // 返回产生给定streamSize数量的伪随机int值的流。
        // 生成伪随机int值，就好像它是调用方法nextInt() 。
        /*
         * public IntStream ints(long streamSize) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         return StreamSupport.intStream
         *                 (new RandomIntsSpliterator
         *                          (this, 0L, streamSize, Integer.MAX_VALUE, 0),
         *                  false);
         *     }
         */
        // 返回有效无限的伪随机int数值流。
        // 生成伪随机int值，就好像它是调用方法nextInt() 。
        /*
         * public IntStream ints() {
         *         return StreamSupport.intStream
         *                 (new RandomIntsSpliterator
         *                          (this, 0L, Long.MAX_VALUE, Integer.MAX_VALUE, 0),
         *                  false);
         *     }
         */
        // 返回产生给定streamSize数量的伪随机int值的流，每个值都符合给定的原点（包括）和边界（不包括）。
        /*
         * public IntStream ints(long streamSize, int randomNumberOrigin,
         *                           int randomNumberBound) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         if (randomNumberOrigin >= randomNumberBound)
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.intStream
         *                 (new RandomIntsSpliterator
         *                          (this, 0L, streamSize, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 返回伪随机的有效无限流int值，每个符合给定的原点（含）和约束（不含）
        /*
         * public IntStream ints(int randomNumberOrigin, int randomNumberBound) {
         *         if (randomNumberOrigin >= randomNumberBound)
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.intStream
         *                 (new RandomIntsSpliterator
         *                          (this, 0L, Long.MAX_VALUE, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 返回产生给定streamSize数量的伪随机long值的流。
        // 生成伪随机long值，就好像是调用方法nextLong() 。
        /*
         * public LongStream longs(long streamSize) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         return StreamSupport.longStream
         *                 (new RandomLongsSpliterator
         *                          (this, 0L, streamSize, Long.MAX_VALUE, 0L),
         *                  false);
         *     }
         */
        // 返回有效无限的伪随机long值流。
        // 生成伪随机long值，就好像是调用方法nextLong() 。
        /*
         * public LongStream longs() {
         *         return StreamSupport.longStream
         *                 (new RandomLongsSpliterator
         *                          (this, 0L, Long.MAX_VALUE, Long.MAX_VALUE, 0L),
         *                  false);
         *     }
         */
        // 返回产生给定streamSize数的伪随机long ，每个伪随机数符合给定的原点（包括）和绑定的（排除）。
        /*
         * public LongStream longs(long streamSize, long randomNumberOrigin,
         *                             long randomNumberBound) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         if (randomNumberOrigin >= randomNumberBound)
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.longStream
         *                 (new RandomLongsSpliterator
         *                          (this, 0L, streamSize, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 返回有效无限制的伪随机long值流，每个值均符合给定的原点（包含）和边界（不含）。
        /*
         * public LongStream longs(long randomNumberOrigin, long randomNumberBound) {
         *         if (randomNumberOrigin >= randomNumberBound)
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.longStream
         *                 (new RandomLongsSpliterator
         *                          (this, 0L, Long.MAX_VALUE, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 返回产生给定streamSize数量的伪随机double streamSize值的流，
        // 每个值在0（含）和1（ streamSize ）之间。
        /*
         * public DoubleStream doubles(long streamSize) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         return StreamSupport.doubleStream
         *                 (new RandomDoublesSpliterator
         *                          (this, 0L, streamSize, Double.MAX_VALUE, 0.0),
         *                  false);
         *     }
         */
        // 返回有效无限的伪随机double精度值流，每个值在0（含）和1（不含）之间。
        // 生成伪随机double值，就好像是调用方法nextDouble() 。
        /*
         * public DoubleStream doubles() {
         *         return StreamSupport.doubleStream
         *                 (new RandomDoublesSpliterator
         *                          (this, 0L, Long.MAX_VALUE, Double.MAX_VALUE, 0.0),
         *                  false);
         *     }
         */
        // 返回一个流，该流产生给定的streamSize数量的伪随机double streamSize值，
        // 每个值都与给定的原点（包含）和边界（包含）相对应
        /*
         * public DoubleStream doubles(long streamSize, double randomNumberOrigin,
         *                                 double randomNumberBound) {
         *         if (streamSize < 0L)
         *             throw new IllegalArgumentException(BadSize);
         *         if (!(randomNumberOrigin < randomNumberBound))
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.doubleStream
         *                 (new RandomDoublesSpliterator
         *                          (this, 0L, streamSize, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 返回有效无限制的伪随机double精度值流，每个值均符合给定的原点（包含）和边界（不含）
        /*
         * public DoubleStream doubles(double randomNumberOrigin, double randomNumberBound) {
         *         if (!(randomNumberOrigin < randomNumberBound))
         *             throw new IllegalArgumentException(BadRange);
         *         return StreamSupport.doubleStream
         *                 (new RandomDoublesSpliterator
         *                          (this, 0L, Long.MAX_VALUE, randomNumberOrigin, randomNumberBound),
         *                  false);
         *     }
         */
        // 序列化到流
        /*
         * private void readObject(java.io.ObjectInputStream s)
         *         throws java.io.IOException, ClassNotFoundException {
         *
         *         ObjectInputStream.GetField fields = s.readFields();
         *
         *         // The seed is read in as {@code long} for
         *         // historical reasons, but it is converted to an AtomicLong.
         *         long seedVal = fields.get("seed", -1L);
         *         if (seedVal < 0)
         *           throw new java.io.StreamCorruptedException(
         *                               "Random: invalid seed");
         *         resetSeed(seedVal);
         *         nextNextGaussian = fields.get("nextNextGaussian", 0.0);
         *         haveNextNextGaussian = fields.get("haveNextNextGaussian", false);
         *     }
         */
        // 从流中反序列化
        /*
         * synchronized private void writeObject(ObjectOutputStream s)
         *         throws IOException {
         *
         *         // set the values of the Serializable fields
         *         ObjectOutputStream.PutField fields = s.putFields();
         *
         *         // The seed is serialized as a long for historical reasons.
         *         fields.put("seed", seed.get());
         *         fields.put("nextNextGaussian", nextNextGaussian);
         *         fields.put("haveNextNextGaussian", haveNextNextGaussian);
         *
         *         // save them
         *         s.writeFields();
         *     }
         */
        // 重设种子
        /*
         * private void resetSeed(long seedVal) {
         *         unsafe.putObjectVolatile(this, seedOffset, new AtomicLong(seedVal));
         *     }
         */
        // 序列化参数
        // static final long serialVersionUID = 3905348978240129619L;
        // 与此伪随机数生成器关联的内部状态。 （此类方法的规范描述了该值的持续计算。）
        // private final AtomicLong seed; 种子
        // private static final long multiplier = 0x5DEECE66DL; 乘法
        // private static final long addend = 0xBL; 加法
        // private static final long mask = (1L << 48) - 1; 面具
        // private static final double DOUBLE_UNIT = 0x1.0p-53; // 1.0 / (1L << 53)
        // static final String BadBound = "bound must be positive"; 越界msg
        // static final String BadRange = "bound must be greater than origin"; 异常随机数
        // static final String BadSize  = "size must be non-negative"; 异常size
        // 种子统一符
        /*
         *     private static final AtomicLong seedUniquifier
         *         = new AtomicLong(8682522807148012L);
         */
        // private double nextNextGaussian; 下一个正态分布
        // private boolean haveNextNextGaussian = false; 是否拥有下一个正态分布
        // object流属性数组
        /*
         *     private static final ObjectStreamField[] serialPersistentFields = {
         *         new ObjectStreamField("seed", Long.TYPE),
         *         new ObjectStreamField("nextNextGaussian", Double.TYPE),
         *         new ObjectStreamField("haveNextNextGaussian", Boolean.TYPE)
         *     };
         */
        // 支持在反序列化时重置种子
        // private static final Unsafe unsafe = Unsafe.getUnsafe();
        // 种子偏移量
        // private static final long seedOffset;
    }
}
