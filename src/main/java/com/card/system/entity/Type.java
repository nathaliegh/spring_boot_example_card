package com.card.system.entity;

import javax.jdo.annotations.Unique;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


/**
 * TYPE Entity
 *
 * Table containing type list
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "TYPE")
public class Type {

    @Id
    @Column(name = "TYPE_ID")
    @NotNull
    @Unique
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "type_Sequence")
    @SequenceGenerator(name = "type_Sequence", sequenceName = "SITE_SEQ",initialValue=1, allocationSize=1)
    private Integer typeId;

    @Column(name = "DESCRIPTION", unique = true, nullable = false)
    private String description;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "SITE_TYPE_ID")
    private Set<Site> siteSet = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "PROFILE_TYPE_ID")
    private Set<Profile> profileSet = new HashSet<>();

    public Type() {
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Site> getSiteSet() {
        return siteSet;
    }

    public void setSiteSet(Set<Site> siteSet) {
        this.siteSet = siteSet;
    }

    public Set<Profile> getProfileSet() {
        return profileSet;
    }

    public void setProfileSet(Set<Profile> profileSet) {
        this.profileSet = profileSet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(typeId, type.typeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeId);
    }

    @Override
    public String toString() {
        return "Type{" +
                "typeId=" + typeId +
                ", description='" + description + '\'' +
                ", siteSet=" + siteSet +
                ", profileSet=" + profileSet +
                '}';
    }
}
