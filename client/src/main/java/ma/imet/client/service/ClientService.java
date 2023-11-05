package ma.imet.client.service;

import ma.imet.client.entities.Client;

import java.util.List;

public interface ClientService {

    public void saveClient(Client client);

    public List<Client> allClients();
}
