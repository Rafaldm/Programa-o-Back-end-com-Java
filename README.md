# CadastroPOO

Projeto desenvolvido na disciplina de Programação Orientada a Objetos.

O sistema foi feito em Java e permite cadastrar Pessoa Física e Pessoa Jurídica, com opção de salvar e recuperar os dados em arquivos.

---

## Procedimento 1 – Estrutura do Projeto

Nesta parte foram criadas as classes principais do sistema:

- Pessoa (classe base)
- PessoaFisica
- PessoaJuridica
- PessoaFisicaRepo
- PessoaJuridicaRepo

A classe Pessoa é a base das outras duas.  
PessoaFisica e PessoaJuridica herdam seus atributos e adicionam informações específicas (CPF ou CNPJ).

As classes de repositório são responsáveis por:

- Inserir
- Alterar
- Excluir
- Buscar por id
- Listar todos
- Salvar em arquivo
- Recuperar do arquivo

A persistência foi feita utilizando arquivos binários (.bin).

---

## Procedimento 2 – Cadastro em Modo Texto

Foi implementado um menu no método `main`, permitindo que o usuário escolha as opções pelo teclado.

Menu disponível:

1 - Incluir  
2 - Alterar  
3 - Excluir  
4 - Buscar pelo Id  
5 - Exibir Todos  
6 - Persistir Dados  
7 - Recuperar Dados  
0 - Sair  

O usuário escolhe o tipo de pessoa (F ou J) e informa os dados pelo teclado utilizando a classe Scanner.

Os dados podem ser salvos com um prefixo definido pelo usuário, gerando:

- prefixo.fisica.bin  
- prefixo.juridica.bin  

Também é possível recuperar esses dados depois.

---

## Conceitos Utilizados

- Programação Orientada a Objetos
- Herança
- Polimorfismo
- Serializable
- Manipulação de arquivos
- Uso da classe Scanner
- Organização em pacotes

---

## Observação

O projeto foi versionado no Git conforme solicitado na atividade.
