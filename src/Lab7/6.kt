package Lab7

fun main() {
    val player = Player()
    val bot = Bot()
    var yn = ""

    while(yn != "нет") {
        println("Ваши карты: ${player.cardPlayer()}")
        println("Ваши баллы: ${player.sumPlayer()}\n")
        if (player.sumP >= 21) break
        println("Больше? (да/нет)")
        yn = readln()
    }

    do {
        bot.cardBot()
        bot.sumBot()
    } while(bot.sumB < 16)

    println("Ваши баллы: ${player.sumP}")
    println("Баллы Бота: ${bot.sumB}")

    when {
        ((player.sumP == 21) or (bot.sumB > 21)) -> println("Вы выиграли")
        ((player.sumP > 21) or (bot.sumB == 21)) -> println("Вы проиграли")
        (player.sumP > bot.sumB) -> println("Вы выиграли")
        (player.sumP < bot.sumB) -> println("Вы проиграли")
        else -> println("Ничья")
    }
}

class Player(val deck: Deck = Deck()) {
    var cardP = ""
    var sumP = 0

    fun cardPlayer(): String{
        cardP += "\n" + deck.randCard()
        return cardP
    }

    fun sumPlayer(): Int{
        sumP = deck.isSum()
        return sumP
    }
}

class Bot(val deck: Deck = Deck()) {
    var cardB = ""
    var sumB = 0

    fun cardBot(): String{
        cardB += "\n" + deck.randCard()
        return cardB
    }

    fun sumBot(): Int{
        sumB = deck.isSum()
        return sumB
    }
}

class Deck(){
    var deck = mutableListOf(
        "J Пики", "J Черви", "J Крести", "J Буби",
        "Q Пики", "Q Черви", "Q Крести", "Q Буби",
        "K Пики", "K Черви", "K Крести", "K Буби",
        "6 Пики", "6 Черви", "6 Крести", "6 Буби",
        "7 Пики", "7 Черви", "7 Крести", "7 Буби",
        "8 Пики", "8 Черви", "8 Крести", "8 Буби",
        "9 Пики", "9 Черви", "9 Крести", "9 Буби",
        "10 Пики", "10 Черви", "10 Крести", "10 Буби",
        "A Пики", "A Черви", "A Крести", "A Буби",
    )
    var n = 36
    var randIndex = 0
    var sum = 0

    fun randCard(): String{
        randIndex = (0..<n).random()
        val card = deck.removeAt(randIndex)
        n--
        return card
    }

    fun isSum(): Int{
        when(randIndex){
            in (0..3) -> sum += 2
            in (4..7) -> sum += 3
            in (8..11) -> sum += 4
            in (12..15) -> sum += 6
            in (16..19) -> sum += 7
            in (20..23) -> sum += 8
            in (24..27) -> sum += 9
            in (28..31) -> sum += 10
            in (32..35) -> sum += 11
        }
        return sum
    }
}