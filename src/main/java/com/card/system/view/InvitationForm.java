package com.card.system.view;

import java.util.Objects;

/**
 * INVITATION Form
 *
 *
 * @author NG
 * @version 0.0.1
 */
public class InvitationForm {
    private Integer ownerId;
    private String email;
    private String site;

    public InvitationForm() {
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvitationForm that = (InvitationForm) o;
        return Objects.equals(ownerId, that.ownerId) &&
                Objects.equals(email, that.email) &&
                Objects.equals(site, that.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ownerId, email, site);
    }

    @Override
    public String toString() {
        return "InvitationForm{" +
                "ownerId=" + ownerId +
                ", email='" + email + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
