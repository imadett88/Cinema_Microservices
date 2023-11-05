package ma.imet.cinema.service;

import lombok.RequiredArgsConstructor;
import ma.imet.cinema.entities.Cinema;
import ma.imet.cinema.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CinemaServiceImpl implements CinemaService {

    private final CinemaRepository cinemaRepository;


    @Override
    public void saveCinema(Cinema cinema) {
        cinemaRepository.save(cinema);
    }

    @Override
    public List<Cinema> allCinemas() {
        return cinemaRepository.findAll();
    }
}
