open class persona (var LugarNacimiento: String) {
    public open fun hablar(): String {
        return "Saludo"
    }
}
class espaniol : persona("Spain") {
    override fun hablar(): String {
        return "Hola"
    }
}

class frances : persona("Francia") {
    override fun hablar(): String {
        return "Salut"
    }
}

class estadounidense : persona("Estados Unidos") {
    override fun hablar(): String {
        return "Hello"
    }
}