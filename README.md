# Computer-Shopping-Portal

## Steps To Build The Application

- $ javac App.java
- $ javah App
- $ gcc -shared -o calcLogic.so calcLogic.c -fPIC
- $ gcc -o libcalc.so -shared -I/usr/lib/jvm/java-8-openjdk-amd64/include -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux calc.c -lc -fPIC
- $ java -Djava.library.path=/home/jeet/Desktop/JNI App
