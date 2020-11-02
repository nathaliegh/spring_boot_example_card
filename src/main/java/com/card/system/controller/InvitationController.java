package com.card.system.controller;


import com.card.system.converter.InvitationConverter;
import com.card.system.entity.Invitation;
import com.card.system.entity.Team;
import com.card.system.entity.TeamPK;
import com.card.system.repository.InvitationRepository;
import com.card.system.repository.TeamRepository;
import com.card.system.util.enumeration.InvitationStatus;
import com.card.system.view.InvitationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Invitation Controller
 */
@RestController
@EnableAutoConfiguration
@RequestMapping({"/invitation"})
public class InvitationController {



    @Autowired
    InvitationConverter invitationConverter;

    @Autowired
    @Qualifier("invitationRepository")
    private InvitationRepository invitationRepository;


    @Autowired
    @Qualifier("teamRepository")
    private TeamRepository teamRepository;


    @PostMapping("/request")
    public ResponseEntity<?> request(@RequestBody InvitationForm invitationForm)  {
        //validate invitation Form
        //convert to entity
        Invitation invitation = invitationConverter.convertToEntity(invitationForm);
        invitation.setStatusCode(InvitationStatus.REJECTED.getValue());
        //save as request invitation
        invitationRepository.saveAndFlush(invitation);
        return new ResponseEntity(true, HttpStatus.OK
        );
    }

    @PutMapping("/approve")
    public ResponseEntity<?> approve(@RequestBody InvitationForm invitationForm)  {
        // convert to entity
        Invitation invitation = invitationConverter.convertToEntity(invitationForm);
        invitation.setStatusCode(InvitationStatus.APPROVED.getValue());
        // save as member in team
        TeamPK teamPK = new TeamPK();
        teamPK.setTeamSiteId(invitation.getInvitationPK().getInvitationSiteId());
        teamPK.setTeamUserId(invitation.getInvitationPK().getInvitationOwnerId());
        Team team = new Team(teamPK);
        teamRepository.saveAndFlush(team);
        //save as approved invitation
        invitationRepository.saveAndFlush(invitation);
        return new ResponseEntity(true, HttpStatus.OK
        );

    }

    @PutMapping("/reject")
    public ResponseEntity<?> reject(@RequestBody InvitationForm invitationForm)  {
        // convert to entity
        Invitation invitation = invitationConverter.convertToEntity(invitationForm);
        invitation.setStatusCode(InvitationStatus.REJECTED.getValue());
        //save as rejected invitation
        invitationRepository.saveAndFlush(invitation);
        return new ResponseEntity(true, HttpStatus.OK
        );

    }
}
