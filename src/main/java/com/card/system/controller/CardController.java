package com.card.system.controller;

import com.card.system.entity.Card;
import com.card.system.repository.CardRepository;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Card Controller
 */
@RestController
@RequestMapping({"/card"})
public class CardController {
   // @Autowired
   // private KieSession session;

   // @Autowired
  //  @Qualifier("cardRepository")
  //  private CardRepository cardRepository;

    @PostMapping("/save")
    public Card saveCard(@RequestBody Card card) {
       // session.insert(card);
       // session.fireAllRules();
       // cardRepository.saveAndFlush(card);
        return card;
    }

}