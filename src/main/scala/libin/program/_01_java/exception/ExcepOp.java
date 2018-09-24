package libin.program._01_java.exception;

/**
 * Copyright (c) 2018/09/24. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class ExcepOp {
    public static void main(String[] args) {
        ExcepOp excepOp = new ExcepOp();
        excepOp.TryCatch();
        excepOp.computeMain();
        excepOp.computeMain2();

        int arr[] = {1, 2, 3};
        assert arr.length == 0;
    }

    /**
     * 1.try...catch...finally处理异常
     */
    private void TryCatch() {
        try {
            int res = 10 / 0;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } finally {
            System.out.println("TryCatch -- try...catch...finally 处理异常~");
        }
    }

    /**
     * 2.throws关键字
     * 此方法不处理异常，交给方法调用者处理。
     */
    private int compute(int a, int b) throws Exception {
        return a / b;
    }

    /**
     * 方法调用处处理异常。
     */
    private void computeMain() {
        try {
            int compute = compute(10, 0);
            System.out.println(compute);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("computeMain -- throws 方法调用处处理异常~");
        }
    }

    /**
     * 3.try...catch...finally 、throw、throws同时使用。
     * 调用处和被调用处均处理异常。
     */
    int compute2(int a, int b) throws Exception {
        try {
            return a / b;
        } catch (Exception e) {
            System.out.println("compute2 -- throws 把异常交给调用处~");
            throw e;  // 把异常交给调用处
        } finally {
            System.out.println("compute2 -- throws 方法被调用处处理异常~");
        }
    }

    /**
     * 方法调用处也处理异常。
     */
    private void computeMain2() {
        try {
            int compute = compute2(10, 0);
            System.out.println(compute);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("computeMain2 -- throws 方法调用处处理异常~");
        }
    }

}


