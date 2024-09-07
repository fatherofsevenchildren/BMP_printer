# Создание папки target и копирование библиотек
rm -rf target && mkdir target && cd target && jar xf ../lib/JCDP-4.0.0.jar && jar xf ../lib/jcommander-1.72.jar && cd ..

# Компиляция
javac -cp lib/jcommander-1.72.jar:lib/JCDP-4.0.0.jar -d target src/java/edu/school21/printer/app/Main.java src/java/edu/school21/printer/logic/ArgsRider.java src/java/edu/school21/printer/logic/Converter.java

# Создание .jar файла и перемещение в folder
jar cfm target/ImagesToChar-folder.jar src/manifest.txt -C ./target .

# Запуск
java -jar target/ImagesToChar-folder.jar --white= GREEN --black= RED

![it](images/it_red.png)
