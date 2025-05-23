# Desafio Técnico - API REST para cadastro de Beneficiários e Documentos

Esta aplicação RESTful foi desenvolvida como parte de uma avaliação técnica. O projeto viabiliza o gerenciamento dos **Beneficiarios** e seus **Documentos** para um plano de saúde, consiste em cadastrar, listar,atualizar e deletar as entidades.

## Tecnologias 
Esse projeto foi desenvolvido com as seguintes tecnologias:

  - Java 17
  - Spring Boot
  - Banco de Dados relacional H2
  - Swagger-OpenAI
  - Postman

## Entidades e Endpoints da Aplicação

### Beneficiários

### 1. Cadastro de um beneficiario e seus documentos

- **POST** `/v1/beneficiario`
- **Descrição**: Cadastra um novo beneficiário junto com seus dados pessoais.
- **Corpo da requisição**:
```json
{
    "nomeCompleto":"Fulano da Silva",
    "cpf":"65562968053",
    "telefone":"73988029584",
    "dataNascimento":"1997-07-10"
}
```
- **Resposta**:
```json
{
  "idBeneficiario": "uuid-gerado"
 }
```

---

#### 2. Listar todos os beneficiários cadastrados

- **GET** `/v1/beneficiario`
- **Descrição**: Retorna uma lista com todos os beneficiários cadastrados.

---

#### 3. Lista um beneficiário por ID 

- **GET** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Retorna os dados detalhados do beneficiário com base em seu ID.

---

#### 4. Atualizar dados de um beneficiário

- **PATCH** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Altera os dados cadastrais de um beneficiário existente.
- **Corpo da requisição**:
```json
{
  "telefone": "7388559210"
}
```

---

#### 5. Remover um beneficiário

- **DELETE** `/v1/beneficiario/{idBeneficiario}`
- **Descrição**: Remove um beneficiário e seus documentos do sistema com base em seu ID de beneficiário

---

### Documentos

#### 6. Cadastrar documentos para um beneficiário existente

- **POST** `/v1/beneficiario/{idBeneficiario}/documento`
- **Descrição**: Adiciona novos documentos ao beneficiário informado.
- **Corpo da requisição**:
```json
{
    "tipoDocumento":"CNH",
    "descricao":"09548592156"
    
}
```

---

#### 7. Buscar documentos de um beneficiário por ID do beneficiario e ID documento

- **GET** `/v1/beneficiario/{idBeneficiario}/documento/{idDocumento}`
- **Descrição**: Retorna os dados detalhados de um documento com base em seu ID.

---

#### 8. Editar um documento existente

- **PATCH** `/v1/beneficiario/{idBeneficiario}/documento/{idDocumento}`
- **Descrição**: Altera os dados de um documento já cadastrado.
- **Corpo da requisição**:
```json
{
    "tipoDocumento":"...",
    "descricao":"..."
    
}
```

---

## Como Executar o Projeto

1. Clone o repositório:
```bash
git https://github.com/DevMatheusMoura/cadastro-saude.git
```

2. Acesse a pasta do projeto:
```bash
cd cadastro-saude
```

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080/cadastro-saude/api/swagger-ui/index.html`.

---

## Observações

- Os dados são validados de acordo com as anotações presentes nos DTOs (`@Valid`).
- Todos os IDs utilizados são do tipo UUID.
- Alterações serão permitidas deste que não modifiquem toda a estrutura do Projeto

---
