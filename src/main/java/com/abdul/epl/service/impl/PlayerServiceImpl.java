package com.abdul.epl.service.impl;

import com.abdul.epl.model.Player;
import com.abdul.epl.repo.PlayerRepository;
import com.abdul.epl.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by abdul on 7/29/17.
 */

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    PlayerRepository playerRepository;

    public void createPlayer(Player player){
        playerRepository.save(player);
    }

    public List<Player> getAllPlayers(){
        return playerRepository.findAll();
    }
}
