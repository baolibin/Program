package libin.program._01_java.object;

import java.util.Arrays;

/**
 * Copyright (c) 2018/10/02. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class ComparableOp {
    public static void main(String[] args) {
        UserInfo a = new UserInfo("a", true, 20);
        UserInfo b = new UserInfo("b", true, 18);
        UserInfo c = new UserInfo("c", true, 15);

        UserInfo[] userInfos = {a, b, c};

        Arrays.sort(userInfos);
        for (UserInfo user : userInfos) {
            System.out.println(user.toString());
        }
    }
}

class UserInfo implements Comparable<UserInfo> {
    private String name;
    private boolean sex;
    private int age;

    UserInfo(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public int compareTo(UserInfo o) {
        if (this.age < o.age) return -1;
        else if (this.age > o.age) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return this.name + "\t" + this.sex + "\t" + this.age;
    }
}
