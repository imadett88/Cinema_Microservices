package ma.imet.cinema.service;

import ma.imet.cinema.connection.FullCinemaResponse;
import ma.imet.cinema.entities.Cinema;
import java.util.List;

public interface CinemaService {

    public void saveCinema(Cinema cinema);

    public List<Cinema> allCinemas();

    public FullCinemaResponse findCinemasWithClients(Long cinemaId);
}
