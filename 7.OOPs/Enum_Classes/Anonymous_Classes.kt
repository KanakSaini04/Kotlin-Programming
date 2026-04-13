enum class Weather {
    SUMMER {
        override fun description() = "Hot days of a year"
    },
    WINTER {
        override fun description() = "Cold days of a year"
    };

    abstract fun description(): String
}