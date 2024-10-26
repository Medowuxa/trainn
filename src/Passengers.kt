import kotlin.random.Random

class Passengers {
    public var num: Int? = null

    fun passen() {
        val s = 5
        val e = 201

        num = Random.nextInt(s, e + 1)
        println("Билетов продано $num")
    }


    fun vagon() {

        var u = num
        val s = 5
        val e = 25
        var kol = 0
        do {

            var mest = Random.nextInt(s, e + 1)
            u = u?.minus(mest)
            kol++
            println("Вагон номер $kol вместимостью $mest мест")

        } while (u!! >= 0)
        if (u < 0) {
            u = u * -1
        }

        println("Всего вагонов отправлено $kol ")
        println("Свободных мест осталось $u ")
    }
}