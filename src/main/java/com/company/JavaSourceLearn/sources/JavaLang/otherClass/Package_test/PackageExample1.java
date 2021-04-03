package com.company.JavaSourceLearn.sources.JavaLang.otherClass.Package_test;

/**
 * @author : LiWenBo
 * @program : JavaSourcesLearn
 * @description : Package
 * @date : 2021-01-21 21:08:40
 */
public class PackageExample1 {
    public static void main(String[] args) {
        // Package对象包含有关Java软件包的实现和规范的版本信息
        // 使用指定的版本信息构造一个包实例。
        /*
        *
            名称–包裹名称
            spectitle –规范的标题
            specversion –规范的版本
            厂商-维护规格的组织
            impltitle –实现的标题
            implversion –实现的版本
            实施者–维护实施的组织
        * */
        /*
         * Package(String name,
         *             String spectitle, String specversion, String specvendor,
         *             String impltitle, String implversion, String implvendor,
         *             URL sealbase, ClassLoader loader)
         *     {
         *         pkgName = name;
         *         implTitle = impltitle;
         *         implVersion = implversion;
         *         implVendor = implvendor;
         *         specTitle = spectitle;
         *         specVersion = specversion;
         *         specVendor = specvendor;
         *         sealBase = sealbase;
         *         this.loader = loader;
         *     }
         */
        // 使用指定清单中的属性构造一个包。
        /*
         * private Package(String name, Manifest man, URL url, ClassLoader loader) {
         *         String path = name.replace('.', '/').concat("/");
         *         String sealed = null;
         *         String specTitle= null;
         *         String specVersion= null;
         *         String specVendor= null;
         *         String implTitle= null;
         *         String implVersion= null;
         *         String implVendor= null;
         *         URL sealBase= null;
         *         Attributes attr = man.getAttributes(path);
         *         if (attr != null) {
         *             specTitle   = attr.getValue(Name.SPECIFICATION_TITLE);
         *             specVersion = attr.getValue(Name.SPECIFICATION_VERSION);
         *             specVendor  = attr.getValue(Name.SPECIFICATION_VENDOR);
         *             implTitle   = attr.getValue(Name.IMPLEMENTATION_TITLE);
         *             implVersion = attr.getValue(Name.IMPLEMENTATION_VERSION);
         *             implVendor  = attr.getValue(Name.IMPLEMENTATION_VENDOR);
         *             sealed      = attr.getValue(Name.SEALED);
         *         }
         *         attr = man.getMainAttributes();
         *         if (attr != null) {
         *             if (specTitle == null) {
         *                 specTitle = attr.getValue(Name.SPECIFICATION_TITLE);
         *             }
         *             if (specVersion == null) {
         *                 specVersion = attr.getValue(Name.SPECIFICATION_VERSION);
         *             }
         *             if (specVendor == null) {
         *                 specVendor = attr.getValue(Name.SPECIFICATION_VENDOR);
         *             }
         *             if (implTitle == null) {
         *                 implTitle = attr.getValue(Name.IMPLEMENTATION_TITLE);
         *             }
         *             if (implVersion == null) {
         *                 implVersion = attr.getValue(Name.IMPLEMENTATION_VERSION);
         *             }
         *             if (implVendor == null) {
         *                 implVendor = attr.getValue(Name.IMPLEMENTATION_VENDOR);
         *             }
         *             if (sealed == null) {
         *                 sealed = attr.getValue(Name.SEALED);
         *             }
         *         }
         *         if ("true".equalsIgnoreCase(sealed)) {
         *             sealBase = url;
         *         }
         *         pkgName = name;
         *         this.specTitle = specTitle;
         *         this.specVersion = specVersion;
         *         this.specVendor = specVendor;
         *         this.implTitle = implTitle;
         *         this.implVersion = implVersion;
         *         this.implVendor = implVendor;
         *         this.sealBase = sealBase;
         *         this.loader = loader;
         *     }
         */
        // 获取包名
        /*
         * public String getName() {
         *         return pkgName;
         *     }
         */
        // 返回此包实现的规范的标题。
        /*
         * public String getSpecificationTitle() {
         *         return specTitle;
         *     }
         */
        // 获取包实现的规范版本
        /*
         * public String getSpecificationVersion() {
         *         return specVersion;
         *     }
         */
        // 获取包实现的规范厂商
        /*
         * public String getSpecificationVendor() {
         *         return specVendor;
         *     }
         */
        // 返回此程序包的标题。
        /*
         * public String getImplementationTitle() {
         *         return implTitle;
         *     }
         */
        // 获取程序包的规范版本
        /*
         * public String getImplementationVersion() {
         *         return implVersion;
         *     }
         */
        // 获取程序包的规范厂商
        /*
         * public String getImplementationVendor() {
         *         return implVendor;
         *     }
         */
        // 返回提供此实现的组织，供应商或公司的名称。
        /*
         * public String getImplementationVendor() {
         *         return implVendor;
         *     }
         */
        // 如果密封此包装，则返回true。
        /*
         * public boolean isSealed() {
         *         return sealBase != null;
         *     }
         */
        // 如果此程序包相对于指定的代码源url是密封的，则返回true。
        /*
         * public boolean isSealed(URL url) {
         *         return url.equals(sealBase);
         *     }
         */
        // 将此软件包的规范版本与所需版本进行比较。 如果此程序包规范版本号大于或等于所需版本号，则返回true。
        /*
         * public boolean isCompatibleWith(String desired)
         *         throws NumberFormatException
         *     {
         *         if (specVersion == null || specVersion.length() < 1) {
         *             throw new NumberFormatException("Empty version string");
         *         }
         *
         *         String [] sa = specVersion.split("\\.", -1);
         *         int [] si = new int[sa.length];
         *         for (int i = 0; i < sa.length; i++) {
         *             si[i] = Integer.parseInt(sa[i]);
         *             if (si[i] < 0)
         *                 throw NumberFormatException.forInputString("" + si[i]);
         *         }
         *
         *         String [] da = desired.split("\\.", -1);
         *         int [] di = new int[da.length];
         *         for (int i = 0; i < da.length; i++) {
         *             di[i] = Integer.parseInt(da[i]);
         *             if (di[i] < 0)
         *                 throw NumberFormatException.forInputString("" + di[i]);
         *         }
         *
         *         int len = Math.max(di.length, si.length);
         *         for (int i = 0; i < len; i++) {
         *             int d = (i < di.length ? di[i] : 0);
         *             int s = (i < si.length ? si[i] : 0);
         *             if (s < d)
         *                 return false;
         *             if (s > d)
         *                 return true;
         *         }
         *         return true;
         *     }
         */
        // 在调用者ClassLoader实例中按名称查找包。
        // 调用者ClassLoader实例用于查找与命名类相对应的包实例。
        // 如果调用方ClassLoader实例为null，则将搜索系统ClassLoader实例加载的软件包集，以找到命名的软件包。
        /*
         *     @CallerSensitive
         *     public static Package getPackage(String name) {
         *         ClassLoader l = ClassLoader.getClassLoader(Reflection.getCallerClass());
         *         if (l != null) {
         *             return l.getPackage(name);
         *         } else {
         *             return getSystemPackage(name);
         *         }
         *     }
         */
        // 获取当前对于调用者的ClassLoader实例已知的所有软件包
        /*
         * @CallerSensitive
         *     public static Package[] getPackages() {
         *         ClassLoader l = ClassLoader.getClassLoader(Reflection.getCallerClass());
         *         if (l != null) {
         *             return l.getPackages();
         *         } else {
         *             return getSystemPackages();
         *         }
         *     }
         */
        // 获取包名的hashCode
        /*
         * public int hashCode(){
         *         return pkgName.hashCode();
         *     }
         */
        // 获取包名的String
        /*
         * public String toString() {
         *         String spec = specTitle;
         *         String ver =  specVersion;
         *         if (spec != null && spec.length() > 0)
         *             spec = ", " + spec;
         *         else
         *             spec = "";
         *         if (ver != null && ver.length() > 0)
         *             ver = ", version " + ver;
         *         else
         *             ver = "";
         *         return "package " + pkgName + spec + ver;
         *     }
         */
        // 获取类信息
        /*
         * private Class<?> getPackageInfo() {
         *         if (packageInfo == null) {
         *             try {
         *                 packageInfo = Class.forName(pkgName + ".package-info", false, loader);
         *             } catch (ClassNotFoundException ex) {
         *                 // store a proxy for the package info that has no annotations
         *                 class PackageInfoProxy {}
         *                 packageInfo = PackageInfoProxy.class;
         *             }
         *         }
         *         return packageInfo;
         *     }
         */
        // 获取注解
        /*
         * public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {
         *         return getPackageInfo().getAnnotation(annotationClass);
         *     }
         */
        // 判断包是否拥有该注解
        /*
         * @Override
         *     public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {
         *         return AnnotatedElement.super.isAnnotationPresent(annotationClass);
         *     }
         */
        // 根据注解类型获取注解
        /*
         * @Override
         *     public  <A extends Annotation> A[] getAnnotationsByType(Class<A> annotationClass) {
         *         return getPackageInfo().getAnnotationsByType(annotationClass);
         *     }
         */
        // 获取注解
        /*
         * public Annotation[] getAnnotations() {
         *         return getPackageInfo().getAnnotations();
         *     }
         */
        // 获取声明的注解
        /*
         * @Override
         *     public <A extends Annotation> A getDeclaredAnnotation(Class<A> annotationClass) {
         *         return getPackageInfo().getDeclaredAnnotation(annotationClass);
         *     }
         */
        // 根据类型获取声明的注解
        /*
         * @Override
         *     public <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> annotationClass) {
         *         return getPackageInfo().getDeclaredAnnotationsByType(annotationClass);
         *     }
         */
        // 获取声明的注解
        /*
         * public Annotation[] getDeclaredAnnotations()  {
         *         return getPackageInfo().getDeclaredAnnotations();
         *     }
         */
        // 获取包名
        /*
         * static Package getSystemPackage(String name) {
         *         synchronized (pkgs) {
         *             Package pkg = pkgs.get(name);
         *             if (pkg == null) {
         *                 name = name.replace('.', '/').concat("/");
         *                 String fn = getSystemPackage0(name);
         *                 if (fn != null) {
         *                     pkg = defineSystemPackage(name, fn);
         *                 }
         *             }
         *             return pkg;
         *         }
         *     }
         */
        // 获取系统包名
        /*
         * static Package[] getSystemPackages() {
         *         // First, update the system package map with new package names
         *         String[] names = getSystemPackages0();
         *         synchronized (pkgs) {
         *             for (int i = 0; i < names.length; i++) {
         *                 defineSystemPackage(names[i], getSystemPackage0(names[i]));
         *             }
         *             return pkgs.values().toArray(new Package[pkgs.size()]);
         *         }
         *     }
         */
        // 定义包
        /*
         * private static Package defineSystemPackage(final String iname,
         *                                                final String fn)
         *     {
         *         return AccessController.doPrivileged(new PrivilegedAction<Package>() {
         *             public Package run() {
         *                 String name = iname;
         *                 // Get the cached code source url for the file name
         *                 URL url = urls.get(fn);
         *                 if (url == null) {
         *                     // URL not found, so create one
         *                     File file = new File(fn);
         *                     try {
         *                         url = ParseUtil.fileToEncodedURL(file);
         *                     } catch (MalformedURLException e) {
         *                     }
         *                     if (url != null) {
         *                         urls.put(fn, url);
         *                         // If loading a JAR file, then also cache the manifest
         *                         if (file.isFile()) {
         *                             mans.put(fn, loadManifest(fn));
         *                         }
         *                     }
         *                 }
         *                 // Convert to "."-separated package name
         *                 name = name.substring(0, name.length() - 1).replace('/', '.');
         *                 Package pkg;
         *                 Manifest man = mans.get(fn);
         *                 if (man != null) {
         *                     pkg = new Package(name, man, url, null);
         *                 } else {
         *                     pkg = new Package(name, null, null, null,
         *                                       null, null, null, null, null);
         *                 }
         *                 pkgs.put(name, pkg);
         *                 return pkg;
         *             }
         *         });
         *     }
         */
        // 返回指定JAR文件名的清单。
        /*
         * private static Manifest loadManifest(String fn) {
         *         try (FileInputStream fis = new FileInputStream(fn);
         *              JarInputStream jis = new JarInputStream(fis, false))
         *         {
         *             return jis.getManifest();
         *         } catch (IOException e) {
         *             return null;
         *         }
         *     }
         */
        // private static native String getSystemPackage0(String name);
        // private static native String[] getSystemPackages0();
        // 加载系统包
        // private static Map<String, Package> pkgs = new HashMap<>(31);
        // 将每个目录或zip文件名映射到其相应的url
        // private static Map<String, URL> urls = new HashMap<>(10);
        // 将jar文件的每个代码源URL映射到其清单
        // private static Map<String, Manifest> mans = new HashMap<>(10);
        // 包属性
        // private final String pkgName;
        // private final String specTitle;
        // private final String specVersion;
        // private final String specVendor;
        // private final String implTitle;
        // private final String implVersion;
        // private final String implVendor;
        // private final URL sealBase;
        // private transient final ClassLoader loader;
        // private transient Class<?> packageInfo;
    }
}
