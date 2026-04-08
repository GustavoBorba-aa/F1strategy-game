# 🏎️ F1 Strategy Game

Um jogo de estratégia casual inspirado na Fórmula 1, onde o jogador precisa tomar decisões rápidas sobre qual composto de pneus utilizar com base nas condições climáticas.

---

## 🏁 O Projeto

O **F1 Strategy Game** aplica a lógica clássica de **Pedra, Papel e Tesoura** ao universo do automobilismo.

O desafio é simples: a condição climática muda a cada rodada e você deve escolher o pneu correto para não “rodar” na pista.

---

## 🕹️ Como Funciona (Lógica do Jogo)

O jogo compara a escolha do jogador com uma condição climática gerada aleatoriamente:

| Condição Sorteada | Pneu Escolhido        | Resultado              |
|------------------|----------------------|------------------------|
| ☀️ Sol           | 🔴 Pneu Macio         | ✅ Sucesso              |
| ☀️ Sol           | 🟢 Pneu Intermediário | ⚠️ Desgaste excessivo  |
| 🌧️ Chuva        | 🟢 Pneu Intermediário | ✅ Sucesso              |
| 🌧️ Chuva        | 🔴 Pneu Macio         | ❌ VOCÊ RODOU!         |

---

## 🚀 Funcionalidades

- 🎲 **Geração Aleatória**: o clima muda a cada rodada  
- 🎨 **Feedback Visual**: interface intuitiva com ícones de pneus da F1  
- 🏁 **Imersão**: fundo temático com referências ao automobilismo  

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **IDE:** Android Studio  
- **Layout:** XML (ConstraintLayout)  

---

## 📸 Screenshots

![Interface principal](https://github.com/seu-usuario/F1strategy-game/raw/main/sua-imagem.png)

*Interface principal: Decidindo o pneu sob chuva.*

---

## 📥 Como baixar e testar

```bash
git clone https://github.com/seu-usuario/F1strategy-game.git
