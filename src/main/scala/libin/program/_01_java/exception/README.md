
##### Java异常
    在Java异常结构中，最常用的两个类为：Exception和Error。这2个类都是Throwable的子类。
    1.Exception：一般表示的是程序中出现的问题，可以直接使用Try...catch进行处理。
    2.Error：一般指的是JVM错误，程序中无法处理。

##### 为啥使用Exception，而不使用Throwable？
    使用Throwable捕获异常是最大的，在代码中使用没有问题。但是在开发中一般不会直接使用。
    因为Throwable有Exception和Error两个子类，Error本身不需要程序处理，程序中需要处理的只是Exception。
    另外不要直接使用Exception进行捕获所有异常，最好分别进行捕获。

##### try...catch...finally异常
    在try中产生了异常，则程序自动跳转到catch语句中找到匹配的异常类型进行相应的处理。
    最后不管程序是否继续产生异常，则肯定都会执行finally语句，finally作为异常的统一出口。

##### throws关键字
    在定义一个方法时候使用throws关键字声明，表示此方法不处理异常，而交给方法的调用者进行处理。
    
##### assert断言
    断言就是肯定某一返回值是正确的，如果最终此结果的返回值是错误的，那么通过断言肯定会提示错误信息。
    如果使用断言则需要在程序运行时使用 java -ea className