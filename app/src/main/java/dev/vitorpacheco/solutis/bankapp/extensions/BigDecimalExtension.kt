package dev.vitorpacheco.solutis.bankapp.extensions

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.format(): String {
    return NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(this)
}