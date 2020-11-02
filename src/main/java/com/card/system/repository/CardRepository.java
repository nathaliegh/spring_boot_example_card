package com.card.system.repository;

import com.card.system.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * CARD Repository
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Repository
public interface CardRepository extends JpaRepository<Card, String> {
}
