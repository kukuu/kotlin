//The Data Class
//It’s a POJO complete with toString(), equals(), hashCode(), and copy(), and unlike in Java it won’t take up 100 lines of code:

data class Person(val name: String,
                  var email: String,
                  var age: Int)

val john = Person("Jake", "jake@gmail.com", 112)