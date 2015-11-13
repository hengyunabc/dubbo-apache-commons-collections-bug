
演示Apache Commons Collections远程代码执行漏洞，在dubbo rpc上验证。

漏洞参考：http://blog.chaitin.com/2015-11-11_java_unserialize_rce/

## 漏洞演示
下载代码
```bash
git clone git@github.com:hengyunabc/dubbo-apache-commons-collections-bug.git
```

启动dubbo service server
```
cd dubbo-apache-commons-collections-bug
mvn exec:java -Dexec.mainClass="Provider"
```

启动dubbo client
```bash
cd dubbo-apache-commons-collections-bug
mvn exec:java -Dexec.mainClass="Consumer"
```

调用成功的话，可以发现多了 /tmp/xxxx 文件。

如果是windows，可以修改下代码，把 src/main/java/Consumer.java 里的command改为 calc.exe ：
```java
                //windows下面可换为 calc.exe
                String command = "touch /tmp/xxxx";
```
