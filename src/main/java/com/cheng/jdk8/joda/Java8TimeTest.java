package com.cheng.jdk8.joda;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author cheng
 *         2018/12/5 12:39
 */
public class Java8TimeTest {

    public static void main(String[] args) {

        LocalDate localDate1 = LocalDate.now();

        System.out.println(localDate1);
        System.out.println(localDate1.getYear() + ", "
                + localDate1.getMonthValue() + ", "
                + localDate1.getDayOfMonth());
        System.out.println("----------");

        LocalDate localDate2 = LocalDate.of(2018, 3, 3);
        System.out.println(localDate2);
        System.out.println("----------");

        LocalDate localDate3 = LocalDate.of(2010, 3, 25);
        MonthDay monthDay = MonthDay.of(localDate3.getMonth(), localDate3.getDayOfMonth());
        MonthDay monthDay2 = MonthDay.from(LocalDate.of(2010, 3, 25));
        System.out.println(monthDay + " --- " + monthDay2);
        if (monthDay.equals(monthDay2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        System.out.println("----------");

        LocalTime time1 = LocalTime.now();
        System.out.println(time1);

        // time1 + 3小时20分钟
        LocalTime time2 = time1.plusHours(3).plusMinutes(20);
        System.out.println(time2);
        System.out.println("----------");

        // localDate1 增加2周
        LocalDate localDate4 = localDate1.plus(2, ChronoUnit.WEEKS);
        System.out.println(localDate4);
        System.out.println("----------");

        LocalDate localDate5 = localDate1.minus(2, ChronoUnit.MONTHS);
        System.out.println(localDate5);
        System.out.println("----------");

        Clock clock = Clock.systemDefaultZone();
        System.out.println(clock.millis());
        System.out.println("----------");

        LocalDate localDate6 = LocalDate.now();
        LocalDate localDate7 = LocalDate.of(2017, 12, 5);
        System.out.println(localDate6.isAfter(localDate7));
        System.out.println(localDate6.isBefore(localDate7));
        System.out.println(localDate6.equals(localDate7));
        System.out.println("----------");

        Set<String> set = ZoneId.getAvailableZoneIds();
        Set<String> treeSet = new TreeSet<String>() {

            private static final long serialVersionUID = -155139768230701505L;

            {
                addAll(set);
            }
        };

//        set.forEach(System.out::println);
        treeSet.forEach(System.out::println);
        System.out.println("----------");

        ZoneId zoneId = ZoneId.of("Asia/Shanghai");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println(zonedDateTime);
        System.out.println("----------");

        YearMonth yearMonth1 = YearMonth.now();
        System.out.println(yearMonth1);
        System.out.println(yearMonth1.lengthOfMonth());
        System.out.println(yearMonth1.isLeapYear());
        System.out.println("----------");

        YearMonth yearMonth2 = YearMonth.of(2016, 2);
        System.out.println(yearMonth2);
        System.out.println(yearMonth2.lengthOfMonth());
        System.out.println(yearMonth2.isLeapYear());
        System.out.println("----------");

        LocalDate localDate8 = LocalDate.now();
        LocalDate localDate9 = LocalDate.of(2017, 10, 7);

        // 包含两个日期的间隔
        Period period = Period.between(localDate8, localDate9);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());
        System.out.println("----------");

        // UTC 时间输出
        System.out.println(Instant.now());
        System.out.println("----------");
    }
}