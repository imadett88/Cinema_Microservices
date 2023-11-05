package ma.imet.cinema.connection;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class FullCinemaResponse {

    private String name;
    private String email;
    List<Client> clients;
}
