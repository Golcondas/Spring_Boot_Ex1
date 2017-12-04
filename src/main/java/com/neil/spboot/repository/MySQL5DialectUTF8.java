package com.neil.spboot.repository;

import org.hibernate.dialect.MySQL5InnoDBDialect;

/**
 * mysql UTF-8格式继承
 */
public class MySQL5DialectUTF8 extends MySQL5InnoDBDialect {
    @Override
    public String getTableTypeString() {
        return " ENGINE=InnoDB DEFAULT CHARSET=utf8";
    }
}
