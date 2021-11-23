package capitulo_2

/*O ternário em kotlin, pode ser chamado simplesmente utilizando if/else na mesma linha
* Isso acontece por que diferente de Java em que o if é uma instrução, no Kotlin
* if se torna uma expressão, que pode ser parte de outra expressão, retornando valor
* * Esse tipo de função é chamada de função com corpo de bloco
*/
fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

/*Simplificando a função acima em uma única expressão, assim omitimos o tipo de retorno, a keyword return
* e deixamos a expressão mais concisa.
* Esse tipo de função é chamada de função com corpo de expressão
* Apesar de Kotlin ser uma linguagem estaticamente tipada, e apesar de estarmos omitindo seu tipo
* o compilador do kotlin é capaz de analisar o retorno e atribuir o tipo retornado, através do conceito de inferencia de tipo
* Esse comportamento só pode acontecer em fun com corpo de expressão
*/
fun maxSingleExpression(a: Int, b: Int) = if (a > b) a else b


//Construção de um getter personalizável. Na hora da execução é calculado a expressão atribuida ao get()
class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

//Declarando uma classe enum com propriedades
enum class Color(
    val r: Int, val g: Int, val b: Int
    ) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b

    fun getWarmth(color: Color) = when(color) {
        RED, ORANGE, YELLOW -> "warm"
        GREEN -> "neutral"
        BLUE, INDIGO, VIOLET -> "cold"
    }
}