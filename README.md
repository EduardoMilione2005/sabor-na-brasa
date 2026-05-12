🍔 Sistema de Hamburgueria com Padrões de Projeto

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática de diversos padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema foi evoluindo ao longo das aulas, recebendo novos padrões conforme eram apresentados, resultando em uma aplicação modular, organizada e de fácil manutenção.

📚 Padrões de Projeto Utilizados
✅ Factory Method

Responsável pela criação dos diferentes tipos de lanches da hamburgueria.

Exemplos:
X-Burger
X-Salada

📍 Diagrama:

src/main/factorymethod/diagrama/diagrama-classe-factorymethod.png

✅ Singleton

Responsável por garantir uma única instância da configuração do sistema.

📍 Diagrama:

src/main/singleton/diagrama/diagrama-classe-singleton.png

✅ Decorator

Responsável por adicionar ingredientes extras dinamicamente aos hambúrgueres.

📍 Diagrama:

src/main/decorator/diagrama/diagrama-classe-decorator.png

✅ Abstract Factory

Responsável pela criação de combos completos da hamburgueria.

📍 Diagrama:

src/main/abstractfactory/diagrama/diagrama-classe-abs-factory.png

✅ Bridge

Separa a abstração do hambúrguer de seus ingredientes.

📍 Diagrama:

src/main/bridge/diagrama/diagrama-classe-bridge.png

✅ Chain of Responsibility

Realiza o encaminhamento de solicitações entre níveis de atendimento.

📍 Diagrama:

src/main/chain/diagrama/diagrama-classe-chain.png

✅ Builder

Responsável pela construção de hambúrgueres personalizados.

📍 Diagrama:

src/main/builder/diagrama/diagrama-classe-builder.png

✅ Composite

Permite representar produtos individuais e combos compostos.

📍 Diagrama:

src/main/composite/diagrama/diagrama-classe-composite.png

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
