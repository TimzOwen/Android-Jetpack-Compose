package com.timzowen.noteappmvvm.data

import com.timzowen.noteappmvvm.model.Note

class NoteDataSource{

    fun loadNotes() : List<Note>{
        return listOf(
            Note(
                title = "Weekly Sales Report",
                description = "Compile M-PESA agent performance data and airtime sales trends."
            ),
            Note(
                title = "Customer Feedback",
                description = "Analyze the top 10 recurring complaints from call center data."
            ),
            Note(
                title = "Network Maintenance",
                description = "Schedule an outage notice for fiber upgrades in Westlands."
            ),
            Note(
                title = "New Data Plans",
                description = "Draft a marketing campaign for the 5GB bundle offer."
            ),
            Note(
                title = "Agent Training",
                description = "Prepare training materials for new M-PESA agents on fraud prevention."
            ),
            Note(
                title = "System Downtime Report",
                description = "Investigate the server issue that affected M-PESA transactions on Saturday."
            ),
            Note(
                title = "Performance Engineering Workshop",
                description = "Host a session for university students on optimizing service reliability."
            ),
            Note(
                title = "Device Financing Program",
                description = "Review the terms for the smartphone layaway plan rollout."
            ),
            Note(
                title = "Fiber Installation Requests",
                description = "Prioritize pending installations in Nairobi South area."
            ),
            Note(
                title = "Promotional SMS Campaign",
                description = "Draft messages for the 'Free 100MB Daily' data promotion."
            ),
            Note(
                title = "Billing System Audit",
                description = "Verify accuracy of postpaid plan invoices for corporate clients."
            ),
            Note(
                title = "Network Expansion",
                description = "Identify new areas for 4G rollout based on user demand data."
            ),
            Note(
                title = "CSR Event",
                description = "Organize the Safaricom Marathon logistics and communications."
            ),
            Note(
                title = "Fraud Alert System",
                description = "Implement SMS notifications for suspicious account activities."
            ),
            Note(
                title = "New App Features",
                description = "Brainstorm enhancements for the MySafaricom app, such as bill reminders."
            )
        )
    }

}