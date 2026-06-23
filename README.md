# Lista de Compras

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=openjdk)
![JavaFX](https://img.shields.io/badge/JavaFX-21-blue?style=flat-square)
![License](https://img.shields.io/badge/license-MIT-green?style=flat-square)

## 📌 Sobre o Projeto

Aplicativo desktop desenvolvido em Java com JavaFX que permite ao usuário montar uma lista de compras de forma simples e visual. Os itens adicionados ficam visíveis em tempo real na tela e podem ser exportados para um arquivo `.txt` ao final.

## 🚀 Tecnologias Utilizadas

- Java 21
- JavaFX 21
- Eclipse IDE

## 📋 Funcionalidades

- Adicionar itens à lista através de um campo de texto
- Visualizar todos os itens adicionados em uma lista interativa
- Exportar a lista para o arquivo `listaDeCompras.txt` com um clique

## ▶️ Como Executar

### Pré-requisitos

- [Java 21](https://www.oracle.com/java/technologies/downloads/#java21) instalado
- [JavaFX SDK 21](https://gluonhq.com/products/javafx/) baixado e extraído
- [Eclipse IDE](https://www.eclipse.org/downloads/) com suporte a Java

### Configurando a User Library do JavaFX no Eclipse

1. Abra o Eclipse e vá em **Window → Preferences → Java → Build Path → User Libraries**
2. Clique em **New**, nomeie como `JavaFX` e confirme
3. Selecione a library criada e clique em **Add External JARs**
4. Navegue até a pasta `lib` do JavaFX SDK baixado e adicione todos os `.jar`
5. Confirme com **Apply and Close**

### Executando o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/MarceloJustin/ListaDeCompras.git
   ```
2. No Eclipse, vá em **File → Import → Existing Projects into Workspace** e selecione a pasta clonada
3. Com o projeto importado, clique com o botão direito em `Main.java → Run As → Java Application`

O arquivo `listaDeCompras.txt` será gerado na raiz do projeto ao clicar em **Exportar Lista**.

## 👨‍💻 Autor

Feito por **Marcelo Justin**

[![GitHub](https://img.shields.io/badge/GitHub-MarceloJustin-black?style=flat-square&logo=github)](https://github.com/MarceloJustin)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-marcelojustin-blue?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/marcelojustin)

## 📄 Licença

Este projeto está sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para mais detalhes.
