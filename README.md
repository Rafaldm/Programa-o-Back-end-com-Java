# CadastroPOO

Projeto desenvolvido para a disciplina de Programação Orientada a Objetos.

O sistema foi implementado em Java utilizando o NetBeans (Java Ant Application) e tem como objetivo aplicar conceitos fundamentais de POO, herança, polimorfismo e persistência de dados em arquivos binários.

---

# 📌 Procedimento 1 – Criação das Entidades e Sistema de Persistência

## 🎯 Objetivo

Criar as entidades do sistema utilizando herança e implementar a persistência dos dados em arquivos binários utilizando a interface Serializable.

## 🏗 Estrutura do Projeto

### Pacote: model

Classes criadas:

- Pessoa
- PessoaFisica
- PessoaJuridica
- PessoaFisicaRepo
- PessoaJuridicaRepo

### 🔹 Classe Pessoa
Classe base contendo:
- id
- nome
- método exibir()
- construtores
- getters e setters
- implementação da interface Serializable

### 🔹 Classe PessoaFisica
Herda de Pessoa e adiciona:
- cpf
- idade
- método exibir() polimórfico

### 🔹 Classe PessoaJuridica
Herda de Pessoa e adiciona:
- cnpj
- método exibir() polimórfico

---

## 💾 Persistência de Dados

Foram criadas duas classes de repositório:

- PessoaFisicaRepo
- PessoaJuridicaRepo

Essas classes são responsáveis por:

- inserir
- alterar
- excluir
- obter por id
- obter todos
- persistir dados em arquivo
- recuperar dados do arquivo

A persistência é feita utilizando:

- ObjectOutputStream
- ObjectInputStream
- Interface Serializable

Os dados são armazenados em arquivos binários.

---

# 📌 Procedimento 2 – Cadastro em Modo Texto

## 🎯 Objetivo

Implementar um sistema interativo em modo texto, permitindo que o usuário gerencie o cadastro pelo terminal.

## 🖥 Funcionalidades Implementadas

Menu com as opções:

1 - Incluir Pessoa  
2 - Alterar Pessoa  
3 - Excluir Pessoa  
4 - Buscar pelo Id  
5 - Exibir Todos  
6 - Persistir Dados  
7 - Recuperar Dados  
0 - Finalizar Programa  

---

## 🧠 Funcionamento

- O usuário escolhe o tipo de pessoa (Física ou Jurídica).
- Os dados são digitados pelo teclado utilizando a classe Scanner.
- As informações são manipuladas através das classes de repositório.
- A persistência salva os dados nos arquivos:

  prefixo.fisica.bin  
  prefixo.juridica.bin  

- A recuperação lê os arquivos e carrega os dados novamente na memória.

---

# 🏛 Conceitos Aplicados

- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Encapsulamento
- Serializable
- Manipulação de arquivos binários
- Estrutura de repetição (while)
- Estrutura de decisão (switch)
- Classe Scanner
- Padrão DAO (Data Access Object)

---

# 📝 Análise Geral

O projeto permitiu aplicar na prática os principais conceitos de orientação a objetos. A separação entre entidades e repositórios ajudou a manter o código organizado e mais fácil de entender.

A implementação da persistência mostrou como é possível salvar objetos diretamente em arquivos binários, aproximando o exercício de uma aplicação real.

O modo texto reforçou o entendimento sobre entrada de dados, controle de fluxo e organização lógica do sistema.

---

# 🚀 Tecnologias Utilizadas

- Java
- NetBeans
- Git / GitHub

---

# 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos.
