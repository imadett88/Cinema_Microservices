package ma.imet.client.service;

import lombok.RequiredArgsConstructor;
import ma.imet.client.entities.Client;
import ma.imet.client.repository.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;


    @Override
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public List<Client> allClients() {
        return clientRepository.findAll();
    }

    @Override
    public List<Client> allClientsByCinema(Long cinemaId) {
        return clientRepository.findAllByCinemaId(cinemaId);
    }
}
