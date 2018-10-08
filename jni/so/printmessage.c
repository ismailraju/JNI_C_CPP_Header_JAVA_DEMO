#include <stdio.h>
#include "MyMain.h"

JNIEXPORT void JNICALL Java_MyMain_printmsg
  (JNIEnv *env, jobject obj)

//void printmsg()
{

	printf("Hello raju's world");


}
