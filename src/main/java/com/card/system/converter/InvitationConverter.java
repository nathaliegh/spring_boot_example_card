package com.card.system.converter;

import com.card.system.entity.Invitation;
import com.card.system.entity.InvitationPK;
import com.card.system.entity.Site;
import com.card.system.entity.User;
import com.card.system.repository.SiteRepository;
import com.card.system.repository.UserRepository;
import com.card.system.view.InvitationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Invitation Converter
 */
@Component
public class InvitationConverter {

    @Autowired
    @Qualifier("siteRepository")
    private SiteRepository siteRepository;

    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    public Invitation convertToEntity(InvitationForm invitationForm){
        Invitation invitation = new Invitation();
        InvitationPK invitationPK = new InvitationPK();
        Site site = siteRepository.fingByName(invitationForm.getSite());
        invitationPK.setInvitationEmail(invitationForm.getEmail());
        invitationPK.setInvitationOwnerId(invitationForm.getOwnerId());
        invitationPK.setInvitationSiteId(site.getSiteId());
        invitation.setInvitationPK(invitationPK);
        User user = userRepository.fingByEmail(invitationForm.getEmail());
        if(user!= null) invitation.setInvitationUserId(user.getUserId());
        return invitation;
    }
}
