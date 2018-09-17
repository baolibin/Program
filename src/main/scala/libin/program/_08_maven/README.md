# Maven
- [简介-Wikipedia](https://en.wikipedia.org/wiki/Apache_Maven)
- [官网](http://maven.apache.org/)
---
##### 1.坐标、依赖
    Maven的一大功能就是管理项目依赖，为了能自动化解析任何一个Java构件(jar、war等)，就需要将它们唯一标识，这就是坐标，依赖管理的底层基础。

    Maven坐标元素如下：
    1.groupId(必须定义)：定义当前Maven项目隶属的时间项目(模块在哪一个项目下)。
    2.artifactId(必须定义)：定义实际项目中的一个模块Module。推荐使用实际项目名作为前缀。
    3.version(必须定义)：定义Maven项目当前所处的版本。
    4.packaging(可选，默认为jar)：定义Maven项目的打包方式(jar、war)。
    5.classifier(不能直接定义)：帮助定义构建输出的一些附属构建(Java文档、源代码)。
    
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


