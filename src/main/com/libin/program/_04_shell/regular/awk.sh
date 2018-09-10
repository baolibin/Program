#! /bin/bash


function InitEnv()
{
    # 脚本名
    SCRIPT_NAME="$(basename $0 .sh)"
    # 脚本路径
    DIR_NAME="$(cd $(dirname $0);pwd)"

    # echo ${SCRIPT_NAME}
    # echo ${DIR_NAME}
}

function CutLine
{
    # 操作文件
    FILE=${DIR_NAME}"/passwd.txt"
    # 打印第一列
    awk -F "\*" '{print $1}' ${FILE}
    # 打印列数
    awk -F "\*" '{print NF}' ${FILE}
    # 打印倒数第二列
    awk -F "\*" '{print $(NF-1)}' ${FILE}
    # if条件判断
    awk -F "\*" '{if($1=="daemon:") {print $(NF-1)} else {print $NF}}' ${FILE}
    # BEGIN,END
    awk -F "\*" 'BEGIN{sum=0}{if($1=="daemon:"){sum+=1} else {sum+=0}}END{print sum}' ${FILE}
}

InitEnv
CutLine
