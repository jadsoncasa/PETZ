# language: pt
@CT001
Funcionalidade: Validar se sistema remove o produto do resumo quando o usuário inseri um valor negativo no campo de quantidade de produto na assinatura

  Cenário: Abrir a tela de assinatura
    Dado a abertura da tela de assinatura
    Então exibe o título "01 Escolha os produtos"

  Esquema do Cenário: Adcionar um produto e em seguida inserir um valor negativo no campo de quantidade de produto
    Dado a busca de um <produto> cadastro no sistema
    E clicar no botão Adcionar ao lado do produto
    E clicar no botão Adcionar no modal da descrição do produto
    E inserir um <valor> negativo no campo quantidade
    Então validar se o produto é removido do resumo <texto>

    Exemplos: 
      | produto                                        | valor | texto                                                                      |
      | "Ração Royal Canin Maxi - Cães Adultos - 15kg" | "-1"  | "Você ainda não selecionou produtos para sua assinatura, adicione ao lado" |
