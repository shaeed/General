# Define a variable for classpath
CLASS_PATH = ../bin

# Define a virtual path for .class in the bin directory
vpath %.class $(CLASS_PATH)

# $* matches the target filename without the extension
JNIIntro2.h : JNIIntro2.class
	javah -classpath $(CLASS_PATH) $*
