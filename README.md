🍔 Sabor na Brasa - Sistema de Hamburgueria com Design Patterns

Projeto desenvolvido em Java com o objetivo de demonstrar a aplicação prática dos principais padrões de projeto (Design Patterns) em um sistema de hamburgueria.

O sistema simula funcionalidades reais de uma hamburgueria utilizando diversos padrões arquiteturais, tornando o código mais organizado, reutilizável e de fácil manutenção.

📚 Padrões de Projeto Implementados
✅ Singleton

Garante uma única instância da configuração do sistema.

Funcionalidade:
Configuração global da hamburgueria.
✅ Builder

Responsável pela construção de hambúrgueres personalizados.

Funcionalidade:
Hambúrguer tradicional.
Hambúrguer vegano.
✅ Bridge

Separa a abstração dos hambúrgueres premium das implementações de ingredientes.

Funcionalidade:
Hambúrguer premium tradicional.
Hambúrguer premium vegano.
✅ Abstract Factory

Cria famílias de produtos relacionados.

Funcionalidade:
Combos tradicionais.
Combos veganos.
Bebidas e batatas específicas.
✅ Factory Method

Responsável pela criação de diferentes tipos de lanches.

Funcionalidade:
X-Burger.
X-Salada.
✅ Chain of Responsibility

Encaminha solicitações entre diferentes níveis de atendimento.

Funcionalidade:
Atendimento comum.
Reclamações.
Problemas graves.
✅ Decorator

Adiciona ingredientes extras dinamicamente aos hambúrgueres.

Funcionalidade:
Bacon extra.
Queijo extra.
✅ Composite

Permite tratar produtos individuais e combos da mesma forma.

Funcionalidade:
Criação de combos completos.
✅ State

Controla os estados do pedido no sistema.

Funcionalidade:
Pedido recebido.
Pedido em preparo.
Pedido entregue.
✅ Observer

Notifica clientes automaticamente sobre alterações nos pedidos.

Funcionalidade:
Atualização de status.
Remoção de observadores.
✅ Mediator

Centraliza a comunicação entre cliente e cozinha.

Funcionalidade:
Comunicação indireta entre setores.
✅ Facade

Simplifica operações complexas da hamburgueria.

Funcionalidade:
Realização simplificada de pedidos.
✅ Strategy

Permite trocar estratégias de desconto dinamicamente.

Funcionalidade:
Desconto para cliente novo.
Desconto para cliente VIP.
✅ Template Method

Define um fluxo padrão para preparação dos pedidos.

Funcionalidade:
Pedido tradicional.
Pedido vegano.
🧪 Testes Automatizados

O projeto possui testes automatizados utilizando JUnit 5 para validar o funcionamento dos padrões implementados.

✅ SingletonTest

Verifica se apenas uma instância da configuração do sistema é criada.

Testes:
Retorno da mesma instância.
Nome da hamburgueria configurado corretamente.
✅ BuilderTest

Valida a construção dos hambúrgueres.

Testes:
Criação do hambúrguer tradicional.
Criação do hambúrguer vegano.
Verificação dos ingredientes.
✅ BridgeTest

Testa a separação entre abstração e implementação.

Testes:
Hambúrguer premium tradicional.
Hambúrguer premium vegano.
✅ AbstractFactoryTest

Valida a criação das famílias de produtos.

Testes:
Bebidas tradicionais.
Batatas tradicionais.
Bebidas veganas.
Batatas veganas.
✅ FactoryMethodTest

Verifica a criação correta dos lanches.

Testes:
Criação de X-Burger.
Criação de X-Salada.
✅ ChainTest

Valida o fluxo de atendimento.

Testes:
Atendimento de pedido comum.
Atendimento de reclamação.
Encaminhamento de problema grave.
✅ DecoratorTest

Verifica a adição dinâmica de ingredientes.

Testes:
Hambúrguer com bacon.
Hambúrguer com queijo extra.
Hambúrguer com múltiplos adicionais.
✅ CompositeTest

Testa a composição de combos.

Testes:
Adição de produtos ao combo.
Exibição do combo completo.
✅ StateTest

Valida a mudança de estados do pedido.

Testes:
Estado inicial.
Mudança para preparo.
Mudança para entregue.
✅ ObserverTest

Verifica o sistema de notificações.

Testes:
Adição de observadores.
Remoção de observadores.
Notificação de clientes.
✅ MediatorTest

Testa a comunicação mediada.

Testes:
Comunicação cliente → cozinha.
Comunicação cozinha → cliente.
✅ FacadeTest

Valida a simplificação dos serviços.

Testes:
Realização completa de pedido usando fachada.
✅ StrategyTest

Testa as estratégias de desconto.

Testes:
Desconto para cliente novo.
Desconto para cliente VIP.
✅ TemplateMethodTest

Valida o fluxo padrão de preparação dos pedidos.

Testes:
Preparação do pedido tradicional.
Preparação do pedido vegano.
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
│               ├── templatemethod/
│               └── Main.java
│
└── test/
🛠️ Tecnologias Utilizadas
Java 17
Maven
JUnit 5
IntelliJ IDEA
