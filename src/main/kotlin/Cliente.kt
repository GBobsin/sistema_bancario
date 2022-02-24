import java.time.LocalDate

class Cliente(
    var saldo: String,

    nome: String,
    dataDeNascimento: String,
    rg: String,
    cpf: String,
) : Pessoa(
    nome = nome,
    dataDeNascimento = dataDeNascimento,
    rg = rg,
    cpf = cpf
) {
    override fun sacar(): String = "Um cliente pode sacar dinheiro!!!"
    override fun depositar(): String = "Um cliente pode depositar dinheiro!!!"
    override fun transferir(): String = "Um cliente pode transferir dinheiro!!!"
    override fun consultar(): String = "Cliente consulta sua conta"
}

//O importante, é a tentativa, e não a vítoria :D/*