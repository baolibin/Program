package libin.program._01_java.generics;

/**
 * Copyright (c) 2018/09/28. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
class Point<T> {
    private T var;

    T getVar() {
        return var;
    }

    void setVar(T var) {
        this.var = var;
    }
}
