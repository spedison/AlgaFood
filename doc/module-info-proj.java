module AlgaFood {
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

    opens br.com.spedison.algafood;
}