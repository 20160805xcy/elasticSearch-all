package com.xcy.elasticsearchitjc8.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseController {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

}
