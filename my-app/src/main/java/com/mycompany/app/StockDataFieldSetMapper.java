package com.mycompany.app;

import java.math.BigDecimal;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindException;

import com.mycompany.model.StockData;

@Component("stockDataFieldMapper")
public class StockDataFieldSetMapper implements FieldSetMapper<StockData> {
 
    public StockData mapFieldSet(FieldSet fieldSet) throws BindException {
        StockData data = new StockData();
        data.setSymbol(fieldSet.readString(0));
        data.setName(fieldSet.readString(1));
 
        String lastSaleVal = fieldSet.readString(2);
        if ("n/a".equals(lastSaleVal)) {
            data.setLastSale("0");
        } else {
            data.setLastSale(lastSaleVal);
        }
 
        data.setMarketCap(fieldSet.readString(3));
        data.setAdrTso(fieldSet.readString(4));
        data.setIpoYear(fieldSet.readString(5));
        data.setSector(fieldSet.readString(6));
        data.setIndustry(fieldSet.readString(7));
        data.setSummaryUrl(fieldSet.readString(8));
        return data;
    }
}