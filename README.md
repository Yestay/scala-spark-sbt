# scala-spark-sbt
Playing with SBT-Spark. JSON deserialisation

spark-submit --master local --class JsonReader C:\IdeaProjects\spark2demo2\target\scala-2.11\spark23.jar C:\Otus\winemag-data-130k-v2.json

Цели задания
Написать распределенное приложение для чтения JSON-файлов.
Создание проекта
Для начала выполнения задания необходимы следующие инструменты:
sbt
IntelliJ IDEA
Для создания проекта введите в консоли
sbt new MrPowers/spark-sbt.g8
В настройках укажите
name - json_reader_{ваша фамилия}
остальные параметры оставьте по-умолчанию (просто нажмайте Enter)
Импортируйте проект в IntelliJ IDEA
File > New > Project from existing sources
Задание
Напишите приложение, которое читает json-файл с помощью Spark RDD API без использования Dataframe/Dataset (https://storage.googleapis.com/otus_sample_data/winemag-data.json.tgz), конвертирует его содержимое в case class’ы и распечатывает их в stdout.
Расположение файла передается первым и единственным аргументом.
Сборка и запуск приложения
Главный класс приложения должен называться JsonReader
Собрать приложение можно с помощью команды sbt assembly
Для запуска приложения через спарк нужно скачать Spark (версия 2.4.x, scala 2.11) - https://spark.apache.org/downloads.html
Приложение запускается командой
/path/to/spark/bin/spark-submit --master local[*] --class com.example.JsonReader /path/to/assembly-jar {path/to/winemag.json}
Подсказки
Для чтения файла можно использовать
spark.sparkContext.textFile("README.md")
Для десериализации JSON можно использовать библиотеку json4s или circe
https://eax.me/scala-json/ - статья с примерами
https://github.com/json4s/json4s - сама библиотека
val decodedUser = parse(json).extract[User]
где User - это ваш case class
Для знакомства с системой сборки sbt:
само собой, наиболее полная дока - оффициальная, но она на английском: https://www.scala-sbt.org/1.x/docs/
http://twitter.github.io/scala_school/ru/sbt.html
https://eax.me/scala-sbt/
https://groz.github.io/scala/intro/sbt/
