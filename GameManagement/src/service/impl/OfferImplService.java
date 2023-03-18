package service.impl;

import entities.Offer;
import service.OfferService;

import java.util.ArrayList;
import java.util.List;

public class OfferImplService implements OfferService {
    Offer offer =new Offer();
    @Override
    public void saveGame(Offer offer1) {
        offer.setId(offer1.getId());
        offer.setOfferName(offer1.getOfferName());
    }

    @Override
    public List<Offer> getAllGame() {
       List<Offer> offers=new ArrayList<>();
       return offers;
    }

    @Override
    public Offer getGameById(int id) {
       if(offer.getId()==id){
           return offer;
       }
       else {
           return null;
       }
    }

    @Override
    public Offer updateGame(int id, Offer offer1) {
      if(offer.getId()==id){
          offer.setId(offer1.getId());
          offer.setOfferName(offer1.getOfferName());
      }
      else{
          return null;
      }
      return offer;
    }

    @Override
    public void deleteGameById(int id) {
         if(offer.getId()==id){
             System.out.println("Offer is delete..");
         }
         else{
             System.out.println("Offer not found...");
         }
    }
}
