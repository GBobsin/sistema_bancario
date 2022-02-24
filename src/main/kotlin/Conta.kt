open class Conta (
    var numero: String,
    var senha: String,
    var saldo: String,
    var agencia: String
    ) {
    open fun sacar(): String = "Uma conta pode sacar dinheiro!!!"
    open fun depositar(): String = "Uma conta pode depositar dinheiro!!!"
    open fun transferir(): String = "Uma conta pode transferir dinheiro!!!"
}

//O importante, é a tentativa, e não a vítoria :D/*