# java-native-loader

```
NativeLoader.load(
    /**
    * just the name.
    * e.g. "stb", NOT "libstb.so"
    */
    "libname",      
    /**
    * where is th lib, default to "java/class/path/natives/${os_name}/${os_arch}/${lib_fullname}". 
    * e.g. "com/mumumusuc/stb/natives/linux/x86_64/libstb.so"
    */
    "from path",    
    /**
    * where lib extracted to, default to "${java.io.tmpdir}/${package_name}/${class_hash}/natives/${os_name}/${os_arch}/"
    * e.g. "/tmp/com.mumumusuc.stb/1326120713/natives/linux/x86_64/"
    */
    "to path"
)
```