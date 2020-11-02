package com.card.system.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

/**
 * INVITATION PK
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Embeddable
public class InvitationPK  implements Serializable {

    private Integer invitationOwnerId;

    private String invitationEmail;

    private Integer invitationSiteId;

    public InvitationPK() {
    }

    public Integer getInvitationOwnerId() {
        return invitationOwnerId;
    }

    public void setInvitationOwnerId(Integer invitationOwnerId) {
        this.invitationOwnerId = invitationOwnerId;
    }

    public String getInvitationEmail() {
        return invitationEmail;
    }

    public void setInvitationEmail(String invitationEmail) {
        this.invitationEmail = invitationEmail;
    }

    public Integer getInvitationSiteId() {
        return invitationSiteId;
    }

    public void setInvitationSiteId(Integer invitationSiteId) {
        this.invitationSiteId = invitationSiteId;
    }

    @Override
    public String toString() {
        return "InvitationPK{" +
                "invitationOwnerId=" + invitationOwnerId +
                ", invitationEmail='" + invitationEmail + '\'' +
                ", invitationSiteId=" + invitationSiteId +
                '}';
    }

}
