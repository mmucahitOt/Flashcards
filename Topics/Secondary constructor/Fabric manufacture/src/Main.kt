import java.util.regex.Pattern

class Fabric(var color: String) {
    var pattern: String = "none"
    var patternColor: String = "none"
    init {
        println("$color fabric is created")
    }

    constructor(color: String, _pattern: String, _patternColor: String):this(color){
        pattern = _pattern
        patternColor = _patternColor
        println("$patternColor $pattern pattern is printed on the fabric")
    }
}