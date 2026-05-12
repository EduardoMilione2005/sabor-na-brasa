🍔 Sabor na Brasa

Sistema desenvolvido em Java com foco no estudo e aplicação de Padrões de Projeto (Design Patterns) em um cenário de hamburgueria.

O projeto simula funcionalidades como criação de hambúrgueres, montagem de combos, personalização de ingredientes e fluxo de atendimento, utilizando diferentes padrões estruturais e comportamentais.

📚 Objetivo do Projeto

Aplicar conceitos de Programação Orientada a Objetos utilizando Design Patterns para:

Melhorar a organização do código
Facilitar manutenção e expansão do sistema
Promover reutilização de componentes
Tornar o sistema mais flexível e desacoplado
🚀 Tecnologias Utilizadas
Java 17
Maven
JUnit 5
IntelliJ IDEA
🏗️ Padrões de Projeto Aplicados
🔨 Builder

Utilizado para criar hambúrgueres personalizados passo a passo.

Exemplo:
Hambúrguer tradicional
Hambúrguer vegano
Hambúrguer personalizado
🌉 Bridge

Responsável por separar os tipos de hambúrguer dos ingredientes utilizados.

Benefícios:
Maior flexibilidade
Evita excesso de subclasses
Facilita novas combinações
🏭 Abstract Factory

Responsável pela criação de famílias de produtos relacionadas.

Exemplos:
Combo tradicional
Combo vegano

Cada fábrica cria:

Bebida
Batata
🔗 Chain of Responsibility

Responsável pelo fluxo de atendimento da hamburgueria.

Fluxo:
Atendente
Gerente
Dono

Cada nível resolve um tipo específico de problema.

🎨 Decorator

Responsável por adicionar ingredientes extras dinamicamente aos hambúrgueres.

Exemplos:
Bacon extra
Queijo extra
Combinação de adicionais
📂 Estrutura do Projeto
src/
├── main/java/com/sabornabrasa
│
│   ├── abstractfactory
│   ├── bridge
│   ├── builder
│   ├── chain
│   ├── decorator
│   ├── director
│   ├── model
│   ├── refinedabstraction
│   └── Main.java
│
└── test/java/com/sabornabrasa
    ├── AbstractFactoryTest.java
    ├── BridgeHamburguerTest.java
    ├── ChainTest.java
    ├── DecoratorTest.java
    ├── HamburguerBuilderTest.java
    └── HamburguerDirectorTest.java
✅ Funcionalidades
Criar hambúrgueres personalizados
Criar hambúrgueres premium
Criar combos tradicionais e veganos
Adicionar ingredientes extras
Simular fluxo de atendimento
Executar testes automatizados
▶️ Como Executar
Compilar o Projeto
mvn clean install
Executar os Testes
mvn test
Executar o Sistema
mvn exec:java
🧪 Testes Automatizados

O projeto possui testes utilizando JUnit 5 para validar:

Builder
Bridge
Abstract Factory
Chain of Responsibility
Decorator
📖 Conceitos Trabalhados
Programação Orientada a Objetos
Encapsulamento
Abstração
Polimorfismo
Herança
Design Patterns
