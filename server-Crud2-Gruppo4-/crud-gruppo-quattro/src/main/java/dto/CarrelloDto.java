
package dto;

import java.util.List;
import model.Prodotto;


public class CarrelloDto {
    private List<Prodotto> listaProdotti;

    public CarrelloDto() {
    }

    public CarrelloDto(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    @Override
    public String toString() {
        return "CarrelloDto{" + "listaProdotti=" + listaProdotti + '}';
    }
    
    
}

