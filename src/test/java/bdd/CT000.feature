# language: pt
@CT000
Funcionalidade: Validar as mensagem de alerta de campos obrigatórios da tela Atendimento Inteligente

  Cenário: Abrir o browser informar a url do blog petz e clicar no link Atendimento
    Dado a abertura do blog
    E clicar no link Atendimento na parte superior da tela
    Então validar se a tela é exibida através do título "Bem-vindo ao nosso atendimento"

  Esquema do Cenário: Abrir o browser informar a url do blog petz e clicar no link Atendimento
    Dado o click no botão Enviar
    E Exibe a mensagem de alerta do campo Nome <nome>
    E Exibe a mensagem de alerta do campo Sobrenome <Sobrenome>
    E Exibe a mensagem de alerta do campo CPF <cpf>
    E Exibe a mensagem de alerta do campo Email <email>
    E Exibe a mensagem de alerta do campo Telefone <telefone>
    E Exibe a mensagem de alerta do campo Assunto <assunto>
    E Exibe a mensagem de alerta do campo Motivo <motivo>
    E Exibe a mensagem de alerta do campo Texto <texto>

    Exemplos: 
      | nome                | Sobrenome                | cpf                | email                             | telefone                | assunto                           | motivo                             | texto                |
      | "Nome é necessário" | "Sobrenome é necessário" | "CPF é necessário" | "Endereço de E-mail é necessário" | "Telefone é necessário" | "Produto - Selecione um Assunto*" | "Categoria - Selecione um Motivo*" | "Texto é necessário" |
