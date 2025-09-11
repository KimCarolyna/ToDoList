# 📝 Gerenciador de Tarefas em Java

Este projeto é um sistema simples de gerenciamento de tarefas em **Java**, rodando no terminal.  
Ele permite criar, listar, atualizar, remover e marcar tarefas como concluídas.

## 🚀 Funcionalidades

- Criar uma nova tarefa com título e descrição
- Listar todas as tarefas cadastradas
- Atualizar título e descrição de uma tarefa existente
- Remover uma tarefa pelo seu **ID**
- Marcar uma tarefa como **concluída**
- Exibir a data de criação da tarefa
- Encerrar o programa de forma segura

---

## 📂 Estrutura do Projeto
📦 GerenciadorTarefas
```bash
┣ 📜 Main.java # Classe principal, contém o menu interativo
┣ 📜 TarefaServico.java # Classe de serviço, implementa a lógica de CRUD
┣ 📜 Tarefa.java # Classe modelo, representa uma tarefa
```

---

## ⚙️ Como funciona cada parte

### 1. `Main.java`
- É o **ponto de entrada** do programa.
- Exibe o **menu interativo** no terminal.
- Usa `Scanner` para capturar a entrada do usuário.
- Chama os métodos da classe `TarefaServico`.

---

Exemplo de menu:
```bash
----MENU----
1 - Criar tarefa
2 - Listar tarefas
3 - Atualizar tarefa
4 - Remover tarefa
5 - Marcar como concluída
6 - Sair
```

---

### 2. `TarefaServico.java`
- Gerencia a lista de tarefas em memória (`ArrayList`).
- Implementa as operações principais:
  - `criarTarefa(titulo, descricao)`
  - `listarTarefa()`
  - `atualizarTarefa(id, novoTitulo, novaDescricao)`
  - `removerTarefa(id)`
  - `marcarComoConcluida(id)`

---

### 3. `Tarefa.java`
- Representa uma tarefa individual.
- Contém:
  - `id` → identificador único
  - `titulo` → título da tarefa
  - `descricao` → descrição detalhada
  - `completa` → indica se a tarefa foi concluída
  - `dataAgora` → data/hora em que a tarefa foi criada

Exemplo de saída ao listar:

ID: 1, Título: Estudar, Descrição: Revisar Java, Concluída: Não, Data: 10/09/2025 23:12

---

## ▶️ Como executar

1. Compile os arquivos:
   ```bash
   javac Main.java TarefaServico.java Tarefa.java
   ```
   Execute o programa:
   java Main
