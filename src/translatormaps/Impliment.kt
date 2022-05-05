package translatormaps

import java.util.Scanner

class Impliment : DictServise {
    val sc = Scanner(System.`in`)
    var allWord = hashMapOf<String, String>()
    override fun creatWord() {
        println("yangi so'z kiriting")
        var word = sc.next()
        println("tarjimasini kiriting")
        var trans = sc.next()
        allWord.put(word, trans)
        println(" new word added")
    }

    override fun readWord() {

        for (i in allWord.keys) println(
            "$i " + "${allWord[i]}"
        )

    }

    override fun updateWord() {
        print("o'zgartirmoqchi so'zingizni kiriting:")
        var changeword = sc.next()
        for (i in allWord.keys) {
            if (changeword == i) {
                println("sozni yangitarjimasini yozing:")
                var newword = sc.next()
                //bu yerda change keyni valuesini orniga newword joylaydi
                allWord.replace(changeword, newword)


            }

        }

    }

    override fun deleteWord() {
        println("ochirmoqchi bolgan sozingiznikiriting:")
        var findword = sc.next()
        for (i in allWord.keys) {
            if (findword == i) allWord.remove(findword)
        }


    }

    override fun searchWord() {
        println("qidirmoqchi bolgan sozingizni yozing:")
        var findword = sc.next()
        for (i in allWord.keys) {
            if (findword == i || findword == allWord[i]) println("$i - ${allWord[i]}")
        }

    }

}