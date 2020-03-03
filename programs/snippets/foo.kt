class Foo {

    val b: String = "b"     // val means unmodifiable -immutable
    var i: Int = 0          // var means modifiable - mutable

    fun hello() {
        val str = "Hello"
        print("$str World")
    }

    fun sum(x: Int, y: Int): Int {
        return x + y
    }

    fun maxOf(a: Float, b: Float) = if (a > b) a else b

}
