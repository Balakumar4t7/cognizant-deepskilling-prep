package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerExample {
  private static final Logger log = LoggerFactory.getLogger(LoggerExample.class);
    public void testloggerExample(){
        log.warn("Started Warn Log from Logger Example class !");
        log.info("Started Info Log from Logger Example class !");

        String user ="User A ";
        log.info("the user {} is logging here" , user );
    }
}
