package com.lankydan.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {

  private static final Logger log = LoggerFactory.getLogger(MyServiceImpl.class);

  @Override
  public void doStuff(final String value) {
    log.trace("doStuff needed more information - {}", value);
    log.debug("doStuff needed to debug - {}", value);
    log.info("doStuff took input - {}", value);
    log.warn("doStuff needed to warn - {}", value);
    log.error("doStuff encountered an error with value - {}", value);
  }
}
