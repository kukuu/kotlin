//Intuitive Equals
//You can stop calling equals() explicitly because the == operator now checks for structural equality:


val john1 = Person("John")
val john2 = Person("John")
john1 == john2    // true  (structural equality)
john1 === john2   // false (referential equality)