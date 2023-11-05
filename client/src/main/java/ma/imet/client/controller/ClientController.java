package ma.imet.client.controller;

import lombok.RequiredArgsConstructor;
import ma.imet.client.entities.Client;
import ma.imet.client.service.ClientServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clients")
@RequiredArgsConstructor
public class ClientController {

    private final ClientServiceImpl clientServiceImp;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@RequestBody Client client){
        clientServiceImp.saveClient(client);
    }

    @GetMapping
    public ResponseEntity<List<Client>> findAll() {
       return ResponseEntity.ok(clientServiceImp.allClients());
    }

}
