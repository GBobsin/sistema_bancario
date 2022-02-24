import java.time.LocalDate

class Gerente (
    var id : Int,

    nome: String,
    dataDeNascimento: String,
    rg: String,
    cpf: String,
) : Pessoa(
    nome = nome,
    dataDeNascimento = dataDeNascimento,
    rg = rg,
    cpf = cpf
){
    override fun sacar(): String = "Um gerente pode sacar dinheiro!!!"
    override fun depositar(): String = "Um gerente pode depositar dinheiro!!!"
    override fun transferir(): String = "Um gerente pode transferir dinheiro!!!"
    override fun consultar(): String = "Gerente consulta sua conta"
}

//O importante, é a tentativa, e não a vítoria :D/*