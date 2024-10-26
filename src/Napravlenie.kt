import kotlin.random.Random

class Napravlenie {
    fun naprav(){
        val n = listOf("Москва","Волгоград","Владивосток","Тверь","Саратов","Тула","Новосибирск","Мурманск","Нижний Новгород","Краснодар","Омск","Ярославль","Кемерово","Пермь","Вологда")
        val Cities = n.shuffled(Random).take(2)
        println("Случайный маршрут: ${Cities[0]} - ${Cities[1]}")
    }
}