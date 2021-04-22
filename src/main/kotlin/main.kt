const val DISCOUNT_ZERO = 0.0
const val DISCOUNT_STANDART = 100.0
const val DISCOUNT_PERCENT = 0.05
const val DISCOUNT_MUSIC_LOVER = 0.01
val musicLover :Boolean=true
val purchase = 100_000.0

fun main() {

    var discount = when (purchase) {
        in 0.0..1000.0 -> DISCOUNT_ZERO
        in 1001.0..10_000.0 -> DISCOUNT_STANDART
        else -> (purchase - 10_000.0) * DISCOUNT_PERCENT + DISCOUNT_STANDART
    }
    discount = if (musicLover) discount+discount*DISCOUNT_MUSIC_LOVER else
        discount
println(" сумма покупки ${purchase.toInt()} руб, сумма скидки ${discount.toInt()} руб")

}
