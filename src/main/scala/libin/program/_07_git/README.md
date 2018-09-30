## Git
    Git是开源的分布式版本控制系统。
- [简介-Wikipedia](https://en.wikipedia.org/wiki/Git)
- [官网](https://git-scm.com/)
---
##### git stash
    - git stash --help
    - git stash list
    - git stash save "xxx"
    - git stash pop
    - git stash pop stash@{0}

##### git push
    - git push <远端主机名> <本地分支>:<远端分支>
    - git push origin master

##### git pull
    - git pull <远端主机名> <远端分支>:<本地分支>
    - git pull
    

##### Github配置  
    - git config --global user.name "name"   
    - git config --global user.email "email"  
    - git config --global credential.helper store

    - git config --global  --list
    - git config --local  --list
    - git config --local --get user.name

##### git config用法
    用法：git config [<选项>]
    
    配置文件位置
        --global              使用全局配置文件
        --system              使用系统级配置文件
        --local               使用仓库级配置文件
        -f, --file <文件>     使用指定的配置文件
        --blob <数据对象 ID>  从给定的数据对象读取配置
    
    操作
        --get                 获取值：name [value-regex]
        --get-all             获得所有的值：key [value-regex]
        --get-regexp          根据正则表达式获得值：name-regex [value-regex]
        --get-urlmatch        获得 URL 取值：section[.var] URL
        --replace-all         替换所有匹配的变量：name value [value_regex]
        --add                 添加一个新的变量：name value
        --unset               删除一个变量：name [value-regex]
        --unset-all           删除所有匹配项：name [value-regex]
        --rename-section      重命名小节：old-name new-name
        --remove-section      删除一个小节：name
        -l, --list            列出所有
        -e, --edit            打开一个编辑器
        --get-color           获得配置的颜色：配置 [默认]
        --get-colorbool       获得颜色设置：配置 [stdout-is-tty]
    
    类型
        --bool                值是 "true" 或 "false"
        --int                 值是十进制数
        --bool-or-int         值是 --bool or --int
        --path                值是一个路径（文件或目录名）
    
    其它
        -z, --null            终止值是 NUL 字节
        --name-only           只显示变量名
        --includes            查询时参照 include 指令递归查找
