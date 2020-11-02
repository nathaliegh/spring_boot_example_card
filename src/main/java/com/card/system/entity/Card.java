package com.card.system.entity;

import javax.jdo.annotations.Unique;
import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.Objects;

/**
 * CARD Entity
 *
 * Table containing card list
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "CARD")
public class Card {

    @Id
    @Column(name = "CARD_ID")
    @NotNull
    @Unique
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "card_Sequence")
    @SequenceGenerator(name = "card_Sequence", sequenceName = "CARD_SEQ",initialValue=1, allocationSize=1)
    private Integer cardId;

    @Column(name = "CARD_USER_ID",  nullable = false)
    private String cardUserId;

    @Column(name = "CARD_USAGE",  nullable = false)
    private String cardUsage;

    @Column(name = "CARD_STATUS",  nullable = false)
    private String cardStatus;

    @Column(name = "TOP_UP_LIMIT",  nullable = false )
    private Integer topUpLimit;

    @Min(1)
    @Max(4)
    @Column(name = "WEEKLY_LIMIT",  nullable = false )
    private Integer weeklyLimit;

    @Min(1)
    @Max(4)
    @Column(name = "MONTHLY_LIMIT",  nullable = false )
    private Integer monthlyLimit;

    @Min(1991)
    @Max(2020)
    @Column(name = "YEARLY_LIMIT",  nullable = false )
    private Integer yearlyLimit;

    @Column(name = "FEES" )
    private Double fees;

    @Column(name = "CREATED_BY" )
    private Integer CreatedBy;

    @Column(name = "CREATED_DATE" )
    private Date CreatedDate;

    public Card() {
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardUserId() {
        return cardUserId;
    }

    public void setCardUserId(String cardUserId) {
        this.cardUserId = cardUserId;
    }

    public String getCardUsage() {
        return cardUsage;
    }

    public void setCardUsage(String cardUsage) {
        this.cardUsage = cardUsage;
    }

    public String getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(String cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Integer getTopUpLimit() {
        return topUpLimit;
    }

    public void setTopUpLimit(Integer topUpLimit) {
        this.topUpLimit = topUpLimit;
    }

    public Integer getWeeklyLimit() {
        return weeklyLimit;
    }

    public void setWeeklyLimit(Integer weeklyLimit) {
        this.weeklyLimit = weeklyLimit;
    }

    public Integer getMonthlyLimit() {
        return monthlyLimit;
    }

    public void setMonthlyLimit(Integer monthlyLimit) {
        this.monthlyLimit = monthlyLimit;
    }

    public Integer getYearlyLimit() {
        return yearlyLimit;
    }

    public void setYearlyLimit(Integer yearlyLimit) {
        this.yearlyLimit = yearlyLimit;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Integer getCreatedBy() {
        return CreatedBy;
    }

    public void setCreatedBy(Integer createdBy) {
        CreatedBy = createdBy;
    }

    public Date getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(Date createdDate) {
        CreatedDate = createdDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(cardId, card.cardId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId);
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardId=" + cardId +
                ", cardUserId='" + cardUserId + '\'' +
                ", cardUsage='" + cardUsage + '\'' +
                ", cardStatus='" + cardStatus + '\'' +
                ", topUpLimit=" + topUpLimit +
                ", weeklyLimit=" + weeklyLimit +
                ", monthlyLimit=" + monthlyLimit +
                ", yearlyLimit=" + yearlyLimit +
                ", fees=" + fees +
                ", CreatedBy=" + CreatedBy +
                ", CreatedDate=" + CreatedDate +
                '}';
    }
}
