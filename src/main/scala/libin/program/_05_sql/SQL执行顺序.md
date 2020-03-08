
###### SQL执行顺序：
    Join操作时候过滤条件加在on和where上执行顺序使不一样的，面试时候常考：
    （8）SELECT
    （9）DISTINCT <select_list>
    （1）FROM <left_table>
    （3）<join_type> JOIN <right_table>
    （2）ON <join_condition>
    （4）WHERE <where_condition>
    （5）GROUP BY <grout_by_list>
    （6）WITH {CUTE|ROLLUP}
    （7）HAVING <having_condition>
    （10）ORDER BY <order_by_list>
    （11）LIMIT <limit_number>


