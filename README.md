# eclipse
Projeto TOTVS Leilão

### Pré-requisitos


### 🚀 Começando

Antes de começar, você vai precisar ter instalado em sua máquina alguma ferramenta de interpratação de código.

### 📋 Pré-requisitos

Para o desenvolvimento deste projeto eu utilizei o Eclipse em sua respectiva versão:

- Eclipse IDE for Java Developers (includes Incubating components)

- Version: 2021-03 (4.19.0)

- Build id: 20210312-0638

- OS: Windows 10, v.10.0, x86_64 / win32

- Java version: 15.0.2

A linguagem escolhida para desenvolvimento e criação do framework foi Java + Selenium.

### 🔧 Instalação

É importante que se faça do download do da versão do Chromedriver compatível com a versão do seu navegador do Google Chrome no link: https://chromedriver.chromium.org/downloads

- Procure a pasta 'C:\Drivers' com o arquivo do Chromedriver extraído e cole nela.

- Abra o eclipse.

- Clique em File -> Import -> Git -> Project from Git > Clone URI e clique em Next

- Em URI você insere o link: https://github.com/DmarinhoSan/eclipse.git e o preenchimento de outros campos será feito automático.

- Depois em Authentication, você deve inserir o seu usuário e senha do git e clicar em Next;
- Em seguida deixar a branch master selecionada;
- E apontar o diretório aonde o projeto ficará em sua máquina;
- E por fim deixar selecionado Import using the New Project wizard e clicar em Finish;
- Selecionar o Java Project e clicar em Next;
- Verificar as informações do projeto a ser criado e inserir o nome no Projeto (project name) e clicar em next;

*obs: Verificar a necessidade de baixar as bibliotecas do JUnit entre versões 4 e 5.

### ⚙️ Executando os testes
- Basta acessar o projeto e acessar a package de testes (tests) e selecionar dar um duplo clique em uma das classes.

- Em seguida, poderá ver toda a estrutura do código.

- Agora clique com botão direito Run As > JUnit Test (Alt + Shift + X, T)

- E será aberta uma aba do Google Chrome totalmente controlada pela automação.

- Ao final JUnit dará uma resposta se o teste executou com sucesso ou não.

### 🔩 Analise os testes de ponta a ponta
A ideia dos testes são validar o canal de leilão proposto pelo desafio. Ao todo são 4 casos de testes automatizados.
- Criação de um conta para logar no canal
- Criação de um item para leilão
- Criação de uma proposta para um item do leilão
- Fechamento de um item para o leilão.


### 📌 Versão
Durante a execução dos testes alguns bugs e propostas de melhorias foram notados. 

### ✒️ Autores
Douglas Henrique Marinho dos Santos - QA

### 🎁 Expressões de gratidão
Desafio bem interessante proposto para um entrevista de emprego pela TOTVS (04/2021).
Obrigado publicamente 🤓.
