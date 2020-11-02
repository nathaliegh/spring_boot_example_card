package com.card.system.repository;

import com.card.system.entity.Site;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Site Repository
 *
 *
 * @author NG
 * @version 0.0.1
 */
@Repository
public interface SiteRepository extends JpaRepository<Site, String> {

    Site fingByName(String name);


}
