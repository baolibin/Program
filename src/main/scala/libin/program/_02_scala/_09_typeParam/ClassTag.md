
### ClassTag 、Manifest、ClassManifest、TypeTag
    Scala中ClassTag 、Manifest、ClassManifest、TypeTag是描述运行时类型信息的。
    JVM中的泛型并不会保存泛型的，Scala为了在运行时能够获取到泛型信息，就推出了如上关键字。

    ClassManifest是Manifest的一个弱化版本，就是保存的类型信息不如Manifest多。
    scala在2.10里却用TypeTag替代了Manifest，用ClassTag替代了ClassManifest
    ClassTag是TypeTag的一个弱化版本。
