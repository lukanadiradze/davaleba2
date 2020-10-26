fun main(){
    val f1 = Fraction(16F, 24F)
    val f2 = Fraction(5F, 7F)


    println(f1)
    println(f1 == f2)
    println(f1.jami(f2))
    println(f1.gamravleba(f2))
    println(f1.gakofa(f2))
    println(f1.shekveca())

}
class Fraction(n:Float, d:Float){
    private  var numerator:Float = n
    private  var denominator:Float = d

    fun jami(fraction: Fraction):Fraction{
        val m = denominator*fraction.denominator
        val k = m/denominator*numerator
        val l = m/fraction.denominator*fraction.numerator
        return Fraction (k+l,m)

    }
    fun gamravleba(fraction: Fraction): Fraction{
        val x = numerator*fraction.numerator
        val z = denominator*fraction.denominator
        return Fraction(x, z)

    }
    fun gakofa(fraction: Fraction):Fraction{
        val r = numerator*fraction.denominator
        val h = denominator*fraction.numerator
        return Fraction(r, h)
    }
    fun shekveca() {
        var u: Float = numerator
        var v: Float = denominator
        while (u != 0F && v != 0F) {
            if (u > v) {
                u = u % v
            } else {
                v = v % u
            }
        }
        var m = u+v
        var a = numerator/m
        var b = denominator/m
        this.numerator = a
        this.denominator = b
        println("$a / $b")
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Fraction){
            if(numerator*other.denominator/denominator == numerator){
                return true
            }
        }
        return false
    }
}
