package com.cheng.jdk8.joda;

import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * joda-jodaTime
 *
 * @author cheng
 *         2018/12/5 12:11
 */
public class JodaTest2 {
    public static void main(String[] args) {

        DateTime today = new DateTime();
        DateTime tomorrow = today.plusDays(1);

        System.out.println(today.toString("yyyy-MM-dd"));
        System.out.println(tomorrow.toString("yyyy-MM-dd"));
        System.out.println("----------");

        DateTime d1 = today.withDayOfMonth(1);
        System.out.println(d1.toString("yyyy-MM-dd"));
        System.out.println("----------");

        LocalDate localDate = new LocalDate();
        System.out.println(localDate);
        System.out.println("----------");

        // 获取3个月后月份的最后一天
        localDate = localDate.plusMonths(3).dayOfMonth().withMaximumValue();
        System.out.println(localDate);
        System.out.println("----------");

        // 计算两年前的第三个月的最后一天的日期
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = dateTime.minusYears(2).monthOfYear().setCopy(3).dayOfMonth().withMaximumValue();
        System.out.println(dateTime2.toString("yyyy-MM-dd"));
        System.out.println("----------");

    }
}
