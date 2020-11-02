package com.card.system.entity;

import javax.jdo.annotations.Unique;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;


/**
 * PROFILE Entity
 *
 * Table containing profile list
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "PROFILE")
public class Profile {

    @Id
    @Column(name = "PROFILE_ID")
    @NotNull
    @Unique
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "profile_Sequence")
    @SequenceGenerator(name = "profile_Sequence", sequenceName = "PROFILE_SEQ",initialValue=1, allocationSize=1)
    private Integer profileId;

    @Column(name = "DESCRIPTION", unique = true, nullable = false)
    private String description;

    @Column(name = "PROFILE_TYPE_ID", unique = true, nullable = false)
    private Integer profileTypeId ;

    public Profile() {
    }

    public Integer getProfileId() {
        return profileId;
    }

    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getProfileTypeId() {
        return profileTypeId;
    }

    public void setProfileTypeId(Integer profileTypeId) {
        this.profileTypeId = profileTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(profileId, profile.profileId) &&
                Objects.equals(profileTypeId, profile.profileTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(profileId, profileTypeId);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "profileId=" + profileId +
                ", description='" + description + '\'' +
                ", profileTypeId=" + profileTypeId +
                '}';
    }
}
