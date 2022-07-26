The example project for StringBoot service

<div align="center">
    <img src="./assets/images/initialization-block.png"/>
</div>

## Project structure
```
.
├── initialization-block
│   ├── pom.xml
│   ...
├── pom.xml
|
└── README.md
```

## Start project

- Build project

```shell script
$ ./mvnw clean package
...
[INFO] 
[INFO] Initialization Block ............................... SUCCESS [  4.773 s]
[INFO] Parent ............................................. SUCCESS [  0.013 s]
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  4.920 s
[INFO] Finished at: 2022-07-26T16:54:03+07:00
[INFO] ------------------------------------------------------------------------
```

- Run project

```shell script
$ java -jar initialization-block/target/initialization-block-0.0.1-SNAPSHOT.jar 
Static initialization block 1
Initialization block 1
Initialization block 2
Constructor 1

```

## Reference