package service;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.AddressDTO;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import static java.lang.String.format;

public class APICepService {

    AddressDTO addressDTO = null;

    public AddressDTO getAddress(String cep){
        try {
            HttpClient client = HttpClient.newHttpClient();
            String url = "http://viacep.com.br/ws/" + cep + "/json/";
            HttpRequest request = HttpRequest
                    .newBuilder(URI.create(url)).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            ObjectMapper mapper = new ObjectMapper();

            addressDTO = mapper.readValue(response.body(), AddressDTO.class);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return addressDTO;
    }
}
