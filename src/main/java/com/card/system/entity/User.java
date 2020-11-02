package com.card.system.entity;

import javax.jdo.annotations.Unique;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * USER Entity
 *
 * Table containing the list of users
 *
 * @author NG
 * @version 0.0.1
 */
@Entity
@Table(name = "USER")
public class User implements Serializable {
    @Id
    @Column(name = "USER_ID")
    @NotNull
    @Unique
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_Sequence")
    @SequenceGenerator(name = "user_Sequence", sequenceName = "USER_SEQ",initialValue=1, allocationSize=1)
    private Integer userId;

    @Column(name = "FIRSTNAME",  nullable = false)
    private String firstname;

    @Column(name = "LASTNAME",  nullable = false)
    private String lastname;

    @Column(name = "EMAIL", unique = true , nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;


   @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "TEAM_USER_ID")
    private Set<Team> teamSet = new HashSet<>();

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "INVITATION_OWNER_ID")
    private Set<Invitation> invitationOwnerSet = new HashSet<>();

    public User() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        User user = (User) o;
        return Objects.equals(userId, user.userId) &&
                Objects.equals(email, user.email);
    }



    @Override
    public int hashCode() {
        return Objects.hash(userId, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", teamSet=" + teamSet +
                ", invitationOwnerSet=" + invitationOwnerSet +
                '}';
    }
}

