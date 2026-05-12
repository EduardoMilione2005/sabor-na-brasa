# README.md — Hamburgueria Sabor na Brasa

# Projeto: Hamburgueria Sabor na Brasa

## Descrição

Este projeto representa um sistema simples de uma hamburgueria chamada **Sabor na Brasa**, utilizando o padrão de projeto **Builder** em Java.

O sistema permite montar hambúrgueres personalizados de forma organizada e flexível.

Também foram adicionados casos de testes utilizando **JUnit 5**.

---

# Estrutura do Projeto

```text
sabor-na-brasa/
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/sabornabrasa/
│   │           ├── model/
│   │           │   └── Hamburguer.java
│   │           │
│   │           ├── builder/
│   │           │   └── HamburguerBuilder.java
│   │           │
│   │           ├── director/
│   │           │   └── HamburguerDirector.java
│   │           │
│   │           └── Main.java
│   │
│   └── test/
│       └── java/
│           └── com/sabornabrasa/
│               └── HamburguerTest.java
│
└── pom.xml
```

---

# 1. Classe Hamburguer

```java
package com.sabornabrasa.model;

public class Hamburguer {

    private String pao;
    private String carne;
    private String queijo;
    private boolean bacon;
    private boolean salada;
    private String molho;

    public Hamburguer() {
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getQueijo() {
        return queijo;
    }

    public void setQueijo(String queijo) {
        this.queijo = queijo;
    }

    public boolean isBacon() {
        return bacon;
    }

    public void setBacon(boolean bacon) {
        this.bacon = bacon;
    }

    public boolean isSalada() {
        return salada;
    }

    public void setSalada(boolean salada) {
        this.salada = salada;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }

    @Override
    public String toString() {
        return "Hamburguer{" +
                "pao='" + pao + '\'' +
                ", carne='" + carne + '\'' +
                ", queijo='" + queijo + '\'' +
                ", bacon=" + bacon +
                ", salada=" + salada +
                ", molho='" + molho + '\'' +
                '}';
    }
}
```

---

# 2. Classe HamburguerBuilder

```java
package com.sabornabrasa.builder;

import com.sabornabrasa.model.Hamburguer;

public class HamburguerBuilder {

    private Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public HamburguerBuilder adicionarPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }

    public HamburguerBuilder adicionarCarne(String carne) {
        hamburguer.setCarne(carne);
        return this;
    }

    public HamburguerBuilder adicionarQueijo(String queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }

    public HamburguerBuilder adicionarBacon(boolean bacon) {
        hamburguer.setBacon(bacon);
        return this;
    }

    public HamburguerBuilder adicionarSalada(boolean salada) {
        hamburguer.setSalada(salada);
        return this;
    }

    public HamburguerBuilder adicionarMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }

    public Hamburguer build() {
        return hamburguer;
    }
}
```

---

# 3. Classe HamburguerDirector

```java
package com.sabornabrasa.director;

import com.sabornabrasa.builder.HamburguerBuilder;
import com.sabornabrasa.model.Hamburguer;

public class HamburguerDirector {

    public Hamburguer criarHamburguerTradicional() {
        return new HamburguerBuilder()
                .adicionarPao("Brioche")
                .adicionarCarne("Carne bovina 180g")
                .adicionarQueijo("Cheddar")
                .adicionarBacon(true)
                .adicionarSalada(true)
                .adicionarMolho("Barbecue")
                .build();
    }

    public Hamburguer criarHamburguerVegano() {
        return new HamburguerBuilder()
                .adicionarPao("Integral")
                .adicionarCarne("Hambúrguer vegetal")
                .adicionarQueijo("Vegano")
                .adicionarBacon(false)
                .adicionarSalada(true)
                .adicionarMolho("Mostarda e mel")
                .build();
    }
}
```

---

# 4. Classe Main

```java
package com.sabornabrasa;

import com.sabornabrasa.director.HamburguerDirector;
import com.sabornabrasa.model.Hamburguer;

public class Main {

    public static void main(String[] args) {

        HamburguerDirector director = new HamburguerDirector();

        Hamburguer tradicional = director.criarHamburguerTradicional();
        Hamburguer vegano = director.criarHamburguerVegano();

        System.out.println("=== HAMBÚRGUER TRADICIONAL ===");
        System.out.println(tradicional);

        System.out.println("\n=== HAMBÚRGUER VEGANO ===");
        System.out.println(vegano);
    }
}
```

---

# 5. Casos de Teste com JUnit 5

```java
package com.sabornabrasa;

import com.sabornabrasa.builder.HamburguerBuilder;
import com.sabornabrasa.director.HamburguerDirector;
import com.sabornabrasa.model.Hamburguer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HamburguerTest {

    @Test
    void deveCriarHamburguerPersonalizado() {

        Hamburguer hamburguer = new HamburguerBuilder()
                .adicionarPao("Australiano")
                .adicionarCarne("Picanha")
                .adicionarQueijo("Prato")
                .adicionarBacon(true)
                .adicionarSalada(true)
                .adicionarMolho("Especial")
                .build();

        assertEquals("Australiano", hamburguer.getPao());
        assertEquals("Picanha", hamburguer.getCarne());
        assertEquals("Prato", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
        assertTrue(hamburguer.isSalada());
        assertEquals("Especial", hamburguer.getMolho());
    }

    @Test
    void deveCriarHamburguerTradicional() {

        HamburguerDirector director = new HamburguerDirector();
        Hamburguer hamburguer = director.criarHamburguerTradicional();

        assertEquals("Brioche", hamburguer.getPao());
        assertEquals("Cheddar", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
    }

    @Test
    void deveCriarHamburguerVegano() {

        HamburguerDirector director = new HamburguerDirector();
        Hamburguer hamburguer = director.criarHamburguerVegano();

        assertEquals("Integral", hamburguer.getPao());
        assertEquals("Vegano", hamburguer.getQueijo());
        assertFalse(hamburguer.isBacon());
    }
}
```

---

# 6. Arquivo pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         http://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.sabornabrasa</groupId>
    <artifactId>sabor-na-brasa</artifactId>
    <version>1.0</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
    </properties>

    <dependencies>

        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.10.0</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-surefire-plugin</artifactId>
                <version>3.1.2</version>
            </plugin>
        </plugins>
    </build>

</project>
```

---

---

# README Atualizado

````markdown
# 🍔 Sabor na Brasa

Sistema desenvolvido em Java utilizando o padrão de projeto Builder.

## 📚 Objetivo

O projeto simula o funcionamento de uma hamburgueria permitindo a criação de hambúrgueres personalizados.

Foi utilizado o padrão Builder para facilitar a construção dos objetos.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Maven
- JUnit 5
- IntelliJ IDEA

---

## 📁 Estrutura do Projeto

src/
├── main/java/com/sabornabrasa
│   ├── builder
│   ├── director
│   ├── model
│   └── Main.java
│
└── test/java/com/sabornabrasa
    └── HamburguerTest.java

---

## 🏗️ Padrão Builder

O padrão Builder permite criar objetos complexos passo a passo.

Exemplo:

```java
Hamburguer hamburguer = new HamburguerBuilder()
        .adicionarPao("Brioche")
        .adicionarCarne("Picanha")
        .adicionarQueijo("Cheddar")
        .build();
````

---

## ✅ Funcionalidades

* Criar hambúrguer tradicional
* Criar hambúrguer vegano
* Criar hambúrguer personalizado
* Executar testes automatizados

---

## ▶️ Como Executar

### Compilar

```bash
mvn clean install
```

### Rodar os testes

```bash
mvn test
```

### Executar o projeto

```bash
mvn exec:java
```

---

## 🧪 Testes

Os testes verificam:

* Criação de hambúrguer personalizado
* Criação de hambúrguer tradicional
* Criação de hambúrguer vegano

---

## 👨‍💻 Autor

Projeto acadêmico desenvolvido para estudo do padrão Builder em Java.

````

---

# Explicação do Padrão Builder

O padrão **Builder** foi utilizado para separar a construção do objeto `Hamburguer` da sua representação.

## Vantagens:

- Facilita a criação de objetos complexos.
- Evita construtores gigantes.
- Melhora a legibilidade do código.
- Permite criar diferentes tipos de hambúrgueres facilmente.

---

# Resultado Esperado

Ao executar a classe `Main`, o sistema exibirá:

```text
=== HAMBÚRGUER TRADICIONAL ===
Hamburguer{pao='Brioche', carne='Carne bovina 180g', queijo='Cheddar', bacon=true, salada=true, molho='Barbecue'}

=== HAMBÚRGUER VEGANO ===
Hamburguer{pao='Integral', carne='Hambúrguer vegetal', queijo='Vegano', bacon=false, salada=true, molho='Mostarda e mel'}
````

---

# Como Executar

## Compilar o projeto

```bash
mvn clean install
```

## Executar os testes

```bash
mvn test
```

## Executar o sistema

```bash
mvn exec:java
```
