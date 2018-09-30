#!/usr/bin/env bash

#set -x
startDay1="20170901"
startDay2="2017-01-01"

endDay1="20170930"
endDay2="2017-09-30"

yesterday=`date -d "1 days ago" +%Y-%m-%d`

while [ ${startDay1} -le ${endDay1} ]
do
    echo ${yesterday}
    echo "date="${startDay1}
    echo ${startDay2}
    if [ $? -ne "0" ]; then
      echo "[ERROR]"
      exit 1
    fi
    startDay1=`date -d "${startDay1} +1 days" +%Y%m%d`
    startDay2=`date -d "${startDay2} +1 days" +%Y-%m-%d`
done
