package com.sathya.spring;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;



public class MyClass {
    private static final Log logger = LogFactory.getLog(MyClass.class);

    public static void main(String[] args) {
        logger.debug("Debug message");
        logger.info("Info message");
        logger.warn("Warning message");
        logger.error("Error message");
    }
}
