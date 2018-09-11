package main.com.libin.program._01_java.utils;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.format.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Java中常用的时间类操作有Date、Calendar、DateFormat
 */
public class TimeUtils {
    private static final String DATEFORMAT1 = "yyyy-MM-dd HH:mm:ss.SSS";
    private static final String DATEFORMAT2 = "yyyyMMdd";
    private static final String DATEFORMAT3 = "yyyy-MM-dd";

    public static void main(String[] args) {
        TimeUtils timeUtils = new TimeUtils();
        timeUtils.dateOperation(); // Date类操作
        timeUtils.calendarOperation(); // Calendar类操作
        timeUtils.dateFormatOp(); // DateFormat操作
        timeUtils.simpleDateFormatOp(); // SimpleDateFormat类操作
        timeUtils.strConvert();
        timeUtils.dateTimeOp();
    }

    /**
     * 时间Date类操作
     */
    @SuppressWarnings("deprecation")
    private void dateOperation() {
        Date date = new Date();
        System.out.println(date); // System.currentTimeMillis()
        System.out.println(date.getTime()); // 获取当前时间的时间戳
        System.out.println(date.getYear());  // 年
        System.out.println(date.getMonth());  // 月
        System.out.println(date.getDate());  // 日
    }

    /**
     * Calendar类操作
     */
    private void calendarOperation() {
        Calendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(Calendar.YEAR));  // 年
        System.out.println(calendar.get(Calendar.MONTH) + 1);  // 月
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));  // 日
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));  // 时
        System.out.println(calendar.get(Calendar.MINUTE));  // 分
        System.out.println(calendar.get(Calendar.SECOND));  // 秒
        System.out.println(calendar.get(Calendar.MILLISECOND));  // 毫秒
        System.out.println(calendar.getTimeInMillis());  // 时间戳
    }

    /**
     * DateFormat类操作
     */
    private void dateFormatOp() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        DateFormat dateTimeInstance = DateFormat.getDateTimeInstance();
        System.out.println(dateFormat.format(new Date()));
        System.out.println(dateTimeInstance.format(new Date()));
        DateFormat dateFormat1 = DateFormat.getDateInstance(DateFormat.YEAR_FIELD, new Locale("zh", "CN"));
        DateFormat dateTimeInstance1 = DateFormat.getDateTimeInstance(DateFormat.YEAR_FIELD, DateFormat.ERA_FIELD, new Locale("zh", "CN"));
        System.out.println(dateFormat1.format(new Date()));
        System.out.println(dateTimeInstance1.format(new Date()));
    }

    /**
     * SimpleDateFormat类操作
     */
    private void simpleDateFormatOp() {
        SimpleDateFormat df1 = new SimpleDateFormat(DATEFORMAT1);
        SimpleDateFormat df2 = new SimpleDateFormat(DATEFORMAT2);
        System.out.println(df1.format(new Date()));
        System.out.println(df2.format(new Date()));
    }

    /**
     * DateTime类操作
     */
    private void dateTimeOp() {
        DateTime dateTime = new DateTime();
        System.out.println(dateTime.year().get());
        String date = "20180909";
        DateTime dateTime1 = DateTimeFormat.forPattern(DATEFORMAT2).parseDateTime(date);
        System.out.println(dateTime1);
        System.out.println(dateTime1.plusDays(1));
        System.out.println(dateTime1.minusDays(1));
        System.out.println(dateTime1.plusDays(1).isAfter(dateTime1.minusDays(1)));
        System.out.println(dateTime1.plusDays(1).isBefore(dateTime1.minusDays(1)));
    }

    private void strConvert() {
        String date = "2018-09-09";
        SimpleDateFormat df1 = new SimpleDateFormat(DATEFORMAT3);
        try {
            System.out.println(df1.parse(date).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(new DateTime().toString(DATEFORMAT3));

        long t1 = new DateTime().minusDays(1).getMillisOfDay();
        long t2 = new DateTime().plusDays(1).getMillisOfDay();
        System.out.println(t1 + "|" + t2);
        System.out.println((t2 - t1) / 60);

        long t3 = new DateTime().minusDays(1).getMillis();
        long t4 = new DateTime().plusDays(1).getMillis();
        System.out.println(toDayZeroDiff(t3, t4));
    }

    long toDayZeroClock(long ts) {
        return ts - new DateTime(ts).getMillisOfDay();
    }

    private DateTime toDayZeroClock(DateTime a) {
        return a.minusMillis(a.getMillisOfDay());
    }

    /**
     * 求两个时间戳相差的天数
     */
    private int toDayZeroDiff(long ts1, long ts2) {
        DateTime a = toDayZeroClock(new DateTime(ts1));
        DateTime b = toDayZeroClock(new DateTime(ts2));
        return Days.daysBetween(a, b).getDays();
    }

    DateTime toDayZeroClock(DateTime a, DateTime b) {
        return a.minusMillis(a.getMillisOfDay());
    }
}
