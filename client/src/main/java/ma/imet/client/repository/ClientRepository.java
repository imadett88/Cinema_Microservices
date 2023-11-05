package ma.imet.client.repository;

import ma.imet.client.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client,Long> {
    List<Client> findAllByCinemaId(Long cinemaId);
}
