//A predefined set of operators can be overloaded to improve readability:

data class Vec(val x: Float, val y: Float) {
    operator fun plus(v: Vec) = Vec(x + v.x, y + v.y)
}

val v = Vec(3f, 4f) + Vec(5f, 2f)