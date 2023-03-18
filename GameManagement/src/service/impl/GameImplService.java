package service.impl;

import entities.Game;
import service.GameService;

import java.util.ArrayList;
import java.util.List;

public class GameImplService implements GameService {
    Game game=new Game();
    @Override
    public void saveGame(Game game1) {
        game.setId(game1.getId());
        game.setCost(game1.getCost());
        game.setName(game1.getName());
        game.setCountofManager(game1.getCountofManager());

    }

    @Override
    public List<Game> getAllGame() {
        List<Game> listGame=new ArrayList<>();
        return  listGame;
    }

    @Override
    public Game getGameById(int id) {
        if(game.getId()==id){
            return game;
        }
        else {
            return null;
        }
    }

    @Override
    public Game updateGame(int id, Game game1) {
        if(game.getId()==id){
            game.setId(game1.getId());
            game.setCost(game1.getCost());
            game.setName(game1.getName());
            game.setCountofManager(game1.getCountofManager());
        }
        else {
            return null;
        }
        return game;
    }

    @Override
    public void deleteGameById(int id) {
      if(game.getId()==id){
          System.out.println("Game is deleted..");
      }
      else{
          System.out.println("Game not Found");
      }
    }
}
