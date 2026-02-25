# 📚 Projeto de Estudos — Herança e Polimorfismo em Java

Este repositório é um material **didático** desenvolvido com o objetivo de praticar e demonstrar, de forma separada e progressiva, os principais conceitos de **Programação Orientada a Objetos (POO)** em Java, com foco especial em **Herança, Polimorfismo, Sobrescrita de métodos (Override), Upcasting/Downcasting e uso de `final`**.

A ideia do projeto não é ser um sistema comercial, e sim um **laboratório de aprendizado**, onde cada pacote aborda um conceito específico de POO de maneira isolada para facilitar o entendimento.

---

## 🧠 Conceitos Trabalhados

Durante o desenvolvimento foram aplicados os seguintes conceitos fundamentais da POO:

* Classes e Objetos
* Encapsulamento
* Herança
* Generalização e Especialização
* Polimorfismo
* Sobrescrita de métodos (`@Override`)
* Upcasting
* Downcasting
* Palavra‑chave `final` em classes e métodos
* Reutilização de código
* Organização em pacotes

---

## 🗂️ Estrutura do Projeto

O projeto está dividido em **módulos independentes**, cada um explicando um conceito específico.

```
herancas/
 ├── heranca/
 ├── sobreposicao/
 ├── upcastingDowncasting/
 └── final/
```

Cada pasta contém:

* `application` → classe principal com `main`
* `entities` → classes de domínio (modelos das contas)

O domínio escolhido foi o de **contas bancárias**, pois facilita a visualização de especializações de uma mesma classe base.

---

## 1️⃣ Herança (Pacote: `heranca`)

Aqui é apresentada a base de tudo.

Foi criada uma **Superclasse** representando uma conta bancária genérica e uma **Subclasse** representando um tipo específico de conta empresarial.

### Objetivo

Demonstrar que uma classe pode herdar atributos e comportamentos de outra.

### Ideias Demonstradas

* Relação "é um" (ContaEmpresarial *é uma* Conta)
* Reutilização de código
* A subclasse herda atributos e métodos da superclasse
* Possibilidade de adicionar novos comportamentos na subclasse

---

## 2️⃣ Sobreposição de Métodos — Override (Pacote: `sobreposicao`)

Nesta etapa foi trabalhado o **polimorfismo**, sobrescrevendo métodos da classe pai.

A classe de poupança e a empresarial alteram o comportamento de um método da conta base (ex.: saque), mantendo a mesma assinatura.

### Objetivo

Mostrar que subclasses podem **modificar o comportamento** de métodos herdados.

### Conceitos Importantes

* Uso de `@Override`
* Polimorfismo em tempo de execução
* Mesmo método, comportamentos diferentes

Isso demonstra uma das ideias centrais da POO:

> Objetos diferentes podem responder de forma diferente à mesma mensagem.

---

## 3️⃣ Upcasting e Downcasting (Pacote: `upcastingDowncasting`)

Nesta parte o projeto explora o tratamento de objetos por meio de referências mais genéricas.

### Upcasting

Converter uma subclasse para um tipo da superclasse.

```
Conta c1 = new ContaEmpresarial(...);
```

Isso permite tratar todos os tipos de contas de forma uniforme.

### Downcasting

Converter novamente para o tipo específico para acessar comportamentos exclusivos.

```
ContaEmpresarial c2 = (ContaEmpresarial) c1;
```

### Objetivo

Demonstrar:

* Polimorfismo
* Uso de `instanceof`
* Segurança ao converter tipos

---

## 4️⃣ Uso de `final` (Pacote: `final`)

Este módulo demonstra como impedir modificações indesejadas na hierarquia de classes.

### `final` em Classes

Impede que uma classe seja herdada.

### `final` em Métodos

Impede que um método seja sobrescrito.

### Objetivo

Mostrar como proteger regras de negócio importantes contra alteração por subclasses.

---

## 🎯 O que este projeto ensina na prática

Ao finalizar este estudo é possível compreender claramente:

* Como organizar um projeto Java em pacotes
* Como modelar uma hierarquia de classes
* Quando usar herança
* Diferença entre herança e especialização
* Como funciona o polimorfismo
* Quando usar casting de objetos
* Como proteger comportamentos usando `final`

---

## ▶️ Como Executar

1. Baixe o projeto ou clone o repositório

```
git clone <link-do-repositorio>
```

2. Importe no Eclipse, IntelliJ ou VSCode (com extensão Java)

3. Execute qualquer classe dentro da pasta:

```
application
```

Cada uma possui um `main` demonstrando o conceito do respectivo pacote.

---

## 💡 Motivação

Este projeto foi criado como material de apoio para estudo de POO em Java, com foco em entender **o comportamento da linguagem na prática**, e não apenas na teoria.

A divisão por pacotes permite estudar cada conceito isoladamente, facilitando revisões futuras.

---

## 👨‍💻 Autor

Pedro Augusto Ribeiro Ferreira
Estudante de Programação e entusiasta de Java

---

## 🏁 Conclusão

Este repositório representa uma evolução importante no aprendizado de Java, pois cobre a base necessária para compreender frameworks, APIs e projetos maiores.

Dominar herança e polimorfismo é essencial para trabalhar com:

* Spring Boot
* Sistemas corporativos
* APIs REST
* Arquiteturas em camadas

Este projeto funciona como um **alicerce sólido** para estudos mais avançados dentro do ecossistema Java.
