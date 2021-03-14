package controller;

import dto.CarrelloDto;
import dto.CriterioRicercaDto;
import dto.ProdottoDto;
import model.Prodotto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CrudService;

@CrossOrigin("*")
@RestController
public class CrudController {

    @Autowired
    CrudService crudService;

    @RequestMapping("/aggiungi")
    public CarrelloDto aggiungi(@RequestBody ProdottoDto dto) {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    //dubbio se passare un prodottoDto o criterio ricercadto
    @RequestMapping("/modifica")
    public CarrelloDto modifica(@RequestBody ProdottoDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping("/rimuovi")
    public CarrelloDto rimuovi(@RequestBody ProdottoDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping("/aggiorna")
    public CarrelloDto aggiorna() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @RequestMapping("/ricerca")
    public CarrelloDto ricerca(@RequestBody CriterioRicercaDto dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
