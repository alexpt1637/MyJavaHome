package ru.alexpt.test.projects_01.newtest_01

fun main(args: Array<String>) {
    var x: Int = 3
    var name: String = "Name"
    x = x * 10
    var d: Double = Math.random()
    val str = String.format("%.2f", d)
    println("x = $x; random d = $str; name = $name")
    println("-------------------------------------------")

    while (x > 12){
        x = x - 10
        println("х равен: $x")
    }
    println("-------------------------------------------")

    for(x in 10..12){
        println("Теперь х равен: $x")
    }
    println("-------------------------------------------")

    if (x == 10){
        println("x должен быть равен 10 (x = $x)")
    } else {
        println("x не равен 10 (x = $x)")
    }
    println("-------------------------------------------")

    if ((x < 3) && (name.equals("Name"))){
        println("Вывод строки $name")
    }
    println("Эта строка выполняется при x = $x; name = $name")
    println("-------------------------------------------")

    x = 4   // присваиваем значение x = 4
    println("Запускаем цикл while:")
    while (x > 2){
        print("x = $x, далее: ")
        x = x - 1
        println("при x = x - 1: x = $x")
    }
    println("-------------------------------------------")

    // Пример цикла while:
    x = 1
    println("Пример цикла while: \nПеред началом цикла x = $x")
    while (x < 4) {
        println("Внутри цикла: x = $x")
        x = x + 1
    }
    println("После окончания цикла x = $x")
    println("-------------------------------------------")

    when(x){
        1 -> println("when(x=1): x = $x")
        2 -> println("when(x=2): x = $x")
        3 -> println("when(x=3): x = $x")
        else -> println("when(x=?): x = $x")
    }
    println("-------------------------------------------")

    x = 3
    when(x){
        3 -> println("when(x=$x): х равняется 3")
        else -> println("when(x=$x): х не равняется 3")
    }
    println("Эта строка выполняется в любом случае, x=$x")
    println("-------------------------------------------")

    x = 2
    when(x){
        3 -> println("when(x=$x): х равняется 3")
        else -> println("when(x=$x): х не равняется 3")
    }
    println("Эта строка выполняется в любом случае, x=$x")
    println("-------------------------------------------")
}

// Генератор фраз (начало) ---------------------------------------------------------------------------------------------
fun phraseGenerator(){
    // Создаем строковые массивы
    val wordListOne: Array<String> = arrayOf(
            "быть", "мочь", "сказать", "говорить", "хотеть", "иметь", "видеть", "думать", "сделать", "понимать",
            "жить", "делать", "работать", "стоять", "пойти", "считать", "смотреть", "взять", "получать", "сидеть"
    )
    val wordListTwo: Array<String> = arrayOf(
            "новый", "хороший", "должный", "последний", "российский", "высокий", "русский", "общий", "главный", "хороший",
            "маленький", "любой", "полный", "молодой", "советский", "разный", "настоящий", "всякий", "военный", "иной"
    )
    val wordListThree: Array<String> = arrayOf(
            "год", "человек", "время", "долг", "жизнь", "день", "рукав", "работник", "словарь", "тост",
            "вопрос", "лист", "глаз", "странник", "друг", "период", "дом", "случай", "ребенок", "гол"
    )

    // Вычисляем сколько слов в каждом списке (длину массива)
    val oneSize = wordListOne.size
    val twoSize = wordListTwo.size
    val threeSize = wordListThree.size
//    println("oneLength = $oneSize; twoLength = $twoSize; threeLength = $threeSize")

    // Генерируем три случайных числа, приводим их к целочисленому типу Int
    val rand1 = (Math.random() * oneSize).toInt()
    val rand2 = (Math.random() * twoSize).toInt()
    val rand3 = (Math.random() * threeSize).toInt()
//    println("rand1 = $rand1; rand2 = $rand2; rand3 = $rand3")

    // Строим фразу, выбираем по слову их каждого списка
    val phrase: String = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3]

    // Выводим фразу на экран
    println("Всё что нам нужно - это $phrase")
}
// Генератор фраз (конец) ----------------------------------------------------------------------------------------------

// Игра в угадывание (начало) ------------------------------------------------------------------------------------------
class Player {
    // Здесь хранится вариант числа
    var number = 0

    fun guess(){
        number = (Math.random() * 10).toInt()
        println("Думаю, это число: $number")
    }
}

fun startGame(){
    // Создаем три объекта класса Player и присваиваем их трем переменным экземляра
    val p1: Player = Player()
    val p2: Player = Player()
    val p3: Player = Player()

    // Три переменных для хранения вариантов от каждого игрока
    var guessp1: Int = 0
    var guessp2: Int = 0
    var guessp3: Int = 0

    // Три переменных для хранения правильности или неправильности ответов игроков
    var p1isRight: Boolean = false
    var p2isRight: Boolean = false
    var p3isRight: Boolean = false

    // Создаем число, которое игроки должны угадать
    val targetNumber = (Math.random() * 10).toInt()
    println("Я загадываю число от 0 до 9...")
    println("Число, которое нужно угадать: $targetNumber")

    // Вызываем функцию guess() из каждого объекта Player
    p1.guess()
    p2.guess()
    p3.guess()

    // Извлекаем варианты каждого игрока, получая доступ к их переменным number
    guessp1 = p1.number
    println("Первый игрок думает, что это: $guessp1")

    guessp2 = p2.number
    println("Первый игрок думает, что это: $guessp2")

    guessp3 = p3.number
    println("Первый игрок думает, что это: $guessp3")

    // Проверяем варианты каждого из игроков на соответствие загаданному числу
    if (guessp1 == targetNumber) {
        p1isRight = true
    }
    if (guessp2 == targetNumber) {
        p2isRight = true
    }
    if (guessp3 == targetNumber) {
        p3isRight = true
    }
    // Если игрок угадал, то присваиваем соответствующей переменной значение true

    if (p1isRight || p2isRight || p3isRight) {
        // Если первый игрок, ИЛИ второй игрок, ИЛИ третий игрок угадал
        println("У нас есть победитель!")
        when(p1isRight){
            true -> println("Угадал первый игрок, это число: $targetNumber.")
            false -> println("Первый игрок - не угадал.")
        }
        when(p2isRight){
            true -> println("Угадал второй игрок, это число: $targetNumber.")
            false -> println("Второй игрок - не угадал.")
        }
        when(p3isRight){
            true -> println("Угадал третий игрок, это число: $targetNumber.")
            false -> println("Третий игрок - не угадал.")
        }
        println("Конец игры.")                          // Игра окончена
    } else {
        println("Игроки могут попробовать ещё раз")    // Просим игроков сделать ещё одну попытку
    }
}
// Игра в угадывание (конец) -------------------------------------------------------------------------------------------

// Балуемся с ООП, создаем класс ---------------------------------------------------------------------------------------
class Dog {
    // Переменные экземпляра
    var sizeDog = 0
    var hiDog = ""
    var breedDog = ""
    var nameDog = ""
    var ownerDog = ""

    // Функция (действие) экземпляра класса
    fun bark(){
        println("$hiDog Я - $breedDog, меня зовут $nameDog, мне $sizeDog лет." +
                "\nМой владелец $ownerDog.")
    }
}

fun myDog(){
    // Экземпляр класса Dog
    val dog1: Dog = Dog()
    val dog2: Dog = Dog()
    val dog3: Dog = Dog()

    dog1.sizeDog = 5             // Присваеваем значение возраста щенка
    dog1.hiDog = "Гав! Гав!"     // Приветствие щенка
    dog1.breedDog = "хаски"      // Порода щенка
    dog1.nameDog = "Тузик"       // Имя щенка
    dog1.ownerDog = "Оля"        // Хозяин щенка

    dog2.sizeDog = 6
    dog2.hiDog = "Гав!"
    dog2.breedDog = "сенбернар"
    dog2.nameDog = "Бобик"
    dog2.ownerDog = "Вова"

    dog3.sizeDog = 7
    dog3.hiDog = "Тяф-Тяф!"
    dog3.breedDog = "такса"
    dog3.nameDog = "Маня"
    dog3.ownerDog = "Борис"

    dog1.nameDog = "Рэкс, а не Тузик"   // Меняем имя щенка

    println("Кто ты, пёсик?")    // Интересуемся у щенка, кто он...
    dog1.bark()                  // Получаем ответ
    println("А ты кто?")
    dog2.bark()
    println("Ну а ты?")
    dog3.bark()
}

fun myDogRandom(){
    val rand = (Math.random() * 7).toInt() + 1

    val dog: Dog = Dog()

    when(rand){
        1 -> {
            dog.sizeDog = 5             // Присваеваем значение возраста щенка
            dog.hiDog = "Гав! Гав!"     // Приветствие щенка
            dog.breedDog = "хаски"      // Порода щенка
            dog.nameDog = "Сири"        // Имя щенка
            dog.ownerDog = "Оля"        // Хозяин щенка
        }
        2 -> {
            dog.sizeDog = 6
            dog.hiDog = "Гаввв!"
            dog.breedDog = "сенбернар"
            dog.nameDog = "Боб"
            dog.ownerDog = "Вова"
        }
        3 -> {
            dog.sizeDog = 7
            dog.hiDog = "Тяф-тяф!"
            dog.breedDog = "такса"
            dog.nameDog = "Маня"
            dog.ownerDog = "Коля"
        }
        4 -> {
            dog.sizeDog = 8
            dog.hiDog = "Тяф! Тяф!"
            dog.breedDog = "спаниэль"
            dog.nameDog = "Терри"
            dog.ownerDog = "Борис"
        }
        5 -> {
            dog.sizeDog = 9
            dog.hiDog = "Гав! Гав!"
            dog.breedDog = "лабрадор"
            dog.nameDog = "Рэкс"
            dog.ownerDog = "Максим"
        }
        6 -> {
            dog.sizeDog = 10
            dog.hiDog = "Гав! Гав!"
            dog.breedDog = "овчарка колли"
            dog.nameDog = "Лэсси"
            dog.ownerDog = "Наташа"
        }
        7 -> {
            dog.sizeDog = 11
            dog.hiDog = "Тяф!"
            dog.breedDog = "дворняжка"
            dog.nameDog = "Тузик"
            dog.ownerDog = "теперь ты"
        }
    }

    println("Кто ты, пёсик?")    // Интересуемся у щенка, кто он...
    dog.bark()                   // Получаем ответ
}
// Балуемся с ООП ------------------------------------------------------------------------------------------------------
// Тестирование объектов Movie (начало)

class Movie {
    var title: String = ""          // Название фильма
    var genre: String = ""          // Жанр фильма
    var rating: Int = 0             // Рейтинг фильма
    var duration: Int = 0           // Длительность фильма
    var land: String = ""           // Страна - производитель

    fun playIt(){
        println("Сегодня демонстрируется $genre '$title' длительностью $duration минут, рейтинг фильма - $rating, производство $land.")
    }
}

fun onMovie(){
    val rand = (Math.random() * 5).toInt() + 1

    val movie: Movie = Movie()

    when (rand){
        1 -> {
            movie.title = "Чужой"
            movie.genre = "фантастика"
            movie.rating = 120
            movie.duration = 105
            movie.land = "USA"
        }
        2 -> {
            movie.title = "Хищник"
            movie.genre = "фантастика"
            movie.rating = 115
            movie.duration = 110
            movie.land = "USA"
        }
        3 -> {
            movie.title = "Банзай"
            movie.genre = "комедия"
            movie.rating = 90
            movie.duration = 95
            movie.land = "France"
        }
        4 -> {
            movie.title = "Не бойся, я с тобой!"
            movie.genre = "приключения"
            movie.rating = 120
            movie.duration = 125
            movie.land = "USSR"
        }
        5 -> {
            movie.title = "Дочки-мачехи"
            movie.genre = "мелодрама"
            movie.rating = 65
            movie.duration = 320
            movie.land = "Russia"
        }
    }

    println("Какой фильм демонстрируется сегодня?")
    movie.playIt()
}
// Тестирование объектов Movie (конец) ---------------------------------------------------------------------------------

// Первичный и вторичный конструктор:
class Personal(val name: String, val age: Int){     // Первичный конструктор является частью заголовка класса и определяется сразу после имени класса
    var friend = ""                                 // Вторичные конструкторы определяются в теле класса
    var agefriend = 0
}

fun personal(){
    val bob = Personal("Bob", 23)
    val mom = Personal("Mom", 45)
    val alex = Personal("Alex", 24)
    alex.friend = "Fred"
    alex.agefriend = 36

    println("Name: ${bob.name}, Age: ${bob.age}")
    println("Name: ${mom.name}, Age: ${mom.age}")
    println("Name: ${alex.name}, Age: ${alex.age}, My friend: ${alex.friend}, His age: ${alex.agefriend}")
}
// Первичный и вторичный конструктор (конец) ---------------------------------------------------------------------------