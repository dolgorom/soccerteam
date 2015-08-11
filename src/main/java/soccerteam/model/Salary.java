/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerteam.model;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.Locale;

/**
 *
 * @author roman_dolgoter
 */
public class Salary {
    
    private Currency currency;
    private BigDecimal amount;
    
    public Salary(){
        Locale locale = Locale.getDefault();
        this.currency = Currency.getInstance(locale);
    }
    
    public Salary(BigDecimal amount){
        this();
        this.amount = amount;
    }
    
    public Salary(BigDecimal amount, Locale locale){
        this.currency = Currency.getInstance(locale);
        this.amount = amount;
    }

    /**
     * @return the currency
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * @param currency the currency to set
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    /**
     * @return the amount
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "currency=" + currency +
                ", amount=" + amount +
                '}';
    }
}
