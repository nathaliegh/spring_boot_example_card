package com.card.system.repository;

import com.card.system.entity.Card;
import com.card.system.entity.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Invitation Repository
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Repository
public interface InvitationRepository extends JpaRepository<Invitation, String> {

    @Modifying
    @Transactional
    @Query(value = "update Invitation u set u.STATUS_CODE = ? where u.INVITATION_OWNER_ID = ? and u.INVITATION_EMAIL = ? and INVITATION_SITE_ID = ?",
            nativeQuery = true)
    int updateInvitation(@Param("statusCode") String statusCode, @Param("invitationOwnerId") Integer invitationOwnerId, @Param("invitationEmail") String invitationEmail, @Param("invitationSiteId") Integer invitationSiteId);


}
