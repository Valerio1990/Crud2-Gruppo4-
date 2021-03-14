
package service;

import dto.CarrelloDto;
import dto.ProdottoDto;
import model.Prodotto;


public interface CrudService {
    CarrelloDto aggiungi(Prodotto prodotto);
     CarrelloDto modifica(Prodotto prodotto);
      CarrelloDto rimuovi(Prodotto prodotto);
      CarrelloDto aggiornaCarrello();
      CarrelloDto ricercaProdotto(String stringa);
    
}
