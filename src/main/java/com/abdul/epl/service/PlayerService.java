package com.abdul.epl.service;

import com.abdul.epl.model.Player;
import com.abdul.epl.repo.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abdul on 7/29/17.
 */

public interface PlayerService {
    public void createPlayer(Player player);
    public List<Player> getAllPlayers();
}
