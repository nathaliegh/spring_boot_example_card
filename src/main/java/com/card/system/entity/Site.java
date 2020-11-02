package com.card.system.entity;

import javax.jdo.annotations.Unique;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * SITE Entity
 *
 * Table containing the list of sites
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "SITE")
public class Site {

    @Id
    @Column(name = "SITE_ID")
    @NotNull
    @Unique
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "site_Sequence")
    @SequenceGenerator(name = "site_Sequence", sequenceName = "SITE_SEQ",initialValue=1, allocationSize=1)
    private Integer siteId;

    @Column(name = "NAME",  nullable = false)
    private String name;

    @Column(name = "SITE_TYPE_ID",  nullable = false)
    private Integer siteTypeId;

    @Column(name = "PROFILE_ID", nullable = false)
    private String profileId;

    @Column(name = "CREATED_BY", nullable = false)
    private Integer createdBy;

    @Column(name = "CREATED_DATE", nullable = false)
    private Date createdDate;


    public Site() {
    }

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "TEAM_SITE_ID")
    private Set<Team> teamSet = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "INVITATION_SITE_ID")
    private Set<Invitation> invitationOwnerSet = new HashSet<>();

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getSiteTypeId() {
        return siteTypeId;
    }

    public void setSiteTypeId(Integer siteTypeId) {
        this.siteTypeId = siteTypeId;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Set<Team> getTeamSet() {
        return teamSet;
    }

    public void setTeamSet(Set<Team> teamSet) {
        this.teamSet = teamSet;
    }

    public Set<Invitation> getInvitationOwnerSet() {
        return invitationOwnerSet;
    }

    public void setInvitationOwnerSet(Set<Invitation> invitationOwnerSet) {
        this.invitationOwnerSet = invitationOwnerSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return Objects.equals(siteId, site.siteId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(siteId);
    }

    @Override
    public String toString() {
        return "Site{" +
                "siteId=" + siteId +
                ", name='" + name + '\'' +
                ", siteTypeId=" + siteTypeId +
                ", profileId='" + profileId + '\'' +
                ", createdBy=" + createdBy +
                ", createdDate=" + createdDate +
                ", teamSet=" + teamSet +
                ", invitationOwnerSet=" + invitationOwnerSet +
                '}';
    }
}
