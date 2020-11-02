package com.card.system.util.enumeration;

import java.io.Serializable;

/**
 * Card Status enumeration
 *
 * @author NG
 * @version 0.0.1
 */
public enum CardStatus implements Serializable {

    PREPAID( "PRP"),
    CREDIT("CRD");

    private final String value;

    CardStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
