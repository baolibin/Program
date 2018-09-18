# Maven
- [简介-Wikipedia](https://en.wikipedia.org/wiki/Apache_Maven)
- [官网](http://maven.apache.org/)
---
##### 1.坐标、依赖
    Maven的一大功能就是管理项目依赖，为了能自动化解析任何一个Java构件(jar、war等)，就需要将它们唯一标识，这就是坐标，依赖管理的底层基础。
##
    Maven坐标元素如下：
    1.groupId(必须定义)：定义当前Maven项目隶属实际项目(模块在哪一个项目下)。
    2.artifactId(必须定义)：定义实际项目中的一个模块Module。推荐使用实际项目名作为前缀。
    3.version(必须定义)：定义Maven项目当前所处的版本。
    4.packaging(可选，默认为jar)：定义Maven项目的打包方式(jar、war)。
    5.classifier(不能直接定义)：帮助定义构建输出的一些附属构建(Java文档、源代码)。
    
    <modelVersion>4.0.0</modelVersion>
    <groupId>org-libin-studyMaven</groupId>
    <artifactId>studyMaven-program</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>studyMaven</name>
    <url>http://maven.apache.org</url>

##    
    Maven依赖元素如下：
    1.groupId、artifactId、version：依赖的基本坐标。
    2.type：依赖的类型，默认是packaging。
    3.scope：依赖的范围
        - compile(默认依赖范围)：编译依赖范围。编译、测试、运行三种classpath都有效。spring-core。
        - test：测试范围依赖。测试有效，编译和运行都无法使用该依赖。JUnit。
        - provided：已提供依赖范围。编译、测试有效，运行无效。servlet-api。
        - runtime：运行时以来范围。测试、运行有效，编译无效。JDBC驱动。
        - system：系统依赖范围。除用systemPath显示指定依赖文件路径，其它同provided。
        - import：导入依赖范围。不会对三种classPath产生实际影响。
    4.optional：标记坐标是否可选。
    5.exclusions：用来排除传递性依赖。
    dependencies中包含多个dependency，这是pom中定义项目依赖的位置。
    <dependencies>
        <dependency>
            <groupId>org.scala-lang</groupId>
            <artifactId>scala-reflect</artifactId>
            <version>2.12.0</version>
        </dependency>
    </dependencies>

##### 2.仓库
    坐标和依赖是任何一个构件在Maven中的逻辑表示方式，而文件则是其物理表示方式，Maven通过仓库来统一管理这些文件。
    为了实现重用，项目构建完毕后生成的构件也可以安装或者部署到仓库中，供其它项目使用。
##
    仓库的分类：
        对Maven来说，仓库分为本地仓库和远程仓库。Maven根据坐标寻找构件时候，首先查看本地仓库，如果本地仓库存在此构件，则直接使用，
        如果不存在此构件或者相查看是否存在更新的构件版本，则Maven就会去远端仓库查找，发现需要的构件之后下载到本地再使用。
    1）本地仓库：
        配置settings.xml文件的localRepository元素的值可以设置本地仓库的路径。
    2）远程仓库：
        中央仓库：
            中央仓库是Maven核心自带的远程仓库，包含了绝大部分开源的构件。
        私服：
            是另一种特殊的远程仓库，为了节省宽带和时间，应该在局域网内架设一个私有的仓库服务器，用其代理所有的远程仓库。

##### 3.生命周期


##### 4.插件

* maven-thrift-plugin ：该插件可以让我们在项目中使用编译.thrift文件。  
* maven-compiler-plugin：指定Maven编译时的jdk版本和字符集。  
* maven-source-plugin：对Maven工程的源码打包。  

##### 5.私服Nexus


##### 6.Archetype
