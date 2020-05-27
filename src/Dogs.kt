class Dog(val name: String,
          weight_param: Int,
          breed_param: String) {

    init {
        print("Dog $name has been created. ")
    }

    var activities = arrayOf("Walks")
    val breed = breed_param.toUpperCase()

    init {
        println("The breed is $breed")
    }

    var weigh = weight_param
        set (value) {
            if (value > 0) field = value
        }

    val weightInKgs: Double
        get() = weigh / 2.2

    fun bark() {
        println(if (weigh < 20) "Yip!" else "Woof!")
    }
}