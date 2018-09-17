# Maven
- [简介-Wikipedia](https://en.wikipedia.org/wiki/Apache_Maven)
- [官网](http://maven.apache.org/)
---
##### 1.坐标、依赖
    Maven的一大功能就是管理项目依赖，为了能自动化解析任何一个Java构件(jar、war等)，就需要将它们唯一标识，这就是坐标，依赖管理的底层基础。
##
    Maven坐标元素如下：
    1.groupId(必须定义)：定义当前Maven项目隶属的时间项目(模块在哪一个项目下)。
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


##### 3.生命周期


##### 4.插件


##### 5.私服Nexus


##### 6.Archetype


