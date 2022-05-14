package ir.tafreshiali.subvention_domain_ui

import android.os.Parcelable
import ir.tafreshiali.ayan_core_ui.DateTime
import ir.tafreshiali.ayan_core_ui.toDateTime
import ir.tafreshiali.subvention_domain.InquirySubventionPaymentResultResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class InquirySubventionPaymentResult(
    val AccountNumber: String?,
    val AccountRegistrationDate: DateTime?,
    val Bank: String?,
    val CardNumber: String?,
    val FullName: String?,
    val LastAmountOfPayments: Long?,
    val LastPayment: Payment?,
    val Payments: List<Payment>?,
    val PersonCount: String?,
    val TotalAmountOfPayments: Long?,
    val TotalNumberOfPayments: Long?
) : Parcelable


fun InquirySubventionPaymentResultResponse?.toInquirySubventionPaymentResult() = this?.let {
    InquirySubventionPaymentResult(
        AccountNumber = AccountNumber,
        AccountRegistrationDate = AccountRegistrationDate.toDateTime(),
        Bank = Bank,
        CardNumber = CardNumber,
        FullName = FullName,
        LastAmountOfPayments = LastAmountOfPayments,
        LastPayment = LastPayment.toPayment(),
        Payments = Payments.toPaymentList(),
        PersonCount = PersonCount,
        TotalAmountOfPayments = TotalAmountOfPayments,
        TotalNumberOfPayments = TotalNumberOfPayments,
    )
}
