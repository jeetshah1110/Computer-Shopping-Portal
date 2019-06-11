# Computer-Shopping-Portal

This application provides a shopping portal which is developed with Java for frontend interface and C for backend computations.
This application makes use of Java Native Interface to combine the C with Java which reduces the computation complexity of the application.
## Steps To Build The Application

- $ javac App.java
- $ javah App
- $ gcc -shared -o calcLogic.so calcLogic.c -fPIC
- $ gcc -o libcalc.so -shared -I/usr/lib/jvm/java-8-openjdk-amd64/include -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux calc.c -lc -fPIC
- $ java -Djava.library.path=path-of-your-application App
