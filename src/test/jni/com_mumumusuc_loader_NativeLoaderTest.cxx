#include "com_mumumusuc_loader_NativeLoaderTest.h"
#include <stdlib.h>

JNIEXPORT void JNICALL Java_com_mumumusuc_loader_NativeLoaderTest_sayHello
  (JNIEnv *, jobject){
    printf("hello from native!\n");
  }