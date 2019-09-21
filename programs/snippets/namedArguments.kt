

//Named Arguments
//Combined with default arguments, named arguments eliminates the need for builders:

build("PacMan", 400, 300)                           // equivalent
build(title = "PacMan", width = 400, height = 300)  // equivalent
build(width = 400, height = 300, title = "PacMan")  // equivalent
