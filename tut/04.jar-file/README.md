# .jar file

`.jar` file is for ditributing your program easier.

## To create .jar file

To zip `out` folder and `manifest.txt` file to file `hello.jar`:

```
jar cfm hello.jar manifest.txt -C ../03.package/out .
```

## To run the .jar file

```
java -jar hello.jar
```
