package com.card.system.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * TEAM Entity
 *
 * Table containing the list of team
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "TEAM",uniqueConstraints =  { @UniqueConstraint(columnNames = {"TEAM_SITE_ID","TEAM_USER_ID"})})
public class Team implements Serializable {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride( name = "teamSiteId", column = @Column(name = "TEAM_SITE_ID", nullable = false)),
            @AttributeOverride( name = "teamUserId", column = @Column(name = "TEAM_USER_ID" , nullable = false))
    })
    protected TeamPK teamPK;

    public Team() {
    }

    public Team(TeamPK teamPK) {
        this.teamPK = teamPK;
    }

    public TeamPK getTeamPK() {
        return teamPK;
    }

    public void setTeamPK(TeamPK teamPK) {
        this.teamPK = teamPK;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamPK=" + teamPK +
                '}';
    }
}

