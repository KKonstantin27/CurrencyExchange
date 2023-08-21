package dto.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import dto.CurrencyDTO;
import dto.ExchangeRateDTO;
import models.Currency;
import models.ExchangeRate;

public class ConverterJSON {
    private ObjectMapper objectMapper = new ObjectMapper();

    public String convertToJSON(CurrencyDTO currencyDTO) {
        String json;
        try {
            json = objectMapper.writeValueAsString(currencyDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

    public String convertToJSON(ExchangeRateDTO exchangeRateDTO) {
        String json;
        try {
            json = objectMapper.writeValueAsString(exchangeRateDTO);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return json;
    }
}