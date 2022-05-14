package ir.tafreshiali.subvention_domain

import ir.tafreshiali.ayan_core.inquiry_history.InquiryHistoryResponse

data class InquirySubventionPaymentHistoryDto(
    val BankAccountNumber: String,
    val NationalID: String,
    val YearOfBirth: String
)


data class InquirySubventionPaymentHistoryResponse(
    val Inquiry: InquiryHistoryResponse,
    val Result: InquirySubventionPaymentResultResponse
)