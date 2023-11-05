package ma.imet.cinema.connection;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Client {
    private String firstName;
    private String lastName;
    private String email;
}
