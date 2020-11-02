package com.card.system.entity;

import javax.persistence.*;

/**
 * INVITATION Entity
 *
 * Table containing the list of invitation
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "INVITATION",uniqueConstraints =  { @UniqueConstraint(columnNames = {"INVITATION_OWNER_ID","INVITATION_EMAIL","INVITATION_SITE_ID"})})
public class Invitation {

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride( name = "invitationOwnerId", column = @Column(name = "INVITATION_OWNER_ID", nullable = false)),
            @AttributeOverride( name = "invitationEmail", column = @Column(name = "INVITATION_EMAIL" , nullable = false)),
            @AttributeOverride( name = "invitationSiteId", column = @Column(name = "INVITATION_SITE_ID" , nullable = false)),
    })
    protected InvitationPK invitationPK;

    @Column(name = "USER_ID")
    private Integer invitationUserId;

    @Column(name = "STATUS_CODE", nullable = false)
    private String statusCode;


    public Invitation() {
    }

    public Invitation(InvitationPK invitationPK) {
        this.invitationPK = invitationPK;
    }

    public InvitationPK getInvitationPK() {
        return invitationPK;
    }

    public void setInvitationPK(InvitationPK invitationPK) {
        this.invitationPK = invitationPK;
    }

    public Integer getInvitationUserId() {
        return invitationUserId;
    }

    public void setInvitationUserId(Integer invitationUserId) {
        this.invitationUserId = invitationUserId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    @Override
    public String toString() {
        return "Invitation{" +
                "invitationPK=" + invitationPK +
                ", invitationUserId=" + invitationUserId +
                ", statusCode='" + statusCode + '\'' +
                '}';
    }
}
