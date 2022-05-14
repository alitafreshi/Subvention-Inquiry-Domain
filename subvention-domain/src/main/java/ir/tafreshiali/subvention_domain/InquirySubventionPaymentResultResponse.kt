package ir.tafreshiali.subvention_domain

import ir.tafreshiali.ayan_core.date_time.DateTimeResponse

data class InquirySubventionPaymentResultResponse(
    val AccountNumber: String,
    val AccountRegistrationDate: DateTimeResponse,
    val Bank: String,
    val CardNumber: String,
    val FullName: String,
    val LastAmountOfPayments: Long,
    val LastPayment: PaymentResponse,
    val Payments: List<PaymentResponse>,
    val PersonCount: String,
    val TotalAmountOfPayments: Long,
    val TotalNumberOfPayments: Long
)
