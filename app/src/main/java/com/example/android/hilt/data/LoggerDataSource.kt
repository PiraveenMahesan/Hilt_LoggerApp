package com.example.android.hilt.data

/*
    Common interface for Logger data sources.
    Added by Piraveen Mahesan on 10/22/2024
 */

interface LoggerDataSource {
    fun addLog(msg: String)
    fun getAllLogs(callback: (List<Log>) -> Unit)
    fun removeLogs()
}