package ma.imet.cinema.connection.client;

import ma.imet.cinema.connection.Client;
import ma.imet.cinema.entities.Cinema;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "client-service",url = "${application.config.clients-url}")
public interface Clientcl {

    @GetMapping("/cinema/{cinema-id}")
    List<Client> findAllClientsByCinema(@PathVariable("cinema-id") Long cinemaId);
}
