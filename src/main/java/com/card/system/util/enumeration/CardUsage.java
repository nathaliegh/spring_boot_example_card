package com.card.system.util.enumeration;

import java.io.Serializable;

/**
 * Card Usage enumeration
 *
 * @author NG
 * @version 0.0.1
 */
public enum CardUsage implements Serializable {


    ONE_TIME_BONUS( "OTB"),
    CASH_BACK("CB"),
    REWARDS_POINT("RP"),
        FREQUENT_FLYER_MILES("FFM"),
            SAFETY("S"),
                KEEPING_VENDORS_HONEST("KVH"),
                    GRACE_PERIOD("GP"),
                        INSURANCE("I"),
                            UNIVERSAL_ACCEPTANCE("UA"),
                                BUILDING_CREDIT("BC");

    private final String value;

    CardUsage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
