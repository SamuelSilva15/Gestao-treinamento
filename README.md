## Sistema de Gerenciamento de Treinamentos

## Objetivo
Descrever o sistema para o gerenciamento de treinamentos para empresas.

## Requisitos Funcionais

### 2.1 Cadastro de Empresas
- **Campos**:
  - Nome
  - CNPJ
  - Unidades (lista de unidades associadas)

### 2.2 Cadastro de Unidades
- **Campos**:
  - Nome
  - CNPJ
  - Setores (lista de setores)
  - Turnos (lista de turnos)
  - Centros de Custo (lista de centros de custo)
  - Funções (lista de funções)
- **Relacionamento com Empresas**:
  - Cada unidade pertence a uma empresa.

### 2.3 Cadastro de Funcionários
- **Campos**:
  - Registro (RE)
  - Nome
  - CPF
  - Setores (lista de setores)
  - Turnos (lista de turnos)
  - Centros de Custo (lista de centros de custo)
  - Funções (lista de funções)
  - Situação (ativo ou desligado)

### 2.4 Cadastro de Cursos
- **Campos**:
  - Nome
  - Validade
  - Funções (lista de funções relacionadas ao curso)
  - Sessões (lista de sessões)
  - Carga Horária (diferenciada para formação e reciclagem)
  - Nível

### 2.5 Requisitos de Curso para Funcionários
- Se um funcionário possui uma função listada em algum curso, ele deve realizar o curso correspondente.
- Possibilidade de retirar a obrigatoriedade de um curso para um funcionário específico.
- Todos os funcionários devem realizar o curso NR-01.

### 2.6 Cadastro de Treinamentos
- **Campos**:
  - Data de Conclusão
  - Carga Horária (informação vinda do curso)
  - Nível
  - Formato (presencial, à distância, semipresencial)
  - Tipo de Formação (formação ou reciclagem)
  - Validade
  - Curso
  - Situação do Treinamento
  - Funcionários (lista de funcionários participantes)
  - Sessões (lista de sessões)
  - Data de Vencimento
  - Instrutor

### 2.7 Sessões de Treinamento
- **Campos**:
  - Data de Início
  - Data de Término
  - Intervalo
  - Situação
- No dia da sessão, não será possível alterar a data, apenas cancelá-la.

### 2.8 Instrutores
- **Campos**:
  - Nome
  - E-mail
  - CPF
  - CREA (opcional)
  - Dados do Carro (placa e modelo, não obrigatórios)
  - Certificado de Aptidão (opcional)
- O instrutor recebe um e-mail com o link para acessar a sessão e preencher a lista de presença.

### 2.9 Controle de Participação e Vencimento
- Verificar porcentagem de participantes presentes e ausentes, por sessão e por treinamento.
- Funcionários receberão o certificado por e-mail após conclusão do curso.
- Notificações para renovação do curso: 60, 30 e 15 dias antes do vencimento.
- Unidades recebem lista de funcionários com treinamentos prestes a vencer.
- Funcionários podem consultar individualmente todos os treinamentos realizados.

## Banco de dados
![image](https://github.com/user-attachments/assets/853dac0d-a8cb-4e04-bdee-ea0f979b8b88)

