package com.dev2life.demo.dao.impl;

import com.dev2life.demo.dao.DemoDataDao;
import com.dev2life.demo.model.DemoData;
import com.dev2life.demo.model.DemoWebRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DemoDataDaoImpl extends DaoCommon implements DemoDataDao {

    private static final Logger LOGGER = LogManager.getLogger(DemoDataDaoImpl.class);

    @Override
     public List<DemoData> getCampaigns(DemoWebRequest demoWebRequest) {
        ArrayList<DemoData> blsDataList = new ArrayList<>();
        DemoData blsData = new DemoData();
        blsDataList.add(blsData);
        return blsDataList.stream().toList();
    }



  

    /**
     * Map Parameters for the SQL WHERE clause
     * @return
     */
    public SqlParameterSource getParameters(DemoWebRequest blsWebRequest) {

        MapSqlParameterSource parameters = new MapSqlParameterSource();
        // DemoData owReq=super.getCampaigns(blsWebRequest);
        DemoData owReq= new DemoData();

        // Campaigns

        if (!owReq.getCityName().isEmpty()) {
            sql.append(sqlqry.getWhereV_CityName());
            parameters.addValue("CityName", owReq.getCityName(), Types.VARCHAR);
        }

        if (owReq.getCityName() !=null) {
            sql.append(sqlqry.getWhereV_StateName());
            parameters.addValue("StateName", owReq.getEstadoName(), Types.VARCHAR);
        }

        return parameters;
    }

    @Override
    public DemoWebRequest checkOfertasWebRequest(Optional<DemoWebRequest> owReqOptional) {
        return super.checkOfertasWebRequest(owReqOptional);
    }
}

/**
 * Inner Class to Map Data Object --> Rows
 */
class VDemoDataMapper implements RowMapper {
    @Override
    public DemoData mapRow(ResultSet rs, int rowNum) throws SQLException {
        DemoData vc = new DemoData();
//        vc.setCampaignOperationalAreaId(rs.getLong("CampaignOperationalAreaId"));
//        vc.setCampaignId(rs.getLong("CampaignId"));
//        vc.setCampaignName(rs.getString("CampaignName"));
//        vc.setOperationalAreaId(rs.getLong("OperationalAreaId"));
//        vc.setOperationalAreaName(rs.getString("OperationalAreaName"));
//        vc.setRegion(rs.getString("Region"));
//        vc.setRegionId(rs.getLong("RegionId"));
//        vc.setCampaignTypeId(rs.getLong("CampaignTypeId"));
//        vc.setCampaignTypeDescription(rs.getString("CampaignTypeDescription"));
//        vc.setOperationalAreaCityId(rs.getLong("OperationalAreaCityId"));
//        vc.setCityId(rs.getLong("CityId"));
//        vc.setCityName(rs.getString("CityName"));
//        vc.setEstadoId(rs.getLong("EstadoId"));
//        vc.setEstadoName(rs.getString("EstadoName"));
//        vc.setCampanhaStatusId(rs.getLong("CampanhaStatusId"));
//        vc.setDataInicial(rs.getTimestamp("DataInicial")); // Start Date
//        vc.setDataFinal(rs.getTimestamp("DataFinal")); // End Date

        return vc;
    }
}