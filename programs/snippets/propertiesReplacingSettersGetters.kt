//Properties

//Custom set & get behavior can be added to public fields, which means we can 
//stop bloating our code with mindless getters & setters.
//Also, no need for semi colons except for example using do..while statements.

class Frame {
    var width: Int = 800
    var height: Int = 600

    val pixels: Int
        get() = width * height
}