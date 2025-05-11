package com.lara.alisson.conversormoeda.dto;

public class CotacaoDto {
    private String codeBase;
    private String codeTarget;
    private double conversionRate;


    public CotacaoDto(ConversionRates conversionRates){
        this.codeBase = conversionRates.base_code();
        this.codeTarget = conversionRates.target_code();
        this.conversionRate = conversionRates.conversion_rate();
    }

    public String getCodeBase() {
        return codeBase;
    }

    public void setCodeBase(String codeBase) {
        this.codeBase = codeBase;
    }

    public String getCodeTarget() {
        return codeTarget;
    }

    public void setCodeTarget(String codeTarget) {
        this.codeTarget = codeTarget;
    }

    public double getConversionRate(double valor) {
        return conversionRate * valor;
    }

    public void setConversionRate(double conversionRate) {
        this.conversionRate = conversionRate;
    }


    @Override
    public String toString() {
        return "CotacaoDto{" +
                "codeBase='" + codeBase + '\'' +
                ", codeTarget='" + codeTarget + '\'' +
                ", conversionRate=" + conversionRate +
                '}';
    }
}
