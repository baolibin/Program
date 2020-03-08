
-- 相差一天：
-- 第一种写法：
select A.date from temperature A,temperature B where A.date=B.date+1 and A.value>B.value;
-- 第二种写法：
select A.date from temperature A inner join temperature B on A.date=B.date+1 and A.value>B.value;


-- 相差多天：
select distinct(A.date)
from temperature A,temperature B
where A.value>B.value and B.date=(select max(B.date) from temperature where A.date>B.date);



