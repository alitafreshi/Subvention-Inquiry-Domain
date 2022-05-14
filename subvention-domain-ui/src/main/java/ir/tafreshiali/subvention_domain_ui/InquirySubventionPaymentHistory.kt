package ir.tafreshiali.subvention_domain_ui

import android.os.Parcelable
import ir.tafreshiali.ayan_core_ui.history.InquiryHistory
import ir.tafreshiali.ayan_core_ui.history.toInquiryHistory
import ir.tafreshiali.subvention_domain.InquirySubventionPaymentHistoryResponse
import kotlinx.parcelize.Parcelize

@Parcelize
data class InquirySubventionPaymentHistory(
    val Inquiry: InquiryHistory,
    val Result: InquirySubventionPaymentResult
) : Parcelable

fun InquirySubventionPaymentHistoryResponse?.toInquirySubventionPaymentHistory() = this?.let {
    Result.toInquirySubventionPaymentResult()?.let {
        InquirySubventionPaymentHistory(
            Inquiry = Inquiry.toInquiryHistory(),
            Result = it
        )
    }
}