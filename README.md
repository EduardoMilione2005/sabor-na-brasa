README.md — Sabor na Brasa
🍔 Sabor na Brasa

Projeto desenvolvido em Java com o objetivo de demonstrar a utilização de padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema simula o funcionamento de uma hamburgueria permitindo a criação de hambúrgueres, combos, fluxo de atendimento e organização dos ingredientes.

📚 Objetivo

Aplicar conceitos de Programação Orientada a Objetos utilizando padrões de projeto para melhorar:

Organização do código
Reutilização
Flexibilidade
Manutenção do sistema
🚀 Tecnologias Utilizadas
Java 17
Maven
JUnit 5
IntelliJ IDEA
🏗️ Padrões de Projeto Utilizados
Builder

Responsável pela criação dos hambúrgueres personalizados passo a passo.

Bridge

Responsável por separar os tipos de hambúrguer dos ingredientes utilizados.

Abstract Factory

Responsável pela criação de famílias de produtos, como bebidas e batatas.

Chain of Responsibility

Responsável pelo fluxo de atendimento da hamburgueria.

📂 Estrutura de Pastas
src/
├── main/java/com/sabornabrasa
│   ├── abstractfactory
│   ├── bridge
│   ├── builder
│   ├── chain
│   ├── director
│   ├── model
│   ├── refinedabstraction
│   └── Main.java
│
└── test/java/com/sabornabrasa
    ├── AbstractFactoryTest.java
    ├── BridgeHamburguerTest.java
    ├── ChainTest.java
    ├── HamburguerBuilderTest.java
    └── HamburguerDirectorTest.java
✅ Funcionalidades
Criar hambúrguer tradicional
Criar hambúrguer vegano
Criar hambúrguer premium
Criar combos tradicionais e veganos
Simular fluxo de atendimento
Executar testes automatizados
▶️ Como Executar
Compilar o projeto
mvn clean install
Executar os testes
mvn test
Executar o sistema
mvn exec:java
🧪 Testes

Os testes verificam:

Criação de hambúrguer personalizado
Criação de hambúrguer tradicional
Criação de hambúrguer vegano
Funcionamento do padrão Bridge
Funcionamento do Abstract Factory
Funcionamento do Chain of Responsibility
