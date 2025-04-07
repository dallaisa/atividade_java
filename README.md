# Isabelle - RM: 554592

##  Projeto: Locadora de Veículos

Este projeto foi desenvolvido em Java com o objetivo de simular uma aplicação simples de uma locadora de veículos, permitindo o cálculo do custo de aluguel de acordo com a quantidade de dias, aplicação de descontos e cálculo de multas por atraso.

---

##  Tecnologias Utilizadas

- **Java** (JDK 17 ou superior)
- **JUnit 5** para testes unitários
- **Maven** como gerenciador de dependências
- **IntelliJ IDEA** como ambiente de desenvolvimento (IDE)

---

##  Funcionalidades do Projeto

- **Cadastro de veículo com modelo e valor da diária**
- **Cálculo do custo total de aluguel**
  - Baseado na quantidade de dias solicitada.
- **Desconto de 10%**
  - Aplicado automaticamente em aluguéis com **7 dias ou mais**.
- **Cálculo de multa por devolução atrasada**
  - Valor adicional por cada dia de atraso.
- **Validação de entradas**
  - Tratamento para valores inválidos como diárias negativas ou dias iguais a zero.

---

## Testes Automatizados

O projeto conta com testes unitários usando **JUnit 5** que cobrem:

- Cálculo correto do custo total de aluguel.
- Aplicação do desconto em aluguéis longos.
- Cálculo de multa por atraso.
- Cenários extremos:
  - Aluguel por 0 dias
  - Valores negativos de diária
  - Aluguel de muitos dias (stress test)

Os testes estão na classe `VeiculoTest.java`.
