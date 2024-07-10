package org.example


fun main() {
    val winningBid = Bid(5000, "Coleccionista privado")
    println("El artículo A se vende en: ${auctionPrice(winningBid, 2000)}.")
    println("El artículo B se vende en:${auctionPrice(null, 3000)}.")
}
class Bid(val amount: Int, val bidder: String)
fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice
}