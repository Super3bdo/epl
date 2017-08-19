package com.abdul.epl.api;

import com.abdul.epl.api.util.EplRequest;
import com.abdul.epl.api.util.EplResponse;
import com.abdul.epl.model.Player;
import com.abdul.epl.service.PlayerService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by abdul on 7/29/17.
 */
@Path("/players")
public class PlayerApi {
    ObjectMapper objectMapper;
    @Autowired
    PlayerService playerService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public EplResponse<Player> createPlayer(EplRequest<Player>request){
        EplResponse<Player> response = new EplResponse<Player>();

        try {
            Player player = request.getEntity();
            playerService.createPlayer(player);
            response.setEntity(player);
        }
        catch(Exception e){
            response.setRepsonseCode("404");
            response.setMesssage(e.toString());
        }
        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public EplResponse getAllPlayers(EplRequest<Player>request){
        EplResponse<List<Player>> response = new EplResponse();

        try {
            List<Player> players =  playerService.getAllPlayers();
            response.setEntity(players);
        }
        catch(Exception e){
            response.setRepsonseCode("404");
            response.setMesssage(e.toString());
        }
        return response;
    }
}
