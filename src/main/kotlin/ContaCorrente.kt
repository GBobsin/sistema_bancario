class ContaCorrente (
    var limite: Int,

    numero: String,
    senha: String,
    saldo: String,
    agencia: String
) : Conta(
    numero=numero,
    senha=senha,
    saldo=saldo,
    agencia=agencia
){
    override fun sacar(): String = "Uma conta pode sacar dinheiro!!!"
    override fun depositar(): String = "Uma conta pode depositar dinheiro!!!"
    override fun transferir(): String = "Uma conta pode transferir dinheiro!!!"
}

//O importante, é a tentativa, e não a vítoria :D/*