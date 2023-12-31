package ma.imet.cinema.controller;

import lombok.RequiredArgsConstructor;
import ma.imet.cinema.entities.Cinema;
import ma.imet.cinema.service.CinemaServiceImpl;
import ma.imet.cinema.connection.FullCinemaResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cinemas")
@RequiredArgsConstructor
public class CinemaController {

    private final CinemaServiceImpl cinemaServiceImpl;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Cinema cinema){
        cinemaServiceImpl.saveCinema(cinema);
    }

    @GetMapping
    public ResponseEntity<List<Cinema>> findAll() {
       return ResponseEntity.ok(cinemaServiceImpl.allCinemas());
    }

    @GetMapping("/with-clients/{cinema-id}")
    public ResponseEntity<FullCinemaResponse> findAll(@PathVariable("cinema-id") Long cinemaId){
        return ResponseEntity.ok(cinemaServiceImpl.findCinemasWithClients(cinemaId));
    }

}
