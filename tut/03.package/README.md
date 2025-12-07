# Java package

Java package is for grouping related files together.

## Source code folder structure

```
hello/
  world/
    Hello.java
    Main.java
```

## To compile all files to the `out` folder

```
javac -d out hello/world/*
```

```
hello/
  world/
    Hello.java
    Main.java
out/
  hello/
    world/
      Hello.class
      Main.class
```

## To run

```
java -cp out hello.world.Main
```
