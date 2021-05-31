package com.company.JavaSourceLearn.sources.JavaUtil.otherClass.uuid_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : UUID
 * @date : 2021-01-11 21:22:39
 */
public class UUIDExample1 {
    public static void main(String[] args) {
        // 内部类
        // Holder
        // 随机数生成
        // static final SecureRandom numberGenerator = new SecureRandom();
        // byte[]构造
        /*
         * private UUID(byte[] data) {
         *         long msb = 0;
         *         long lsb = 0;
         *         assert data.length == 16 : "data must be 16 bytes in length";
         *         for (int i=0; i<8; i++)
         *             msb = (msb << 8) | (data[i] & 0xff);
         *         for (int i=8; i<16; i++)
         *             lsb = (lsb << 8) | (data[i] & 0xff);
         *         this.mostSigBits = msb;
         *         this.leastSigBits = lsb;
         *     }
         */
        // 使用指定的数据构造一个新的UUID 。
        // mostSigBits用于最显著64位UUID和leastSigBits成为的至少显著64位UUID 。
        /*
         * public UUID(long mostSigBits, long leastSigBits) {
         *         this.mostSigBits = mostSigBits;
         *         this.leastSigBits = leastSigBits;
         *     }
         */
        // 获取uuid
        /*
         * public static UUID randomUUID() {
         *         SecureRandom ng = Holder.numberGenerator;
         *         byte[] randomBytes = new byte[16];
         *         ng.nextBytes(randomBytes);
         *         randomBytes[6]  &= 0x0f;
         *         randomBytes[6] |= 0x40;
         *         randomBytes[8] &= 0x3f;
         *         randomBytes[8] |= 0x80;
         *         return new UUID(randomBytes);
         * }
         */
        // 静态工厂，用于根据指定的字节数组检索类型3（基于名称）的UUID
        /*
         * public static UUID nameUUIDFromBytes(byte[] name) {
         *         MessageDigest md;
         *         try {
         *             md = MessageDigest.getInstance("MD5");
         *         } catch (NoSuchAlgorithmException nsae) {
         *             throw new InternalError("MD5 not supported", nsae);
         *         }
         *         byte[] md5Bytes = md.digest(name);
         *         md5Bytes[6]  &= 0x0f;
         *         md5Bytes[6] |= 0x30;
         *         md5Bytes[8] &= 0x3f;
         *         md5Bytes[8] |= 0x80;
         *         return new UUID(md5Bytes);
         *         }
         */
        // 如toString方法中所述，从字符串标准表示形式创建UUID 。
        /*
         * public static UUID fromString(String name) {
         *         String[] components = name.split("-");
         *         if (components.length != 5)
         *             throw new IllegalArgumentException("Invalid UUID string: "+name);
         *         for (int i=0; i<5; i++)
         *             components[i] = "0x"+components[i];
         *
         *         long mostSigBits = Long.decode(components[0]).longValue();
         *         mostSigBits <<= 16;
         *         mostSigBits |= Long.decode(components[1]).longValue();
         *         mostSigBits <<= 16;
         *         mostSigBits |= Long.decode(components[2]).longValue();
         *
         *         long leastSigBits = Long.decode(components[3]).longValue();
         *         leastSigBits <<= 48;
         *         leastSigBits |= Long.decode(components[4]).longValue();
         *
         *         return new UUID(mostSigBits, leastSigBits);
         *     }
         */
        // 返回此UUID的128位值的最低有效64位。
        /*
         * public long getLeastSignificantBits() {
         *         return leastSigBits;
         *     }
         */
        // 返回此UUID的128位值的最高有效64位。
        /*
         * public long getMostSignificantBits() {
         *         return mostSigBits;
         *     }
         */
        // uuid的版本
        // 1个基于时间的UUID
        // 2 DCE安全性UUID
        // 3基于名称的UUID
        // 4随机生成的UUID
        /*
         * public int version() {
         *         // Version is bits masked by 0x000000000000F000 in MS long
         *         return (int)((mostSigBits >> 12) & 0x0f);
         *     }
         */
        // 与此UUID关联的变量编号。 变型号描述了UUID的布局。 变体编号具有以下含义：
        // 0保留用于NCS向后兼容
        // 2 IETF RFC 4122  （Leach-Salz），由此类使用
        // 6保留，Microsoft Corporation向后兼容
        // 7为将来定义保留
        /*
         * public int variant() {
         *         // This field is composed of a varying number of bits.
         *         // 0    -    -    Reserved for NCS backward compatibility
         *         // 1    0    -    The IETF aka Leach-Salz variant (used by this class)
         *         // 1    1    0    Reserved, Microsoft backward compatibility
         *         // 1    1    1    Reserved for future definition.
         *         return (int) ((leastSigBits >>> (64 - (leastSigBits >>> 62)))
         *                       & (leastSigBits >> 63));
         *     }
         */
        // 与此UUID关联的时间戳记值。
        /*
         * public long timestamp() {
         *         if (version() != 1) {
         *             throw new UnsupportedOperationException("Not a time-based UUID");
         *         }
         *
         *         return (mostSigBits & 0x0FFFL) << 48
         *              | ((mostSigBits >> 16) & 0x0FFFFL) << 32
         *              | mostSigBits >>> 32;
         *     }
         */
        // 与此UUID关联的时钟序列值。
        /*
         * public int clockSequence() {
         *         if (version() != 1) {
         *             throw new UnsupportedOperationException("Not a time-based UUID");
         *         }
         *
         *         return (int)((leastSigBits & 0x3FFF000000000000L) >>> 48);
         *     }
         */
        // 与此UUID关联的节点值。
        /*
         * public long node() {
         *         if (version() != 1) {
         *             throw new UnsupportedOperationException("Not a time-based UUID");
         *         }
         *
         *         return leastSigBits & 0x0000FFFFFFFFFFFFL;
         *     }
         */
        // toString
        /*
         * public String toString() {
         *         return (digits(mostSigBits >> 32, 8) + "-" +
         *                 digits(mostSigBits >> 16, 4) + "-" +
         *                 digits(mostSigBits, 4) + "-" +
         *                 digits(leastSigBits >> 48, 4) + "-" +
         *                 digits(leastSigBits, 12));
         *     }
         */
        // 返回由指定数量的十六进制数字表示的val。
        /*
         * private static String digits(long val, int digits) {
         *         long hi = 1L << (digits * 4);
         *         return Long.toHexString(hi | (val & (hi - 1))).substring(1);
         *     }
         */
        // hashCode方法
        /*
         * public int hashCode() {
         *         long hilo = mostSigBits ^ leastSigBits;
         *         return ((int)(hilo >> 32)) ^ (int) hilo;
         *     }
         */
        // equals方法
        /*
         * public boolean equals(Object obj) {
         *         if ((null == obj) || (obj.getClass() != UUID.class))
         *             return false;
         *         UUID id = (UUID)obj;
         *         return (mostSigBits == id.mostSigBits &&
         *                 leastSigBits == id.leastSigBits);
         *     }
         */
        // 将此UUID与指定的UUID进行比较。
        // 如果对于第一个UUID，UUID不同的最高有效字段更大，则两个UUID中的第一个大于第二个。
        /*
         * public int compareTo(UUID val) {
         *         // The ordering is intentionally set up so that the UUIDs
         *         // can simply be numerically compared as two numbers
         *         return (this.mostSigBits < val.mostSigBits ? -1 :
         *                 (this.mostSigBits > val.mostSigBits ? 1 :
         *                  (this.leastSigBits < val.leastSigBits ? -1 :
         *                   (this.leastSigBits > val.leastSigBits ? 1 :
         *                    0))));
         *     }
         */
        // 序列化
        // private static final long serialVersionUID = -4856846361193249489L;
        // private final long mostSigBits; 高64位
        // private final long leastSigBits; 低64位

    }
}
