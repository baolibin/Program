
### 用户管理
    UID：区分不同用户的ID称之为User ID。Linux系统中的用户分为普通用户、根用户、系统用户
    GID：区分不同用户组的ID称之为Group ID。
    
##### /etc/passwd
    用来记录用户名相关信息。
    

##### /etc/shadow
    用来记录用户密码相关信息。

##### 新增用户   
    useradd user1
    useradd -u 555 user1
    useradd -g group1 user1
    useradd -d /home/mydir user1
    
    选项：
      -b, --base-dir BASE_DIR	新账户的主目录的基目录
      -c, --comment COMMENT         新账户的 GECOS 字段
      -d, --home-dir HOME_DIR       新账户的主目录
      -D, --defaults		显示或更改默认的 useradd 配置
      -e, --expiredate EXPIRE_DATE  新账户的过期日期
      -f, --inactive INACTIVE       新账户的密码不活动期
      -g, --gid GROUP		新账户主组的名称或 ID
      -G, --groups GROUPS	新账户的附加组列表
      -h, --help                    显示此帮助信息并推出
      -k, --skel SKEL_DIR	使用此目录作为骨架目录
      -K, --key KEY=VALUE           不使用 /etc/login.defs 中的默认值
      -l, --no-log-init	不要将此用户添加到最近登录和登录失败数据库
      -m, --create-home	创建用户的主目录
      -M, --no-create-home		不创建用户的主目录
      -N, --no-user-group	不创建同名的组
      -o, --non-unique		允许使用重复的 UID 创建用户
      -p, --password PASSWORD		加密后的新账户密码
      -r, --system                  创建一个系统账户
      -R, --root CHROOT_DIR         chroot 到的目录
      -s, --shell SHELL		新账户的登录 shell
      -u, --uid UID			新账户的用户 ID
      -U, --user-group		创建与用户同名的组
      -Z, --selinux-user SEUSER		为 SELinux 用户映射使用指定 SEUSER
          --extrausers              Use the extra users database

