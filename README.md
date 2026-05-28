# Manutenção de Software e Engenharia Reversa

Repositório dedicado às atividades e projetos práticos da disciplina.

## Atividade: Correção do Sistema de Controle Académico (Chamado 2)

Este projeto contém a resolução de uma **Manutenção Corretiva** aplicada num sistema legado de gestão de notas e faltas de alunos utilizando a linguagem Java.

### O Problema (Defeito)
O método `calcularMedia` apresentava um erro de precedência matemática no código original (`nota1 + nota2 / 2`), o que gerava médias finais incorretas (muito acima do limite) e comprometia as regras de negócio da instituição.

### A Solução
A lógica foi corrigida com a adição de parênteses para isolar a operação de adição: `(nota1 + nota2) / 2`, garantindo que a soma ocorre sempre antes da divisão.

### Validação e Testes
Para garantir a eficácia da correção e evitar bugs de regressão, foi estruturada uma bateria de testes automatizados para validação de limites:
- Cálculo exato da média (com e sem casas decimais).
- Verificação de aprovação no limite exato (Média 7.0 e Frequência 75%).
- Validação do limite máximo de frequência (100%).

**Como executar:**
Basta correr o ficheiro `Principal.java` para visualizar o diagnóstico completo dos testes diretamente na consola.

---
*Desenvolvido por Davi Lucas Alves Silva como requisito para a disciplina de Manutenção de Software e Engenharia Reversa.*
