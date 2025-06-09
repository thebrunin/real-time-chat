# 💬 Chat em Tempo Real com Spring Boot + WebSocket + STOMP

Este projeto é um chat em tempo real onde múltiplos usuários podem interagir simultaneamente via WebSocket. O front-end está embutido no backend (servindo diretamente via Spring Boot).

---

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- WebSocket + STOMP
- SockJS (fallback)
- Docker + Docker Compose
- MongoDB

---

## 🐳 Rodando com Docker Compose

### Pré-requisitos

- Docker
- Docker Compose
- Gradle

### Build e execução

```bash
./gradlew clean bootJar
docker-compose up --build
```

### A aplicação estará disponível em:
http://localhost:8080/chat.html

### ✨ Funcionalidades atuais:

Envio e recebimento de mensagens em tempo real

Vários clientes conectados ao mesmo tempo

Nome do usuário informado ao entrar no chat

---

## ✅ Backlog features
- Adicionar timestamp automático às mensagens
- Notificação de entrada/saída de usuários
- Histórico persistente (ex: MongoDB)
- Interface com Vue ou React
- Autenticação básica

👨‍💻 
thebrunin 