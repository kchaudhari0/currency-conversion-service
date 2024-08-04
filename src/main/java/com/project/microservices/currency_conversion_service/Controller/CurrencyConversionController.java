package com.project.microservices.currency_conversion_service.Controller;

import com.project.microservices.currency_conversion_service.Beans.currencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public currencyConversion calculateCurrencyConversion(
            @PathVariable String from,
            @PathVariable String to,
            @PathVariable BigDecimal quantity
    ) {

        return new currencyConversion(1001L,from, to , quantity , BigDecimal.ONE , BigDecimal.ONE ,"");
    }

}
