package ma.imet.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Client {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Long cinemaId;


}
