package com.fshtank.demo.model;

public class DemoWebRequest {

    private String locale;
    private String language;
    private Long cityId;
    private String cityName;
    private Long stateId; // EstadoId
    private String stateName;

    private Long regiaoId;
    private Long pCampanhaId; // pbcTable.CampaignID
    private Long vCampanhaId; // vCampaignOperationalAreaCity.CampaignID
    private Long ofertaId;
    private Long veiculoId;
    private Long veiculoCategoriaId;

    private Long ano;
    private String cor;

    private CampaignType campaignType;

    private String[] listOfModels; // To select Backup Offers (where Model not in)

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public Long getStateId() {
        return stateId;
    }

    public void setStateId(Long stateId) {
        this.stateId = stateId;
    }

    public Long getRegiaoId() {
        return regiaoId;
    }

    public void setRegiaoId(Long regiaoId) {
        this.regiaoId = regiaoId;
    }

    public Long getpCampanhaId() {
        return pCampanhaId;
    }

    public void setpCampanhaId(Long pCampanhaId) {
        this.pCampanhaId = pCampanhaId;
    }

    public Long getvCampanhaId() {
        return vCampanhaId;
    }

    public void setvCampanhaId(Long vCampanhaId) {
        this.vCampanhaId = vCampanhaId;
    }

    public Long getOfertaId() {
        return ofertaId;
    }

    public void setOfertaId(Long ofertaId) {
        this.ofertaId = ofertaId;
    }

    public Long getVeiculoId() {
        return veiculoId;
    }

    public void setVeiculoId(Long veiculoId) {
        this.veiculoId = veiculoId;
    }

    public Long getVeiculoCategoriaId() {
        return veiculoCategoriaId;
    }

    public void setVeiculoCategoriaId(Long veiculoCategoriaId) {
        this.veiculoCategoriaId = veiculoCategoriaId;
    }

    public Long getAno() {
        return ano;
    }

    public void setAno(Long ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public CampaignType getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(CampaignType campaignType) {
        this.campaignType = campaignType;
    }

    public String[] getListOfModels() {
        return listOfModels;
    }

    public void setListOfModels(String[] listOfModels) {
        this.listOfModels = listOfModels;
    }
}
