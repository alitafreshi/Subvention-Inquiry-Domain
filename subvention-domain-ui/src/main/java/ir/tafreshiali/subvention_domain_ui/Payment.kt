package ir.tafreshiali.subvention_domain_ui

import android.os.Parcelable
import ir.tafreshiali.subvention_domain.PaymentResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class Payment(
    val Amount: Long,
    val Bank: String,
    val Category: String,
    val Count: Long,
    val Month: String?,
    val OrderID: Long,
    val SubsidyTypeID: Long,
    val SubsidyTypeTitle: String,
    val Turn: String
) : Parcelable

fun PaymentResponse.toPayment() = Payment(
    Amount = Amount,
    Bank = Bank,
    Category = Category,
    Count = Count,
    Month = Month,
    OrderID = OrderID,
    SubsidyTypeID = SubsidyTypeID,
    SubsidyTypeTitle = SubsidyTypeTitle,
    Turn = Turn,
)

fun List<PaymentResponse>.toPaymentList() = buildList {
    this@toPaymentList.forEach { item ->
        add(item.toPayment())
    }
}

