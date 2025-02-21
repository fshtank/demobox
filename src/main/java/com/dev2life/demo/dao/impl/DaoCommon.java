package com.dev2life.demo.dao.impl;

import com.dev2life.demo.config.SQLqueryConfigs;
import com.dev2life.demo.dao.BlsTypeWhereClause;
import com.dev2life.demo.model.DemoWebRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.Optional;

/**
 * Common DAO Ancestor to put common utility methods
 */
public class DaoCommon {

    // Spring Boot will create and configure DataSource and JdbcTemplate
    // To use it, just @Autowired
    @Autowired
    NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    SQLqueryConfigs sqlqry;

    StringBuilder sql = null;

    /**
     * Unwrap the OPTIONAL OfertasWebRequest object to check if NULL
     * @param owReqOptional
     * @return
     */
    public DemoWebRequest checkOfertasWebRequest (Optional<DemoWebRequest> owReqOptional) {
        DemoWebRequest owReq = null;
        if (owReqOptional.isPresent()) {
            owReq = owReqOptional.get();
        } else {
            owReq = new DemoWebRequest();
        }

        return owReq;
    }



}
