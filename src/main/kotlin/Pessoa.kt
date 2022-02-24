import java.time.LocalDate

open class Pessoa (
    var nome: String,
    var dataDeNascimento: String,
    var rg: String,
    var cpf: String,
){
    open fun sacar(): String = "Uma pessoa pode sacar dinheiro!!!"
    open fun depositar(): String = "Uma pessoa pode depositar dinheiro!!!"
    open fun transferir(): String = "Uma pessoa pode transferir dinheiro!!!"
    open fun consultar(): String = "Uma pessoa pode consultar a conta"
}

//O importante, é a tentativa, e não a vítoria :D/*