/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serviceImpl;

import dto.CarrelloDto;
import java.util.ArrayList;
import java.util.List;
import model.Prodotto;
import org.springframework.stereotype.Service;
import repository.CrudRepository;
import service.CrudService;

@Service
public class CrudServiceImpl implements CrudService {
    
    CrudRepository crudRepository;

    @Override
    public CarrelloDto aggiungi(Prodotto prodotto) {
       crudRepository.save(prodotto);
        return aggiornaCarrello();
    }

    @Override
    public CarrelloDto modifica(Prodotto prodotto) {
        //Dobbiamo trovare un modo per modificare il prodotto
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
    public CarrelloDto rimuovi(Prodotto prodotto) {
        crudRepository.delete(prodotto);
        return aggiornaCarrello();
    }

    @Override
    public CarrelloDto aggiornaCarrello() {
       CarrelloDto dto = new CarrelloDto();
       List<Prodotto> listaProdotti = crudRepository.findAll();
       if(listaProdotti == null) {
           dto.setListaProdotti(new ArrayList());
       } else {
           dto.setListaProdotti(listaProdotti);
       }
        return dto;
    }

    @Override
    public CarrelloDto ricercaProdotto(String stringa) {
        List<Prodotto> lista = crudRepository.findByCodice(stringa);
        return new CarrelloDto(lista);
    }
    
}
