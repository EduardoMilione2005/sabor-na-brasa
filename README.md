🍔 Sistema de Hamburgueria com Padrões de Projeto

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática de diversos padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema foi evoluindo ao longo das aulas, recebendo novos padrões conforme eram apresentados, resultando em uma aplicação modular, organizada e de fácil manutenção.

📚 Padrões de Projeto Utilizados
✅ Factory Method

Responsável pela criação dos diferentes tipos de lanches da hamburgueria.

Exemplos:
X-Burger
X-Salada

🚀 Como Executar
▶️ Executar aplicação

Execute a classe:

src/main/java/com/sabornabrasa/Main.java
🧪 Executar testes
mvn clean test
📁 Estrutura do Projeto
src/
├── main/
│   └── java/
│       └── com/
│           └── sabornabrasa/
│               ├── abstractfactory/
│               ├── bridge/
│               ├── builder/
│               ├── chain/
│               ├── composite/
│               ├── decorator/
│               ├── factorymethod/
│               └── Main.java
│
└── test/
    └── java/
        └── com/
            └── sabornabrasa/
🧪 Testes

O projeto possui testes automatizados utilizando JUnit 5 para os padrões implementados.

Testes disponíveis:
Factory Method
Builder
Bridge
Abstract Factory
Chain of Responsibility
Decorator
Composite
🛠️ Tecnologias Utilizadas
Java 17
Maven
JUnit 5
PlantUML
IntelliJ IDEA
