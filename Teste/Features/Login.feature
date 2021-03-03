# language: pt
@logout
Funcionalidade: Login
    Para que eu possa cadastrar e gerenciar minhas tarefas
    Sendo um usuário
    Posso acessar o sistema com meu email e senha previamente cadastrados.

    Contexto:Paginal principal
    Dado que eu acesso a página principal


    Cenario: Usuário deve ser autorizado
        Quando eu faço login com "talita.moraes@ufrpe.br" e "Talita9898"
        Então devo ser autenticado com sucesso
        E devo ver a mensagem "TALITA FERREIRA"