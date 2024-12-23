# Consumo de API de CEP

Este projeto é uma aplicação simples em Java que consome a API pública [ViaCEP](https://viacep.com.br) para consultar informações de endereço com base em um CEP (Código de Endereçamento Postal).

## Funcionalidades

- O usuário insere um CEP e o sistema consulta a API para obter os dados do endereço.
- Exibe as informações detalhadas, como logradouro, bairro, cidade, estado e outros dados relacionados ao CEP.
- Valida o formato do CEP e trata erros de consulta (como CEP inválido ou inexistente).

## Tecnologias

- **Linguagem:** Java 11+
- **Bibliotecas:**
  - `HttpClient`: Para realizar a requisição HTTP à API.
  - `Jackson`: Para converter o JSON retornado pela API em objetos Java.
