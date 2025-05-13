# Alisson Lara

![Perfil](https://avatars.githubusercontent.com/u/149639259?v=4&size=64) <!-- Adicione uma imagem sua ou do projeto -->

## Sobre Mim

- 🤖 Apaixonado por tecnologia e automação industrial.
- 🤔 Explorando novas tecnologias e desenvolvendo soluções de software.
- 🎓 Estudando lógica de programação no grupo 8 da Alura/ONE.
- 💼 Trabalhando como projetista de sistemas de automação industrial na Videplast.
- 🌱 "Aprendendo mais sobre C/C++, HTML, CSS e JavaScript.

## Minhas Skills

**Aplicações e Dados**

![C++](https://img.shields.io/badge/C++-00599C?style=flat-square&logo=cplusplus)
![JavaScript](https://img.shields.io/badge/-JavaScript-333333?style=flat&logo=javascript)
![HTML5](https://img.shields.io/badge/-HTML5-333333?style=flat&logo=HTML5)
![CSS](https://img.shields.io/badge/-CSS-333333?style=flat&logo=CSS3&logoColor=1572B6)
![MySQL](https://img.shields.io/badge/-MySQL-333333?style=flat&logo=mysql)
![Java](https://img.shields.io/badge/-Java-333333?style=flat&logo=java&logoColor=white)


**Utilidades**

![Postman](https://img.shields.io/badge/-Postman-333333?style=flat&logo=postman)

**DevOps**

![Git](https://img.shields.io/badge/-Git-333333?style=flat&logo=git)
![GitHub](https://img.shields.io/badge/-GitHub-333333?style=flat&logo=github)

**Ferramentas de Desenvolvimento**

![Visual Studio Code](https://img.shields.io/badge/-Visual_Studio_Code-333333?style=flat&logo=visual-studio-code&logoColor=007ACC)
![Trello](https://img.shields.io/badge/-Trello-333333?style=flat&logo=trello&logoColor=007ACC)
![IntelliJ IDEA](https://img.shields.io/badge/-IntelliJ_IDEA-333333?style=flat&logo=intellij-idea&logoColor=white)


<br/>

## Projetos em Destaque

### Challenge conversor de moedas

Curso: Alura/ONE - Iniciante em Programação G8 - ONE


### 🧾 **Descrição Geral do Sistema – Conversor de Moedas**

O sistema é uma aplicação interativa de linha de comando que permite ao usuário simular conversões de moedas com base em cotações atualizadas. A experiência é dividida em quatro etapas principais:



### 🔹 **1. Início do Programa**

Assim que o programa é executado, o usuário é questionado com a seguinte mensagem:

> "Você deseja simular uma conversão de moedas?"

* Se o usuário responder **"N" (não)**, o sistema encerra imediatamente.
* Se o usuário responder **"Y" (sim)**, o sistema prossegue para o **menu de opções de conversão**.



### 🔹 **2. Simulação Automática por Menu (Opções 1 a 10)**

Após confirmar o desejo de simular uma conversão, o sistema apresenta um **menu com 10 opções pré-definidas** (de 1 a 10).

* Cada opção corresponde a um par de moedas fixo (exemplo: USD → BRL).
* O usuário escolhe uma opção, e o sistema automaticamente seleciona as moedas associadas.
* Em seguida, o usuário informa o **valor que deseja converter**.
* O sistema consulta uma API de cotação em tempo real e exibe:

  * O valor da **cotação atual** da moeda
  * O **valor convertido** com base no valor digitado



### 🔹 **3. Simulação Manual (Opção 11)**

Se o usuário selecionar a opção **11**, o modo de conversão manual é ativado:

* O sistema solicita que o usuário digite o **código da moeda de origem** (ex: USD).
* Em seguida, pede o **código da moeda de destino** (ex: EUR).
* Por fim, o usuário informa o **valor a ser convertido**.
* O sistema então realiza a consulta na API e exibe:

  * A **cotação atual** entre as moedas informadas
  * O **resultado da conversão** com base no valor digitado


### 🔹 **4. Encerramento ou Nova Simulação**

Após **cada simulação**, seja automática ou manual:

* O sistema volta ao início e pergunta novamente:

  > "Você deseja simular uma conversão de moedas?"

* O ciclo se repete até que o usuário responda "N", encerrando o programa.



### ✅ **Resumo das Funcionalidades**

| Etapa                | Ação do Usuário                        | Resultado                      |
| -------------------- | -------------------------------------- | ------------------------------ |
| Início               | Responder Y/N                          | Continua ou encerra o programa |
| Simulação automática | Escolher opção 1 a 10                  | Converte moedas pré-definidas  |
| Simulação manual     | Escolher opção 11 e digitar os códigos | Converte moedas personalizadas |
| Finalização          | Nova pergunta após cada simulação      | Decide se continua ou finaliza |




## 🚀 Tecnologias Utilizadas

* **Java 17+**

  * Linguagem principal para desenvolvimento da aplicação.
  * Utilizada com orientação a objetos e organização por pacotes.

* **Gson (Google Gson)**

  * Biblioteca para conversão de JSON em objetos Java (e vice-versa).
  * Utilizada para interpretar as respostas da API de cotação.

* **Java HTTP Client (java.net.http)**

  * Utilizado para realizar requisições HTTP à API de cotação de moedas.
  * Parte da biblioteca padrão do Java (a partir do Java 11).

* **API de Cotação de Moedas**

  * Serviço externo para obter taxas de câmbio em tempo real.
  * Exemplo: [AwesomeAPI](https://docs.awesomeapi.com.br/api-de-moedas) ou outro serviço equivalente.

* **Scanner (java.util.Scanner)**

  * Usado para capturar entradas do usuário via terminal.

* **Tratamento de Exceções**

  * Uso de `try-catch` com exceções como `IllegalArgumentException`, `IOException`, `InputMismatchException`, `InterruptedException` e `NumberFormatException`.

* **Modularização com Pacotes**

  * `controller` – controla o fluxo principal do programa.
  * `api` – integra com a API externa.
  * `dto` – representa os dados da cotação.
  * `exception` – centraliza o tratamento de erros.


📚 Objetivo do Desafio
Este projeto tem como foco exercitar:

Lógica de programação em Java.

Consumo de APIs.

Boas práticas com modularização e tratamento de exceções.

Entrada de dados e interação com o usuário via console.


📦 Como Executar o Projeto
git clone https://git@github.com:LaraAlisson/conversor-moeda.git

cd nome-do-repositorio
# Execute com sua IDE favorita (IntelliJ, VSCode) ou pelo terminal.

