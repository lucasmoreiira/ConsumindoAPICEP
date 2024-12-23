import model.AddressDTO;
import service.APICepService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        APICepService apiCepService = new APICepService();
        AddressDTO address;


        System.out.println("Digite um CEP:");
        String cep = sc.next();

        while(cep.length() != 8){
            System.out.println("O CEP informado é invalido.");
            System.out.println("Digite um cep valido:");
            cep = sc.next();
        }

        address = apiCepService.getAddress(cep);

        System.out.println("Endereço encontrado:");
        System.out.println("CEP: " + address.getCep());
        System.out.println("Logradouro: " + address.getLogradouro());
        System.out.println("Bairro: " + address.getBairro());
        System.out.println("Localidade: " + address.getLocalidade());
        System.out.println("UF: " + address.getUf());
        System.out.println("IBGE: " + address.getIbge());
        System.out.println("GIA: " + address.getGia());
        System.out.println("DDD: " + address.getDdd());
        System.out.println("SIAFI: " + address.getSiafi());


    }
}
