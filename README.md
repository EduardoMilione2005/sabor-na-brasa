🍔 Sistema de Hamburgueria com Padrões de Projeto

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática de diversos padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema foi evoluindo ao longo do desenvolvimento, recebendo novos padrões conforme eram implementados, resultando em uma aplicação modular, organizada e de fácil manutenção.

📚 Padrões de Projeto Utilizados
✅ Singleton

Responsável por garantir uma única instância da configuração do sistema da hamburgueria.

Exemplos:
Configuração global do sistema
Nome da hamburgueria
✅ Builder

Responsável pela construção de hambúrgueres personalizados.

Exemplos:
Hambúrguer tradicional
Hambúrguer vegano
Hambúrguer personalizado
✅ Bridge

Separa a abstração do hambúrguer de seus ingredientes.

Exemplos:
Hambúrguer premium tradicional
Hambúrguer premium vegano
✅ Abstract Factory

Responsável pela criação de combos completos da hamburgueria.

Exemplos:
Combo tradicional
Combo vegano
✅ Chain of Responsibility

Realiza o encaminhamento de solicitações entre níveis de atendimento.

Fluxo:
Atendente
Gerente
Dono
✅ Decorator

Responsável por adicionar ingredientes extras dinamicamente aos hambúrgueres.

Exemplos:
Bacon extra
Queijo extra
Combinação de adicionais
✅ Composite

Permite representar produtos individuais e combos compostos.

Exemplos:
Produto individual
Combo completo
Organização de pedidos compostos
✅ Factory Method

Responsável pela criação de diferentes tipos de lanches.

Exemplos:
X-Burger
X-Salada
✅ State

Responsável por controlar os estados do pedido durante o fluxo da hamburgueria.

Fluxo:
Recebido
Preparando
Entregue
✅ Observer

Responsável por notificar clientes sobre atualizações nos pedidos.

Exemplos:
Pedido saiu para entrega
Pedido entregue
Atualização automática dos clientes cadastrados
✅ Mediator

Responsável por centralizar a comunicação entre cliente e cozinha.

Exemplos:
Cliente envia pedido
Cozinha recebe solicitação
Cozinha responde status do pedido
Comunicação desacoplada entre setores
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
│               ├── mediator/
│               ├── observer/
│               ├── singleton/
│               ├── state/
│               └── Main.java
│
└── test/
    └── java/
        └── com/
            └── sabornabrasa/
🧪 Testes

O projeto possui testes automatizados utilizando JUnit 5 para os padrões implementados.

Testes disponíveis:
Singleton
Builder
Bridge
Abstract Factory
Chain of Responsibility
Decorator
Composite
Factory Method
State
Observer
Mediator
🛠️ Tecnologias Utilizadas
Java 17
Maven
JUnit 5
IntelliJ IDEA
