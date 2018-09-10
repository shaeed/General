#include<stdio.h>
#include "NativeMethods.h"

JNIEXPORT void JNICALL Java_NativeMethods_helloNative
  (JNIEnv *a, jobject b) {
	printf("Hello from Native method in C\n");
  }