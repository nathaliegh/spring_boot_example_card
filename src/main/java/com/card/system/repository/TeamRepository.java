package com.card.system.repository;

import com.card.system.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Invitation Repository
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Repository
public interface TeamRepository extends JpaRepository<Team, String> {


}
