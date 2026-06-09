# 🍔 Sabor na Brasa — Design Patterns em Java

Projeto acadêmico desenvolvido em **Java** com objetivo de aplicar os principais **Design Patterns (Padrões de Projeto)** utilizando o tema de uma hamburgueria.

---

## 📌 Objetivo

Demonstrar a implementação prática dos padrões de projeto utilizando conceitos de:

* Criação de objetos
* Organização estrutural
* Controle de comportamento
* Reutilização de código
* Boas práticas de orientação a objetos

---

# 🚀 Tecnologias

* Java
* IntelliJ IDEA
* JUnit 5
* Maven

---

# 📁 Estrutura do Projeto

```text
src
├── main
│   └── java
│       └── com.sabornabrasa
│
├── test
│   └── java
│       └── com.sabornabrasa
```

---

# 🧩 Padrões Implementados

## Criacionais

### Singleton

Controle de configuração única do sistema.

### Factory Method

Criação de tipos diferentes de lanches.

### Abstract Factory

Criação de famílias de produtos (bebidas e batatas).

### Builder

Construção personalizada de hambúrgueres.

### Prototype

Clonagem de pedidos sem recriação completa.

---

## Estruturais

### Adapter

Adaptação de sistema antigo de entrega para o padrão atual.

### Bridge

Separação entre hambúrguer premium e tipo de ingrediente.

### Composite

Construção de combos utilizando composição.

### Decorator

Adição dinâmica de ingredientes.

### Facade

Interface simplificada para realização de pedidos.

### Flyweight

Compartilhamento de ingredientes para economia de memória.

### Proxy

Controle de acesso ao sistema real de pedidos.

---

## Comportamentais

### Chain of Responsibility

Encaminhamento de solicitações entre atendente, gerente e dono.

### Command

Encapsulamento de ações de pedido.

### Interpreter

Interpretação de comandos e pedidos.

### Iterator

Percorre itens do cardápio.

### Mediator

Comunicação centralizada entre cliente e cozinha.

### Memento

Controle e restauração do estado do pedido.

### Observer

Notificação automática de clientes.

### State

Mudança dinâmica de estados do pedido.

### Strategy

Aplicação de diferentes descontos.

### Template Method

Padronização do preparo dos pedidos.

### Visitor

Operações aplicadas sobre itens do pedido.

---

# ▶️ Executando

Clone o projeto:

```bash
git clone <repositorio>
```

Entre na pasta:

```bash
cd sabornabrasa
```

Execute:

```bash
mvn clean install
```

Depois:

```bash
mvn exec:java
```

---

# 🧪 Testes

Executar todos os testes:

```bash
mvn test
```

Padrões com testes implementados:

* Adapter
* Command
* Interpreter
* Iterator
* Prototype
* Proxy

---

# 📚 Conceitos Aplicados

* SOLID
* Programação Orientada a Objetos
* Encapsulamento
* Polimorfismo
* Herança
* Composição
* Reutilização de Código

---

# 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos utilizando Java e Design Patterns.
