package services.impl;

import services.ClienteService;
import dtos.ClienteDTO;
import daos.ClienteDAO;
import model.Cliente;

public class ClienteServiceImpl implements ClienteService {

    public void ingresarCliente(ClienteDTO cli) {

        Cliente cliente = converterDTOtoModel(cli);

        clienteDAO.insert(cliente);
    }

    private Cliente converterDTOtoModel(ClienteDTO clienteDTO){

        Cliente cliente = new Cliente();

        cliente.setNombre(clienteDTO.getNombre());

        return cliente;
    }

    private ClienteDTO converterModeltoDTO(Cliente cliente){

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setNombre(cliente.getNombre());

        return clienteDTO;
    }

}
