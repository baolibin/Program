package libin.program._01_java.enumeration;

/**
 * Copyright (c) 2018/09/24. xixi Inc. All Rights Reserved.
 * Authors: libin <2578858653@qq.com>
 * <p>
 * Purpose :
 */
public class EnumOp {
    public static void main(String[] args) {
        Color red = Color.RED;
        System.out.println(red);
        for (Color c : Color.values()) {
            System.out.println("编号：" + c.ordinal() + "\t 名字：" + c.name());
        }

        ColorAttr blue = ColorAttr.BLUE;
        blue.setName("蓝色呀");
        System.out.println(blue.getName());
    }
}

enum Color {
    RED, GREEN, BLUE
}

enum ColorAttr {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");
    private String name;

    private ColorAttr(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
