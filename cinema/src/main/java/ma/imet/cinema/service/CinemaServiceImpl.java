package ma.imet.cinema.service;

import lombok.RequiredArgsConstructor;
import ma.imet.cinema.connection.FullCinemaResponse;
import ma.imet.cinema.connection.client.Clientcl;
import ma.imet.cinema.entities.Cinema;
import ma.imet.cinema.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;
    private Clientcl clientcl;


    @Override
    public void saveCinema(Cinema cinema) {
        cinemaRepository.save(cinema);
    }

    @Override
    public List<Cinema> allCinemas() {
        return cinemaRepository.findAll();
    }

    @Override
    public FullCinemaResponse findCinemasWithClients(Long cinemaId) {
        var cinema = cinemaRepository.findById(cinemaId)
                .orElse(
                        Cinema.builder()
                                .name("NOT FOUND")
                                .email("NOT FOUND")
                                .build()
                );
        var clients = clientcl.findAllClientsByCinema(cinemaId);
        return FullCinemaResponse.builder()
                .name(cinema.getName())
                .email(cinema.getEmail())
                .clients(clients)
                .build();
    }
}
