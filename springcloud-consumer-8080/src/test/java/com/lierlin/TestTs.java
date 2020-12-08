package com.lierlin;

import org.springframework.boot.SpringBootVersion;
import org.springframework.core.SpringVersion;

public class TestTs {

    public static void main(String[] args) {
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();
        System.out.println(version1);
    }
}
