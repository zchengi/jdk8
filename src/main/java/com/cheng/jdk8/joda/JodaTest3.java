package com.cheng.jdk8.joda;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

import java.util.Date;

/**
 * @author cheng
 *         2018/12/5 12:22
 */
public class JodaTest3 {

    /**
     * 标准 UTC 时间: 2014-11-04T09:11:22.841Z
     *
     * @param utcDate
     * @return
     */
    public static Date convertUTC2Date(String utcDate) {
        try {
            DateTime dateTime = DateTime.parse(utcDate,
                    DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ"));
            return dateTime.toDate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String convertDate2UTC(Date javaDate) {
        DateTime dateTime = new DateTime(javaDate, DateTimeZone.UTC);
        return dateTime.toString();
    }

    public static String convertDate2LocalByDateFormat(Date javaDate, String dateFormat) {
        return new DateTime(javaDate).toString(dateFormat);
    }

    public static void main(String[] args) {

        System.out.println(convertUTC2Date("2017-11-04T09:22:52.876Z"));

        System.out.println(convertDate2UTC(new Date()));

        System.out.println(convertDate2LocalByDateFormat(new Date(), "yyyy-MM-dd HH:mm:ss"));
    }
}
