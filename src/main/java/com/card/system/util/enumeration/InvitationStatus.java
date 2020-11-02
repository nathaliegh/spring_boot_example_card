package com.card.system.util.enumeration;

import java.io.Serializable;

/**
 * Invitation Status enumeration
 *
 * @author NG
 * @version 0.0.1
 */
public enum InvitationStatus implements Serializable {

    REQUESTED( "REQ"),
    APPROVED("APR"),
    REJECTED( "REJ");

    private final String value;

    InvitationStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
