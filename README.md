# 🏎️ F1 Strategy Game

Um jogo de estratégia casual inspirado na Fórmula 1, onde o jogador precisa tomar decisões rápidas sobre qual composto de pneus utilizar com base nas condições climáticas.

---

## 🏁 O Projeto

O **F1 Strategy Game** aplica a lógica clássica de **Pedra, Papel e Tesoura** ao universo do automobilismo.

O desafio é simples: a condição climática muda a cada rodada e você deve escolher o pneu correto para não “rodar” na pista ou não ser chamado ao box.

---

## 🕹️ Como Funciona (Lógica do Jogo)

O jogo compara a escolha do jogador com uma condição climática gerada aleatoriamente:

| Condição Sorteada      | Pneu Escolhido        | Resultado                      |
|-----------------------|----------------------|----------------------------------|
| ☀️ Sol                | 🔴 Pneu Macio (vermelho)| ✅ Sucesso, fastest lap       |  
| ☀️ Sol                | 🟢 Pneu Intermediário   | 📢 Toto Wolff: "BOX, BOX!     |
| 🌧️ Chuva              | 🟢 Pneu Intermediário   | ✅ Sucesso, fastest lap      |
| 🌧️ Chuva              | ⚪Pneu Duro             | 📢 Toto Wolff: "BOX, BOX!     |
| 🌧️ Chuva              | 🔴 Pneu Macio           | ⚠️ Carro 12 fora da corrida  |              
| 🔥 Pista Quente       | ⚪ Pneu Duro (Branco)   | ✅ Sucesso, fastest lap       |               
| 🔥 Pista Quente       | 🔴 Pneu Macio           | 📢 Toto Wolff: "BOX, BOX!     | 
| 🔥 Pista Quente       | 🟢 Pneu Intermediário   | ⚠️ Carro 12 fora da corrida   |         

---

## 🚀 Funcionalidades

- 🎲 **Geração Aleatória**: o clima muda a cada rodada conforme for sorteado no random  
- 🎨 **Feedback Visual**: interface intuitiva com ícones de pneus da F1  
- 🏁 **Imersão**: fundo temático com referências ao automobilismo  
- 🆕 **Eventos Especiais**: mensagens temáticas como **"BOX, BOX!"**  

---

## 🛠️ Tecnologias Utilizadas

- **Linguagem:** Java  
- **IDE:** Android Studio  
- **Layout:** XML (ConstraintLayout)  

---

## 📸 Screenshots



<img width="359" height="659" alt="formula-inicial" src="https://github.com/user-attachments/assets/599d3003-5250-49dd-8bf1-1360b55c3fdc" />



*Interface principal: Decidindo qual composto escolher.*

---

## 📥 Como baixar e testar

```bash
git clone https://github.com/seu-usuario/F1strategy-game.git

👨‍💻 Desenvolvido por Gustavo Borba 🏎️💨



