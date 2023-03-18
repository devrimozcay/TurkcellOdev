package service;

import entities.Offer;
import java.util.List;

public interface OfferService {
    void saveGame(Offer offer);
    List<Offer> getAllGame();
    Offer getGameById(int id);
    Offer updateGame(int id, Offer offer);
    void deleteGameById(int id);
}
