package com.fshtank.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;

/**
 * SQLqueryConfiguration is to capture any SQL from Properties files
 * and make available to the Application.
 *
 */
// @Configuration
@ComponentScan(basePackages = "com.fshtank.demo")
public class SQLqueryConfigs {
    @Value("${select.PbcOfertaVeiculo}")
    private String selectPbcOfertaVeiculo;

    @Value("${select.PbcOfertaVeiculo.join.vCampaignOperationalAreaCity}")
    private String selectPbcOfertaJoinVCampaignByCity;

    @Value("${select.PbcOfertaVeiculo.backup.offers}")
    private String selectBackupPbcOferta;

    // Campaign ID by Active Dates
    @Value("${select.vCampaignOperationalAreaCity}")
    private String select_vCampaignOperationalAreaCity;

    @Value("${select.OfertaServicoAcessorio}")
    private String select_OfertaServicoAcessorio;

    @Value("${select.VehicleCgiColors}")
    private String select_VehicleCgiColors;

    @Value("${select.VehicleOptions}")
    private String select_VehicleOptions;

    @Value("${where.v_cityName}")
    private String whereV_CityName;

    @Value("${where.v_stateName}")
    private String whereV_StateName;

    @Value("${where.p_ofertaId}")
    private String whereP_OfertaId;

    @Value("${where.p_veiculoId}")
    private String whereP_VeiculoId;

    // Brazil Special Characters do not read in correctly from Properties file
    @Value("${where.campaign_type_pbc}")
    private String where_CampaignTypePbc;

    @Value("${where.campaign_type_svc_acc}")
    private String where_CampaignTypeSvcAcc;

    @Value("${where.backupFilterVehicles}")
    private String where_BackupFilterVehicles;

    private String where_CampaignTypeAccessories = "'Acessório'";
    private String where_CampaignTypeConcessionaria="'Concessionária'";
    private String where_CampaignTypeDirectSales="'DirectSalesCampaign'";
    private String where_CampaignTypeNational="'NationalCampaign'";
    private String where_CampaignTypeServices="'Serviço'";
    private String where_CampaignTypeVehicles="'Veículo'";

    public String getSelectPbcOfertaVeiculo() {
        return selectPbcOfertaVeiculo;
    }

    public String getSelectPbcOfertaJoinVCampaignByCity() {
        return selectPbcOfertaJoinVCampaignByCity;
    }

    public String getSelectBackupPbcOferta() {
        return selectBackupPbcOferta;
    }

    public String getSelect_vCampaignOperationalAreaCity() {
        return select_vCampaignOperationalAreaCity;
    }

    public String getSelect_OfertaServicoAcessorio() {
        return select_OfertaServicoAcessorio;
    }

    public String getSelect_VehicleCgiColors() { return select_VehicleCgiColors; }

    public String getSelect_VehicleOptions() { return select_VehicleOptions; }

    public String getWhereV_CityName() {
        return whereV_CityName;
    }

    public String getWhereV_StateName() {
        return whereV_StateName;
    }

    public String getWhereP_OfertaId() {
        return whereP_OfertaId;
    }

    public String getWhereP_VeiculoId() {
        return whereP_VeiculoId;
    }

    public String getWhere_CampaignTypePbc() {
        return where_CampaignTypePbc;
    }

    public String getWhere_CampaignTypeSvcAcc() {
        return where_CampaignTypeSvcAcc;
    }

    public String getWhere_CampaignTypeAccessories() {
        return where_CampaignTypeAccessories;
    }

    public String getWhere_CampaignTypeConcessionaria() {
        return where_CampaignTypeConcessionaria;
    }

    public String getWhere_CampaignTypeDirectSales() {
        return where_CampaignTypeDirectSales;
    }

    public String getWhere_CampaignTypeNational() {
        return where_CampaignTypeNational;
    }

    public String getWhere_CampaignTypeServices() {
        return where_CampaignTypeServices;
    }

    public String getWhere_CampaignTypeVehicles() {
        return where_CampaignTypeVehicles;
    }

    public String getWhere_BackupFilterVehicles() { return where_BackupFilterVehicles; }
}
