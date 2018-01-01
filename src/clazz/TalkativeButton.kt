package clazz

internal open class TalkativeButton : Focusable {
    fun pub() = println()
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

//fun TalkativeButton.giveSpeech() {
//    pub()
//    yell()
//    whisper()
//}