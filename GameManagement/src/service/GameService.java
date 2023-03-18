package service;

import entities.Game;

import java.util.List;

public interface GameService {
   void saveGame(Game game);
   List<Game> getAllGame();
   Game getGameById(int id);
   Game updateGame(int id, Game game);
   void deleteGameById(int id);


}
