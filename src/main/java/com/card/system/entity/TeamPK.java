package com.card.system.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * TEAMPK
 * <p>
 * Table containing team Primary keys
 *
 * @author NG
 * @version 0.0.1
 */
@Embeddable
public class TeamPK implements Serializable {

    private Integer teamSiteId;

    private Integer teamUserId;

    public TeamPK() {
    }

    public Integer getTeamSiteId() {
        return teamSiteId;
    }

    public void setTeamSiteId(Integer teamSiteId) {
        this.teamSiteId = teamSiteId;
    }

    public Integer getTeamUserId() {
        return teamUserId;
    }

    public void setTeamUserId(Integer teamUserId) {
        this.teamUserId = teamUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamPK teamPK = (TeamPK) o;
        return Objects.equals(teamSiteId, teamPK.teamSiteId) &&
                Objects.equals(teamUserId, teamPK.teamUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamSiteId, teamUserId);
    }

    @Override
    public String toString() {
        return "TeamPK{" +
                "teamSiteId=" + teamSiteId +
                ", teamUserId=" + teamUserId +
                '}';
    }
}