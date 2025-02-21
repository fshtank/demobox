package com.dev2life.demo.dao.impl;

import com.dev2life.demo.config.SQLqueryConfigs;
import com.dev2life.demo.dao.BlsTypeWhereClause;
import com.dev2life.demo.model.DemoType;
import com.dev2life.demo.model.DemoType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

public class DemoTypeWhereClauseImpl implements BlsTypeWhereClause {
    private static final Logger LOGGER = LogManager.getLogger(DemoTypeWhereClauseImpl.class);

    @Autowired
    SQLqueryConfigs sqlqry;

    @Override
    public String getCampaignWhereClause(DemoType campaignType) {
        String sqlWhereClause = null;
        switch (campaignType) {
            case VEHICLE:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeVehicles();
                break;
            case ACCESSORIES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypeSvcAcc() + sqlqry.getWhere_CampaignTypeAccessories();
                break;
            case SERVICES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypeSvcAcc() + sqlqry.getWhere_CampaignTypeServices();
                break;
            case CONCESSIONARIA:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeConcessionaria();
                break;
            case NATIONAL:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeNational();
                break;
            case DIRECT_SALES:
                sqlWhereClause = sqlqry.getWhere_CampaignTypePbc() + sqlqry.getWhere_CampaignTypeDirectSales();
                break;
        }

        return sqlWhereClause;
    }


}
