🍔 Sabor na Brasa — Padrões de Projeto em Java

Projeto desenvolvido em Java com o objetivo de demonstrar a implementação prática dos principais Design Patterns (Padrões de Projeto) da engenharia de software, utilizando o contexto de uma hamburgueria chamada Sabor na Brasa.

📚 Padrões Implementados
✅ Singleton

Garante que exista apenas uma instância da configuração do sistema.

Classe principal
ConfiguracaoSistema
Funcionalidade

Controla informações globais da hamburgueria.

✅ Builder

Responsável pela construção de hambúrgueres complexos passo a passo.

Classes principais
Hamburguer
HamburguerDirector
HamburguerTradicional
HamburguerVegano
Funcionalidade

Permite montar diferentes tipos de hambúrgueres.

✅ Bridge

Separa abstração da implementação.

Classes principais
HamburguerPremium
IngredienteTradicional
IngredienteVegano
Funcionalidade

Permite combinar tipos de hambúrguer com ingredientes diferentes.

✅ Abstract Factory

Cria famílias de objetos relacionados.

Classes principais
HamburguerFactory
FactoryTradicional
FactoryVegana
Funcionalidade

Criação de bebidas e batatas tradicionais ou veganas.

✅ Factory Method

Define uma interface para criar objetos.

Classes principais
LancheFactory
XBurgerFactory
XSaladaFactory
Funcionalidade

Criação de diferentes tipos de lanches.

✅ Chain of Responsibility

Encadeia responsáveis para tratar solicitações.

Classes principais
Atendente
Gerente
Dono
Funcionalidade

Encaminha reclamações e pedidos conforme o nível de responsabilidade.

✅ Decorator

Adiciona funcionalidades dinamicamente aos objetos.

Classes principais
HamburguerSimples
BaconDecorator
QueijoExtraDecorator
Funcionalidade

Adiciona ingredientes extras ao hambúrguer.

✅ Composite

Permite tratar objetos individuais e composições de forma uniforme.

Classes principais
Produto
Combo
Funcionalidade

Criação de combos com vários produtos.

✅ State

Altera comportamento conforme o estado interno.

Classes principais
Pedido
Estados do pedido
Funcionalidade

Controla o fluxo do pedido:

Recebido
Em preparação
Saiu para entrega
Entregue
✅ Observer

Define dependência entre objetos.

Classes principais
PedidoLoja
Cliente
Funcionalidade

Clientes recebem notificações sobre atualizações do pedido.

✅ Mediator

Centraliza a comunicação entre objetos.

Classes principais
AtendimentoMediator
ClienteUsuario
CozinhaUsuario
Funcionalidade

Facilita comunicação entre cliente e cozinha.

✅ Facade

Fornece interface simplificada para subsistemas.

Classe principal
HamburgueriaFacade
Funcionalidade

Simplifica o processo de realizar pedidos.

✅ Strategy

Permite alterar algoritmos dinamicamente.

Classes principais
PedidoStrategy
DescontoClienteNovo
DescontoClienteVip
Funcionalidade

Aplicação de diferentes estratégias de desconto.

✅ Template Method

Define o esqueleto de um algoritmo.

Classes principais
PrepararPedido
PedidoTradicional
PedidoVegano
Funcionalidade

Padroniza o preparo dos pedidos.

✅ Memento

Salva e restaura estados anteriores de um objeto.

Classes principais
PedidoMemento
HistoricoPedido
Funcionalidade

Permite salvar e restaurar estados do pedido.

✅ Visitor

Permite adicionar operações sem modificar os objetos.

Classes principais
Visitor
VisitorPreco
HamburguerItem
BebidaItem
Funcionalidade

Calcula preços dos itens do pedido.

🧪 Testes Implementados

O projeto possui testes unitários utilizando JUnit 5.

✅ SingletonTest

Verifica se apenas uma instância é criada.

✅ BuilderTest

Testa criação dos hambúrgueres.

✅ FactoryMethodTest

Valida criação correta dos lanches.

✅ CompositeTest

Testa montagem de combos.

✅ DecoratorTest

Verifica adição de ingredientes extras.

✅ ObserverTest

Valida notificações aos clientes.

✅ StrategyTest

Testa cálculo de descontos:

Cliente novo
Cliente VIP
✅ MementoTest

Verifica salvamento e restauração de estados.

✅ VisitorTest

Valida cálculo de preços via Visitor.

📂 Estrutura do Projeto
src
└── main
    └── java
        └── com.sabornabrasa
            ├── abstractfactory
            ├── bridge
            ├── builder
            ├── chain
            ├── composite
            ├── decorator
            ├── facade
            ├── factorymethod
            ├── mediator
            ├── memento
            ├── observer
            ├── singleton
            ├── state
            ├── strategy
            ├── templatemethod
            ├── visitor
            └── Main.java
▶️ Como Executar
Pré-requisitos
Java 17+
IntelliJ IDEA ou Eclipse
Maven ou Gradle
Executar o projeto

Execute a classe:

Main.java
👨‍💻 Tecnologias Utilizadas
Java
Programação Orientada a Objetos
Design Patterns
JUnit 5