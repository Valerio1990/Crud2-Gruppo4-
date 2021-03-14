
package repository;

import java.util.List;
import model.Prodotto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrudRepository extends JpaRepository <Prodotto,Long> {
    public List<Prodotto> findByCodice(String c);
}
