fun main() {
    val likes=2111
    val word1="Понравилось $likes человеку"
    val word2="Понравилось $likes людям"
    val result:String=if(likes%100==11) word2 else if(likes%10==1) word1 else word2
    println(result)

}