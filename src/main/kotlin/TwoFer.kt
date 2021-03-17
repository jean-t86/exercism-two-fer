internal fun twofer(name: String? = null): String =
    if (name == null) {
        "One for you, one for me."
    } else {
        "One for $name, one for me."
    }
