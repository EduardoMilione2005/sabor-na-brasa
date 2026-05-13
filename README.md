🍔 Sabor na Brasa - Sistema de Hamburgueria com Padrões de Projeto

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática de diversos padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema simula funcionalidades de uma hamburgueria moderna, utilizando padrões de projeto para tornar a aplicação modular, organizada, reutilizável e de fácil manutenção.

📚 Padrões de Projeto Implementados
✅ Singleton

Garante uma única instância da configuração do sistema.

Exemplo:
Configuração global da hamburgueria
✅ Builder

Responsável pela construção de hambúrgueres personalizados.

Exemplos:
Hambúrguer tradicional
Hambúrguer vegano
✅ Bridge

Separa a abstração do hambúrguer da implementação dos ingredientes.

Exemplos:
Hambúrguer premium tradicional
Hambúrguer premium vegano
✅ Abstract Factory

Cria famílias de produtos relacionados.

Exemplos:
Combo tradicional
Combo vegano
✅ Chain of Responsibility

Encaminha solicitações entre diferentes níveis de atendimento.

Fluxo:
Atendente
Gerente
Dono
✅ Decorator

Adiciona ingredientes extras dinamicamente aos hambúrgueres.

Exemplos:
Bacon extra
Queijo extra
✅ Composite

Permite representar produtos individuais e combos completos.

Exemplos:
Produto simples
Combo da hamburgueria
✅ Factory Method

Responsável pela criação de diferentes tipos de lanches.

Exemplos:
X-Burger
X-Salada
✅ State

Controla os estados do pedido durante o fluxo da hamburgueria.

Fluxo:
Recebido
Preparando
Entregue
✅ Observer

Notifica clientes automaticamente sobre alterações no pedido.

Exemplos:
Pedido saiu para entrega
Pedido entregue
✅ Mediator

Centraliza a comunicação entre cliente e cozinha.

Exemplos:
Cliente envia pedido
Cozinha responde status
✅ Facade

Simplifica o acesso às funcionalidades principais da hamburgueria.

Exemplo:
Realização completa de pedidos
✅ Strategy

Permite aplicar diferentes estratégias de desconto.

Exemplos:
Desconto para cliente novo
Desconto para cliente VIP
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
│               ├── facade/
│               ├── factorymethod/
│               ├── mediator/
│               ├── observer/
│               ├── singleton/
│               ├── state/
│               ├── strategy/
│               └── Main.java
│
└── test/
    └── java/
        └── com/
            └── sabornabrasa/
🧪 Testes

O projeto possui testes automatizados utilizando JUnit 5 para validação dos padrões implementados.

Testes implementados:
Singleton
Builder
Abstract Factory
Bridge
Chain of Responsibility
Decorator
Composite
Factory Method
State
Observer
Mediator
Facade
Strategy
🛠️ Tecnologias Utilizadas
Java 17
Maven
JUnit 5
IntelliJ IDEA
