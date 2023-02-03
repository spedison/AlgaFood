module AlgaFoodTest {
    requires java.annotation;
    requires lombok;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.boot.devtools;
    requires spring.boot.starter;
    requires spring.boot.starter.tomcat;
    requires spring.beans;
    requires org.apache.logging.slf4j;
    requires org.apache.logging.log4j;
    requires spring.context;
    requires spring.boot.configuration.processor;
    requires spring.web;
    requires spring.aop;
    requires spring.boot.starter.web;
    requires spring.boot.starter.json;
    requires spring.core;
    requires spring.test;
    requires spring.boot.test;
    requires spring.boot.test.autoconfigure;
    requires org.junit.jupiter;
    requires org.junit.jupiter.api;
    requires org.junit.jupiter.engine;
    requires jsonassert;
    requires org.mockito;
    requires org.mockito.junit.jupiter;

    requires AlgaFood;
}