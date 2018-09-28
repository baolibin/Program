package libin.program._01_java.generics;

/**
 * Copyright (c) 2018/09/28. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class GenericsOp {
    public static void main(String[] args){
        Point<Integer> point = new Point<>();
        point.setVar(18);
        System.out.println(point.getVar());
    }
}
