package com.abdul.epl.repo;

import com.abdul.epl.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by abdul on 7/29/17.
 */

//@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
}
